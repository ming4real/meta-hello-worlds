SUMMARY = "Simple Maven hello world application"
DESCRIPTION = "Builds a dependency-free Java application using Maven."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " \
    file://pom.xml \
    file://src/ \
"

S = "${UNPACKDIR}"

# These recipe names depend on the Java layer used by the build.
# You need to provide the JDK layer.

# Maven is availabe in meta-aws https://layers.openembedded.org/layerindex/branch/master/layer/meta-aws/
DEPENDS = "maven-native openjdk-21-native"
RDEPENDS:${PN} = "openjdk-21-jre"

do_compile() {
    mvn --offline package
}

do_install() {
    install -d ${D}${libdir}/hello-maven
    install -m 0644 target/hello-maven-1.0.0.jar ${D}${libdir}/hello-maven/hello-maven.jar

    install -d ${D}${bindir}
    cat > ${D}${bindir}/hello-maven <<EOF_SCRIPT
#!/bin/sh
exec java -cp ${libdir}/hello-maven/hello-maven.jar com.example.HelloMaven "\$@"
EOF_SCRIPT
    chmod 0755 ${D}${bindir}/hello-maven
}

FILES:${PN} += "${libdir}/hello-maven"

SUMMARY = "Simple Java hello world application"
DESCRIPTION = "Builds a Java application directly using javac without Maven or Gradle."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://HelloJava.java"

S = "${UNPACKDIR}"

# Adjust these names to match the OpenJDK version supplied by your Java layer.
# You need to provide the JDK layer.
DEPENDS = "openjdk-21-native"
RDEPENDS:${PN} = "openjdk-21-jre"

do_compile() {
    javac HelloJava.java
    jar cf hello-java.jar HelloJava.class
}

do_install() {
    install -d ${D}${libdir}/hello-java
    install -m 0644 hello-java.jar ${D}${libdir}/hello-java/hello-java.jar

    install -d ${D}${bindir}
    cat > ${D}${bindir}/hello-java <<EOF_SCRIPT
#!/bin/sh
exec java -cp ${libdir}/hello-java/hello-java.jar HelloJava "\$@"
EOF_SCRIPT
    chmod 0755 ${D}${bindir}/hello-java
}

FILES:${PN} += "${libdir}/hello-java"

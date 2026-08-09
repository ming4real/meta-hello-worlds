SUMMARY = "Small Go hello application"
DESCRIPTION = "Builds a dependency-free Go binary using Yocto Go support."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit go

GO_IMPORT = "example.com/hello-go"

SRC_URI = " \
    file://go.mod;subdir=${GO_IMPORT} \
    file://main.go;subdir=${GO_IMPORT} \
"

S = "${UNPACKDIR}/${GO_IMPORT}"

do_compile() {
    cd ${S}
    ${GO} build ${GOBUILDFLAGS} -o ${B}/hello-go .
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${B}/hello-go ${D}${bindir}/hello-go
}

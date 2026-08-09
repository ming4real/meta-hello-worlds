SUMMARY = "Small C hello application"
DESCRIPTION = "Builds a single C source file with the Yocto C compiler."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://hello-c.c"

S = "${UNPACKDIR}"

do_compile() {
    ${CC} ${CFLAGS} ${LDFLAGS} ${S}/hello-c.c -o hello-c
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 hello-c ${D}${bindir}/hello-c
}

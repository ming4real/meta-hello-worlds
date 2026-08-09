SUMMARY = "Small Makefile-based C application"
DESCRIPTION = "Builds a C application using a Makefile that respects Yocto tool variables."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " \
    file://Makefile \
    file://hello-make.c \
"

S = "${UNPACKDIR}"

do_compile() {
    oe_runmake
}

do_install() {
    oe_runmake install DESTDIR=${D} bindir=${bindir}
}

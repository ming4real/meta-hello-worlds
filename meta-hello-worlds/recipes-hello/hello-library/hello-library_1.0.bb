SUMMARY = "Simple shared hello library"
DESCRIPTION = "Demonstrates building a shared library and exporting headers and pkg-config metadata."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " \
    file://CMakeLists.txt \
    file://hello.c \
    file://hello.h \
    file://hello.pc.in \
"

S = "${UNPACKDIR}"

inherit cmake

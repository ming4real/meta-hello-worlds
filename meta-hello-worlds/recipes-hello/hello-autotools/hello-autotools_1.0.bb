SUMMARY = "Simple Autotools hello world application"
DESCRIPTION = "Demonstrates building an application using GNU Autotools."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " \
    file://configure.ac \
    file://Makefile.am \
    file://hello-autotools.c \
"

S = "${UNPACKDIR}"

inherit autotools

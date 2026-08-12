SUMMARY = "Application consuming hello-library through pkg-config"
DESCRIPTION = "Demonstrates DEPENDS, recipe sysroots, pkg-config and CMake integration."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " \
    file://CMakeLists.txt \
    file://hello-pkgconfig.c \
"

S = "${UNPACKDIR}"

DEPENDS = "hello-library"

inherit cmake pkgconfig

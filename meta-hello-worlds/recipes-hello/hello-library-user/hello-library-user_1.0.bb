SUMMARY = "Application using hello-library"
DESCRIPTION = "Demonstrates DEPENDS and consuming another recipe through the recipe sysroot."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " \
    file://CMakeLists.txt \
    file://hello-library-user.c \
"

S = "${UNPACKDIR}"

DEPENDS = "hello-library"

inherit cmake

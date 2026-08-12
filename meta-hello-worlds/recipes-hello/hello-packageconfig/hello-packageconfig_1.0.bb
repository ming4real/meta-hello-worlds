SUMMARY = "PACKAGECONFIG example"
DESCRIPTION = "Demonstrates an optional CMake feature controlled using PACKAGECONFIG."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " \
    file://CMakeLists.txt \
    file://hello-packageconfig.c \
"

S = "${UNPACKDIR}"

inherit cmake

PACKAGECONFIG ??= ""
PACKAGECONFIG[colour] = "-DENABLE_COLOUR=ON,-DENABLE_COLOUR=OFF"

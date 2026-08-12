SUMMARY = "Simple CMake/CPack hello world application"
DESCRIPTION = "Shows an upstream CPack configuration while Yocto remains responsible for target packaging."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " \
    file://CMakeLists.txt \
    file://hello-cpack.c \
"

S = "${UNPACKDIR}"

inherit cmake

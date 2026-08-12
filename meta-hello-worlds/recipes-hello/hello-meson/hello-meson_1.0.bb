SUMMARY = "Simple Meson hello world application"
DESCRIPTION = "Demonstrates building an application using Meson."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " \
    file://meson.build \
    file://hello-meson.c \
"

S = "${UNPACKDIR}"

inherit meson

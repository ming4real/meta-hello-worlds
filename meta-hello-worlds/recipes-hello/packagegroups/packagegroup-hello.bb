SUMMARY = "Package group for all hello example recipes"
DESCRIPTION = "Installs every package provided by recipes-hello."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit packagegroup

RDEPENDS:${PN} = " \
    hello-c \
    hello-config \
    hello-cpp \
    hello-go \
    hello-make \
    hello-pip \
    hello-python \
    hello-rust \
    hello-service \
    hello-shell \
"

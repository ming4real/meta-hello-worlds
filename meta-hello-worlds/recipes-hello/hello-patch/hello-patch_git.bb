SUMMARY = "Remote source plus local patch example"
DESCRIPTION = "Fetches hello-make from GitHub and applies a patch supplied by the layer."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " \
    git://github.com/ming4real/meta-hello-worlds.git;protocol=https;branch=main \
    file://0001-change-greeting.patch \
"
SRCREV = "b9178508b7f56d316df4d390c662ce83afb4a6ba"

PV = "1.0+git"
S = "${WORKDIR}/git/meta-hello-worlds/recipes-hello/hello-make/files"

do_compile() {
    oe_runmake
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 hello-make ${D}${bindir}/hello-patch
}

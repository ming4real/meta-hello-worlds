SUMMARY = "Small shell script package"
DESCRIPTION = "Installs a script-only package with no compile step."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://hello-shell"

RDEPENDS:${PN} += "bash"

do_compile[noexec] = "1"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${UNPACKDIR}/hello-shell ${D}${bindir}/hello-shell
}

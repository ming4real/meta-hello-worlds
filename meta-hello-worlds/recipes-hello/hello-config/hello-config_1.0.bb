SUMMARY = "Small configuration file package"
DESCRIPTION = "Installs a configuration file under /etc."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://hello-app.conf"

do_compile[noexec] = "1"

do_install() {
    install -d ${D}${sysconfdir}/hello-app
    install -m 0644 ${UNPACKDIR}/hello-app.conf ${D}${sysconfdir}/hello-app/hello-app.conf
}

CONFFILES:${PN} += "${sysconfdir}/hello-app/hello-app.conf"

SUMMARY = "Small systemd service package"
DESCRIPTION = "Installs a script and a systemd service unit."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit systemd

SRC_URI = " \
    file://hello-service \
    file://hello-service.service \
"

do_compile[noexec] = "1"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${UNPACKDIR}/hello-service ${D}${bindir}/hello-service

    install -d ${D}${systemd_system_unitdir}
    install -m 0644 ${UNPACKDIR}/hello-service.service ${D}${systemd_system_unitdir}/hello-service.service
}

SYSTEMD_SERVICE:${PN} = "hello-service.service"
RDEPENDS:${PN} += "bash"

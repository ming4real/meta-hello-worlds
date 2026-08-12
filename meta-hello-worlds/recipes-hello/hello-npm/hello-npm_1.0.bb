SUMMARY = "Simple npm hello world application"
DESCRIPTION = "Demonstrates an npm project with a locked dependency."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = " \
    file://index.js \
    file://package.json \
    file://package-lock.json \
"

S = "${UNPACKDIR}"

# This intentionally shows the project files and lock file. For production npm
# recipes, recipetool is useful for generating the npm dependency fetch metadata.
inherit npm

RDEPENDS:${PN} += "nodejs"

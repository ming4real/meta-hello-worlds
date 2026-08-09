SUMMARY = "Small local Python package"
DESCRIPTION = "Installs a Python package from local source using pyproject metadata."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit python_setuptools_build_meta

SRC_URI = " \
    file://pyproject.toml \
    file://setup.cfg \
    file://hello_python/__init__.py \
    file://hello_python/__main__.py \
"

S = "${UNPACKDIR}"

RDEPENDS:${PN} += "python3-core"

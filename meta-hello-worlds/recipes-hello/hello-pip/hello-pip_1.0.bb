SUMMARY = "Small Python wheel-style package example"
DESCRIPTION = "Builds and installs a Python package with the same PEP 517 path used for pip-style packages."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit python_setuptools_build_meta

SRC_URI = " \
    file://pyproject.toml \
    file://setup.cfg \
    file://hello_pip/__init__.py \
    file://hello_pip/__main__.py \
"

S = "${UNPACKDIR}"

RDEPENDS:${PN} += "python3-core"

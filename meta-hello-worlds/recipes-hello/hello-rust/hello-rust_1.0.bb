SUMMARY = "Small Rust hello application"
DESCRIPTION = "Builds a dependency-free Rust binary using Yocto Cargo support."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

inherit cargo

SRC_URI = " \
    file://Cargo.toml \
    file://Cargo.lock \
    file://src/main.rs \
"

S = "${UNPACKDIR}"

do_install() {
    install -d ${D}${bindir}
    install -m 0755 ${B}/target/${CARGO_TARGET_SUBDIR}/hello-rust ${D}${bindir}/hello-rust
}

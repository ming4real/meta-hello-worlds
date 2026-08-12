SUMMARY = "Hello world fetched from a remote Git repository"
DESCRIPTION = "Demonstrates fetching source from GitHub and building from a repository subdirectory."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "git://github.com/ming4real/meta-hello-worlds.git;protocol=https;branch=main"
SRCREV = "b9178508b7f56d316df4d390c662ce83afb4a6ba"

PV = "1.0+git"
# Set the source directory to the subdirectory of the Git repository with which you want to work
S = "${WORKDIR}/git/meta-hello-worlds/recipes-hello/hello-make/files"

do_compile() {
    oe_runmake
}

do_install() {
    oe_runmake DESTDIR=${D} bindir=${bindir} install
}

SUMMARY = "Small C++ hello application"
DESCRIPTION = "Builds a single C++ source file with the Yocto C++ compiler."
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"

SRC_URI = "file://hello-cpp.cpp"

S = "${UNPACKDIR}"

do_compile() {
    ${CXX} ${CXXFLAGS} ${LDFLAGS} ${S}/hello-cpp.cpp -o hello-cpp
}

do_install() {
    install -d ${D}${bindir}
    install -m 0755 hello-cpp ${D}${bindir}/hello-cpp
}

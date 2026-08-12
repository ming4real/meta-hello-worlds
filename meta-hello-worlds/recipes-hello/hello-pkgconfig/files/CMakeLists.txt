cmake_minimum_required(VERSION 3.16)
project(hello-pkgconfig LANGUAGES C)

find_package(PkgConfig REQUIRED)
pkg_check_modules(HELLO REQUIRED IMPORTED_TARGET hello)

add_executable(hello-pkgconfig hello-pkgconfig.c)
target_link_libraries(hello-pkgconfig PRIVATE PkgConfig::HELLO)
install(TARGETS hello-pkgconfig DESTINATION bin)

cmake_minimum_required(VERSION 3.16)
project(hello-cpack VERSION 1.0.0 LANGUAGES C)

add_executable(hello-cpack hello-cpack.c)
install(TARGETS hello-cpack DESTINATION bin)

set(CPACK_PACKAGE_NAME "hello-cpack")
set(CPACK_PACKAGE_VERSION "${PROJECT_VERSION}")
set(CPACK_PACKAGE_DESCRIPTION_SUMMARY "Hello World CPack example")
include(CPack)

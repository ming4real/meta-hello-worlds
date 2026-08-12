cmake_minimum_required(VERSION 3.16)
project(hello VERSION 1.0 LANGUAGES C)

include(GNUInstallDirs)

add_library(hello SHARED hello.c)
set_target_properties(hello PROPERTIES VERSION 1.0 SOVERSION 1)
target_include_directories(hello PUBLIC ${CMAKE_CURRENT_SOURCE_DIR})

configure_file(hello.pc.in hello.pc @ONLY)

install(TARGETS hello LIBRARY DESTINATION ${CMAKE_INSTALL_LIBDIR})
install(FILES hello.h DESTINATION ${CMAKE_INSTALL_INCLUDEDIR})
install(FILES ${CMAKE_CURRENT_BINARY_DIR}/hello.pc DESTINATION ${CMAKE_INSTALL_LIBDIR}/pkgconfig)

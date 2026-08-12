cmake_minimum_required(VERSION 3.16)
project(hello-cmake C)

add_executable(hello-cmake hello-cmake.c)
install(TARGETS hello-cmake DESTINATION bin)

cmake_minimum_required(VERSION 3.16)
project(hello-packageconfig LANGUAGES C)

option(ENABLE_COLOUR "Enable coloured output" OFF)

add_executable(hello-packageconfig hello-packageconfig.c)
if(ENABLE_COLOUR)
    target_compile_definitions(hello-packageconfig PRIVATE ENABLE_COLOUR)
endif()
install(TARGETS hello-packageconfig DESTINATION bin)

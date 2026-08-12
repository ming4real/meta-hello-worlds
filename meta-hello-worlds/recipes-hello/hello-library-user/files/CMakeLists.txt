cmake_minimum_required(VERSION 3.16)
project(hello-library-user LANGUAGES C)

find_path(HELLO_INCLUDE_DIR hello.h REQUIRED)
find_library(HELLO_LIBRARY hello REQUIRED)

add_executable(hello-library-user hello-library-user.c)
target_include_directories(hello-library-user PRIVATE ${HELLO_INCLUDE_DIR})
target_link_libraries(hello-library-user PRIVATE ${HELLO_LIBRARY})
install(TARGETS hello-library-user DESTINATION bin)

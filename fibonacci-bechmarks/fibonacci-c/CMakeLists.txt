cmake_minimum_required(VERSION 2.8)
project(fibonacci_c C)

set(CMAKE_C_STANDARD 11)
set(CMAKE_C_FLAGS "-std=c99")

add_executable(fibonacci_c main.c)
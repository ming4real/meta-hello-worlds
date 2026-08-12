# Additional hello-world recipe examples

This directory extends the original recipe collection with examples aimed at
teaching specific Yocto concepts.

## Added examples

- `hello-java`: direct `javac`/`jar` build.
- `hello-maven`: Maven build without external Maven dependencies.
- `hello-npm`: npm project with a `package-lock.json` dependency.
- `hello-cmake`: minimal `inherit cmake` example.
- `hello-cpack`: CMake project containing CPack metadata; Yocto still packages the target.
- `hello-autotools`: minimal `inherit autotools` example.
- `hello-meson`: minimal `inherit meson` example.
- `hello-git`: remote Git fetch pinned to a commit.
- `hello-patch`: remote Git fetch plus a local patch with `Upstream-Status`.
- `hello-library`: shared library, development files and pkg-config metadata.
- `hello-library-user`: recipe-to-recipe `DEPENDS` and sysroot consumption.
- `hello-pkgconfig`: consumes `hello-library` through pkg-config.
- `hello-packageconfig`: optional CMake feature controlled with `PACKAGECONFIG`.
- `hello-rust`: updated to use a locked external crate and generated crates include.

## Notes

The Java examples need a layer providing OpenJDK and Maven. The recipe names in
these examples use `openjdk-21-native`, `openjdk-21-jre`, and `maven-native` as
clear placeholders matching a typical Java-layer setup; adjust them to the
versions/providers used by your build.

The npm example is intentionally small and includes `package-lock.json`. For a
production recipe with npm dependencies, use `recipetool` to generate the npm
fetch metadata appropriate to the Yocto release being taught.

The Rust recipe includes `hello-rust-crates.inc`. To demonstrate regeneration,
change the Cargo dependency/lock file and run:

    bitbake -c update_crates hello-rust

The CPack example intentionally does not use the package produced by CPack.
This is the teaching point: upstream may provide CPack metadata, while Yocto's
packaging tasks package files installed into `${D}`.

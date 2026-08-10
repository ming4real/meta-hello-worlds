# meta-hello-worlds

A collection of simple "Hello World" Yocto recipes demonstrating different programming languages and build systems.

This layer started as part of the material for my Yocto training course. The aim is to provide small, easy-to-understand examples that show how different types of software are integrated into a Yocto Project build.

Rather than trying to demonstrate realistic applications, each recipe deliberately keeps the source code as simple as possible so that the focus stays on the Yocto recipe and build process.

## What is included?

The layer contains a selection of Hello World examples using different languages and build systems.

Each example is intended to demonstrate things such as:

- fetching or providing source code
- selecting the appropriate Yocto build class
- configuring the build
- compiling the application
- installing files into the target filesystem
- packaging the resulting application

The examples can therefore be useful both as learning material and as a quick reference when creating a new recipe.

## Using the layer

Clone the repository into your Yocto project's layers directory:

```sh
git clone https://github.com/ming4real/meta-hello-worlds.git
```

Add the layer to your build:

```sh
bitbake-layers add-layer /path/to/meta-hello-worlds
```

You can then build any of the example recipes with:

```sh
bitbake <recipe-name>
```

To install an example into an image, add the relevant package to your image configuration, for example:

```conf
IMAGE_INSTALL:append = " <package-name>"
```

## Why so many Hello Worlds?

A simple Hello World program removes most of the application complexity and makes it easier to see what the Yocto recipe itself is doing.

Comparing equivalent applications built with different languages and build systems is also a useful way to understand the differences between classes such as `cmake`, `meson`, `cargo`, and others.

## Contributions

Suggestions and contributions are welcome.

If there is a programming language, build system, or packaging approach that would make a useful addition, feel free to open an issue or submit a pull request.

The goal is to gradually build a useful collection of small examples covering the common ways software gets integrated into a Yocto Project.
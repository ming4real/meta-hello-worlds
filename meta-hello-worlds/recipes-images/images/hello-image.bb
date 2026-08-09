SUMMARY = "Hello World image."
LICENSE = "MIT"

IMAGE_INSTALL = "packagegroup-core-boot"

IMAGE_LINGUAS = "en-us"

inherit core-image

IMAGE_INSTALL += "packagegroup-hello"

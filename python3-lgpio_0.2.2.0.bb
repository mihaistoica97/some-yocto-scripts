SUMMARY = "https://github.com/Gadgetoid/PY_LGPIO added to Python 3 modules. Probably a better way of doing it though"

LICENSE = "CLOSED"

SRC_URI = " https://github.com/Gadgetoid/PY_LGPIO/releases/download/0.2.2.0/lgpio-0.2.2.0.tar.gz;protocol=https"

SRC_URI[sha256sum] = "ed81a609d7e658e7cc04514af7eaaae643b87d40e455d329d2d4ac6f6084ce85"

RPROVIDES:${PN} = "python3-lgpio"
inherit setuptools3


do_compile:prepend(){
    cp -r  ${WORKDIR}/lgpio-0.2.2.0/* ${WORKDIR}/python3-lgpio-0.2.2.0/
}

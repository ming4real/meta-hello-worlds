CC ?= cc
CFLAGS ?= -O2
LDFLAGS ?=
bindir ?= /usr/bin

all: hello-make

hello-make: hello-make.c
	$(CC) $(CFLAGS) $< -o $@ $(LDFLAGS)

install: hello-make
	install -d $(DESTDIR)$(bindir)
	install -m 0755 hello-make $(DESTDIR)$(bindir)/hello-make

clean:
	rm -f hello-make

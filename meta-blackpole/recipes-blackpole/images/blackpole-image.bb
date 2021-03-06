require conf/license/blackpole-gplv2.inc

inherit task image


IMAGE_INSTALL = " \
	${ROOTFS_PKGMANAGE} \
	base-files-doc \
	mtd-utils \
	mkfs-ubifs \
	mkfs-jffs2 \
	vuplus-compat \
	usbtunerhelper \
	3rd-party-feed-configs \
	avahi-daemon \
	cifs \
	distro-feed-configs \
	dropbear \
	e2fsprogs-e2fsck \
	e2fsprogs-mke2fs \
	early-configure \
	fakelocale \
	nfs-utils \
	blackpole-bootlogo \
	opkg \
	samba \
	sdparm \
	task-base \
	task-core-boot \
	tuxbox-common \
	tuxbox-links \
	tzdata \
	util-linux-sfdisk \
	volatile-media \
	vsftpd \
	mc \
	minidlna \
	djmount \
	openvpn \
	blackpole-base \
	blackholesocker \
	"

OPTIONAL_PACKAGES ?= ""
OPTIONAL_PACKAGES += " \
	autossh \
	ctorrent \
	cups \
	dvbsnoop \
	dvdfs \
	gdb \
	hddtemp \
	hdparm \
	inadyn-mt \
	iperf \
	joe \
	mpd \
	nano \
	ntfs-3g \
	ntp \
	openresolv \
	openssh \
	parted \
	procps \
	pyload \
	rsync \
	sabnzbd \
	sshpass \
	smartmontools \
	strace \
	tcpdump \
	transmission \
	vim \
	wakelan \
	zeroconf \
	"

export IMAGE_BASENAME = "blackpole"
IMAGE_LINGUAS = ""

IMAGE_FEATURES += "package-management"

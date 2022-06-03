run-dist:
	./build/install/app/bin/app

build:
	./gradlew installDist

check-style:
	./gradlew checkstyleMain

.PHONY: build
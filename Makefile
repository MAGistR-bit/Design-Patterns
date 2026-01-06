.PHONY: build run run-dist test lint

build:
	bash -c "./gradlew build"

run:
	bash -c "./gradlew run"

test:
	bash -c "./gradlew test"

lint:
	bash -c "./gradlew checkstyleMain checkstyleTest"
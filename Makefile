.PHONY: build run run-dist test lint

build:
	bash -c "./gradlew build"

run-%:
	bash -c "./gradlew run$*"

test:
	bash -c "./gradlew test"

lint:
	bash -c "./gradlew checkstyleMain checkstyleTest"

help:
	@echo "Available Commands:"
	@echo "  make build          - Build project"
	@echo "  make run-X          - Launch project (example, make run-Ducks)"
	@echo "  make test           - Run the tests"
	@echo "  make lint           - Check the code style"
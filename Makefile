.PHONY: build run run-dist test lint

build:
	bash -c "./gradlew build"

run-%:
	bash -c "./gradlew run$*"

test:
	bash -c "./gradlew test"

lint:
	bash -c "./gradlew checkstyleMain checkstyleTest"

run-with-args:
	@if [ -z "$$appName" ] || [ -z "$$appArgs" ]; then \
		echo "Error: appName and appArgs must be set. Example:"; \
		echo "  make run-with-args appName=EnumerationIterator appArgs='12; \"hello world\";42'"; \
		exit 1; \
	fi
	./gradlew run$$appName -PappArgs="$$appArgs"

help:
	@echo "Available Commands:"
	@echo "  make build          - Build project"
	@echo "  make run-X          - Launch project (example, make run-Ducks)"
	@echo "  make test           - Run the tests"
	@echo "  make lint           - Check the code style"
	@echo "  make run-with-args  - Run application with the arguments"

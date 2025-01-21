.PHONY: build run test clean run-once call help gradle-build

help: ## Show this help message
	@echo 'Usage: make [target]'
	@echo
	@echo 'Targets:'
	@awk 'BEGIN {FS = ":.*?## "} /^[a-zA-Z_-]+:.*?## / {printf "  %-20s %s\n", $$1, $$2}' $(MAKEFILE_LIST)

build: ## Build the project
	./mvnw clean package

run: ## Run the application
	./mvnw spring-boot:run

test: ## Run tests
	./mvnw test

clean: ## Clean the project
	./mvnw clean

all: clean build ## Clean and build the project

run-once: ## Run the application and then exit
	@echo "Starting the application..." && \
	./mvnw spring-boot:run & \
	sleep 10 && \
	@echo "Calling the /hello endpoint..." && \
	curl -s http://localhost:8080/hello && \
	@echo "Stopping the application..." && \
	pkill -f 'java -jar'

call: ## Call the /hello endpoint
	@curl -s http://localhost:8080/hello

# Compile using Gradle
gradle-build: ## Build the project using Gradle
	./gradlew build

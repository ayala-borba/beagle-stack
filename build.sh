#!/bin/bash

function compose_run() {
	docker-compose -f docker-compose-ci.yml run -v $1/.m2/settings.xml:/root/.m2/settings.xml:ro stack-demo $2
}

function main() {
	trap 'docker-compose -f docker-compose-ci.yml down' EXIT
	compose_run $1 'mvn clean package'
	docker build -t stack-demo .
	compose_run $1 'mvn clean'
}

trap exit SIGINT SIGKILL
main ${1:-~}

#!/bin/bash

if ! command -v xmlstarlet &> /dev/null; then
    echo "The xmlstarlet isn't installed. Please, install the xmlstarlet with the following command and rerun the build!"
    echo "Command: sudo apt update && sudo apt install xmlstarlet -y"
    exit 0
fi

read -p "Do you want to run tests? [y/n] " run_tests

if [ "$run_tests" = 'y' ];
then
  ./mvnw clean package
else
  ./mvnw clean package -DskipTests
fi

VERSION=$(xmlstarlet sel -N pom=http://maven.apache.org/POM/4.0.0 -t -v '/pom:project/pom:version' pom.xml)

aws ecr get-login-password --profile chronotrack --region sa-east-1 | docker login --username AWS --password-stdin 119705507337.dkr.ecr.sa-east-1.amazonaws.com

docker tag chronotrack-api:latest 119705507337.dkr.ecr.sa-east-1.amazonaws.com/chronotrack-api:latest
docker tag chronotrack-api:"$VERSION" 119705507337.dkr.ecr.sa-east-1.amazonaws.com/chronotrack-api:"$VERSION"

docker push 119705507337.dkr.ecr.sa-east-1.amazonaws.com/chronotrack-api:latest
docker push 119705507337.dkr.ecr.sa-east-1.amazonaws.com/chronotrack-api:"$VERSION"
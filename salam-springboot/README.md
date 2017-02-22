#SpringBoot Service

Simple SpringBoot Microservice application

##Create the project for first time

First Install Spring CLI

$ spring --version

spring init --build maven --groupId com.redhat.examples \ --version 1.0 --java-version 1.8 --dependencies web \ --name hola-springboot salam-springboot

Or using Spring Web [Generator](http://start.spring.io/)

##How to run locally:
1. mvn clean install spring-boot:run -Dserver.port=9090
2. open http://localhost:9090/api/salam or http://localhost:9090/api/greeting
3. open http://localhost:9090/health for health status

##Environment Variable:
Please look src/main/resource/application.properties

1. GREETING_SAYING 
2. GREETING_BACKEND_SERVICE_HOST
3. GREETING_BACKEND_SERVICE_PORT
4. HELLOAPP_SAYING


##How to deploy to openshift:
1. oc login $IP:$PORT (please login to openshift cluster by replace $IP and $PORT)
2. mvn clean install docker:build fabric8:json fabric8:apply
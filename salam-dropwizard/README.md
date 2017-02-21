#Dropwizard Service

Simple SpringBoot Microservice application

##How to run locally:
1. mvn clean install spring-boot:run -Dserver.port=9090
2. open http://localhost:9005/api/salam or http://localhost:9005/api/greeting
3. open http://localhost:9006 for health status

##Environment Variable:
Please look conf/application.yml
1. GREETING_SAYING 
2. GREETING_BACKEND_SERVICE_HOST
3. GREETING_BACKEND_SERVICE_PORT
4. HELLOAPP_SAYING


##How to deploy to openshift:
1. oc login $IP:$PORT (please login to openshift cluster by replace $IP and $PORT)
2. mvn clean install docker:build fabric8:json fabric8:apply
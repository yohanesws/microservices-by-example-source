#Wildfly Service

Simple Wildfly Swarm Microservice application

##Create the project for first time

There 3 Option to create the project for first time:

1. Valilla Java Application with org.wildfly.swarm Maven Plugin and Depedency
2. Using [Jboss Forge](http://forge.jboss.org/)
3. Using [Web Generator](http://wildfly-swarm.io/generator/)

##How to run locally:
1. mvn clean install wildfly-swarm:run -Dswarm.port.offset=100
2. open http://localhost:8180/api/salam or http://localhost:8180/api/greeting
3. open http://localhost:8180/node or http://localhost:8180/heap or http://localhost:8180/threads for health status

##Environment Variable:
Please look com.redhat.examples.wfswarm.rest.GreeterResource

1. WF_SWARM_SAYING 
2. GREETING_BACKEND_SERVICE_HOST
3. GREETING_BACKEND_SERVICE_PORT


##How to deploy to openshift:
1. oc login $IP:$PORT (please login to openshift cluster by replace $IP and $PORT)
2. mvn clean install docker:build fabric8:json fabric8:apply
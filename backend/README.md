#Backend Service

Simple servlet application

##How to run locally:
1. mvn clean install jetty:run
2. open http://localhost:8080/api/backend?greeting=salam%20framework

Return JSON Example:
{
  "greeting" : "salam framework dari cluster Backend",
  "time" : 1487668062455,
  "ip" : "192.168.15.129"
}

##How to deploy to openshift:
1. oc login $IP:$PORT (please login to openshift cluster by replace $IP and $PORT)
2. mvn clean install docker:build fabric8:json fabric8:apply
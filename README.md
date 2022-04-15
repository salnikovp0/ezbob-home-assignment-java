# Ezbob home assignment solution

### project include 2 services:
service-log: log the requests
service-shuttle: generate no duplicate array of integers

### instruction to run:
 1. from root folder, cd service-log, mvn install, mvn spring-boot:run 
 2. from root folder, cd service-shuffle, mvn install, mvn spring-boot:run

### test:
curl -X POST -H "Content-Type: application/json" -d '{"value": 10}' http://localhost:8080/shuffle




Generates random price and pushes to kafka topic.

Consumer processes prices and displays them via server side event push.

docker-compose up

mvn compile quarkus:dev

http://localhost:8080/prices.html

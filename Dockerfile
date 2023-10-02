FROM openjdk:17
ADD ./clients-api-test.jar clients-api-test.jar
ENTRYPOINT ["java","jar","*clients-api-test.jar"]
FROM openjdk:17
ADD ./clientes-apirest.jar clientes-apirest.jar
ENTRYPOINT ["java","jar","*clientes-apirest.jar"]
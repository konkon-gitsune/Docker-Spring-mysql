FROM openjdk:11
ADD build/libs/spring-mysql-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8089
ENTRYPOINT ["java","-jar","/app.jar"]
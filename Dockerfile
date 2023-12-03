FROM openjdk:17-jdk-alpine
EXPOSE 8989
ARG JAR_FILE=target/*jar
COPY ./target/team9-rating-docker.jar team9.jar
ENTRYPOINT ["java","-jar","/team9.jar"]
#test
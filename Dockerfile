FROM amazoncorretto:17-alpine3.18-jdk
LABEL maintainer=csmervyn@gmail.com
WORKDIR /app
COPY build/libs/spring-boot-command-line-runner-demo-0.0.1-SNAPSHOT.jar .
ENTRYPOINT ["java", "-jar", "/app/spring-boot-command-line-runner-demo-0.0.1-SNAPSHOT.jar"]

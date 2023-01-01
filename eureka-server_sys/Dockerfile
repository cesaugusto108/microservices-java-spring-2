FROM openjdk:11
VOLUME /tmp
EXPOSE 8761
ADD ./target/eureka-server_sys-0.0.1-SNAPSHOT.jar eureka-server_sys-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "eureka-server_sys-0.0.1-SNAPSHOT.jar"]
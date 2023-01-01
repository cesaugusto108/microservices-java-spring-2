FROM openjdk:11
VOLUME /tmp
EXPOSE 8765
ADD ./target/api-gateway_sys-0.0.1-SNAPSHOT.jar api-gateway_sys-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java", "-jar", "api-gateway_sys-0.0.1-SNAPSHOT.jar"]
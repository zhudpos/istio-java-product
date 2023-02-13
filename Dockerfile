FROM openjdk:8-jdk-alpine
COPY target/istio-java-product-0.0.1-SNAPSHOT.jar.jar app.jar
ENTRYPOINT ["java","-jar","app.jar"]

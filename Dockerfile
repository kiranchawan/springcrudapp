FROM openjdk:18
COPY target/springcrud.jar  /usr/app/
WORKDIR /usr/app/
EXPOSE 8080
ENTRYPOINT [ "java","-jar","springcrud.jar" ]
FROM java:8-jdk-alpine

COPY ./target/e-shop-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

RUN sh -c 'touch e-shop-0.0.1-SNAPSHOT.jar'

ENTRYPOINT ["java","-jar","e-shop-0.0.1-SNAPSHOT.jar"]
## docker build -t e-shop-backend .
## docker run -d -p 8080:8080 --name e-shop-backend e-shop-backend

# Nani GraphQL web server 

Boilerplate Project creating a **GraphQL Web Server** with **SpringBoot**, **Kotlin** and **MongoDB**.

> **WARNING**: This is not prod ready
> 

## Running

### With docker

To test the application you can run `docker-compose up` to run a container with `MongoDB` and another one with a `webserver` .

### Manually

To run manually you need to have
- mongodb instance running on your machine
- java 8 or above installed

After cloning the project, run `./gradlew bootRun` to test the development version or `./gradlew clean build` to generate a `.jar` file in `build/libs/my-app.jar` which can be executed with `java -jar ./build/libs/my-app.jar`   


## Usage

Use the GraphQL interactive console (graphiql) by accessing `http://localhost:9000`.

There you can make queries to list of `snacks` and its `reviews`. We have implemented a CRUD for stacks and reviews.


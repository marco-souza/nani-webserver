FROM alpine:edge

WORKDIR /app

ADD ./ /app/

RUN apk add --no-cache openjdk8 && \
    ./gradlew clean

CMD ["./gradlew", "bootRun"]

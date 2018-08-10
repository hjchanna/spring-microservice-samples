#!/bin/sh
java                                                       \
    -Djava.security.egd=file:/dev/./urandom                \
    -Dserver.port=$SERVER_PORT                             \
    -Dspring.profiles.active=$PROFILE                      \
    -jar /opt/@project.artifactId@/@project.build.finalName@.jar
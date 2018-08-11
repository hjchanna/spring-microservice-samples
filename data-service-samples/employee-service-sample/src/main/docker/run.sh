#!/bin/sh
echo "********************************************************"
echo "Waiting for the MySQL server to start on port 3306"
echo "********************************************************"
while ! `nc -z mysql 3306`; do sleep 3; done
echo "******* MySQL Server has started"


java                                                       \
    -Djava.security.egd=file:/dev/./urandom                \
    -Dserver.port=$SERVER_PORT                             \
    -Dspring.profiles.active=$PROFILE                      \
    -jar /opt/@project.artifactId@/@project.build.finalName@.jar
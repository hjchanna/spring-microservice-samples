FROM openjdk:8-jdk-alpine
RUN apk update && apk upgrade && apk add netcat-openbsd
RUN mkdir -p /opt/@project.artifactId@
ADD @project.build.finalName@.jar  /opt/@project.artifactId@/
ADD run.sh /opt/@project.artifactId@/
RUN chmod +x /opt/@project.artifactId@/run.sh
CMD ./opt/@project.artifactId@/run.sh
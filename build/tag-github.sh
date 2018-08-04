#!/usr/bin/env bash
export GITHUB_TOKEN="b58fec28a7f7ded72e67656052640235e11074db"
export TARGET_URL="https://api.github.com/repos/hjchanna/spring-microservice-samples/releases?access_token=$GITHUB_TOKEN"

body="{
  \"tag_name\": \"$BUILD_NAME\",
  \"target_commitish\": \"master\",
  \"name\": \"$BUILD_NAME\",
  \"body\": \"Release of version $BUILD_NAME\",
  \"draft\": true,
  \"prerelease\": true
}"

curl -k -X POST \
  -H "Content-Type: application/json" \
  -d "$body" \
  $TARGET_URL
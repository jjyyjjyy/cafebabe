#!/usr/bin/env bash

set -ex

PROJECT_DIR=$(pwd)
PROJECT_NAME=$(basename ${PROJECT_DIR})
TMP_DIR=/tmp/blog/
ORIGIN_ADDRESS=git@github.com:jjyyjjyy/${PROJECT_NAME}.git
ORIGIN_BRANCH=gh-pages

rm -rf ${TMP_DIR} && mkdir -p ${TMP_DIR}
cd ${TMP_DIR} || return
git init
git remote add origin ${ORIGIN_ADDRESS}
git fetch -p
git checkout ${ORIGIN_BRANCH}

cd ${PROJECT_DIR}/notes || return
mvn clean initialize asciidoctor:process-asciidoc
cp -r target/generated-docs/** ${TMP_DIR}

cd ${TMP_DIR} || return
git add .
git commit -m ":rocket: Update"
git push --set-upstream origin ${ORIGIN_BRANCH}
cd - || return
echo "${ORIGIN_BRANCH} sync successfully!"

#!/usr/bin/env bash

NOTE_DIR=$(pwd)
TMP_DIR=/tmp/blog/
ORIGIN_ADDRESS=git@github.com:jjyyjjyy/tech.git
ORIGIN_BRANCH=gh-pages

rm -rf ${TMP_DIR} && mkdir -p ${TMP_DIR}
cd ${TMP_DIR} || return
git init
git remote add origin ${ORIGIN_ADDRESS}
git fetch -p
git checkout ${ORIGIN_BRANCH}

cd ${NOTE_DIR}/notes || return
mvn clean asciidoctor:process-asciidoc
cp -r target/generated-docs/** ${TMP_DIR}

cd ${TMP_DIR} || return
git add .
git commit -m ":rocket: Update"
git push --set-upstream origin ${ORIGIN_BRANCH}
cd - || return
echo "${ORIGIN_BRANCH} sync successfully!"

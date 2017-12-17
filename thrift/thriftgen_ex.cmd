#!/bin/sh

THRIFT_EXE=thrift
THRIFT_VER=9

#Java
rm -f recommendwebservice-thrift/gen-java/*/*/*/*/*/*
#zactransaction
$THRIFT_EXE --gen java -o recommendwebservice-thrift recommendwebservice_object.thrift
$THRIFT_EXE --gen java -o recommendwebservice-thrift recommendwebservice_service.thrift

#-------------------------------------------------------------------------------
#Java build & deploy

PROJECT_NAME=recommendwebservice-thrift
PROJECT_DIR=recommendwebservice-thrift
VERSION=1.0.0.0

#common variables
DEPLOY_JAR="$PROJECT_NAME""$THRIFT_VER"-"$VERSION".jar

#build
ant -f $PROJECT_DIR/build.xml clean
ant -f $PROJECT_DIR/build.xml -Djavac.debug=false -Djar.compress=true -Ddist.jar=dist/$DEPLOY_JAR jar

cp -f $PROJECT_DIR/dist/$DEPLOY_JAR ../lib

#clean
#ant -f $PROJECT_DIR/build.xml clean


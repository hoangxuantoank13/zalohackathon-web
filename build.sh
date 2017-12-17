#!/bin/sh

#setup JAVA environment
#. /zserver/java/set_env.cmd

_DEBUG=true
_COMPRESS=true
_MAINCLASS=com.sk.recommendwebservice.app.MainApp
_DISTJAR=RecommendWebService.jar
_ORIGIN_DISTJAR=RecommendWebService.jar

#change main class of NB project.properties
sed 's/^main.class=.*/main.class='$_MAINCLASS'/' nbproject/project.properties -i
echo "Change main class: $_MAINCLASS"

ant clean #clean first
rm -f dist/$_DISTJAR
rm -f manifest.mf

_CMD="ant jar -Djavac.debug=$_DEBUG -Djar.compress=$_COMPRESS"
$_CMD
echo Done by build command: $_CMD

#mv dist/$_ORIGIN_DISTJAR dist/$_DISTJAR
echo "Main class of $_DISTJAR: $_MAINCLASS"


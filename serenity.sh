#!/usr/local/bin/bash

display_usage() {
  echo "This script must be run with at least 2 arguments"
  echo -e "Usage:" $0 "[iOS|android]"
}

if [  $# -lt 1 ]
then
      display_usage
      exit 1
fi

mvn -U -DskipTests=true clean install
case $1 in 
  iOS)
    mvn clean verify -P single -Dcucumber.filter.tags="@mobile" -Dcucumber.glue="demo.stepdefinitions" 
    ;;
  iOS_realdevice)
    mvn clean verify -Dcucumber.filter.tags="@mobile" -Dcucumber.glue="demo.stepdefinitions" -Dproperties=serenity.ios.real.devices.properties
    ;;
  *)
    display_usage
    exit 1
    ;;
esac
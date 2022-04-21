#!/usr/bin/env sh

if [ -z "${HOST}" ]; then
  echo "Missing HOST enviroment variable"
  exit 1
fi

sed -i "s/{HOST}/${HOST}/" /postman/*.json
newman run /postman/*.json -e /postman/postman.enviroment.json
#!/bin/bash
echo Executing: curl -X GET http://localhost:8080/customers/100
curl -X GET -i http://localhost:8080/customers/100

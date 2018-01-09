#!/bin/bash
echo Executing: curl -X DELETE http://localhost:8080/customers/101
curl -X DELETE -i http://localhost:8080/customers/101

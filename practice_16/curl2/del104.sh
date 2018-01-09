#!/bin/bash
echo Executing: curl -X DELETE http://localhost:8080/customers/104
curl -X DELETE -i http://localhost:8080/customers/104

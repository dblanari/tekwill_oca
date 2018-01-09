#!/bin/bash
echo Executing: curl -X PUT -H "Content-Type: application/json" -d http://localhost:8080/customers/102
curl -X PUT -i -H "Content-Type: application/json" -d '{"id":102, "firstName":"James","lastName":"Polk","email":"jpolk@example.com","city":"Pineville","state":"NC", "birthday":"1833-03-04"}' http://localhost:8080/customers/102

#!/bin/bash
echo Executing: curl -X POST -H "Content-Type: application/json" -d http://localhost:8080/customers
curl -X POST -i -H "Content-Type: application/json" -d '{"id":106, "firstName":"John","lastName":"Doe","email":"jdoe@example.com","city":"Witchita","state":"KS", "birthday":"1995-02-25"}' http://localhost:8080/customers

#!/bin/bash
echo Executing: curl -X POST -H "Content-Type: application/json" -d http://localhost:8080/customers
curl -X POST -i -H "Content-Type: application/json" -d '{"id":105, "firstName":"Abigail","lastName":"Adams","email":"aadams@example.com","city":"Braintree","state":"MA", "birthday":"1744-11-22"}' http://localhost:8080/customers

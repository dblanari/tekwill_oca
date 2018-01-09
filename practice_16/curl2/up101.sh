#!/bin/bash
echo Executing: curl -X PUT -H "Content-Type: application/json" -d http://localhost:8080/customers/101
curl -X PUT -i -H "Content-Type: application/json" -d '{"id":101, "firstName":"John Quincy","lastName":"Adams","email":"jqadams@example.com","city":"Braintree","state":"MA", "birthday":"1767-07-11"}' http://localhost:8080/customers/101

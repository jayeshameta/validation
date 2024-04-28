This project intercepts all the incoming API requests and validating input data ensuring the integrity and security of data passed to the system.

To test the service use postman or any web browser and hit endpoint:

http://localhost:8080/api/validateData?name=xyz&age=xy

where xyz and xy are the values of name and age which would be validated in this validation service.

For this service, name validation is checking if the name sent in the request is "name" and age is "25" or not. If not then it will send "Name should be name" or "Age should be 25" respectively.

Similarly, we can check for the requestbody, Pathvariable or we can read entire payload and then check for any condition.

The class used for intercepting is RequestInterceptor.
The validation rules or fields are taken from application.properties , we can take it from any property class we want.

Java version used here is Java17.


# api-checking-framework

A simple program to automate tests against a booking API.

### Requirements

* Junit 4.13
* Spring 4.3.0
* Jackson 2.5.4
* Docker
* MongoDB
* Download and run API Service: https://github.com/ministryoftesting/restful-booker

## Deployment

Use docker for running the API, seems like `npm start` wasn't spinning up the Database. Go to `localhost:3001/ping` to know that everything is in place.

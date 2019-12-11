# BasicSpringBootAndDocker
A Basic SpringBoot application hosted in docker..

Refer the DockerCOmmands file for details to deploy in docker.

------------------------------------------------------------------------
To Test:
run the url in the browser "http://localhost:8085/rest/docker/hello"

------------------------------------------------------------------------

Below POST API can be used for testing too:

URL:http://localhost:8085/rest/docker/login

HTTP Method: POST

Request Body: 
{
	"userId":"ABC",
	"password":"ABC123"
}

Response Body: 
{
    "loginMessage": "Logged in successfully !",
    "userId": "ABC",
    "password": "ABC123",
    "name": "Saanvi Roy Choudhury",
    "age": 18 
}

# UI Project:

This API project also has a UI. You can use that if needed for playing around. The UI project is in this github account
named "BasicAngularAndDocker". Please refer to that project for details and how to integrate and use it.

-----------------------------------------------------------------------

Installing Java-8 in Ubuntu: 
sudo add-apt-repository ppa:openjdk-r/ppa
sudo apt-get update
sudo apt-get install openjdk-8-jdk
sudo update-alternatives --config java
sudo update-alternatives --config javac

----------------------------------------------------------------------

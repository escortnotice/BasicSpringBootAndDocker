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

# Docker Image :

https://hub.docker.com/repository/docker/escortnotice/basicspringbootanddocker

# UI Project:

This API project also has a UI. You can use that if needed for playing around. The UI project is in this github account
named "BasicAngularAndDocker". Please refer to that project for details and how to integrate and use it.

-----------------------------------------------------------------------
# Setup Ubuntu VM::
	## Installing Java-8 in Ubuntu: 

	sudo add-apt-repository ppa:openjdk-r/ppa

	sudo apt-get update

	sudo apt-get install openjdk-8-jdk

	sudo update-alternatives --config java

	sudo update-alternatives --config javac

	## Clone the repo
	git clone https://github.com/escortnotice/BasicSpringBootAndDocker.git

	## build the application to generate a jar in "target" folder of the project
	cd  BasicSpringBootAndDocker
	./mvnw package

	## start the application
	java -jar target/docker-spring-boot.jar 

	## test the application (Verify Inbound access to the port-8085, protocol-TCP in the vm is added ) 
	 run the url in the browser "http://<ip address>:8085/rest/docker/hello"

----------------------------------------------------------------------

# Docker Build Command to build an image and push to Docker Hub

Build the app with production environment file -> mvn clean build 

Build the docker image with the new build --> docker build -t escortnotice/basicspringbootanddocker:v10.0 .

Push to docker hub --> docker push escortnotice/basicspringbootanddocker:v10.0



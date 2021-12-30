# azure-function-incidentbot
Incident Bot in Java on Azure Functions

## PreRequisites

* Install Java on your machine : https://www.geeksforgeeks.org/how-to-download-and-install-java-for-64-bit-machine/
* Install Intellji Community Edition  on your machine : https://www.jetbrains.com/idea/download/
* Install Azure Functions Core Tools 3 on your machine : https://docs.microsoft.com/en-us/azure/azure-functions/functions-run-local?tabs=v4%2Cmacos%2Ccsharp%2Cportal%2Cbash%2Ckeda


## Buidling the CodeBase

- ``` mvn clean package  ```

## Running the CodeBase

- ``` mvn azure-functions:run  ```

## Local Testing the CodeBase

- ``` curl -v http://localhost:7071/api/IncidentBot  ```


## Deployment on Azure

* Medium Link https://blog.devgenius.io/incident-bot-on-azure-functions-ed20da8af478




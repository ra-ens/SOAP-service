# Bank SOAP Service
This project provides an Object Access Protocol (SOAP) service for a bank transactions. 
The service allows clients to perform various banking operations, such as:
- Converting from EURO to MAD.
- Viewing all accounts
- Consulting account by id

## Prerequisites
Before you can use the SOAP service, you will need to install the following dependencies:

- Java 8 or later
- Apache Maven 3.6.0 or later

## Installation
To install and set up the SOAP service, follow these steps:

1. Clone the repository to your local machine: `git clone https://github.com/ra-ens/SOAP-service.git`
2. Navigate to the "bank-soap" directory: `cd SOAP-service/bank-soap`
3. Build the project using Maven: `mvn clean install`
4. Run the service using Maven: `mvn jetty:run`

## Usage
Once the SOAP service is running, you can use a tool such as SoapUI to interact with the service and perform various banking operations or one of the clients in this repo (java, PHP...). 
The service provides the following operations:

- **convert**: converting from EURO to MAD
- **getComptes**: Viewing all accounts
- **getCompte**: Consulting account by id

## Java client
1. Navigate to the "client-soap" directory: `cd SOAP-service/client-soap`
2. Build the project using Maven: `mvn clean install`
3. Run the service using Maven: `mvn jetty:run`

## PHP client
To use the php client you will need a php server like `Xampp`.
1. Copy "client-php" to htdocs of your xampp.
2. Run xampp apache
3. Open `localhost/client-php/src` in your browser

## License
This project is licensed under the MIT License

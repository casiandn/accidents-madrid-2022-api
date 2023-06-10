# AccidentsAPI

AccidentsAPI is a RESTful API that provides information about accidents that occurred in Madrid in 2022. It allows users to retrieve accident data, including details of the accidents and associated passenger information.

## Technologies Used

- Java
- JPA
- Spring Boot
- Hibernate
- MySQL
- Maven

## Getting Started

### Prerequisites

- Java Development Kit (JDK) 8 or higher
- MySQL database

Entities:
![imagen](https://github.com/casiandn/accidents-madrid-2022-api/assets/69772739/98fd38e6-bbd0-47c6-9e05-47159c954a89)


Field	English Description	Spanish Description
recordNumber	The record number of the accident	Número de registro del accidente
date	The date of the accident (format: dd/mm/yyyy)	Fecha del accidente (formato: dd/mm/aaaa)
time	The time of the accident	Hora del accidente
location	The location of the accident	Ubicación del accidente
number	The number associated with the accident	Número asociado al accidente
districtCode	The district code of the accident	Código del distrito del accidente
district	The district where the accident occurred	Distrito donde ocurrió el accidente
accidentType	The type of accident	Tipo de accidente
weatherCondition	The weather condition at the time of the accident	Condición climática en el momento del accidente
coordinateXUtm	The X-coordinate in the UTM coordinate system	Coordenada X UTM en el sistema de coordenadas UTM
coordinateYUtm	The Y-coordinate in the UTM coordinate system	Coordenada Y UTM en el sistema de coordenadas UTM
passengers	A list of passengers involved in the accident	Lista de pasajeros involucrados en el accidente

Passengers

The passengers field represents a list of passengers involved in the accident. Each passenger object in the list contains the following fields:
Field	English Description	Spanish Description
id	The identifier of the passenger	Identificador del pasajero
personType	The type of person involved	Tipo de persona involucrada
ageRange	The age range of the person	Rango de edad de la persona
gender	The gender of the person	Género de la persona
severityType	The severity of the person's injuries	Gravedad de las lesiones de la persona
positiveAlcohol	Indicates whether the person tested positive for alcohol (Y/N)	Indica si la persona dio positivo en la prueba de alcohol (S/N)
vehicleType	The type of vehicle the person was in	Tipo de vehículo en el que se encontraba la persona

Severity Codes

The severity codes represent the severity of a person's injuries. The following severity codes and their corresponding descriptions are used:
Severity Code	English Description	Spanish Description
1	MILD - Emergency care without subsequent hospitalization	LEVE - Atención de emergencia sin hospitalización posterior
2	MILD - Hospitalization up to 24 hours	LEVE - Hospitalización hasta 24 horas
3	SEVERE - Hospitalization exceeding 24 hours	GRAVE - Hospitalización superior a 24 horas
4	FATAL - Deceased within 24 hours	FATAL - Fallecido dentro de las 24 horas
5	MILD - Outpatient care after the accident	LEVE - Atención ambulatoria después del accidente
6	MILD - Immediate medical care at a health center	LEVE - Atención médica inmediata en un centro de salud
7	MILD - Medical care only at the scene of the accident	LEVE - Atención médica solo en el lugar del accidente
14	MILD - No medical care provided	LEVE - No se proporcionó atención médica
77	Unknown	Desconocido

## API Endpoints

For the documentation we use Swagger: http://localhost:8080/swagger-ui/index.html#/


## Installation

1. Clone the repository: git clone https://github.com/your-username/accidents-api.git


2. Configure the database connection in the `application.properties` file


3. Build the project using Maven: mvn clean install

4. Start the server: The API will be accessible at `http://localhost:8080`.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please create a new issue or submit a pull request.


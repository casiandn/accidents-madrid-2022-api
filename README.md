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

## Accident Fields

- `recordNumber`: The record number of the accident.
- `date`: The date of the accident (format: dd/mm/yyyy).
- `time`: The time of the accident.
- `location`: The location of the accident.
- `number`: The number associated with the accident.
- `districtCode`: The district code of the accident.
- `district`: The district where the accident occurred.
- `accidentType`: The type of accident.
- `weatherCondition`: The weather condition at the time of the accident.
- `coordinateXUtm`: The X-coordinate in the UTM coordinate system.
- `coordinateYUtm`: The Y-coordinate in the UTM coordinate system.
- `passengers`: A list of passengers involved in the accident.

## Passengers

The `passengers` field represents a list of passengers involved in the accident. Each passenger object in the list contains the following fields:

- `id`: The identifier of the passenger.
- `personType`: The type of person involved (e.g., driver, pedestrian, witness, traveler).
- `ageRange`: The age range of the person.
- `gender`: The gender of the person (male, female, unknown).
- `severityType`: The severity of the person's injuries.
- `positiveAlcohol`: Indicates whether the person tested positive for alcohol (S/N).
- `vehicleType`: The type of vehicle the person was in.

## Severity Codes

The severity codes represent the severity of a person's injuries. The following severity codes and their corresponding descriptions are used:

| Severity Code | English Description |
|---------------|---------------------------------------------------------|
| 1             |  MILD - Emergency care without subsequent hospitalization |
| 2             |  MILD - Hospitalization up to 24 hours                   |
| 3             |  SEVERE - Hospitalization exceeding 24 hours             |
| 4             |  FATAL - Deceased within 24 hours                        |
| 5             |  MILD - Outpatient care after the accident   |
| 6             | MILD - Immediate medical care at a health center  |
| 7             | MILD - Medical care only at the scene of the accident |
| 14            | MILD - No medical care provided                    |
| 77            | Unknown                                            |

## API Endpoints

### Get Accidents

Retrieves a page of accidents with a specified size.

**Endpoint:** `GET /accidents`

**Parameters:**

- `page` (optional): The page number (default: 0).
- `size` (optional): The number of records per page (default: 10).

**Response:**

- 200 OK: The list of accidents. This list can be empty if no accidents are found.

**Examples:**

- Request: `GET /accidents`
- Request: `GET /accidents?page=1`
- Request: `GET /accidents?page=1&size=10`

### Get Accident by Record Number

Retrieves the accident information based on the specified record number.

**Endpoint:** `GET /accidents/{recordNumber}`

**Parameters:**

- `recordNumber` (required): The record number of the accident.

**Response:**

- 200 OK: Returns the accident with the specified record number.
- 404 Not Found: If the accident is not found.

**Examples:**

- Request: `GET /accidents/2022S000018`

## Installation

1. Clone the repository: git clone https://github.com/your-username/accidents-api.git


2. Configure the database connection in the `application.properties` file


3. Build the project using Maven: mvn clean install

4. Start the server: The API will be accessible at `http://localhost:8080`.

## Contributing

Contributions are welcome! If you find any issues or have suggestions for improvements, please create a new issue or submit a pull request.


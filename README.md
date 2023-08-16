# GitHub Messaging App with Spring Boot, Maven, and Thymeleaf

Welcome to the GitHub Messaging App project! This messaging application enables users to log in using their GitHub IDs and exchange messages with other users. The app is built using the Spring Boot framework, managed by Maven, and utilizes Thymeleaf for frontend rendering. Data is stored in the Apache Cassandra database, leveraging the Astra DB service.

## Features

- **User Authentication:** Users can securely log in using their GitHub IDs.
- **Message Exchange:** Logged-in users can easily exchange messages with other app users.
- **Astra DB Integration:** The app seamlessly integrates with Apache Cassandra, utilizing the Astra DB service for data storage.

## Prerequisites

Before you begin, make sure you have the following prerequisites:

- Java Development Kit (JDK) 11 or higher installed
- Maven installed
- An Apache Cassandra Astra DB account (username, password, secure connect bundle)
- GitHub accounts for each user of the application

## Getting Started

1. Clone the repository to your local machine:

   ```bash
   git clone https://github.com/your-username/messaging-app.git
   ```

2. Navigate to the project directory:

   ```bash
   cd messaging-app
   ```

3. Open the `src/main/resources/application.properties` file and configure the Astra DB connection:

   ```properties
   # Astra DB Configuration
   spring.data.cassandra.contact-points=your-contact-points
   spring.data.cassandra.username=your-username
   spring.data.cassandra.password=your-password
   spring.data.cassandra.keyspace-name=your-keyspace-name
   spring.data.cassandra.local-datacenter=your-datacenter
   spring.data.cassandra.cloud.secure-connect-bundle=classpath:secure-connect-your-secure-connect-bundle.zip
   ```

4. Build the project using Maven:

   ```bash
   mvn clean install
   ```

5. Run the application:

   ```bash
   mvn spring-boot:run
   ```

6. Open a web browser and navigate to `http://localhost:8080` to access the app.

7. Log in using your GitHub ID.

## Usage

1. Log in using your GitHub ID.
2. Navigate to the messaging interface.
3. Choose a user to start a conversation with.
4. Exchange messages in real time.

## Contributing

We welcome contributions to enhance the GitHub Messaging App. Here's how you can contribute:

1. Fork the repository.
2. Create a new branch for your feature or improvement.
3. Make your changes and commit them.
4. Push your changes to your fork.
5. Submit a pull request to the `main` branch of the original repository.

## License

This project is licensed under the MIT License. See the [LICENSE](LICENSE) file for details.

---

Thank you for using the Messaging App! If you encounter any issues or have suggestions for improvements, please feel free to create an issue or contact us.
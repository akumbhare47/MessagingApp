# GitHub Messaging App with Spring Boot, Maven, Thymeleaf, and OAuth2

Welcome to the GitHub Messaging App project! This messaging application allows users to log in using their GitHub IDs via OAuth2 authentication and exchange messages with other users. The app is built using the Spring Boot framework, managed by Maven, and leverages Thymeleaf for frontend rendering. Data is stored in the Apache Cassandra database, utilizing the Astra DB service.

## Features

- **OAuth2 Authentication:** Users can securely log in using their GitHub accounts.
- **Message Exchange:** Logged-in users can easily exchange messages with other app users.
- **Astra DB Integration:** The app seamlessly integrates with Apache Cassandra, utilizing the Astra DB service for data storage.

## Prerequisites

Before you begin, make sure you have the following prerequisites:

- Java Development Kit (JDK) 11 or higher installed
- Maven installed
- An Apache Cassandra Astra DB account (username, password, secure connect bundle)
- GitHub OAuth2 application credentials (Client ID and Client Secret)

## Getting Started

1. Clone the repository to your local machine:

   ```bash
   git clone https://github.com/akumbhare47/messaging-app.git
   ```

2. Navigate to the project directory:

   ```bash
   cd messaging-app
   ```

3. Open the `src/main/resources/application.yml.dist` file and configure the Astra DB connection:

   ```properties
   # Astra DB Configuration
   spring.data.cassandra.contact-points=your-contact-points
   spring.data.cassandra.username=your-username
   spring.data.cassandra.password=your-password
   spring.data.cassandra.keyspace-name=your-keyspace-name
   spring.data.cassandra.local-datacenter=your-datacenter
   spring.data.cassandra.cloud.secure-connect-bundle=classpath:secure-connect-your-secure-connect-bundle.zip
   ```

4. Configure GitHub OAuth2 credentials in the same file:

   ```properties
   # GitHub OAuth2 Configuration
   spring.security.oauth2.client.registration.github.client-id=your-client-id
   spring.security.oauth2.client.registration.github.client-secret=your-client-secret
   ```

5. Build the project using Maven:

   ```bash
   mvn clean install
   ```

6. Run the application:

   ```bash
   mvn spring-boot:run
   ```

7. Open a web browser and navigate to `http://localhost:8080` to access the app.

8. Log in using your GitHub account.

## Usage

1. Log in using your GitHub account.
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

Thank you for using the GitHub Messaging App! If you encounter any issues or have suggestions for improvements, please feel free to create an issue or contact us.
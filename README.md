# Project: CatchyLabs (Gauge Test Suite)

## Project Summary
### Overview
This project is a **web-based financial application** designed to manage account-related operations such as money transfers, account updates, and adding funds. The automation focuses on validating core functionalities to ensure a secure, efficient, and user-friendly experience for managing financial transactions.

Key features of the project include:
- Test scenarios developed using the **Gauge Framework**
- Integration with **ReportPortal** for centralized test reporting
- Modular and extensible architecture
- JSON-based element definitions

---

## How to Run
Follow the steps below to run the project:

1. **Ensure Prerequisites**
    - Java 11 or higher
    - Maven 3.8 or higher
    - ChromeDriver or FirefoxDriver of a compatible version

2. **Run Commands**
   ```bash
   # Run all tests
   mvn clean test

   # Run tests with specific tags
   mvn gauge:execute -DspecsDir=specs -Dtags="<tag_name>"

   # Run tests with ReportPortal integration enabled
   mvn clean test -Dreportportal.enabled=true
   ```

---

## Setup Instructions
To run the project locally, follow these steps:

## Gauge Installation and Plugin Setup

### Requirements:
- **Gauge version**: 1.6.11
- Ensure the following plugins are installed:
  - `html-report (4.3.1)`
  - `java (0.11.2)`
  - `reportportal (1.17.0)`
  - `screenshot (0.0.1)`
  - `spectacle (0.2.1)`
  - `xml-report (0.5.1)`

### Installation Steps:
1. **Install Gauge**:
   - Download and install Gauge from the [official Gauge website](https://gauge.org/download/) for your operating system.

2. **Check Gauge Version**:
   - Verify the installation by running the following command:
     ```bash
     gauge -v
     ```
     This command should display the installed version of Gauge and the list of installed plugins. Ensure the plugin list matches the required plugins above.

3. **Install Required Plugins**:
   - Install the required plugins using the following commands:
     ```bash
     gauge install html-report
     gauge install java
     gauge install reportportal
     gauge install screenshot
     gauge install spectacle
     gauge install xml-report
     ```
   
1. **Clone the Repository**
   ```bash
   git clone https://github.com/eyupcanbilgin/Gauge-ReportPortal-Json.git
   cd Gauge-ReportPortal-Json
   ```

2. **Install Dependencies**
   ```bash
   mvn clean install
   ```

3. **Configure Settings**
   Edit the `src/test/resources/config.properties` file and fill in the required details:
   ```properties
   BASE_URL=<application_base_url>
   USERNAME=<username>
   PASSWORD=<password>
   CHROME_DRIVER_PATH=<path_to_chromedriver>
   ```

4. **Driver Setup**
    - Add ChromeDriver or FirefoxDriver to the `src/test/resources/web_driver`

---

## ReportPortal Setup and Configuration

### Prerequisites
- Access to a working **ReportPortal** instance
- API token for authentication

### Installation Steps
1. **Install Docker**
    - Ensure Docker is installed and running on your system. For installation instructions, visit [Docker's official website](https://www.docker.com/get-started).

2. **Download and Set Up ReportPortal**
   Run the following commands to set up ReportPortal using Docker Compose:
   ```bash
   curl -LO https://raw.githubusercontent.com/reportportal/reportportal/master/docker-compose.yml
   docker-compose -p reportportal up -d --force-recreate
   ```

   This will download the necessary images and start the ReportPortal services.

3. **Access ReportPortal**
   Once the setup is complete, open your browser and navigate to `http://localhost:8080` (or your configured endpoint).

### Configuration Steps
1. **Add ReportPortal Details**
   Update the `env/default/default.properties` file with the following:
   ```properties
   rp_enabled=true
   rp_url=http://<your_reportportal_endpoint>
   rp_project=<your_project_name>
   rp_uuid=<your_token>
   ```

2. **Run Tests with ReportPortal Integration**
   Execute the following Maven command to run tests and send results to ReportPortal:
   ```bash
   mvn clean test -Drp_enabled=true
   ```

3. **Verify Results in ReportPortal**
    - Open the ReportPortal UI and navigate to your project.
    - View test execution results, logs, and dashboards.



---

## Source Code Version Control

### Branch Management
- Each user creates a branch for their feature development.
- Branch naming convention: `feature/<feature_name>` or `bugfix/<issue_id>`

### Commit Messages
- **Standard Commit Format:**
  ```
  [TYPE] <short_description>

  [TYPE]:
  - feat: New feature
  - fix: Bug fix
  - docs: Documentation updates
  ```

### Merge Rules
- All merge requests require at least one code review approval.
- Direct pushes to the `master` branch are prohibited.

---

## Tag Management
Tags are used to categorize tests. Examples:
- `@smoke`: Smoke tests
- `@regression`: Regression tests
- `@critical`: Critical tests

Command to run tests by tag:
```bash
mvn gauge:execute -Dtags="@smoke"
```

---

## Maven Commands

- Run all tests:
  ```bash
  mvn clean test
  ```

- Run a specific `spec` file:
  ```bash
  mvn gauge:execute -DspecsDir=specs/account
  ```

- Run tests with specific tags:
  ```bash
  mvn gauge:execute -Dtags="@regression"
  ```

---

## Directory Structure

```plaintext
TestiniumTerfiTeslim
├── .gauge             # Gauge Framework configuration files
├── specs              # Test scenarios (.spec files)
│   ├── account
│   ├── add_money
│   ├── edit_account
│   └── transfer_money
├── src
│   └── test
│       ├── java
│       │   ├── com.banking.model      # Model classes
│       │   ├── com.banking.pages      # Page objects
│       │   ├── com.banking.stepImp    # Gauge step implementations
│       │   └── com.banking.utils      # Utility classes
│       └── resources
│           ├── elementValues          # JSON-formatted element definitions
│           └── config.properties      # Test configurations
├── pom.xml            # Maven configuration file
└── README.md          # Project documentation
```

---

## Contact
For any questions, please reach out to:
- [Eyüpcan Bilgin](mailto:eyupcanbilgin.uni@gmail.com)

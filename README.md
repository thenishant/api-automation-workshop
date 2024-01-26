# Ultralesson API Automation Workshop

### Project Setup

This repository contains the initial setup for the API automation workshop. It includes essential dependencies and a basic environment check test to ensure everything is working correctly.

### Getting Started

### Forking and Cloning the Repository

-   **Fork the Repository:** Start by forking this repository to your own GitHub account. This provides you with a personal copy to work on independently.

    -   Navigate to the original GitHub repository.
    -   Click on the `Fork` button at the top right corner.

-   **Clone Your Forked Repository:** After forking, clone your repository to your local machine. This allows you to work on the project locally.

    ```bash
    git clone https://github.com/your-username/your-repository.git
    ```

### Development Environment

-   **Integrated Development Environment (IDE):** You can use any IDE for Java development, but we recommend IntelliJ IDEA for the best experience.
-   **Java and Gradle Compatibility:** Ensure that the Java version installed on your system is compatible with the Gradle version used in the project (**Gradle 8.0, requires Java version < 20**). Refer to the Gradle documentation for [Compatibility Matrix](https://docs.gradle.org/current/userguide/compatibility.html) details if you tend to change the gradle version.

### Setting Up

1. **Open the Project:** Open the cloned repository in your preferred IDE.
2. **Sync Gradle:** Make sure to sync the project with Gradle to download all the necessary dependencies.

### Dependencies

This project kickstarts with the following key dependencies:

-   **RestAssured:** For API testing.
-   **TestNG:** For organizing and running tests.

These are already included in the project's `build.gradle` file.

### Basic Test

The repository includes an environment check test to verify that your setup is correct. You can find this test in the `EnvironmentCheckTest` class.

### Executing the Test Case

Once your environment is set up, you should verify everything is working correctly by running the included test case. You have two options to run the test: using your IDE or the command line.

-   **Using the IDE:**

    -   Open the `EnvironmentCheckTest` class in your IDE.
    -   Run the test using the IDE's built-in test runner. This can usually be done by right-clicking on the test file or the test method and selecting `Run`.

-   **Using the Command Line:**

    -   You can also run the test case via the command line. This is a great way to quickly verify everything is set up correctly.
    -   Navigate to the root directory of your project in the terminal.
    -   Execute the following command:

        ```bash
        ./gradlew test --tests EnvironmentCheckTest
        ```

-   **Test Verification:**
    -   If the test passes and you see all green, it means your environment is correctly set up and ready for the workshop.
    -   If you encounter any errors, check your environment setup and try running the test again.

Remember, running the test case successfully is a good indicator that you have correctly configured your environment and are ready to proceed with the workshop activities.

### Regular sync to remote

You will be making regular updates to your forked repositories as we progress through the workshop.

-   **Committing Changes:** The following are the basic commands to stage the changes and commit the same.

    ```bash
    git add .
    git commit -m "Descriptive message about the change"
    ```

-   **Pushing to GitHub:** To synchronize our local repository with the remote repository on GitHub, we use the `git push` command.

    ```bash
    git push origin main
    ```

As part of this workshop, we will frequently refer to resources and documentation available on the Ultralesson website. To facilitate easy access and enhance our learning experience, we have included direct links to relevant sections of the website.

### Resources

[Swagger Documentation](https://www.apicademy.dev/docs/) for detailed API endpoint information and a [Postman collection](https://www.apicademy.dev/postman-collection-download) for practical interaction with the API used within the workshop.

To complete the setup for the Ultralesson API Automation Workshop, you need to install Postman and import the provided collection. Here are the steps to do this:

#### Postman Installation and Setup

1. **Install Postman:**
   - Visit the [Postman website](https://www.postman.com/downloads/).
   - Download the version of Postman suitable for your operating system.
   - Follow the installation instructions.

2. **Open Postman:**
   - Once installed, launch Postman on your computer.

#### Importing the Collection into Postman

1. **Download the Collection:**
   - Access the [Postman collection download link](https://www.apicademy.dev/postman-collection-download) provided by Ultralesson.
   - Download the collection file to your local machine.

2. **Import the Collection:**
   - In Postman, click on the `Import` button, usually located at the top left of the application.
   - Select the `File` tab in the dialog box that appears.
   - Choose the downloaded collection file or simply drag and drop it into the designated area.
   - Once selected, click `Import` to add the collection to your Postman workspace.

# Master REST Assured Through Our Guided Project

This workshop is anchored around the robust capabilities of REST Assured, a pivotal tool in API testing and automation. To complement the workshop and provide an immersive learning experience, we proudly present our comprehensive [Guided Project on REST Assured](https://ultralesson.ai/guided-projects/07ba6d24-da24-42bb-9fce-de57c6d97378/ac493899-7199-44c4-91f3-f2668cace871) available on UltraLesson.

It's structured to guide you step-by-step, from the foundational aspects to the complexities of test case development using REST Assured.

# Discover More at UltraLesson

At [UltraLesson](https://ultralesson.ai/), we specialize in nurturing Quality Assurance enthusiasts through a unique blend of Guided Projects, Capstones, and Assessments.

-   [Guided Projects](https://ultralesson.ai/guided-projects) are crafted to offer step-by-step learning, ensuring you grasp various tools and languages. Our follow-me solutions provide a smooth learning path, guiding you through complexities with ease.

-   [Capstones](https://ultralesson.ai/capstones) simulate real-world scenarios, challenging you to apply your skills in a practical context. Receive instant, insightful feedback on your code, thanks to our AI-driven review process.

-   Our [Assessments](https://ultralesson.ai/assessments) are tailored to test your knowledge across various tools and programming languages. Coupled with our AI, you receive constructive feedback, helping you understand your strengths and areas for improvement.

# Explore a Diverse Range of Courses at UltraLesson

-   [Selenium - A Comprehensive Deep Dive](https://ultralesson.ai/guided-projects/725a3f08-4eef-4b5c-8324-9e178fa3501b/43287c70-d161-4a86-8eb3-17474609d4d3)

-   [Appium: A Comprehensive Deep Dive](https://ultralesson.ai/guided-projects/648c7ea1-491f-42bd-b02f-6d61de155bc4/c538f7c0-0555-401f-8919-60902926770f)

-   [Web Automation: Framework Mastery](https://ultralesson.ai/guided-projects/f37264dc-2276-49b1-b188-bd28388e1a14/02f2f7f7-ff71-482c-8087-983beeac26e3)

-   [Mobile Automation: Framework Mastery](https://ultralesson.ai/guided-projects/74baf578-5a5f-4d04-aeae-d115598ada48/e6b5a9e4-3f58-4519-8180-1c06a5ae4bba)

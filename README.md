# Simple Java Web Application

This project demonstrates a basic Java web application using Servlets, JSP, and HTML/CSS. It includes a form to capture user information (username and city) and then displays this information dynamically on another page, with a custom message for specific Indian cities.

---

## Project Structure

The project consists of the following components:

* **`HelloServlet.java`**: A basic servlet that displays a "Hello World" message.
* **`MessageLocation.java`**: A utility class to process city names and return a custom message.
* **`ShowOutput.java`**: A servlet that receives user input from the HTML form, processes the city, and displays the username and city message.
* **`web.xml`**: The deployment descriptor for the web application, configuring the welcome file.
* **`form.html`**: An HTML form for users to input their username and city.
* **`index.jsp`**: A simple JSP page displaying the current date.
* **`style.css`**: CSS for styling the `form.html` page.

---

## Technologies Used

* **Java**: Core programming language.
* **Servlets**: Java technology for extending web servers.
* **JSP (JavaServer Pages)**: Technology for creating dynamic web content.
* **HTML5**: For structuring web pages.
* **CSS3**: For styling web pages.
* **Apache Tomcat (or any Servlet Container)**: To deploy and run the web application.

---

## How to Set Up and Run

Follow these steps to get the application running on your local machine:

### Prerequisites

* **JDK (Java Development Kit)**: Version 8 or higher.
* **Apache Tomcat**: Version 8.x or higher (or any compatible Servlet container).
* **Maven (Optional but Recommended)**: For building the project.
* **IDE (Integrated Development Environment)**: IntelliJ IDEA, Eclipse, or VS Code with Java extensions.

### Steps

1.  **Clone the Repository (or create the files manually):**
    If this were a Git repository, you would clone it:
    ```bash
    git clone <repository_url>
    cd <project_directory>
    ```
    Otherwise, create a new Maven web project in your IDE and place the provided files in their respective locations (`src/main/java/com/example` for Java files, `src/main/webapp` for HTML, JSP, CSS, and `WEB-INF/web.xml`).

2.  **Compile the Java Code:**
    If using Maven, navigate to the project root in your terminal and run:
    ```bash
    mvn clean install
    ```
    This will compile your Servlets and package them into a `.war` file.

3.  **Deploy to Tomcat:**
    * Locate the generated `.war` file (usually in the `target/` directory if using Maven).
    * Copy this `.war` file into the `webapps` directory of your Apache Tomcat installation.
    * Start your Tomcat server. Tomcat will automatically deploy the application.

4.  **Access the Application:**
    Open your web browser and navigate to the following URLs:

    * **Main Form:** `http://localhost:8080/<YourWebAppName>/form.html` (Replace `<YourWebAppName>` with the name of your deployed `.war` file without the `.war` extension, e.g., `SimpleWebApp`)
    * **Hello Servlet:** `http://localhost:8080/<YourWebAppName>/welc`
    * **Home Page (JSP):** `http://localhost:8080/<YourWebAppName>/index.jsp`

---

## Usage

1.  **Fill the Form:**
    Go to `http://localhost:8080/<YourWebAppName>/form.html`. Enter a username and a city.
    * Try entering cities like "Kolkata", "Bengaluru", "Mumbai", or "Delhi" to see the specific message.
    * Enter any other city to see the "NA" message.

2.  **Submit the Form:**
    Click the "Submit" button. This will send the data to the `/show` servlet, which will then display the processed output.

---

## Code Explanation

* **`HelloServlet`**: A simple GET request handler that writes HTML directly to the response.
* **`MessageLocation`**: Contains a static method `getMessageByLoc` that takes a city string, converts it to lowercase, trims whitespace, and uses a `switch` expression to return a tailored message or "NA" for unrecognized cities.
* **`ShowOutput`**:
    * Retrieves `username` and `city` parameters from the `HttpServletRequest`.
    * Calls `MessageLocation.getMessageByLoc()` to get the city-specific message.
    * Writes the username and the processed city message back to the client as HTML.
* **`web.xml`**: Configures `form.html` as the default welcome file, meaning when you access the root of your web application (`http://localhost:8080/<YourWebAppName>/`), it will automatically serve `form.html`.
* **`form.html`**: A standard HTML form with two text input fields (`username` and `city`) and a submit button. The `action="/show"` attribute ensures that when the form is submitted, the data is sent to the `ShowOutput` servlet.
* **`index.jsp`**: Demonstrates a basic JSP page that embeds Java code to display the current date and time.
* **`style.css`**: Provides basic styling to make the `form.html` more presentable with a gradient background, centered container, and styled form elements.

---

## Future Enhancements (Ideas for Improvement)

* **Error Handling**: Implement more robust error handling for invalid inputs or server issues.
* **Input Validation**: Add client-side and server-side validation to ensure data quality (e.g., city names are valid).
* **Database Integration**: Store user information in a database.
* **More Cities**: Expand the `MessageLocation` class to include more cities and potentially more complex logic.
* **JSP for Output**: Instead of writing HTML directly in `ShowOutput.java`, forward the request to a JSP page to display the output, separating concerns (logic from presentation).
* **MVC Pattern**: Refactor the application to follow the Model-View-Controller (MVC) architectural pattern for better organization and scalability.
* **Build Automation**: Use Maven or Gradle to manage dependencies and build processes more efficiently.

---

## 📧 Contact

Made with ❤️ by [Annwesha Naha]  
📧 Email: annweshanaha2005@gmail.com
🔗 GitHub: [Annwesha10](https://github.com/Annwesha10)

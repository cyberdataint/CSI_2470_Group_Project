<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <title>CSI Group Project</title>
    <style>
        body {
            /* Set the background color of the page */
            background-color: #f0f0f0;
            /* Define the font family and text alignment for the entire body */
            font-family: Arial, sans-serif;
            text-align: center;
            margin: 0;
            padding: 0;
        }
        .container {
            /* Ensure the container is visible by default */
        }
        .login-container {
            /* Styling for the login container */
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            margin: 20px;
        }
        h1 {
            /* Styling for the main heading */
            color: #333;
            font-size: 36px;
        }
        h2 {
            /* Styling for secondary headings */
            color: #555;
            font-size: 24px;
        }
        input[type="text"] {
            /* Styling for text input fields */
            width: 100%;
            padding: 10px;
            margin: 5px 0;
        }
        button {
            /* Styling for buttons */
            background-color: #4CAF50;
            color: #fff;
            border: none;
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;
        }
        button:hover {
            /* Hover effect for buttons */
            background-color: #45a049;
        }
        .hidden {
            /* Styling to hide elements */
            display: none;
        }
        .user-list {
            /* Styling for the user list container */
            text-align: left;
            margin-top: 20px;
            padding: 10px;
        }
    </style>
</head>
<body>
    <div class="container" id="loginContainer">
        <h1>CSI Group Project</h1>
        <div class="login-container">
            <h2>Login</h2>
            <!-- User login form -->
            <form id="loginForm">
                <label for="firstName">First Name:</label>
                <input type="text" id="firstName" required>
                <br>
                <label for="lastName">Last Name:</label>
                <input type="text" id="lastName" required>
                <br>
                <button type="button" onclick="login()">Log In</button>
            </form>
            <!-- Display the list of users -->
            <div class="user-list">
                <h2>User List</h2>
                <ul id="userList"></ul>
            </div>
        </div>
    </div>

    <script>
        // Load existing users from sessionStorage
        function loadUserList() {
            const userList = document.getElementById("userList");
            const storedUsers = sessionStorage.getItem("users");

            if (storedUsers) {
                const users = JSON.parse(storedUsers);
                userList.innerHTML = "";
                // Iterate through each user and add them to the list
                users.forEach(user => {
                    addUserToList(user.firstName, user.lastName);
                });
            }
        }

        // Function to handle the login process
        function login() {
            // Get user input values and capitalize first letters
            var firstName = capitalizeFirstLetter(document.getElementById("firstName").value);
            var lastName = capitalizeFirstLetter(document.getElementById("lastName").value);
            // Add user to the list, store in sessionStorage, and redirect to answer.jsp
            addUserToList(firstName, lastName);
            storeUser(firstName, lastName);
            window.location.href = `answer.jsp?firstName=${firstName}&lastName=${lastName}`;
        }

        // Function to capitalize the first letter of a string
        function capitalizeFirstLetter(name) {
            return name.charAt(0).toUpperCase() + name.slice(1);
        }

        // Function to add a user to the displayed list
        function addUserToList(firstName, lastName) {
            const userList = document.getElementById("userList");
            const listItem = document.createElement("li");
            listItem.textContent = `${firstName} ${lastName}`;
            userList.appendChild(listItem);
        }

        // Function to store the user in sessionStorage
        function storeUser(firstName, lastName) {
            // Retrieve existing users from sessionStorage
            const storedUsers = sessionStorage.getItem("users");
            const users = storedUsers ? JSON.parse(storedUsers) : [];

            // Check if the user already exists
            const userExists = users.some(user => user.firstName === firstName && user.lastName === lastName);

            if (!userExists) {
                // Add the user to the array
                users.push({ firstName, lastName });

                // Save the updated users to sessionStorage
                sessionStorage.setItem("users", JSON.stringify(users));
            }
        }

        // Load user list on page load
        loadUserList();
    </script>
</body>
</html>

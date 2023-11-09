<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Answers - CSI Group Project</title>
    <style>
        body {
            background-color: #007bff;
            font-family: Arial, sans-serif;
            text-align: center;
            margin: 0;
            padding: 0;
        }
        .container {
            /* Keep the container visible by default */
        }
        .login-container {
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            margin: 20px;
            box-shadow: 0 4px 6px rgba(0, 0, 0, 0.1);
        }
        h1 {
            color: #fff;
            font-size: 36px;
        }
        input[type="text"] {
            width: 100%;
            padding: 10px;
            margin: 10px 0;
            border: 2px solid #007bff;
            border-radius: 5px;
        }
        button {
            background-color: #007bff;
            color: #fff;
            border: none;
            padding: 10px 20px;
            font-size: 16px;
            cursor: pointer;
            border-radius: 5px;
        }
        button:hover {
            background-color: #0056b3;
        }
        .hidden {
            display: none;
        }
        #answerSection {
            background-color: #fff;
            padding: 20px;
            border-radius: 10px;
            margin: 20px;
        }
    </style>
</head>
<body>
    <h1>CSI Group Project</h1>
    <div class="container" id="answerContainer" class="hidden">
        <p>Welcome, <span id="userName"></span>! Choose your answer:</p>
        <button onclick="addAnswer('Yes')">Yes</button>
        <button onclick="addAnswer('No')">No</button>
        <button onclick="addAnswer('Don\'t Care')">Don't Care</button>
        <button onclick="toggleAnswersDisplay()">Toggle Answers</button>

        <!-- Back button to return to login.jsp -->
        <a href="login.jsp"><button onclick="loadUserList()">Back</button></a>

        <div id="answerSection" class="hidden">
            <h2>Answer Counts for <span id="userFullName"></span>:</h2>
            <p>Yes: <span id="yesCount">0</span></p>
            <p>No: <span id="noCount">0</span></p>
            <p>Don't Care: <span id="dontCareCount">0</span></p>
        </div>
    </div>
    
    <script>
        // Initialize answers array with stored answers
        let answers = JSON.parse(localStorage.getItem("answers")) || [];

        function getUserName() {
            const urlParams = new URLSearchParams(window.location.search);
            const firstName = urlParams.get('firstName');
            const lastName = urlParams.get('lastName');
            return `${firstName} ${lastName}`;
        }

        function loadUserList() {
            // Load existing users from sessionStorage
            const userList = document.getElementById("userList");
            const storedUsers = sessionStorage.getItem("users");

            if (storedUsers) {
                const users = JSON.parse(storedUsers);
                userList.innerHTML = "";
                users.forEach(user => {
                    addUserToList(user.firstName, user.lastName);
                });
            }
        }

        function updateAnswerCounts() {
            const userName = getUserName();
            const userAnswers = answers.filter(answer => answer.userName === userName);
            const yesCount = userAnswers.filter(answer => answer.answer === "Yes").length;
            const noCount = userAnswers.filter(answer => answer.answer === "No").length;
            const dontCareCount = userAnswers
                .filter(answer => answer.answer === "Don't Care").length;

            document.getElementById("yesCount").textContent = yesCount;
            document.getElementById("noCount").textContent = noCount;
            document.getElementById("dontCareCount").textContent = dontCareCount;
        }

        function toggleAnswersDisplay() {
            var answerSection = document.getElementById("answerSection");
            answerSection.classList.toggle("hidden");
            updateAnswerCounts();
        }

        function addAnswer(answer) {
            const userName = getUserName();
            
            // Add the answer to the global answers array
            answers.push({ userName: userName, answer: answer });

            // Save the answers to localStorage
            localStorage.setItem("answers", JSON.stringify(answers));

            updateAnswerCounts();
        }

        document.getElementById("userName").textContent = getUserName();
        document.getElementById("userFullName").textContent = getUserName();
        updateAnswerCounts();
    </script>
</body>
</html>

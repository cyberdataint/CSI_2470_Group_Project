<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Opinion Poll</title>
</head>
<body>
    <h1>Opinion Poll</h1>
    <form action="VoteServlet" method="post">
        <label for="vote">Do you agree with the statement?</label>
        <select name="vote">
            <option value="yes">Yes</option>
            <option value="no">No</option>
            <option value="dontcare">Don't Care</option>
        </select>
        <input type="submit" value="Submit Vote">
    </form>
</body>
</html>
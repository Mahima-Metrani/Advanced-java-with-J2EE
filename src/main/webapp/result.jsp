<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Result</title>
</head>
<body>
    <h2>Examination Results</h2>
    <table border="1">
        <tr><td>Roll Number:</td><td>${rollno}</td></tr>
        <tr><td>Student Name:</td><td>${name}</td></tr>
        <tr><td>Average Marks:</td><td>${avg}%</td></tr>
        <tr><td>Final Result:</td>
            <td style="color: ${result == 'Pass' ? 'green' : 'red'}; font-weight: bold;">
                ${result}
            </td>
        </tr>
    </table>
    <br>
    <a href="index.jsp">Back to Input Form</a>
</body>
</html>
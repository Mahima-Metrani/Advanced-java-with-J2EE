<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Student Data Entry</title>
    <script>
        function validateForm() {
            let roll = document.forms["studentForm"]["rollno"].value;
            let name = document.forms["studentForm"]["studentname"].value;
            let marks = [
                document.forms["studentForm"]["sub1"].value,
                document.forms["studentForm"]["sub2"].value,
                document.forms["studentForm"]["sub3"].value,
                document.forms["studentForm"]["sub4"].value,
                document.forms["studentForm"]["sub5"].value
            ];

            if (roll == "" || name == "") {
                alert("Roll No and Name must be filled out");
                return false;
            }

            for (let i = 0; i < marks.length; i++) {
                if (marks[i] === "" || isNaN(marks[i]) || marks[i] < 0 || marks[i] > 100) {
                    alert("Please enter valid marks between 0 and 100 for Subject " + (i + 1));
                    return false;
                }
            }
            return true;
        }
    </script>
</head>
<body>
    <h2>Student Mark Entry Form</h2>
    <form name="studentForm" action="ResultServlet" onsubmit="return validateForm()" method="POST">
        Roll No: <input type="text" name="rollno"><br><br>
        Name: <input type="text" name="studentname"><br><br>
        Subject 1: <input type="number" name="sub1"><br><br>
        Subject 2: <input type="number" name="sub2"><br><br>
        Subject 3: <input type="number" name="sub3"><br><br>
        Subject 4: <input type="number" name="sub4"><br><br>
        Subject 5: <input type="number" name="sub5"><br><br>
        <input type="submit" value="Submit">
    </form>
</body>
</html>
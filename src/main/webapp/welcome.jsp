<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Session Welcome</title>
</head>
<body>
    <%
        // Retrieve name from the form
        String name = request.getParameter("username");

        if (name != null && !name.trim().isEmpty()) {
            // Store name in the session
            session.setAttribute("user", name);
            // Set session timeout to 60 seconds (1 minute)
            session.setMaxInactiveInterval(60);
        }

        // Check if session attribute still exists
        String sessionUser = (String) session.getAttribute("user");

        if (sessionUser != null) {
            out.print("<h3>Hello " + sessionUser + "!</h3>");
            out.print("<p>Your session is active. It will expire after 1 minute of inactivity.</p>");
            out.print("<a href='welcome.jsp'>Refresh to check status</a>");
        } else {
            out.print("<h3>Session has expired!</h3>");
            out.print("<a href='index.jsp'>Back to Login</a>");
        }
    %>
</body>
</html>
<%@ page language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>

<%
    // 🔹 Get name from form
    String name = request.getParameter("username");

    // 🔹 Store in session
    if (name != null) {
        session.setAttribute("user", name);
    }

    // 🔹 Set session timeout = 60 seconds
    session.setMaxInactiveInterval(60);

    // 🔹 Retrieve session value
    String user = (String) session.getAttribute("user");

    if (user != null) {
%>
        <h2>Hello <%= user %>!</h2>
        <p>Session will expire in 1 minute of inactivity.</p>
<%
    } else {
%>
        <h2>Session expired! Please enter your name again.</h2>
        <a href="index.jsp">Go Back</a>
<%
    }
%>

</body>
</html>
<%@ page language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>

<%
    String name = request.getParameter("username");

    if (name != null) {
        session.setAttribute("user", name);
    }

    // 🔹 Set session timeout to 1 minute
    session.setMaxInactiveInterval(60);

    String user = (String) session.getAttribute("user");

    if (user != null) {
%>
        <h2>Hello <%= user %>!</h2>
        <p>Your session will expire in 1 minute.</p>
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
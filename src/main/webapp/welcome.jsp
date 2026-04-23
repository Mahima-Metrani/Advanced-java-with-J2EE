<%@ page language="java" %>
<html>
<head>
    <title>Welcome</title>
</head>
<body>

<%
    String name = request.getParameter("username");
    String timeStr = request.getParameter("time");

    if (name != null && timeStr != null) {
        int minutes = Integer.parseInt(timeStr);

        // 🔹 Store in session
        session.setAttribute("user", name);

        // 🔹 Convert minutes → seconds
        session.setMaxInactiveInterval(minutes * 60);
    }

    String user = (String) session.getAttribute("user");

    if (user != null) {
%>
        <h2>Hello <%= user %>!</h2>
        <p>Your session expiry time is set.</p>

        <a href="check.jsp">Click here to check session status</a>
<%
    } else {
%>
        <h2>Session expired! Please enter details again.</h2>
        <a href="index.jsp">Go Back</a>
<%
    }
%>

</body>
</html>
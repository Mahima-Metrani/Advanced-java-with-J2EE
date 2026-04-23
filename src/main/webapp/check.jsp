<%@ page language="java" %>
<html>
<body>

<%
    String user = (String) session.getAttribute("user");

    if (user == null) {
%>
        <h2>Session expired!</h2>
        <a href="index.jsp">Login Again</a>
<%
    } else {
%>
        <h2>Hello again <%= user %>!</h2>
        <p>Your session is still active.</p>
<%
    }
%>

</body>
</html>
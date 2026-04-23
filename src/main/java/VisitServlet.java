import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class VisitServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");
        int visitCount = 1;

        Cookie[] cookies = request.getCookies();

        // 🔹 Check existing cookies
        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitCount")) {
                    visitCount = Integer.parseInt(c.getValue());
                    visitCount++;
                }
                if (c.getName().equals("username")) {
                    name = c.getValue();
                }
            }
        }

        // 🔹 Create / Update cookies
        Cookie nameCookie = new Cookie("username", name);
        Cookie countCookie = new Cookie("visitCount", String.valueOf(visitCount));

        // 🔹 Set expiry (demo: 30 seconds)
        nameCookie.setMaxAge(30);
        countCookie.setMaxAge(30);

        response.addCookie(nameCookie);
        response.addCookie(countCookie);

        // 🔹 Display output
        out.println("<html><body>");
        out.println("<h2>Welcome back " + name + "!</h2>");
        out.println("<h3>You have visited this page " + visitCount + " times.</h3>");
        out.println("<p><i>(Cookies expire in 30 seconds)</i></p>");

        // 🔹 Display list of cookies
        out.println("<h3>List of Cookies:</h3>");

        Cookie[] updatedCookies = request.getCookies();

        if (updatedCookies != null) {
            out.println("<table border='1'>");
            out.println("<tr><th>Name</th><th>Value</th><th>Max Age</th></tr>");

            for (Cookie c : updatedCookies) {
                out.println("<tr>");
                out.println("<td>" + c.getName() + "</td>");
                out.println("<td>" + c.getValue() + "</td>");
                out.println("<td>" + c.getMaxAge() + "</td>");
                out.println("</tr>");
            }

            out.println("</table>");
        } else {
            out.println("<p>No cookies found!</p>");
        }

        out.println("</body></html>");
    }
}
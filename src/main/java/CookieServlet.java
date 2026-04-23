import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class CookieServlet extends HttpServlet {

    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("username");

        int visitCount = 1;

        Cookie cookies[] = request.getCookies();

        if (cookies != null) {
            for (Cookie c : cookies) {
                if (c.getName().equals("visitCount")) {
                    visitCount = Integer.parseInt(c.getValue());
                    visitCount++;
                }
            }
        }

        // Create/Update Cookies
        Cookie nameCookie = new Cookie("username", name);
        Cookie countCookie = new Cookie("visitCount", String.valueOf(visitCount));

        // 🔹 Set expiry time (in seconds)
        nameCookie.setMaxAge(30);     // expires in 30 seconds
        countCookie.setMaxAge(30);    // expires in 30 seconds

        response.addCookie(nameCookie);
        response.addCookie(countCookie);

        out.println("<html><body>");
        out.println("<h2>Welcome back " + name + "!</h2>");
        out.println("<h3>You have visited this page " + visitCount + " times.</h3>");
        out.println("<p><i>(Cookie expires in 30 seconds)</i></p>");
        out.println("</body></html>");
    }
}
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/ResultServlet")
public class ResultServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) 
            throws ServletException, IOException {
        
        try {
            // Retrieve parameters
            String rollno = request.getParameter("rollno");
            String name = request.getParameter("studentname");
            int s1 = Integer.parseInt(request.getParameter("sub1"));
            int s2 = Integer.parseInt(request.getParameter("sub2"));
            int s3 = Integer.parseInt(request.getParameter("sub3"));
            int s4 = Integer.parseInt(request.getParameter("sub4"));
            int s5 = Integer.parseInt(request.getParameter("sub5"));

            // Server-side validation
            if(rollno.isEmpty() || name.isEmpty() || s1 < 0 || s1 > 100) {
                response.sendRedirect("index.jsp"); 
                return;
            }

            // Processing logic
            double average = (s1 + s2 + s3 + s4 + s5) / 5.0;
            String result = (s1 >= 40 && s2 >= 40 && s3 >= 40 && s4 >= 40 && s5 >= 40) ? "Pass" : "Fail";

            // Set attributes to pass to JSP
            request.setAttribute("rollno", rollno);
            request.setAttribute("name", name);
            request.setAttribute("avg", average);
            request.setAttribute("result", result);
            
            request.getRequestDispatcher("result.jsp").forward(request, response);
            
        } catch (NumberFormatException e) {
            response.getWriter().println("Invalid input data.");
        }
    }
}
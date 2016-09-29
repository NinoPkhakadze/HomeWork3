import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by NinoPkhakadze on 9/29/2016.
 */
public class Servlet extends HttpServlet {


        protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            String name = request.getParameter("first_name");
            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println( " <!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println(" <meta charset=\"UTF-8\">");
            out.println(" <title>Title</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("hello "+name);
            out.println("</body>");
            out.println("</html>");
        }
        protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

            response.setContentType("text/html");
            PrintWriter out = response.getWriter();
            out.println( " <!DOCTYPE html>");
            out.println("<html>");
            out.println("<head>");
            out.println(" <meta charset=\"UTF-8\">");
            out.println(" <title>Title</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<form action=\"HelloForm\" method=\"POST\">");
            out.println(" First Name: <input type=\"text\" name=\"first_name\">");
            out.println("<input type=\"submit\" value=\"Submit\" />");
            out.println("</form>");
            out.println("</body>");
            out.println("</html>");
        }
    }


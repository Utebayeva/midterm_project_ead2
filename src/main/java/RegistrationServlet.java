import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/registration")
public class RegistrationServlet extends HttpServlet {
    StudentArray students = StudentArray.getInstance();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("registration.jsp").include(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();

        String name=request.getParameter("name");
        String password=request.getParameter("password");

        if(name != null && password != null){
            Student student = new Student(name, password);
            HttpSession session = request.getSession();
            session.setAttribute("name", name);
            students.addStudent(student);
            response.sendRedirect("/login");

        } else {
            out.print("Username or password field is empty");
        }

        out.close();
    }

}  
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    StudentArray students = StudentArray.getInstance();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.getRequestDispatcher("login.jsp").include(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();

        String name=request.getParameter("name");
        String password=request.getParameter("password");

        Student student = students.findStudent(name);
        if(student.getUsername().equals(name) && student.getPassword().equals(password)){
            HttpSession session = request.getSession();
            session.setAttribute("name", name);
            response.sendRedirect("/main");
        } else{
            out.print("Wrong username/password");
        }
        out.close();
    }

}  
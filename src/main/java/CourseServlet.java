import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import java.io.IOException;

@WebServlet("/course")
public class CourseServlet extends HttpServlet {
    CourseArray courses = CourseArray.getInstance();

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setAttribute("courses", courses.getCourses());
        request.getRequestDispatcher("course.jsp").forward(request, response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String description = request.getParameter("description");
        String category = request.getParameter("category");
        String price = request.getParameter("price");
        String hours = request.getParameter("hours");
        Course course = new Course(name, description, category, price, hours);
        courses.addCourse(course);
        response.sendRedirect("/main");
    }
}

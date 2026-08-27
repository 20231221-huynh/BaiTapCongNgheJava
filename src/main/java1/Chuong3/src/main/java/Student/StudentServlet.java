package Student;

import java.io.IOException;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet(name = "StudentServlet", urlPatterns = {"/students"})
public class StudentServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        request.setCharacterEncoding("UTF-8");

        String msv = request.getParameter("msv");
        String tensv = request.getParameter("tensv");
        String lop = request.getParameter("lop");
        String email = request.getParameter("email");

        request.setAttribute("msv", msv);
        request.setAttribute("tensv", tensv);
        request.setAttribute("lop", lop);
        request.setAttribute("email", email);

        request.getRequestDispatcher("/BaiLab6_Bai2/student-result.jsp")
                .forward(request, response);
    }
}
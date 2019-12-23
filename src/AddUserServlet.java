import dao.impl.UserPageDaoImpl;
import data.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class AddUserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");


//        User user = (User)req.getAttribute("user");
        User user = new User();
        int id = Integer.parseInt(req.getParameter("id"));
        String name = new String(req.getParameter("name").getBytes("iso-8859-1"), "utf-8");
        String gender = new String(req.getParameter("gender").getBytes("iso-8859-1"), "utf-8");
        String addr = new String(req.getParameter("addr").getBytes("iso-8859-1"), "utf-8");
        int grade = Integer.parseInt(req.getParameter("grade"));
        String course = new String(req.getParameter("course").getBytes("iso-8859-1"), "utf-8");
//        if (user == null) {
//            req.getRequestDispatcher("jsp/input_null.jsp").forward(req, resp);
//            return;
//        }
        user.setId(id);
        user.setAddr(addr);
        user.setGender(gender);
        user.setCourse(course);
        user.setGrade(grade);
        user.setName(name);
        boolean isAdd = new UserPageDaoImpl().insert(user);
        req.setAttribute("id", user.getId());
        if (isAdd) {
            req.getRequestDispatcher("jsp/add_success.jsp").forward(req, resp);
        } else {
            req.getRequestDispatcher("jsp/add_failed.jsp").forward(req, resp);
        }
    }
}

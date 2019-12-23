import dao.impl.UserPageDaoImpl;
import data.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UpdateUserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        User user = new User();
        int id = Integer.parseInt(req.getParameter("id"));
        String name = new String(req.getParameter("name").getBytes("iso-8859-1"),"utf-8") ;
        String gender = new String(req.getParameter("gender").getBytes("iso-8859-1"),"utf-8") ;
        String addr = new String(req.getParameter("addr").getBytes("iso-8859-1"),"utf-8") ;
        int grade = Integer.parseInt(req.getParameter("grade"));
        String course = new String(req.getParameter("course").getBytes("iso-8859-1"),"utf-8") ;
        user.setId(id);
        user.setName(name);
        user.setGender(gender);
        user.setAddr(addr);
        user.setGrade(grade);
        user.setCourse(course);
        boolean isUpdate = new UserPageDaoImpl().update(user);
        req.setAttribute("isupdate",isUpdate);
        if (isUpdate) {
            req.getRequestDispatcher("jsp/update_success.jsp").forward(req,resp);
        }else {
            req.getRequestDispatcher("jsp/update_failed.jsp").forward(req,resp);
        }
    }
}

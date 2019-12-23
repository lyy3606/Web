import dao.impl.UserPageDaoImpl;
import data.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class EditUserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        int id = Integer.parseInt(req.getParameter("id"));
        User user = new UserPageDaoImpl().get(id);
        req.setAttribute("user",user);
        req.getRequestDispatcher("jsp/edit_user.jsp").forward(req,resp);
    }
}

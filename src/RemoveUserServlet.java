import dao.impl.UserPageDaoImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class RemoveUserServlet extends HttpServlet {
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html; charset=UTF-8");
        int id = Integer.parseInt(req.getParameter("id"));
        boolean removeSuccess = new UserPageDaoImpl().removeById(id);
        req.setAttribute("isSuccess",removeSuccess);
        req.setAttribute("id",id);
        if (removeSuccess){
            req.getRequestDispatcher("jsp/remove_success.jsp").forward(req,resp);
        }else {
            req.getRequestDispatcher("jsp/remove_failed.jsp").forward(req,resp);
        }

    }
}

import dao.impl.UserDaoImpl;
import dao.impl.UserPageDaoImpl;
import data.User;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.List;

public class ListUserServlet extends HttpServlet {

    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) {
        resp.setContentType("text/html; charset=UTF-8");
        int start = 0;
        int count = 5;
        int total = new UserPageDaoImpl().getTotal();
        try {
            start = Integer.parseInt(req.getParameter("start"));
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException");
        }
        int next = start + count;
        int pre = start - count;
        int last;
        if (total % count == 0) {
            last = total - count;
        } else {
            last = total - total % count;
        }
        pre = pre < 0 ? 0 : pre;
        next = next > last ? last : next;
        List<User> list = new UserPageDaoImpl().list(start, count);
        req.setAttribute("next", next);
        req.setAttribute("pre",pre);
        req.setAttribute("last",last);

        req.setAttribute("users", list);
        try {
            req.getRequestDispatcher("jsp/user_page_list.jsp").forward(req, resp);
        } catch (ServletException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

import common.BeanFactory;
import service.IUserService;
import service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

//@WebServlet(name = "UserServlet")
public class UserServlet extends HttpServlet {
    private IUserService userService = (UserServiceImpl) BeanFactory.getBean(BeanFactory.USER_SERVICE);

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        System.out.println("this is doPost");
        try {
//            Connection connection = DaoHelper.getConnection();
            request.getRequestDispatcher("/jsp/user_info.jsp").forward(request, response);
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        doPost(request, response);
        System.out.println("this is doGet");
    }
}

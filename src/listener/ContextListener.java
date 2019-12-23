package listener;

import common.BeanFactory;
import data.User;
import service.IUserService;
import service.impl.UserServiceImpl;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.util.Map;

public class ContextListener implements ServletContextListener {
    private IUserService userService = (UserServiceImpl) BeanFactory.getBean(BeanFactory.USER_SERVICE);

    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        Map<Integer, User> userMap = userService.listAllUser();
        servletContextEvent.getServletContext().setAttribute("users",userMap);
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }
}

package common;

import dao.IUserDao;
import dao.impl.UserDaoImpl;
import service.IUserService;
import service.impl.UserServiceImpl;

public class BeanFactory {
    private static IUserDao userDao;
    private static IUserService userService;
    public static final String USER_DAO = "UserDapImpl";
    public static final String USER_SERVICE = "UserServiceImpl";

    public static Object getBean(String beanName) {
        if (beanName.equals(USER_DAO)) {
            return getUserDao();
        } else if (beanName.equals(USER_SERVICE)) {
            return getUserService();
        } else {
            return null;
        }
    }

    private synchronized static IUserDao getUserDao() {
        if (userDao == null) {
            userDao = new UserDaoImpl();
        }
        return userDao;
    }

    private synchronized static IUserService getUserService() {
        if (userService == null) {
            userService = new UserServiceImpl();
        }
        return userService;
    }
}

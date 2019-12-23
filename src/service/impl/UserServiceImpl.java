package service.impl;

import common.BeanFactory;
import dao.IUserDao;
import dao.impl.UserDaoImpl;
import data.User;
import service.IUserService;

import java.util.Map;

public class UserServiceImpl implements IUserService {
    private IUserDao userDao = (UserDaoImpl) BeanFactory.getBean(BeanFactory.USER_DAO);
    @Override
    public Map<Integer, User> listAllUser() {
        try {
            Map<Integer, User> list = userDao.getAllUser();
            return list;
        } catch (Exception e) {
            e.printStackTrace();
        }

        return null;
    }
}

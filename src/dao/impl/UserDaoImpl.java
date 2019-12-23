package dao.impl;

import common.MybatisSessionFactory;
import dao.IUserDao;
import data.User;
import data.UserMapper;
import org.apache.ibatis.session.SqlSession;

import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class UserDaoImpl implements IUserDao {

    @Override
    public Map<Integer, User> getAllUser() {
        SqlSession session = MybatisSessionFactory.getSession();
        UserMapper mapper = session.getMapper(UserMapper.class);
//        List<User> users = mapper.getAllUsers();
        Map<Integer,User> userMap = new TreeMap<>();
//        for (User user : users){
//            userMap.put(user.getId(),user);
//        }
        return userMap;
    }
}

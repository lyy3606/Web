package dao;

import data.User;

import java.util.List;

public interface IUserPageDao {
    List<User> list();
    List<User> list(int start,int count);
    int getTotal();
    User get(int id);
    boolean removeById(int id);
    boolean update(User user);
    boolean insert(User user);
}

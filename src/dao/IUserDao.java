package dao;

import data.User;

import java.util.Map;

public interface IUserDao {
    public Map<Integer, User> getAllUser();
}

package service;

import data.User;

import java.util.Map;

public interface IUserService {
    public Map<Integer, User> listAllUser();
}

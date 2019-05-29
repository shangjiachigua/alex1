package wen.tian.it.dao;

import wen.tian.it.model.User;

import java.util.List;

public interface TestDao {
    User find(String uid);
    List<User> findAllUser();
}

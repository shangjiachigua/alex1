package wen.tian.it.service;

import wen.tian.it.model.User;

import java.util.List;

public interface TestService {
    User selectUser(String uid);
    List<User> selectAllUser();
}

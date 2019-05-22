package wen.tian.it.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wen.tian.it.dao.TestDao;
import wen.tian.it.model.User;
import wen.tian.it.service.TestService;

@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private TestDao testDao;

    @Override
    public User selectUser(String uid) {
        return testDao.find(uid);
    }

}

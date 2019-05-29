package wen.tian.it.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import wen.tian.it.dao.AdminDao;
import wen.tian.it.model.Category;
import wen.tian.it.service.AdminService;

import java.util.List;

/**
 * @author tianwenwen
 * @date 2019/5/26 21:15
 **/
@Service
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;

    @Override
    public List<Category> selectCategory() {
        return adminDao.findCategory();
    }
}

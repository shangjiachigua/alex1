package wen.tian.it.dao;

import wen.tian.it.model.Category;

import java.util.List;

public interface AdminDao {
    List<Category> findCategory();
}

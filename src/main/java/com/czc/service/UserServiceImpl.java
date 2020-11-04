package com.czc.service;

import com.czc.dao.UserDao;
import com.czc.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;
import java.util.Map;

//实现类：要做一些(数据)处理，例如分页之类的
@Service
public class UserServiceImpl implements UserService{

    @Autowired
    UserDao userDao;

    @Override
    public List<User> getAll(Map map) {

        return userDao.getAll(map);
    }

    @Override
    public void DeleteById(Integer id) {
         userDao.DeleteById(id);
    }

    @Override
    public void save(User user) {
        user.setCreatetime(new Date());
        userDao.save(user);
    }
}

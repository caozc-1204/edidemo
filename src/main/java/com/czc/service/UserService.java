package com.czc.service;

import com.czc.domain.User;

import java.util.List;
import java.util.Map;

//接收到controller传回来的map
public interface UserService {
    List<User> getAll(Map map);
    void DeleteById(Integer id);
    void save(User user);
}


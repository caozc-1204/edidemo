package com.czc.dao;

import com.czc.domain.User;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

//负责数据库操作
@Mapper
public interface UserDao {
    List<User> getAll(@Param("content")Map map);
    void DeleteById(Integer id);
    void save(User user);
}

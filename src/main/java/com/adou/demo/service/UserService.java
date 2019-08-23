package com.adou.demo.service;

import java.util.List;

import com.adou.demo.domain.User;

public interface UserService {

    public List<User> getUserList();

    public User findUserById(long id);

    public void save(User user);

    public void edit(User user);

    public void delete(long id);


}

package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.dao.UserDao;
import com.example.demo.entity.User;

@Service
public class UserServiceImp implements UserService {

 @Autowired
private UserDao userDao;

 @Override
@Transactional
public void addUser(User user) {
userDao.save(user);
}

 @Override
@Transactional
public List<User> getAlluser() {
return userDao.findAll();
}

 @Override
@Transactional
public Optional<User> getUserById(int userId) {
userDao.findById(userId);
return userDao.findById(userId);
}

 @Override
@Transactional
public List<User> getUserByName(String name) {
return userDao.findByName(name);
}

}
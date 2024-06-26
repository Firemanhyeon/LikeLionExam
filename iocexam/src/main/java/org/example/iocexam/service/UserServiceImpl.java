package org.example.iocexam.service;

import org.example.iocexam.dao.UserDao;
import org.example.iocexam.dao.UserDaoImpl;
import org.example.iocexam.domain.User;
import org.springframework.beans.factory.annotation.Autowired;


public class UserServiceImpl implements UserService{

    private UserDao userDao;


    public UserServiceImpl(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void joinUser(User user) {
        //회원가입을 위한 비즈니스 코드가 작성.

        //회원가입 위한 비즈니스가 끝나면 해당 데이터를 저장하는 코드가 실행.
        userDao.addUser(user);
    }
}

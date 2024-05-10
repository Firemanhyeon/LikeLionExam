package org.example.iocexam.dao;

import org.example.iocexam.domain.User;
import org.springframework.stereotype.Component;

@Component
public class UserDaoImpl1 implements UserDao{
    @Override
    public void addUser(User user) {//저장
        System.out.println(user+"의 정보가 잘 저장 되었습니다.");
    }
}

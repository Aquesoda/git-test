package com.trainning.mysites.service.impl;

import com.trainning.mysites.dao.UserRepository;
import com.trainning.mysites.domain.User;
import com.trainning.mysites.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
@Service
public class UserDaoImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public void save(User u)throws Exception {
        try {
            userRepository.save(u);
        } catch (Exception ex){
            throw ex;
        }
    }

    public Page<User> findAll(String kw, Pageable pageable) {
        return userRepository.findByKeyword(kw,pageable);
    }

    @Override
    public User findById(Integer uid) {
      return  userRepository.findById(uid).get();
    }

    @Override
    public void delete(User user) {
        userRepository.delete(user);
    }

    @Override
    public void deleteById(Integer uid) {
        userRepository.deleteById(uid);
    }

    @Override
    @Transactional
    public void deletes(List<User> users) {
        for (User user : users) {
            userRepository.delete(user);
        }
    }
}

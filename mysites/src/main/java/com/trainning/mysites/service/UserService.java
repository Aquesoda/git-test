package com.trainning.mysites.service;

import com.trainning.mysites.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;


import java.util.List;

public interface UserService {

    public void save(User u)throws Exception;

    public Page<User> findAll(String kw, Pageable pageable);

    public User findById(Integer uid);

    public void delete(User user);

    public void deleteById(Integer uid);

    public void deletes(List<User> users);
}

package com.spring.practice.dao;


import java.util.List;

import com.spring.practice.model.UserProfile;
 
 
 
public interface UserProfileDao {
 
    List<UserProfile> findAll();
     
    UserProfile findByType(String type);
     
    UserProfile findById(int id);
}

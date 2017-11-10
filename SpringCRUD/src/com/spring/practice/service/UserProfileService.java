package com.spring.practice.service;


import java.util.List;

import com.spring.practice.model.UserProfile;
 
 
 
public interface UserProfileService {
 
    UserProfile findById(int id);
 
    UserProfile findByType(String type);
     
    List<UserProfile> findAll();
     
}

package com.portiaxe.service;


import com.portiaxe.model.auth.User;
import com.portiaxe.model.UserDetail;

public interface AccessService {

    UserDetail authenticate(User user);
    UserDetail register(UserDetail userDetail);
    UserDetail lock(UserDetail userDetail);
    UserDetail unlock(UserDetail userDetail);
}

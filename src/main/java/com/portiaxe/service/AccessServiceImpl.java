package com.portiaxe.service;

import com.portiaxe.model.auth.User;
import com.portiaxe.model.UserDetail;
import org.springframework.stereotype.Service;

@Service
public class AccessServiceImpl implements AccessService {


    @Override
    public UserDetail authenticate(User user) {
        return null;
    }

    @Override
    public UserDetail register(UserDetail userDetail) {
        return null;
    }

    @Override
    public UserDetail lock(UserDetail userDetail) {
        return null;
    }

    @Override
    public UserDetail unlock(UserDetail userDetail) {
        return null;
    }
}

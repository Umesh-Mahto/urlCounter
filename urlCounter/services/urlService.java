package com.geekster.urlCounter.services;

import com.geekster.urlCounter.users.userClass;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class urlService {
    @Autowired
    userClass userclass;
    public userClass countHit(String usersName){
        userclass.setUserName(usersName);
        int cnt=userclass.getUrlCounter();
        cnt++;
        userclass.setUrlCounter(cnt);
        return userclass;
    }
}

package com.geekster.urlCounter.users;

import org.springframework.stereotype.Component;

@Component
public class userClass {
    private String userName;
    private int urlCounter=0;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public int getUrlCounter() {
        return urlCounter;
    }

    public void setUrlCounter(int urlCounter) {
        this.urlCounter = urlCounter;
    }
}

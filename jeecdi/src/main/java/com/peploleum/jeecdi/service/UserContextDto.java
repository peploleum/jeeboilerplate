package com.peploleum.jeecdi.service;

import java.util.List;

public class UserContextDto {
    private String userName;
    private List<String> userRights;

    public UserContextDto() {
    }

    public UserContextDto(String userName, List<String> userRights) {
        this.userName = userName;
        this.userRights = userRights;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public List<String> getUserRights() {
        return userRights;
    }

    public void setUserRights(List<String> userRights) {
        this.userRights = userRights;
    }
}

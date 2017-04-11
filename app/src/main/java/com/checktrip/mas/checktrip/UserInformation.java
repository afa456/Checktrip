package com.checktrip.mas.checktrip;

/**
 * Created by ling on 10/17/16.
 */

public class UserInformation {
    public String email, uid;
    public String name;
    public String address;


    public UserInformation(String name, String address, String email, String uid) {
        this.name = name;
        this.address = address;
        this.email = email;
        this.uid = uid;
    }
}

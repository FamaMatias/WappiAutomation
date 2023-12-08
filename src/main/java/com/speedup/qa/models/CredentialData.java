package com.speedup.qa.models;

public class CredentialData {

    public CredentialData(String user, String password) {
        this.user = user;
        this.password = password;
    }

    public String getUser() {
        return user;
    }

    public String getPassword() {
        return password;
    }

    private String user;
    private String password;
}


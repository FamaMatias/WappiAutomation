package com.speedup.qa.models;

import org.openqa.selenium.WebDriver;

import java.io.File;

public class UpdateInformation {

    WebDriver driver;

    private String firstName;
    private String lastName;
    private String birth;
    private String path;
    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    public String getBirth() {
        return birth;
    }

    public String getPath() {return path;}

    public UpdateInformation(String firstName , String lastName, String birth, File file){
        this.firstName = firstName;
        this.lastName = lastName ;
        this.birth =birth ;
        this.file = file;
    }

    public File getFile() {
        return file;
    }

    File file = new File("C:\\Users\\usuar\\Desktop\\QAA_Fronted");



}

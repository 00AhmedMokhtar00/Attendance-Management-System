/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

import java.util.ArrayList;

/**
 *
 * @author Hussam
 */
public class Student {
    String name,username, password;
    String id;
    int present, absent;
    Student (String name , String username , String password , String id, int present, int absent){
        this.name = name;
        this.username = username;
        this.password = password;
        this.id = id;
        this.present = present;
        this.absent = absent;
    }
    Student(){
    }

    @Override
    public String toString() {
        return this.id + "\n" + this.name + "\n" + this.username + "\n" + this.password + "\n"+ this.present + "\n"+ this.absent + "\n"; //To change body of generated methods, choose Tools | Templates.
    }
    
}

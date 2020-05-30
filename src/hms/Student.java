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
    int id;
    ArrayList <Boolean> attendance = new ArrayList ();
    Student (String name , String username , String password , int id ){
        this.name = name;
        this.username = username;
        this.password = password;
        this.id = id;
        
    }
    Student(){
    }

    @Override
    public String toString() {
        return "name : " + this.name + "\nusername : " + this.username + "\npassword : " + this.password + "\nid : " + this.id + "\n"; //To change body of generated methods, choose Tools | Templates.
    }
    
}

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
    ArrayList <Boolean> attendance = new ArrayList ();
    Student (String name , String username , String password , String id ){
        this.name = name;
        this.username = username;
        this.password = password;
        this.id = id;
        
    }
    Student(){
    }

    @Override
    public String toString() {
        return this.id + "\n" + this.name + "\n" + this.username + "\n" + this.password + "\n"; //To change body of generated methods, choose Tools | Templates.
    }
    
}

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
public class StudentList {
    Student[] StudentList = new Student[1000];
    int length = 0;
    
    void insert(Student s){
      
    }
    
    void setattendance (int id , boolean attendance ){
    for (int i = 0; i < length ; i++)
    {
        if (StudentList[i].id == id){
            StudentList[i].attendance.add(attendance);
        }
    }
    }
}

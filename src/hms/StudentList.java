/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hms;

public class StudentList {
    private Student[] students = new Student[1000];
    private int length = 0;
    
    void insert(Student s){
      students[length] = s;
      length++;
    }
    
    void setAttendance (String id , boolean attendance ){
        for (int i = 0; i < length ; i++){
            if (students[i].id.equals(id)){
                students[i].attendance.add(attendance);
            }
        }
    }
    
    int getLength(){
        return this.length;
    }

    @Override
    public String toString() {
        String res = "";
        for(int i = 0  ; i < length ; i++){
            res += students[i].toString();
        }
        return res;
    }
    
    
}

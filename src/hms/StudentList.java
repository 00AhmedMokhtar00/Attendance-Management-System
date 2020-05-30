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
    boolean delete(String id){
      int i; 
      for(i = 0 ; i < length ; i++){
          if(students[i].id.equals(id)){
              break;
          }
      }
      if(i < length){
          students[i] = null;
          length--;
          for(int j = i ; j < length ; j++){
              students[j] = students[j+1];
          }
          return true;
      }
      return false;
    }
    
    boolean setAttendance (String id , boolean attendance ){
        int i;
        for (i = 0; i < length ; i++){
            if (students[i].id.equals(id)){
                if(attendance == true){
                    students[i].present++;
                }else{
                    students[i].absent++;
                }
                break;
            }
        }
        if(i == length){
            return false;
        }
        return true;
    }
    Student getAttendance (String id){
        for (int i = 0; i < length ; i++){
            if (students[i].id.equals(id)){
                return students[i];
            }
        }
        return null;
    }
    
    int getLength(){
        return this.length;
    }
    
    String formattedList() {
        String res = "", temp;
        double percentage;
        for(int i = 0  ; i < length ; i++){
            double total = students[i].present + students[i].absent;
            if(total == 0.0){
                percentage = 100.0;
            }else{
                percentage = students[i].present / total * 100.0;
            }
            temp = "ID: " + students[i].id + "\nName: " + students[i].name 
                    + "\nUsername: " + students[i].username + "\nPassword: " + students[i].password
                    + "\nAttendance Percentage: " + percentage
                    +"\n----------------------\n";
            
            res += temp;
        }
        return res;
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

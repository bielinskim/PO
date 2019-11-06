/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package zad2lab5;

import java.io.FileNotFoundException;

/**
 *
 * @author mateu
 */
public class Sort {
    
    
    public Student[] sortuj(Student[] student) throws FileNotFoundException
    {   
       Student tmp;
       for(int j=0; j<student.length; j++)
       {
           for(int i=0; i<student.length-1; i++)
           {
               if(student[i].getIndeks().getSrednia()>student[i+1].getIndeks().getSrednia())
               {
                   tmp=student[i];
                   student[i]=student[i+1];
                   student[i+1]=tmp;
               }
           }
       }
       return student;
    }
    
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package studentdetails;

/**
 *
 * @author ranjeet
 */
public class StudentDetails {

    /**
     * @param args the command line arguments
     * hey how are you!
     */
    public static void main(String[] args) {
        // create objects for array and print them
        Student s1 = new Student();
        s1.setName("Peter");
        s1.setAge(19);
        Student s2 = new Student();
        s2.setName("Patrick");
        s2.setAge(18);
        Student s3 = new Student();
        s3.setName("Paul");
        s3.setAge(20);
        Student s4 = new Student();
        s4.setName("Paul");
        s4.setAge(20);
        Student s5 = new Student();
        s5.setName("Paul");
        s5.setAge(20);
        
        Student[] list= new Student[5];
        list[0]=s1;
        list[1]=s2;
        list[2]=s3;
        list[3]=s4;
        list[4]=s5;
        for(int i=0;i<5;i++)
        {
            System.out.println(list[i].getName()+" "+list[i].getAge());
        }
    }
    
}

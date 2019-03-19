package Ass5;

import javax.naming.Name;

public class Student extends Person{
    public Student(String Name,String Sex,Integer Birthday ,Double Address){
        super(Name,Sex,Birthday,Address);
    }

    public void KiemTraTuoi(){
        if (this.getBirthday()<=2001){
            System.out.println("Da Du 18 Tuoi");
        }
        else
            System.out.println("Chua Du 18 Tuoi");
    }
}

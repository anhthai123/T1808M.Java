package Ass5;

import sun.rmi.transport.tcp.TCPEndpoint;

import java.util.ArrayList;

public class Person {
    public String Name;
    public String Sex;
    public Integer Birthday;
    public Double Address;

    public Person(){
    }

    public Person(String name , String sex ,Integer birthday,Double address){
        Name = name;
        Sex =sex;
        Birthday= birthday;
        Address = address;
    }
    public String getName(){
        return Name;
    }
    public void setName(String name){
        Name = name;
    }
    public String getSex(){
        return Sex;

    }
    public  void setSex(String sex){
        Sex=sex;

    }
    public Integer getBirthday(){
        return Birthday;

    }
    public void setBirthday(Integer birthday){
        Birthday=birthday;
    }
    public Double getAddress (){
        return Address;
    }
    public void setAddress(Double address){
        Address =address;
    }
    public void InputInfoPerson(){
        Scanner scanner=new Scanner(System.in);
        System.out.println("Nhap Ten:");
        this.setName(scanner.hasNext()?scanner.nextLine():"");

        System.out.println("Gioi Tinh:");
        this.setSex(scanner.hasNext()?scanner.nextLine():"");

        System.out.println("Ngay Sinh");
        this.setBirthday(scanner.hasNext()?scanner.nextInt():"");

        System.out.println("Dia Chi");
        this.setAddress(scanner.hasNext()?scanner.nextLine():"");
    }

    public void ShowInfoPerson(){
        System.out.println("Ten :"+getName()+" Gioi Tinh :"+getSex()+" Ngay Sinh :"+getBirthday()+"Dia Chi:"+getAddress());
    }

}


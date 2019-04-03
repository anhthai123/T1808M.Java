package baithi;

import org.omg.PortableInterceptor.ServerRequestInfo;

import java.util.Scanner;

public class Hotel {
    public String name;
    public String location;
    public String ownerName;

    public Hotel() {
    }

    public Hotel(String name, String location, String ownerName) {
        this.name = name;
        this.location = location;
        this.ownerName = ownerName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }



    public void EnterHotel(){
        Scanner scanner = new Scanner(System.in);
        System.out.println(" Moi Ban Nhap Vao Thong Tin");

        System.out.println(" Nhap Ten");
        this.setName(scanner.hasNext()?scanner.nextLine():"");

        System.out.println(" Vi Tri");
        this.setLocation(scanner.hasNext()?scanner.nextLine():"");

        System.out.println("Ten Nguoi Dung Rieng");
        this.setOwnerName(scanner.hasNext()?scanner.nextLine():"");



    }
    public void InforHotel(){
        System.out.println(" Chi Tiet Khach san");
        System.out.println("Ten"+getName());
        System.out.println("Vi Tri"+getLocation());
        System.out.println("Ten Nguoi Dung Rieng"+getOwnerName());
    }
}

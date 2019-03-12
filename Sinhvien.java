package ass2;

import java.util.Scanner;

public class Sinhvien {
    public int  code;
    public double mediumscore;
    public int age;
    public String Class;

    public  void inputInfo(){
        System.out.println("Nhap ma sinh vien:");
        Scanner scanner = new Scanner(System.in);
        code = scanner.nextInt();

        System.out.println("Nhap diem trung binh:");
        mediumscore = scanner.nextDouble();

        System.out.println("Tuoi:");
        age = scanner.nextInt();

        System.out.println("Lop:");
        Class = scanner.nextLine();

    }
    public void showInfo(){
        System.out.println("Thong tin sinh vien");
        System.out.println(code+"Mã sinh vien:"+ mediumscore+ "diem trung binh:"+age+"So tuoi"+Class+"Lop");


    }
    public void HocBong(){
        if (mediumscore>=8.0)
        System.out.println( "Duoc Hoc Bong");

        else
            System.out.println("Ko Duoc Hoc Bong");
    }




    }

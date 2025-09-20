/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class ThiSinh {
    private int soBD136;
    private String hoTen136;
    private String diaChi136;
    private String dienUuTien136;

    public ThiSinh() {
    }

    public ThiSinh(int soBD136, String hoTen136, String diaChi136, String dienUuTien136) {
        this.soBD136 = soBD136;
        this.hoTen136 = hoTen136;
        this.diaChi136 = diaChi136;
        this.dienUuTien136 = dienUuTien136;
    }

    public void nhapThongTin(Scanner sc){
        System.out.print("\tNhập số báo danh: ");
        soBD136 = sc.nextInt();
        sc.nextLine();
        System.out.print("\tNhập họ tên: ");
        hoTen136 = sc.nextLine();
        System.out.print("\tNhập địa chỉ: ");
        diaChi136 = sc.nextLine();
        System.out.print("\tNhập diện ưu tiên: ");
        dienUuTien136 = sc.nextLine();
    }

    public void hienThongTin(){
        System.out.println("\tSố báo danh: " + soBD136);
        System.out.println("\tHọ tên: " + hoTen136);
        System.out.println("\tĐịa chỉ: " + diaChi136);
        System.out.println("\tDiện ưu tiên: " + dienUuTien136);
    }

    public int getSoBD136() {
        return soBD136;
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI8;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class Nguoi {
    protected String hoTen136;
    protected String ngaySinh136;
    protected String queQuan136;

    public Nguoi() {
    }

    public Nguoi(String hoTen136, String ngaySinh136, String queQuan136) {
        this.hoTen136 = hoTen136;
        this.ngaySinh136 = ngaySinh136;
        this.queQuan136 = queQuan136;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhập họ tên: ");
        hoTen136 = sc.nextLine();
        System.out.print("\tNhập ngày sinh: ");
        ngaySinh136 = sc.nextLine();
        System.out.print("\tNhập quê quán: ");
        queQuan136 = sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tHọ tên: " + hoTen136);
        System.out.println("\tNgày sinh: " + ngaySinh136);
        System.out.println("\tQuê quán: " + queQuan136);
    }
}


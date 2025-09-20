/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI7;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class HocSinh extends Nguoi {
    private String lop136;
    private String khoaHoc136;
    private String kyHoc136;

    public HocSinh() {
    }

    public HocSinh(String hoTen136, String lop136, String khoaHoc136, String kyHoc136) {
        this.hoTen136 = hoTen136;
        this.lop136 = lop136;
        this.khoaHoc136 = khoaHoc136;
        this.kyHoc136 = kyHoc136;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhập lớp: ");
        lop136 = sc.nextLine();
        System.out.print("\tNhập khóa học: ");
        khoaHoc136 = sc.nextLine();
        System.out.print("\tNhập kỳ học: ");
        kyHoc136 = sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tLớp: " + lop136);
        System.out.println("\tKhóa học: " + khoaHoc136);
        System.out.println("\tKỳ học: " + kyHoc136);
    }

    public String getLop() {
        return lop136;
    }
}


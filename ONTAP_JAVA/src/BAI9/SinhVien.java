/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI9;

/**
 *
 * @author Admin
 */
import java.time.LocalDate;
import java.util.Scanner;

public class SinhVien {
    protected String hoTen136;
    protected String maSV136;
    protected LocalDate ngaySinh136;
    protected String lop136;

    public SinhVien() {
    }

    public SinhVien(String hoTen136, String maSV136, LocalDate ngaySinh136, String lop136) {
        this.hoTen136 = hoTen136;
        this.maSV136 = maSV136;
        this.ngaySinh136 = ngaySinh136;
        this.lop136 = lop136;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhập họ tên: ");
        hoTen136 = sc.nextLine();
        System.out.print("\tNhập mã sinh viên: ");
        maSV136 = sc.nextLine();
        System.out.print("\tNhập ngày sinh (dd-MM-yyyy): ");
        String strNgaySinh = sc.nextLine();
        ngaySinh136 = LocalDate.parse(strNgaySinh, java.time.format.DateTimeFormatter.ofPattern("dd-MM-yyyy"));
        System.out.print("\tNhập lớp: ");
        lop136 = sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tHọ tên: " + hoTen136);
        System.out.println("\tNgày sinh: " + ngaySinh136);
        System.out.println("\tMã sinh viên: " + maSV136);
        System.out.println("\tLớp: " + lop136);
    }
}


/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class NhanVien  extends  CanBo{
    private String congViec136;

    public NhanVien() {
    }

    public NhanVien(String congViec136, String hoTen136, String ngaySinh136, String gioiTinh136) {
        super(hoTen136, ngaySinh136, gioiTinh136);
        this.congViec136 = congViec136;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhập công việc: ");
        congViec136 = sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tCông việc: " + congViec136);
    }

}

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
public class CanBo {
    private String hoTen136;
    private String ngaySinh136;
    private String gioiTinh136;
    private String diaChi136;

    public CanBo() {
    }

    public CanBo(String hoTen136, String ngaySinh136, String gioiTinh136) {
        this.hoTen136 = hoTen136;
        this.ngaySinh136 = ngaySinh136;
        this.gioiTinh136 = gioiTinh136;
    }

    public void nhapThongTin(Scanner sc){
        System.out.print("Nhập họ tên cán bộ: ");
        hoTen136 = sc.nextLine();
        System.out.print("Nhập ngày sinh cán bộ(dd/mm/yyyy): ");
        ngaySinh136 = sc.nextLine();
        System.out.print("Nhập giới tính cán bộ: ");
        gioiTinh136 = sc.nextLine();
        System.out.print("Nhập địa chỉ cán bộ: ");
        diaChi136 = sc.nextLine();
    }

    public String getHoTen() {
        return this.hoTen136;
    }

    public void hienThiThongTin(){
        System.out.println("\tHọ tên: " + hoTen136);
        System.out.println("\tNgày sinh: " + ngaySinh136);
        System.out.println("\tGiới tính: " + gioiTinh136);
        System.out.println("\tĐịa chỉ: " + diaChi136);
    }
}

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
public class CongNhan extends CanBo {
    private String bac136;

    public CongNhan() {
    }

    public CongNhan(String bac136, String hoTen136, String ngaySinh136, String gioiTinh136) {
        super(hoTen136, ngaySinh136, gioiTinh136);
        this.bac136 = bac136;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhập bậc: ");
        bac136 = sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tBậc: " + bac136);
    }

}

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
public class KySu extends CanBo {
    private String nganhDaoTao136;

    public KySu() {
    }

    public KySu(String nganhDaoTao136, String hoTen136, String ngaySinh136, String gioiTinh136) {
        super(hoTen136, ngaySinh136, gioiTinh136);
        this.nganhDaoTao136 = nganhDaoTao136;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhập ngành đào tạo: ");
        nganhDaoTao136 = sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tNgành đào tạo: " + nganhDaoTao136);
    }

}

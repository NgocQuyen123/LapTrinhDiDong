/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class Bao extends TaiLieu{
    private String ngayPhatHanh136;

    public Bao() {
    }

    public Bao(String ngayPhatHanh136, String maTaiLieu136, String tenNXB136, int soBanPhatHanh136) {
        super(maTaiLieu136, tenNXB136, soBanPhatHanh136);
        this.ngayPhatHanh136 = ngayPhatHanh136;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhập ngày phát hành: ");
        ngayPhatHanh136 = sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.print("\tNgày phát hành: " + ngayPhatHanh136);
    }

}

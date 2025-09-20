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
public class Sach extends TaiLieu{
    private String tacGia136;
    private int soTrang136;

    public Sach() {
        super();
    }

    public Sach(String tacGia136, int soTrang136, String maTaiLieu136, String tenNXB136, int soBanPhatHanh136) {
        super(maTaiLieu136, tenNXB136, soBanPhatHanh136);
        this.tacGia136 = tacGia136;
        this.soTrang136 = soTrang136;
    }

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhập tên tác giả: ");
        tacGia136 = sc.nextLine();
        System.out.print("\tNhập số trang: ");
        soTrang136 = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tTên tác giả: " + tacGia136);
        System.out.println("\tSố trang: " + soTrang136);
    }

    public String getTacGia136() {
        return tacGia136;
    }

    public void setTacGia136(String tacGia136) {
        this.tacGia136 = tacGia136;
    }

    public int getSoTrang136() {
        return soTrang136;
    }

    public void setSoTrang136(int soTrang136) {
        this.soTrang136 = soTrang136;
    }
    
}

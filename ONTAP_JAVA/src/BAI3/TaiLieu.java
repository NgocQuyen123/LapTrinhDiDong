/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI3;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class TaiLieu {
    private String maTaiLieu136;
    private String tenNXB136;
    private int soBanPhatHanh136;

    public TaiLieu() {
    }

    public TaiLieu(String maTaiLieu136, String tenNXB136, int soBanPhatHanh136) {
        this.maTaiLieu136 = maTaiLieu136;
        this.tenNXB136 = tenNXB136;
        this.soBanPhatHanh136 = soBanPhatHanh136;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhập mã tài liệu: ");
        maTaiLieu136 = sc.nextLine();
        System.out.print("\tNhập tên nhà xuất bản: ");
        tenNXB136 = sc.nextLine();
        System.out.print("\tNhập số bản phát hành: ");
        soBanPhatHanh136 = sc.nextInt();
        sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tMã tài liệu: " + maTaiLieu136);
        System.out.println("\tTên nhà xuất bản: " + tenNXB136);
        System.out.println("\tSố bản phát hành: " + soBanPhatHanh136);
    }

    public String getMaTaiLieu136() {
        return maTaiLieu136;
    }
    public String getTenNXB136() {
        return tenNXB136;
    }

    public void setTenNXB136(String tenNXB136) {
        this.tenNXB136 = tenNXB136;
    }

    public int getSoBanPhatHanh136() {
        return soBanPhatHanh136;
    }

    public void setSoBanPhatHanh136(int soBanPhatHanh136) {
        this.soBanPhatHanh136 = soBanPhatHanh136;
    }
}


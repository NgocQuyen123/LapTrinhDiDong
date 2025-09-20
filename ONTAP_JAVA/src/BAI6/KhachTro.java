/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI6;

/**
 *
 * @author Admin
 */
import java.util.Date;
import java.util.Scanner;

public class KhachTro extends Nguoi {
    private int soNgayTro136;
    private String loaiPhong136;
    private double giaPhong136;

    public KhachTro() {
    }

    public KhachTro(int soNgayTro136, String loaiPhong136, double giaPhong136) {
        this.soNgayTro136 = soNgayTro136;
        this.loaiPhong136 = loaiPhong136;
        this.giaPhong136 = giaPhong136;
    }  

    public KhachTro(int soNgayTro136, String loaiPhong136, double giaPhong136, String hoTen136, Date ngaySinh136, int CMND136) {
        super(hoTen136, ngaySinh136, CMND136);
        this.soNgayTro136 = soNgayTro136;
        this.loaiPhong136 = loaiPhong136;
        this.giaPhong136 = giaPhong136;
    }

    public KhachTro(String hoTen136, int CMND136, int soNgayTro136, String loaiPhong136, double giaPhong136) {
        this.hoTen136 = hoTen136;
        this.CMND136 = CMND136;
        this.soNgayTro136 = soNgayTro136;
        this.loaiPhong136 = loaiPhong136;
        this.giaPhong136 = giaPhong136;
    }   

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhập số ngày trọ: ");
        soNgayTro136 = sc.nextInt();
        sc.nextLine();
        System.out.print("\tNhập loại phòng: ");
        loaiPhong136 = sc.nextLine();
        System.out.print("\tNhập giá phòng: ");
        giaPhong136 = sc.nextDouble();
        sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tSố ngày trọ: " + soNgayTro136);
        System.out.println("\tLoại phòng: " + loaiPhong136);
        System.out.println("\tGiá phòng: " + giaPhong136);
    }

    public String getLoaiPhong136() {
        return loaiPhong136;
    }

    public double getGiaPhong136() {
        return giaPhong136;
    }

    public int getSoNgayTro136() {
        return soNgayTro136;
    }
}


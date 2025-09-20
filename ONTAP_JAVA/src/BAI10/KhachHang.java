/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI10;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class KhachHang {
    protected String tenChuHo136;
    protected int soNha136;
    protected String maCongTo136;

    public KhachHang() {
    }

    public KhachHang(String tenChuHo136, int soNha136, String maCongTo136) {
        this.tenChuHo136 = tenChuHo136;
        this.soNha136 = soNha136;
        this.maCongTo136 = maCongTo136;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhập tên chủ hộ: ");
        tenChuHo136 = sc.nextLine();
        System.out.print("\tNhập số nhà: ");
        soNha136 = sc.nextInt();
        sc.nextLine();
        System.out.print("\tNhập mã công tố: ");
        maCongTo136 = sc.nextLine();
    }

    public void hienThiThongTin() {
        System.out.println("\tTên chủ hộ: " + tenChuHo136);
        System.out.println("\tSố nhà: " + soNha136);
        System.out.println("\tMã công tố: " + maCongTo136);
    }
}


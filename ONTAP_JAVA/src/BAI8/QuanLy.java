/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI8;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<CBGV> ds136;

    public QuanLy() {
        ds136 = new ArrayList<CBGV>(10);
    }

    public void themCBGV(CBGV canBo136) {
        ds136.add(canBo136);
    }

    public void nhapDanhSach(Scanner sc) {
        CBGV canBo136;
        System.out.print("Nhập vào số lượng cán bộ: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập vào danh sách:");
        for (int i = 0; i < n; i++) {
            System.out.println("Cán bộ thứ " + (i + 1) + " là:");
            canBo136 = new CBGV();
            canBo136.nhapThongTin(sc);
            themCBGV(canBo136);
        }
    }

    public void hienThiDanhSach() {
        for (CBGV cb136 : ds136) {
            cb136.hienThiThongTin();
        }
    }

    public void timKiem(double luong136) {
        for (CBGV cb : ds136) {
            if (cb.getLuongThucLinh() >= luong136) {
                cb.hienThiThongTin();
            }
        }
    }
}

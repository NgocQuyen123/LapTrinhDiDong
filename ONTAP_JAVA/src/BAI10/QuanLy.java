/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI10;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<BienLai> ds136;

    public QuanLy() {
        ds136 = new ArrayList<BienLai>(10);
    }

    public void themBienLai(BienLai bienLai) {
        ds136.add(bienLai);
    }

    public void nhapDanhSach(Scanner sc) {
        BienLai bienLai136;
        System.out.print("Nhập vào số lượng biên lai: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập vào danh sách biên lai:");
        for (int i = 0; i < n; i++) {
            System.out.println("Biên lai thứ " + (i + 1) + " là:");
            bienLai136 = new BienLai();
            bienLai136.nhapThongTin(sc);
            themBienLai(bienLai136);
        }
    }

    public void hienThiDanhSach() {
        for (int i = 0; i < ds136.size(); i++) {
            System.out.println("Biên lai thứ " + (i + 1) + " là:");
            ds136.get(i).hienThiThongTin();
            System.out.println();
        }
    }
}


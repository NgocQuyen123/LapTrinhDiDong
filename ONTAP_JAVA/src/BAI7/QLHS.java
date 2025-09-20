/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI7;

/**
 *
 * @author Admin
 */
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class QLHS {
    private ArrayList<HocSinh> dshs136;

    public QLHS() {
        dshs136 = new ArrayList<HocSinh>(10);
    }

    public void themHS(HocSinh hs136) {
        dshs136.add(hs136);
    }

    public void nhapDanhSachHS(Scanner sc) {
        HocSinh hs;
        System.out.print("Nhập vào số lượng học sinh: ");
        int n = sc.nextInt();
        sc.nextLine(); 
        System.out.println("Nhập thông tin cho học sinh trong danh sách:");
        for (int i = 0; i < n; i++) {
            System.out.println("\tHọc sinh thứ " + (i + 1) + " là:");
            hs = new HocSinh();
            hs.nhapThongTin(sc);
            themHS(hs);
        }
    }

    public void hienThiDanhSach() {
        int n = dshs136.size();
        for (int i = 0; i < n; i++) {
            System.out.println("\tHọc sinh thứ " + (i + 1) + " là:");
            dshs136.get(i).hienThiThongTin();
        }
    }

    public void timKiemThongTin(int nam, String que) {
        for (HocSinh hs : dshs136) {
            LocalDate ns = hs.getNgaySinh();
            if (ns != null && ns.getYear() == nam && que.equals(hs.getQueQuan())) {
                hs.hienThiThongTin();
            }
        }
    }

    public void timKiemThongTin(String lop) {
        for (HocSinh hs : dshs136) {
            if (lop.equals(hs.getLop())) {
                hs.hienThiThongTin();
            }
        }
    }
}


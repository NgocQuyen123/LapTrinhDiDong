/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class TuyenSinh {
    private ArrayList<ThiSinh> dsts136;

    public TuyenSinh() {
        dsts136 = new ArrayList<ThiSinh>(10);
    }

    public void themThiSinh(ThiSinh ts) {
        dsts136.add(ts);
    }

    public void nhapDanhSach(Scanner sc) {
        ThiSinh ts136;
        int chon136;

        System.out.print("Nhập vào số lượng thí sinh: ");
        int n = sc.nextInt();
        sc.nextLine();

        for (int i = 0; i < n; i++) {
            System.out.println("Thí sinh thuộc khối nào (1-Khối A; 2-Khối B; 3-Khối C): ");
            chon136 = sc.nextInt();

            switch (chon136) {
                case 1:
                    ts136 = new KhoiA("Toán", "Lý", "Hóa");
                    break;
                case 2:
                    ts136 = new KhoiA("Toán", "Hóa", "Sinh");
                    break;
                case 3:
                    ts136 = new KhoiC("Văn", "Sử", "Địa");
                    break;
                default:
                    ts136 = new KhoiA("Toán", "Lý", "Hóa");
                    break;
            }
            ts136.nhapThongTin(sc);
            themThiSinh(ts136);
        }
    }

    public void hienThiDanhSach() {
        int i = 1;
        for (ThiSinh TS136 : dsts136) {
            System.out.println("Thí sinh thứ " + (i++) + ":");
            TS136.hienThongTin();
        }
    }

    public void timKiemThiSinh(int soBaoDanh) {
        for (ThiSinh ts136 : dsts136) {
            if (ts136.getSoBD136() == soBaoDanh) {
                ts136.hienThongTin();
            }
        }
    }

}

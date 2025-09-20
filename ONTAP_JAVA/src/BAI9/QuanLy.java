/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI9;

/**
 *
 * @author Admin
 */
import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
    private ArrayList<TheMuon> ds136;

    public QuanLy() {
        ds136 = new ArrayList<>(10);
    }

    public void themTheMuon(TheMuon theMuon) {
        ds136.add(theMuon);
    }

    public void nhapDanhSach(Scanner sc) {
        TheMuon theMuon136;
        System.out.print("Nhập vào số lượng thẻ mượn: ");
        int n = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập vào danh sách:");
        for (int i = 0; i < n; i++) {
            System.out.println("Thẻ mượn thứ " + (i + 1) + " là:");
            theMuon136 = new TheMuon();
            theMuon136.nhapThongTin(sc);
            themTheMuon(theMuon136);
        }
    }

    public void hienThiDanhSachTraCuoiThang() {
        for (TheMuon the136 : ds136) {
            int lastDay = the136.getHanTra136().lengthOfMonth(); 
            if (the136.getHanTra136().getDayOfMonth() == lastDay) {
                the136.hienThiThongTin();
            }
        }
    }
}


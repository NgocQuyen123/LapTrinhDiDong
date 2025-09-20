/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QLCB {
    private ArrayList<CanBo> dscb136;

    public QLCB() {
        dscb136 = new ArrayList<CanBo>(10);
    }

    public void themCanBo(CanBo cb136) {
        dscb136.add(cb136);
    }

    public void nhapDanhSach(Scanner sc) {
        CanBo cb136;
        System.out.print("Nhập số lượng cán bộ: ");
        int n136 = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập thông tin chi tiết: ");
        for (int i136 = 1; i136 <= n136; i136++) {
            System.out.println("Cán bộ thứ " + i136 + " :");
            System.out.println("Chọn loại cán bộ (1.Kỹ sư; 2.Nhân viên; 3.Công nhân): ");
            int chon136 = sc.nextInt();
            sc.nextLine();
            cb136 = new CanBo(); // tính đa hình
            switch (chon136) {
                case 1:
                    cb136 = new KySu();
                    break;
                case 2:
                    cb136 = new NhanVien();
                    break;
                case 3:
                    cb136 = new CongNhan();
                    break;
                default:
                    cb136 = new KySu();
                    break;
            }
            cb136.nhapThongTin(sc);
            dscb136.add(cb136);
        }
    }

    public void timKiemCanBo(String hoTen) {
        for (CanBo cb136 : dscb136) {
            if (hoTen.equals(cb136.getHoTen())) {
                cb136.hienThiThongTin();
            }
        }
    }

}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI3;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class QuanLySach {
    private ArrayList<TaiLieu> dstl136;

    public QuanLySach() {
        dstl136 = new ArrayList<TaiLieu>(10);
    }

    public void themTaiLieu(TaiLieu tl136) {
        dstl136.add(tl136);
    }

    public void nhapDSTL(Scanner sc) {
        int chon136; 
        String stop136;
        TaiLieu tl136;
        do {            
            System.out.println("Chọn loại tài liệu: 1.Sách; 2.Tạp chí; 3.Báo");
            chon136 = sc.nextInt();
            sc.nextLine();
            switch (chon136) {
                case 1:
                    tl136 = new Sach();
                    break;
                case 2:
                    tl136 = new TapChi();
                    break;
                case 3:
                    tl136 = new Bao();
                    break;
                default:
                    throw new AssertionError();
            }
            tl136.nhapThongTin(sc);
            themTaiLieu(tl136);
            System.out.println("Bạn có muốn nhập tiếp tục không(Có: c, Không: k)? ");
            stop136 = sc.nextLine();
        } while (stop136.equals("c"));
    }

    public void timMaTL(String maTL136) {
        for (TaiLieu TL136 : dstl136) {
            if (maTL136.equals(TL136.getMaTaiLieu136())) {
                TL136.hienThiThongTin();
            }
        } 
    }

    public void timLoaiTL(String loaiTL136) {
        for (TaiLieu TL136 : dstl136) {
            if (loaiTL136.equals("Sách") && (TL136 instanceof Sach)) {
                TL136.hienThiThongTin();
            }
            else if (loaiTL136.equals("Tạp chí") && (TL136 instanceof TapChi)) {
                TL136.hienThiThongTin();
            }
            else if (loaiTL136.equals("Báo") && (TL136 instanceof Bao)) {
                TL136.hienThiThongTin();
            }
        } 
    }

}

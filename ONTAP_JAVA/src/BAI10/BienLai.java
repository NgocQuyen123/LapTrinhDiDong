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

public class BienLai extends KhachHang {
    private int chiSoMoi136;
    private int chiSoCu136;
    private double tien136;

    public BienLai() {
    }

    public BienLai(int chiSoMoi136, int chiSoCu136, double tien136) {
        this.chiSoMoi136 = chiSoMoi136;
        this.chiSoCu136 = chiSoCu136;
        this.tien136 = tien136;
    }

    public BienLai(String tenChuHo, int chiSoMoi, int chiSoCu, double tien) {
        this.tenChuHo136 = tenChuHo;
        this.chiSoMoi136 = chiSoMoi;
        this.chiSoCu136 = chiSoCu;
        this.tien136 = tien;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhập chỉ số mới: ");
        chiSoMoi136 = sc.nextInt();
        sc.nextLine();
        System.out.print("\tNhập chỉ số cũ: ");
        chiSoCu136 = sc.nextInt();
        sc.nextLine();
        tien136 = (chiSoMoi136 - chiSoCu136) * 750;
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tChỉ số mới: " + chiSoMoi136);
        System.out.println("\tChỉ số cũ: " + chiSoCu136);
        System.out.println("\tTiền: " + tien136);
    }
}


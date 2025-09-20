/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI3;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class TapChi extends TaiLieu {
    private int soPhatHanh136;
    private int thangPhatHanh136;

    public TapChi() {
        super();
    }

    public TapChi(int soPhatHanh136, String maTaiLieu136, String tenNXB136, int soBanPhatHanh136, int thangPhatHanh136) {
        super(maTaiLieu136, tenNXB136, soBanPhatHanh136);
        this.soPhatHanh136 = soPhatHanh136;
        this.thangPhatHanh136 = thangPhatHanh136;
    }

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhập số phát hành: ");
        soPhatHanh136 = sc.nextInt();
        sc.nextLine();
        System.out.print("\tNhập tháng phát hành: ");
        thangPhatHanh136 = sc.nextInt();
        sc.nextLine();
    }

    @Override
    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tSố phát hành: " + soPhatHanh136);
        System.out.println("\tTháng phát hành: " + thangPhatHanh136);
    }

    public int getSoPhatHanh136() {
        return soPhatHanh136;
    }

    public void setSoPhatHanh136(int soPhatHanh136) {
        this.soPhatHanh136 = soPhatHanh136;
    }

    public int getThangPhatHanh136() {
        return thangPhatHanh136;
    }

    public void setThangPhatHanh136(int thangPhatHanh136) {
        this.thangPhatHanh136 = thangPhatHanh136;
    }
}


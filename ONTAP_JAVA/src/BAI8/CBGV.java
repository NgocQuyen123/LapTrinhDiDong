/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI8;

/**
 *
 * @author Admin
 */
import java.util.Scanner;

public class CBGV extends Nguoi {
    private double luongCung136;
    private double thuong136;
    private double phat136;
    private double luongThucLinh136;

    public CBGV() {
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhập lương cứng: ");
        luongCung136 = sc.nextDouble();
        sc.nextLine();
        System.out.print("\tNhập thưởng: ");
        thuong136 = sc.nextDouble();
        sc.nextLine();
        System.out.print("\tNhập phạt: ");
        phat136 = sc.nextDouble();
        sc.nextLine();
        luongThucLinh136 = luongCung136 + thuong136 - phat136;
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.printf("\tLương cứng: %.0f\n", luongCung136);
        System.out.printf("\tThưởng: %.0f\n", thuong136);
        System.out.printf("\tPhạt: %.0f\n", phat136);
        System.out.printf("\tLương thực lĩnh: %.0f\n", luongThucLinh136);
    }

    public double getLuongThucLinh() {
        return luongThucLinh136;
    }
}


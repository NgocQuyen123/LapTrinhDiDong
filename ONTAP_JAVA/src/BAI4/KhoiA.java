/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI4;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class KhoiA extends ThiSinh{
    private String mon1136;
    private String mon2136;
    private String mon3136;

    public KhoiA() {
    }

    public KhoiA(String mon1, String mon2, String mon3) {
        this.mon1136 = mon1;
        this.mon2136 = mon2;
        this.mon3136 = mon3;
    }   

    @Override
    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        System.out.print("\tNhập môn 1: ");
        mon1136 = sc.nextLine();
        System.out.print("\tNhập môn 2: ");
        mon2136 = sc.nextLine();
        System.out.print("\tNhập môn 3: ");
        mon3136 = sc.nextLine();
    }

    @Override
    public void hienThongTin() {
        super.hienThongTin(); 
        System.out.println("\tTổ hợp các môn thi: " + mon1136 + " - " + mon2136 + " - " + mon3136);
    }

    
}

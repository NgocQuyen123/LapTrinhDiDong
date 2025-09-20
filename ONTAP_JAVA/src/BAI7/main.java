/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI7;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
	QLHS list136=new QLHS();
	list136.nhapDanhSachHS(sc);
        System.out.print("Những học sinh sinh năm 1985 và quê ở Thái Nguyên là:");
        list136.timKiemThongTin(1985, "Thái Nguyên");
	System.out.println("Những học sinh lớp 10A1 là:");
	list136.timKiemThongTin("10A1");
	sc.close();
    }
}

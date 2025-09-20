/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI6;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {
     public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

	KhachSan ql136 = new KhachSan();

	ql136.nhapDanhSach(sc);

	System.out.print("Nhập vào khách trọ cần tính tiền(CMND): ");
	int cmnd136 = sc.nextInt();

	System.out.println("Tổng tiền là: " + ql136.tinhTien(cmnd136));
	sc.close();
    }
}

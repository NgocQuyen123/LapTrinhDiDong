/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI10;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
	QuanLy ql136 = new QuanLy();
	ql136.nhapDanhSach(sc);
	System.out.println("Danh sách biên lai của các hộ gia đình là:");
	ql136.hienThiDanhSach();

	sc.close();
    }
}

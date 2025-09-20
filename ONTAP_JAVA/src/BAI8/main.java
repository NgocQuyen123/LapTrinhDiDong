/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI8;

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
	System.out.println("Danh sách những cán bộ có lương >= 8 triệu là:");
	ql136.timKiem(8000000);
	sc.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI9;

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

	System.out.println("Danh sách sinh viên trả sách vào cuối tháng:");
	ql136.hienThiDanhSachTraCuoiThang();
	sc.close();
    }
}

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI2;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QLCB qlcb136 = new QLCB(); 
        qlcb136.nhapDanhSach(sc);
        System.out.print("Nhập vào họ tên cần tìm kiếm: ");
        String hoTenTK136 = sc.nextLine();
        qlcb136.timKiemCanBo(hoTenTK136);

        sc.close();
    }

}

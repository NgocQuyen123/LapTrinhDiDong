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
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        TuyenSinh dsTuyenSinh136 = new TuyenSinh();

        System.out.println("Nhập vào thí sinh: ");
        dsTuyenSinh136.nhapDanhSach(sc);

        System.out.println("Danh sách thí sinh dự thi:");
        dsTuyenSinh136.hienThiDanhSach();

        System.out.print("Nhập số báo danh cần tìm: ");
        int soBaoDanh136 = sc.nextInt();
        sc.nextLine();

        dsTuyenSinh136.timKiemThiSinh(soBaoDanh136);
        sc.close();
    }

}

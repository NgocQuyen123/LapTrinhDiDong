/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI3;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        QuanLySach qls136 = new QuanLySach();
        qls136.nhapDSTL(sc);

        System.out.print("\nNhập vào loại tài liệu cần tìm: ");
        String loai136 = sc.nextLine();
        qls136.timLoaiTL(loai136);

        System.out.print("\nNhập mã tài liệu cần tìm: ");
        String maTL136 = sc.nextLine();
        qls136.timMaTL(maTL136);

        sc.close();
    }
}

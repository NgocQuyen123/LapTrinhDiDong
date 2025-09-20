/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI5;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        KhuPho khuPho136 = new KhuPho();
        khuPho136.nhapHoDan(sc);
        khuPho136.hienThiDS();
        System.out.println("Danh sách hộ dân có người 80 tuổi: ");
        khuPho136.timKiemTT();

    }
}

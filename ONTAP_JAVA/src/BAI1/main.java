/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI1;

import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class main {
    public static void main(String[] args) {
        PhanSo psA136= new PhanSo();
        PhanSo psB136 = new PhanSo(); 
        PhanSo psTong136 = new PhanSo();
        PhanSo psHieu136 = new  PhanSo();
        PhanSo psNhan136 = new  PhanSo();
        PhanSo psChia136 = new  PhanSo();

        System.out.println("Nhập vào phân số thứ nhất: ");
        Scanner sc = new Scanner(System.in);
        psA136.nhapPS(sc);
        System.out.println("Nhập vào phân số thứ hai: ");
        psB136.nhapPS(sc);
        
        psTong136 = psA136.congPS(psB136);
        psTong136.toiGianPhanSo();

        psHieu136 = psA136.truPS(psB136);
        psHieu136.toiGianPhanSo();

        psNhan136 = psA136.nhanPS(psB136);
        psNhan136.toiGianPhanSo();

        psChia136 = psA136.chiaPS(psB136);
        psChia136.toiGianPhanSo();

        System.out.println("Phân số thứ nhất là: ");
        psA136.xuatPS();
        System.out.println("Phân số thứ hai là: ");
        psB136.xuatPS();
        System.out.print("Tổng hai phân số là: ");
        psTong136.xuatPS();
        System.out.print("Hiệu hai phân số là: ");
        psHieu136.xuatPS();
        System.out.print("Tích hai phân số là: ");
        psNhan136.xuatPS();
        System.out.print("Chia hai phân số là: ");
        psChia136.xuatPS();
        System.out.println("Kiểm tra phân số 1 và 2 có tối giản hay không?");
        if(psA136.kiemTraToiGian() && psB136.kiemTraToiGian()){
            System.out.println("Cả hai là phân số tối giản");
        }
        else if (!psA136.kiemTraToiGian() && psB136.kiemTraToiGian()) {
            System.out.println("Phân số 1 chưa tối giản");
            System.out.print("Phân số tối giản là: ");
            psA136.toiGianPhanSo(); 
            psA136.xuatPS();
        } 
        else if (psA136.kiemTraToiGian() && !psB136.kiemTraToiGian()) {
            System.out.println("Phân số 2 chưa tối giản");
            System.out.print("Phân số tối giản là: ");
            psB136.toiGianPhanSo(); 
            psB136.xuatPS();
        } 
        else {
            System.out.println("Cả hai phân số chưa tối giản");
            System.out.print("Phân số 1 tối giản: ");
            psA136.toiGianPhanSo();
            psA136.xuatPS();
            System.out.print("Phân số 2 tối giản: ");
            psB136.toiGianPhanSo();
            psB136.xuatPS();
        }
        sc.close();
    }
}

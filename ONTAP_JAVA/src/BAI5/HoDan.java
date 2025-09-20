/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI5;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class HoDan {
    private int soNguoi136;
    private int soNha136;
    private List<Nguoi> dsThanhVien136 = new ArrayList<>();

    public HoDan(int soNguoi136, int soNha136) {
        this.soNguoi136 = soNguoi136;
        this.soNha136 = soNha136;
    }

    public HoDan() {
    }

    public void nhapThongTin(Scanner sc){
        System.out.println("Nhập sô nhà: ");
        soNha136 = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập số thành viên: ");
        soNguoi136 = sc.nextInt();
        sc.nextLine();
        for(int i =1; i <= soNguoi136; i++)
        {
            System.out.println("Nhập thông tin thành viên thứ "+i+" : ");
            Nguoi tv136 = new Nguoi();
            tv136.nhapThongTin(sc);
            dsThanhVien136.add(tv136);
        }
    }

    public int getSoNha136() {
        return soNha136;
    }

    public void hienThi(){
        System.out.println("Số nhà: " + soNha136);
        System.out.println("Số thành viên: " + soNguoi136);
        System.out.println("Danh sách thành viên:");
        for (Nguoi nguoi136 : dsThanhVien136) {
            nguoi136.hienThiThongTin();    
        }
    }

    public int getSoNguoi136() {
        return soNguoi136;
    }

    public List<Nguoi> getDsThanhVien136() {
        return dsThanhVien136;
    }

}

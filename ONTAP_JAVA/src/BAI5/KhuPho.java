/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI5;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class KhuPho {
    private ArrayList<HoDan> dsHD136 = new ArrayList<>();

    public KhuPho() {
    }

    public KhuPho(ArrayList<HoDan> dsHD136) {
        this.dsHD136 = dsHD136;
    }

    public void themHoDan(HoDan hs136){
        dsHD136.add(hs136);
    }

    public void nhapHoDan(Scanner sc){
        HoDan hoDan136;
        System.out.print("Nhập số hộ dân muốn thêm: ");
        int soHD136 = sc.nextInt();
        sc.nextLine();
        System.out.println("Nhập thông tin cho từng hộ dân: ");
        for(int i = 1; i <= soHD136; i++){
            System.out.println("Hộ dân thứ "+i+" :");
            hoDan136 = new HoDan();
            hoDan136.nhapThongTin(sc);
            themHoDan(hoDan136);
        }
    }

    public void hienThiDS(){
        int i = 1;
        for (HoDan hd136 : dsHD136) {
            System.out.println("Hộ dân thứ " + (i++) + ":");
            hd136.hienThi();
            System.out.println("------------------");
        }
    }

    public void timKiemTT(){
        int namHT136 = LocalDate.now().getYear();
        for(HoDan hd136: dsHD136){
            for (Nguoi n136 : hd136.getDsThanhVien136()){
                int tuoi136 = namHT136 - n136.getNgaySinh136().getYear(); 
                if(tuoi136 == 80){
                    System.out.println("Hộ dân số nhà " + hd136.getSoNha136() + " có người mừng thượng thọ:");
                    n136.hienThiThongTin(); 
                    System.out.println("-------------------");
                }
            }
        }
    }

}

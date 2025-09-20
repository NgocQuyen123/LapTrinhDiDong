/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI5;

/**
 *
 * @author Admin
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Nguoi {
    private String hoTen136;
    private LocalDate ngaySinh136;
    private String ngheNghiep136;

    public Nguoi() {
    }

    public Nguoi(String hoTen136, LocalDate ngaySinh136, String ngheNghiep136) {
        this.hoTen136 = hoTen136;
        this.ngaySinh136 = ngaySinh136;
        this.ngheNghiep136 = ngheNghiep136;
    }

    public void nhapThongTin(Scanner sc){
        System.out.print("\tNhập họ tên: ");
        hoTen136 = sc.nextLine();
        System.out.print("\tNhập ngày sinh: ");
        String strDate = sc.nextLine();
        ngaySinh136 = strToDate(strDate);
        System.out.print("\tNhập nghề nghiệp: ");
        ngheNghiep136 = sc.nextLine();
    }

    private LocalDate strToDate(String ns136) {
        DateTimeFormatter dtf136 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return LocalDate.parse(ns136, dtf136);
    }

    public void hienThiThongTin(){
        System.out.println("Họ tên: "+ hoTen136);
        System.out.println("Ngày sinh: "+ dateToString(ngaySinh136));
        System.out.println("Nghề nghiệp: "+ngheNghiep136);
    }

    public String dateToString(LocalDate ns136) {
        DateTimeFormatter dtf136 = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        return ns136.format(dtf136);
    }

    public LocalDate getNgaySinh136() {
        return ngaySinh136;
    }
}


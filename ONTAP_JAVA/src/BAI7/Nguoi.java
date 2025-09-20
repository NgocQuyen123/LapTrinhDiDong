/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI7;

/**
 *
 * @author Admin
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Nguoi {
    protected String hoTen136;
    protected LocalDate ngaySinh136;
    protected String queQuan136;

    public Nguoi() {
    }

    public Nguoi(String hoTen136, LocalDate ngaySinh136, String queQuan136) {
        this.hoTen136 = hoTen136;
        this.ngaySinh136 = ngaySinh136;
        this.queQuan136 = queQuan136;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhập họ tên: ");
        hoTen136 = sc.nextLine();
        System.out.print("\tNhập ngày sinh (dd-MM-yyyy): ");
        String strDate = sc.nextLine();
        ngaySinh136 = strToDate(strDate);
        System.out.print("\tNhập quê quán: ");
        queQuan136 = sc.nextLine();
    }

    private LocalDate strToDate(String strDate) {
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd-MM-yyyy");
        try {
            return LocalDate.parse(strDate, dtf);
        } catch (Exception e) {
            System.out.println("Lỗi định dạng ngày tháng!");
            return null;
        }
    }

    public void hienThiThongTin() {
        System.out.println("\tHọ tên: " + hoTen136);
        System.out.println("\tNgày sinh: " + ngaySinh136);
        System.out.println("\tQuê quán: " + queQuan136);
    }

    public String getQueQuan() {
        return queQuan136;
    }

    public LocalDate getNgaySinh() {
        return ngaySinh136;
    }
}


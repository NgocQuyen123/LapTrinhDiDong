/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI6;

/**
 *
 * @author Admin
 */
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
    protected String hoTen136;
    protected Date ngaySinh136;
    protected int CMND136;

    public Nguoi() {

    }

    public Nguoi(String hoTen136, Date ngaySinh136, int CMND136) {
        this.hoTen136 = hoTen136;
        this.ngaySinh136 = ngaySinh136;
        this.CMND136 = CMND136;
    }

    public void nhapThongTin(Scanner sc) {
        System.out.print("\tNhập họ tên: ");
        hoTen136 = sc.nextLine();
        System.out.print("\tNhập ngày sinh: ");
        String strDate = sc.nextLine();
        ngaySinh136 = strToDate(strDate);
        System.out.print("\tNhập CMND: ");
        CMND136 = sc.nextInt();
        sc.nextLine(); 
    }

    private Date strToDate(String strDate136) {
        Date date136 = null;
        SimpleDateFormat sdf136 = new SimpleDateFormat("dd-MM-yyyy");

        try {
            date136 = sdf136.parse(strDate136);
        } catch (ParseException e) {
            System.out.println("Lỗi định dạng ngày tháng!");
        }

        return date136;
    }

    public void hienThiThongTin() {
        System.out.println("\tHọ tên: " + hoTen136);
        System.out.println("\tNgày sinh: " + ngaySinh136);
        System.out.println("\tCMND: " + CMND136);
    }

    public int getCMND136() {
        return CMND136;
    }
}


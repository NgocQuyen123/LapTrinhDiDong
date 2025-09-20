/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package BAI9;

/**
 *
 * @author Admin
 */
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheMuon extends SinhVien {
    private int soMuon136;
    private LocalDate ngayMuon136;
    private LocalDate hanTra136;
    private String soHieu136;

    public TheMuon() {
    }

    public TheMuon(int soMuon136, LocalDate ngayMuon136, LocalDate hanTra136, String soHieu136) {
        this.soMuon136 = soMuon136;
        this.ngayMuon136 = ngayMuon136;
        this.hanTra136 = hanTra136;
        this.soHieu136 = soHieu136;
    }

    public void nhapThongTin(Scanner sc) {
        super.nhapThongTin(sc);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

        System.out.print("\tNhập số mượn: ");
        soMuon136 = sc.nextInt();
        sc.nextLine();

        System.out.print("\tNhập ngày mượn (dd-MM-yyyy): ");
        String strNgayMuon = sc.nextLine();
        ngayMuon136 = LocalDate.parse(strNgayMuon, formatter);

        System.out.print("\tNhập hạn trả (dd-MM-yyyy): ");
        String strHanTra = sc.nextLine();
        hanTra136 = LocalDate.parse(strHanTra, formatter);

        System.out.print("\tNhập số hiệu: ");
        soHieu136 = sc.nextLine();
    }

    public void hienThiThongTin() {
        super.hienThiThongTin();
        System.out.println("\tSố phiếu mượn: " + soMuon136);
        System.out.println("\tNgày mượn: " + ngayMuon136);
        System.out.println("\tHạn trả: " + hanTra136);
        System.out.println("\tSố hiệu: " + soHieu136);
    }

    public LocalDate getHanTra136() {
        return hanTra136;
    }
}


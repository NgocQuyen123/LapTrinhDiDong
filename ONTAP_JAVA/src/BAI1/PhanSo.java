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
public class PhanSo {
    private int tuSo136;
    private int mauSo136;

    public PhanSo(){
        tuSo136 =0;
        mauSo136 =1;
    }
    
    public PhanSo(int tuSo136, int mauSo136) {
        this.tuSo136 = tuSo136;
        this.mauSo136 = mauSo136;
    }

    public void nhapPS(Scanner sc){
        int numberA136;
        int numberB136;
        do {
            System.out.print("\tNhập tử số: ");
            numberA136 = sc.nextInt();
            System.out.print("\tNhập mẫu số: ");
            numberB136 = sc.nextInt();
            if(numberB136 ==0)
            {
                System.out.print("Mẫu số không được bằng 0, vui lòng nhập lại !!!");
            }
            else{
                tuSo136 = numberA136;
                mauSo136 =numberB136;
            }
        } while (numberB136==0);
    }
  
    public void xuatPS(){
        if(tuSo136*mauSo136 <0){
            System.out.println("\t-" + Math.abs(tuSo136) +"/" + Math.abs(mauSo136));
        }
        else{
            System.out.println("\t" + Math.abs(tuSo136) +"/" + Math.abs(mauSo136));
        }    
    }
  
    public PhanSo congPS(PhanSo ps2){
        int a136 = tuSo136*ps2.mauSo136 + ps2.tuSo136*mauSo136;
        int b136 = mauSo136 * ps2.mauSo136;
        
        return new PhanSo(a136,b136);
    }
  
    public PhanSo truPS(PhanSo ps2){
        int a136 = tuSo136*ps2.mauSo136 - ps2.tuSo136*mauSo136;
        int b136 = mauSo136 * ps2.mauSo136;
        
        return new PhanSo(a136,b136);
    }
 
    public PhanSo nhanPS(PhanSo ps2){
        int a136 = tuSo136* ps2.tuSo136;
        int b136 = mauSo136 * ps2.mauSo136;
        
        return new PhanSo(a136,b136);
    }
 
    public PhanSo chiaPS(PhanSo ps2){
        int a136 = tuSo136* ps2.mauSo136;
        int b136 = mauSo136 * ps2.tuSo136;
        
        return new PhanSo(a136,b136);
    }
 
    private int timUCLN(int a136, int b136){
        int r136 =a136%b136;
        while(r136!=0)
        {
            a136=b136;
            b136=r136;
            r136=a136%b136;
        }
        return b136;
    }

    public boolean kiemTraToiGian(){
        if(timUCLN(tuSo136, mauSo136)==1){
            return true;
        }
        else 
            return false;
    }

    public void toiGianPhanSo(){
        int x136 = timUCLN(tuSo136, mauSo136);
        tuSo136/=x136;
        mauSo136/=x136;
    }

    public int getTuSo136() {
        return tuSo136;
    }

    public void setTuSo136(int tuSo136) {
        this.tuSo136 = tuSo136;
    }

    public int getMauSo136() {
        return mauSo136;
    }

    public void setMauSo136(int mauSo136) {
        this.mauSo136 = mauSo136;
    }
}


package DangKhaiVy_30209244459;
import java.util.ArrayList;
import java.util.Scanner;
public class bai3 {
    public static ArrayList<Double> nhapgia(){
        ArrayList<Double> gia = new ArrayList<>();
        Scanner nhap = new Scanner(System.in);
        System.out.println("Hay nhap so luong san pham: ");
        int n= nhap.nextInt();
        System.out.println("Hay nhap gia san pham: ");
        for(int i=0;i<n;i++){
            gia.add(nhap.nextDouble());
        }
        return gia;
    }
    public static void main(String[] args) {
        ArrayList<Double> gia = nhapgia();
        System.out.println("Danh sach gia la: "+gia);
        
    }
}

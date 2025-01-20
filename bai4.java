
package DangKhaiVy_30209244459;
import java.util.ArrayList;
import java.util.Scanner;
public class bai4 {
    public static ArrayList<String> nhapcity(){
        ArrayList<String> city = new ArrayList<>();
        Scanner nhap = new Scanner(System.in);
        System.out.println("Hay nhap so thanh pho trong danh sach: ");
        int n= nhap.nextInt();
        nhap.nextLine();
        System.out.println("Hay nhap ten thanh pho: ");
        for(int i=0;i<n;i++){
            city.add(nhap.nextLine());
        }
        return city;
    }
    public static void ktracity(ArrayList<String> city){
        if(city.contains("Lon Don")){
            System.out.println("Lon Don co trong danh sach.");
        }else{
            System.out.println("Lon Don khong co trong danh sach.");
        }
    }
    public static void main(String[] args) {
        ArrayList<String> city = nhapcity();
        System.out.println("Danh sach la: "+city);
        ktracity(city);
    }
}

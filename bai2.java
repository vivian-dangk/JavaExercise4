
package DangKhaiVy_30209244459;
import java.util.ArrayList;
import java.util.Scanner;
public class bai2 {
    public static ArrayList<String> nhapmau(){
        ArrayList<String> mau = new ArrayList<>();
        Scanner nhap = new Scanner(System.in);
        System.out.println("Hay nhap 5 mau: ");
        for(int i=0;i<5;i++){
            mau.add(nhap.nextLine());
        }
        return mau;
    }
    public static void doimau(ArrayList<String> mau, int vt, String maumoi){
        if(vt<0||vt>=mau.size()){
            System.out.println("Khong hopwj le.");
        }else{
            mau.set(vt, maumoi);
        }
    }
    public static void main(String[] args) {
        ArrayList<String> mau = nhapmau();
        System.out.println("Day mau la: " + mau);
        String yellow = "vang";
        doimau(mau, 1, yellow);
        System.out.println("Day mau sau khi doi la: "+mau);
    }
}


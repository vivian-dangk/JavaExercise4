
package DangKhaiVy_30209244459;
import java.util.Random;
import java.util.ArrayList;
public class bai5 {
    public static ArrayList<Integer> nhapso(){
        Random ngaunhien = new Random();
        ArrayList<Integer> so = new ArrayList<>();
        for(int i=0;i<10;i++){
            so.add(ngaunhien.nextInt(100)+1);
        }
        return so;
    }
    public static void xoa(ArrayList<Integer> so,int vt){
        if(vt>=0&&vt<so.size()){
            so.remove(vt);
            System.out.println("Day so sau khi xoa la: "+so);
        }else{
            System.out.println("Khong tim thay vi tri."); 
       }
    }
    public static void main(String[] args) {
        ArrayList<Integer> so = nhapso();
        System.out.println("Danh sach la: "+so);
        xoa(so,2);
    }
}

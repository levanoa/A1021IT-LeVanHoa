package _11_Stack_Queue.Thuc_hanh.Map;

import java.util.*;

public class TuDien {
    private Map<String,String> duLieu = new TreeMap<String,String>();

    public String themTu(String tuKhoa, String yNghia) {
        return this.duLieu.put(tuKhoa,yNghia);

    }
    public String xoaTu(String tuKhoa) {
        return this.duLieu.remove(tuKhoa);
    }
    public String TraTu(String tuKhoa) {
        String yNghia = this.duLieu.remove(tuKhoa);
        return yNghia;
    }
    public void inTuKhoa() {
//        Set<String> tapHopTuKhoa = this.duLieu.keySet();
          for(int i = 0 ; i < duLieu.size(); i++) {
              System.out.println(duLieu.remove(i));
          }
//        System.out.println(Arrays.toString(tapHopTuKhoa.toArray()));
    }
    public int laySoluong() {
        return this.duLieu.size();
    }
    public void xoaTatCa() {
        this.duLieu.clear();
    }

    public static void main(String[] args) {
        TuDien tuDien =new TuDien();

        Scanner scanner =new Scanner(System.in);
        int luaChon = 0;

        do{
            System.out.println("---------");
            System.out.println("----MENU -------");
            System.out.println("Tra từ điển anh việt: \n"
                    + "1. Thêm từ \n"
                    + "2. Xóa từ \n"
                    + "3. Tìm ý nghĩa của từ \n"
                    + "4. In ra danh sách của từ khóa \n"
                    + "5. In ra số lượng từ \n"
                    + "6. Xóa tất cả các từ khóa \n");
            luaChon = scanner.nextInt();
            scanner.nextLine();
            if(luaChon ==1) {
                System.out.println("nhập vào từ khóa");
                String tuKhoa = scanner.nextLine();
                System.out.println("nhập vào ý nghĩa");
                String yNghia = scanner.nextLine();
                tuDien.themTu(tuKhoa,yNghia);
            }else if ( luaChon ==2 || luaChon ==3) {
                System.out.println("nhập vào từ khóa:");
                String tuKhoa = scanner.nextLine();
                if(luaChon ==2) {
                    tuDien.xoaTu(tuKhoa);
                } else {
                    System.out.println("ý nghĩa là " + tuDien.TraTu(tuKhoa));
                }
            }else if(luaChon ==4) {
                tuDien.inTuKhoa();
            } else if(luaChon ==5)  {
                System.out.println("số lượng từ khóa là : " + tuDien.laySoluong());

            } else if(luaChon ==6) {
                tuDien.xoaTatCa();
            }

        } while (luaChon !=0);

    }

}

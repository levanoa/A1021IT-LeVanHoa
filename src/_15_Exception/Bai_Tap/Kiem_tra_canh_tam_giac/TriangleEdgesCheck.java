package _15_Exception.Bai_Tap.Kiem_tra_canh_tam_giac;

import _11_Stack_Queue.Bai_tap.Trien_Khai_Queue.Solution;

public class TriangleEdgesCheck extends Throwable {

    public TriangleEdgesCheck(String s) {
    }

    public TriangleEdgesCheck() {

    }

    public void kiemTra(double a, double b , double c) throws TriangleEdgesCheck {
            if( a + b <= c || a + c <= b || b + c <= a) {
                throw new TriangleEdgesCheck("Loi: tam giac khong hop le");

            } else {
                System.out.println(" Tam giac hop le");
            }
    }


}

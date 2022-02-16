package _7_Abstract_Class_Interface.Bai_tap.PhuongTien;

public class XeDap extends PhuongTienDiChuyen {

    public XeDap(HangSanXuat hangSanXuat) {
        super("xe dap", hangSanXuat);
    }

    @Override
    public double layVanToc() {
        return 60;
    }
}

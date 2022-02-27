package CaseStudy.Models.Models;

public class Room extends Facility {
    private String dichVuMienPhidiKem;


    public Room(String tenDichVu, double dienTich, double chiPhiThue, int soNguoiSuDung, String kieuThue, String dichVuMienPhidiKem) {
        super(tenDichVu, dienTich, chiPhiThue, soNguoiSuDung, kieuThue);
        this.dichVuMienPhidiKem = dichVuMienPhidiKem;
    }

    public String getDichVuMienPhidiKem() {
        return dichVuMienPhidiKem;
    }

    public void setDichVuMienPhidiKem(String dichVuMienPhidiKem) {
        this.dichVuMienPhidiKem = dichVuMienPhidiKem;
    }

    @Override
    public String toString() {
        return "Room{" +
                "dichVuMienPhidiKem='" + dichVuMienPhidiKem + '\'' +
                '}';
    }
}

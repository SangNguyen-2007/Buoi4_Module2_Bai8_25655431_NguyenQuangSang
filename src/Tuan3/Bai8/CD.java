package Tuan3.Bai8;
/**
 * BaiTap tuan3, Bai 8, Nguyen Quang Sang, mssv : 25655431
 */
public class CD {
     
    /**
     * khai bao thuoc tinh cho object CD
     */
    private String maCD;
    private String tuaCD;
    private String caSy;
    private int soBaiHat;
    private float gia;

    // construc
    
    public CD() {
    }

    public CD(String tuaCD, String caSy, int soBaiHat, float gia, String maCD) throws Exception {
        this.tuaCD = tuaCD;
        this.caSy = caSy;
        this.setSoBaiHat(soBaiHat);
        this.gia = gia;
        this.maCD = maCD;
    }

    // get va set

    public String getMaCD() {
        return maCD;
    }

    public void setMaCD(String maCD) {
        this.maCD = maCD;
    }

    public String getTuaCD() {
        return tuaCD;
    }

    public void setTuaCD(String tuaCD) {
        this.tuaCD = tuaCD;
    }

    public String getCaSy() {
        return caSy;
    }

    public void setCaSy(String caSy) {
        this.caSy = caSy;
    }

    /**
     * @return the soBaiHat
     */
    public int getSoBaiHat() {
        return soBaiHat;
    }

    /**
     * @param soBaiHat the soBaiHat to set
     */
    public void setSoBaiHat(int soBai) throws Exception {
        if (soBai > 0) {
            this.soBaiHat = soBai;
        } else {
            throw new Exception("so bai hat lon hon 0");
        }
    }

    /**
     * @return the gia
     */
    public float getGia() {
        return gia;
    }

    /**
     * @param gia the gia to set
     */
    public void setGia(float gia) {
        this.gia = gia;
    }

    // tinh toan va hien thi

    public double getThanhTien() {
        return getSoBaiHat() * getGia();
    }

    /**
     * tieu de de in
     */
    public static void tieuDe() {
        System.out.println("In danh sach CD");
        for (int i = 0; i < 73; i++) {
            System.out.print("-");
        }
        System.out.println();
        String s = "";
        s = String.format("| %10s| %10s| %10s| %10s| %10s| %10s|", "Ma CDRom", "Tua CDRom", "Ten CaSi", "So Bai Hat", "Gia", "Thanh Tien");
        System.out.println(s);
        for (int i = 0; i < 73; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    /**
     * toString
     */
    @Override
    public String toString() {
        String s = "";
        s = String.format("|%10s|%10s|%10s|%10d|%10.2f|%10.2f|", getMaCD(), getTuaCD(), getCaSy(), getSoBaiHat(), getGia(), getThanhTien());
        return s;
    }
}
    /**
     * BaiTap tuan3, Bai 8, Nguyen Quang Sang, mssv : 25655431
     */

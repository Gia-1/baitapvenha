package Day_4;

public abstract class HinhHoc {
    private String tenHinh;

    public void setTenHinh(String tenHinh) {
        this.tenHinh = tenHinh;
    }

    public String getTenHinh() {
        return tenHinh;
    }

    public abstract void tinhDienTich();
}

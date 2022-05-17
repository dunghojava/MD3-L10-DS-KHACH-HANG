package model;

public class khachhang {
    private String ten;
    private String ngaysinh;
    private String diachi;
    private String anh;

    public khachhang(String ten, String ngaysinh, String diachi, String anh) {
        this.ten = ten;
        this.ngaysinh = ngaysinh;
        this.diachi = diachi;
        this.anh = anh;
    }

    @Override
    public String toString() {
        return "khachhang{" +
                "ten='" + ten + '\'' +
                ", ngaysinh='" + ngaysinh + '\'' +
                ", diachi='" + diachi + '\'' +
                ", anh='" + anh + '\'' +
                '}';
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(String ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getDiachi() {
        return diachi;
    }

    public void setDiachi(String diachi) {
        this.diachi = diachi;
    }

    public String getAnh() {
        return anh;
    }

    public void setAnh(String anh) {
        this.anh = anh;
    }

    public khachhang() {
    }
}

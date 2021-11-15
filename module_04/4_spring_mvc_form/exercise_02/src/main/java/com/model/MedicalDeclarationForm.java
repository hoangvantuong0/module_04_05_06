package com.model;

public class MedicalDeclarationForm {
    private String ten;
    private String ngaySinh;
    private String gioiTinh;
    private String quocTich;
    private String soCMND;
    private String phuongTien;
    private String soHieu;
    private String soGhe;
    private String ngayKhoiHanh;
    private String ngayKetThuc;
    private String lichTrinh;
    private String tinhThanh;
    private String quanHuyen;
    private String phuongXa;
    private String diaChiNoiO;
    private String soDienThoai;
    private String email;
    private boolean sot;
    private boolean ho;
    private boolean khoTho;
    private boolean dauHong;
    private boolean buonNon;
    private boolean tieuChay;
    private boolean xuatHuyet;
    private boolean noiBan;
    private boolean diCho;
    private boolean tiepXucGan;

    public MedicalDeclarationForm() {
    }

    public MedicalDeclarationForm(String ten, String ngaySinh, String gioiTinh, String quocTich, String soCMND,
                                  String phuongTien, String soHieu, String soGhe, String ngayKhoiHanh,
                                  String ngayKetThuc, String lichTrinh, String tinhThanh, String quanHuyen,
                                  String phuongXa, String diaChiNoiO, String soDienThoai, String email,
                                  boolean sot, boolean ho, boolean khoTho, boolean dauHong, boolean buonNon,
                                  boolean tieuChay, boolean xuatHuyet, boolean noiBan, boolean diCho, boolean
                                          tiepXucGan) {
        this.ten = ten;
        this.ngaySinh = ngaySinh;
        this.gioiTinh = gioiTinh;
        this.quocTich = quocTich;
        this.soCMND = soCMND;
        this.phuongTien = phuongTien;
        this.soHieu = soHieu;
        this.soGhe = soGhe;
        this.ngayKhoiHanh = ngayKhoiHanh;
        this.ngayKetThuc = ngayKetThuc;
        this.lichTrinh = lichTrinh;
        this.tinhThanh = tinhThanh;
        this.quanHuyen = quanHuyen;
        this.phuongXa = phuongXa;
        this.diaChiNoiO = diaChiNoiO;
        this.soDienThoai = soDienThoai;
        this.email = email;
        this.sot = sot;
        this.ho = ho;
        this.khoTho = khoTho;
        this.dauHong = dauHong;
        this.buonNon = buonNon;
        this.tieuChay = tieuChay;
        this.xuatHuyet = xuatHuyet;
        this.noiBan = noiBan;
        this.diCho = diCho;
        this.tiepXucGan = tiepXucGan;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getNgaySinh() {
        return ngaySinh;
    }

    public void setNgaySinh(String ngaySinh) {
        this.ngaySinh = ngaySinh;
    }

    public String getGioiTinh() {
        return gioiTinh;
    }

    public void setGioiTinh(String gioiTinh) {
        this.gioiTinh = gioiTinh;
    }

    public String getQuocTich() {
        return quocTich;
    }

    public void setQuocTich(String quocTich) {
        this.quocTich = quocTich;
    }

    public String getSoCMND() {
        return soCMND;
    }

    public void setSoCMND(String soCMND) {
        this.soCMND = soCMND;
    }

    public String getPhuongTien() {
        return phuongTien;
    }

    public void setPhuongTien(String phuongTien) {
        this.phuongTien = phuongTien;
    }

    public String getSoHieu() {
        return soHieu;
    }

    public void setSoHieu(String soHieu) {
        this.soHieu = soHieu;
    }

    public String getSoGhe() {
        return soGhe;
    }

    public void setSoGhe(String soGhe) {
        this.soGhe = soGhe;
    }

    public String getNgayKhoiHanh() {
        return ngayKhoiHanh;
    }

    public void setNgayKhoiHanh(String ngayKhoiHanh) {
        this.ngayKhoiHanh = ngayKhoiHanh;
    }

    public String getNgayKetThuc() {
        return ngayKetThuc;
    }

    public void setNgayKetThuc(String ngayKetThuc) {
        this.ngayKetThuc = ngayKetThuc;
    }

    public String getLichTrinh() {
        return lichTrinh;
    }

    public void setLichTrinh(String lichTrinh) {
        this.lichTrinh = lichTrinh;
    }

    public String getTinhThanh() {
        return tinhThanh;
    }

    public void setTinhThanh(String tinhThanh) {
        this.tinhThanh = tinhThanh;
    }

    public String getQuanHuyen() {
        return quanHuyen;
    }

    public void setQuanHuyen(String quanHuyen) {
        this.quanHuyen = quanHuyen;
    }

    public String getPhuongXa() {
        return phuongXa;
    }

    public void setPhuongXa(String phuongXa) {
        this.phuongXa = phuongXa;
    }

    public String getDiaChiNoiO() {
        return diaChiNoiO;
    }

    public void setDiaChiNoiO(String diaChiNoiO) {
        this.diaChiNoiO = diaChiNoiO;
    }

    public String getSoDienThoai() {
        return soDienThoai;
    }

    public void setSoDienThoai(String soDienThoai) {
        this.soDienThoai = soDienThoai;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isSot() {
        return sot;
    }

    public void setSot(boolean sot) {
        this.sot = sot;
    }

    public boolean isHo() {
        return ho;
    }

    public void setHo(boolean ho) {
        this.ho = ho;
    }

    public boolean isKhoTho() {
        return khoTho;
    }

    public void setKhoTho(boolean khoTho) {
        this.khoTho = khoTho;
    }

    public boolean isDauHong() {
        return dauHong;
    }

    public void setDauHong(boolean dauHong) {
        this.dauHong = dauHong;
    }

    public boolean isBuonNon() {
        return buonNon;
    }

    public void setBuonNon(boolean buonNon) {
        this.buonNon = buonNon;
    }

    public boolean isTieuChay() {
        return tieuChay;
    }

    public void setTieuChay(boolean tieuChay) {
        this.tieuChay = tieuChay;
    }

    public boolean isXuatHuyet() {
        return xuatHuyet;
    }

    public void setXuatHuyet(boolean xuatHuyet) {
        this.xuatHuyet = xuatHuyet;
    }

    public boolean isNoiBan() {
        return noiBan;
    }

    public void setNoiBan(boolean noiBan) {
        this.noiBan = noiBan;
    }

    public boolean isDiCho() {
        return diCho;
    }

    public void setDiCho(boolean diCho) {
        this.diCho = diCho;
    }

    public boolean isTiepXucGan() {
        return tiepXucGan;
    }

    public void setTiepXucGan(boolean tiepXucGan) {
        this.tiepXucGan = tiepXucGan;
    }
}
package com.hutech.demo.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.springframework.web.multipart.MultipartFile;

public class SinhVien {
    public SinhVien(String ten, int tuoi, String khoa, String imgUrl){
        this.ten = ten;
        this.tuoi = tuoi;
        this.khoa = khoa;
        this.imgUrl = imgUrl;
    }
    public SinhVien(){}
    @NotBlank(message = "Tên là bắt buộc")
    private String ten;

    @Min(value = 18, message = "Tuổi phải lớn hơn hoặc bằng 18")
    @Max(value = 100, message = "Tuổi phải nhỏ hơn hoặc bằng 100")
    private int tuoi;

    @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Khoa phải là chữ")
    private String khoa;

    public @NotBlank(message = "Tên là bắt buộc") String getTen() {
        return ten;
    }

    public void setTen(@NotBlank(message = "Tên là bắt buộc") String ten) {
        this.ten = ten;
    }

    @Min(value = 18, message = "Tuổi phải lớn hơn hoặc bằng 18")
    @Max(value = 100, message = "Tuổi phải nhỏ hơn hoặc bằng 100")
    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(@Min(value = 18, message = "Tuổi phải lớn hơn hoặc bằng 18") @Max(value = 100, message = "Tuổi phải nhỏ hơn hoặc bằng 100") int tuoi) {
        this.tuoi = tuoi;
    }

    public @Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Khoa phải là chữ") String getKhoa() {
        return khoa;
    }

    public void setKhoa(@Pattern(regexp = "^[a-zA-Z\\s]+$", message = "Khoa phải là chữ") String khoa) {
        this.khoa = khoa;
    }

    private String imgUrl;


    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }
}

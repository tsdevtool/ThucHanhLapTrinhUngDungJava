package com.hutech.demo.model;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;

public class SinhVien {
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
}

package com.hutech.demo.controller;

import com.hutech.demo.model.SinhVien;
import jakarta.validation.Valid;
import org.springframework.boot.context.properties.bind.BindResult;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Controller
public class SinhVienController {
    private List<SinhVien> sinhViens = new ArrayList<>();

    private static final String UPLOAD_DIR = "src/main/resources/static/uploads/";
    @GetMapping("/sinhvien")
    public String showForm(Model model){
        model.addAttribute("sinhVien", new SinhVien());
        return "sinhvien/form-sinhvien";
    }

//    @PostMapping("/sinhvien")
//    public String submitForm(@Valid SinhVien sinhVien, BindingResult bindingResult, Model model){
//        if(bindingResult.hasErrors()){
//            return "sinhvien/form-sinhvien";
//        }
//        sinhViens.add(sinhVien);
//        model.addAttribute("sinhViens", sinhViens);
//        model.addAttribute("message","Sinh viên đã được thêm thành công");
//        return "sinhvien/result-sinhvien";
//    }
    @PostMapping("/sinhvien")
    public String submitForm(@ModelAttribute("sinhVien") SinhVien sinhVien, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()){
            return "sinhvien/form-sinhvien";
        }
//        MultipartFile file = sinhVien.getImgUrl();
//        if(!file != null)=
//        SinhVien sinhVien = new SinhVien();
//        sinhVien.setTen(ten);
//        sinhVien.setTuoi(tuoi);
//        sinhVien.setKhoa(khoa);
//        sinhVien.setImgUrl(imgUrl);
        sinhViens.add(sinhVien);
        model.addAttribute("sinhViens", sinhViens);
        model.addAttribute("message","Sinh viên đã được thêm thành công");
        return "sinhvien/result-sinhvien";
    }

}

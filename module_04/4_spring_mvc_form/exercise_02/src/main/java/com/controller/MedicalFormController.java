package com.controller;

import com.model.MedicalDeclarationForm;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MedicalFormController {
    @GetMapping("")
    public String getFormPage(Model model){
        String[] gioiTinh = new String[]{"nam","nữ"};
        String[] phuongTien= new String[]{"tàu bay","tàu thuyền", "ô tô", "Khác"};
        String[] quocTich = new String[]{"Mỹ","Trung Quốc","Hàn Quốc","Việt Nam"};
        String[] tinhThanh = new String[]{"Hà Nội","Huế","TP Hồ Chí Minh", "Huế"};
//        String[] quanHuyen = new String[]{"Cầu Giấy","Sơn Trà","Hương Trà", "Quận 5"};
//        String[] phuongXa = new String[]{"Phường 1","Phường 2","Phường 3"};
        Boolean[] booleans = new Boolean[]{true,false};

        model.addAttribute("quocTich",quocTich);
        model.addAttribute("phuongTien",phuongTien);
        model.addAttribute("tinhThanh",tinhThanh);
//        model.addAttribute("quanHuyen",quanHuyen);
//        model.addAttribute("phuongXa",phuongXa);
        model.addAttribute("gioiTinh",gioiTinh);
        model.addAttribute("medicalDeclarationForm",new MedicalDeclarationForm());

        return "index";
    }

    @PostMapping("/declaration")
    public String createForm(@ModelAttribute("medicalDeclarationForm") MedicalDeclarationForm medicalDeclarationForm, Model model){
        model.addAttribute("medicalDeclarationForm",medicalDeclarationForm);
        return "show";
    }
}

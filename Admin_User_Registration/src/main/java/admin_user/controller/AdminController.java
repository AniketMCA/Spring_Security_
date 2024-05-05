package admin_user.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import admin_user.model.Admin;
import admin_user.model.Applicant;
import admin_user.repositories.AdminRepository;
import admin_user.repositories.ApplicantRepository;
import admin_user.service.AdminService;
@Controller
public class AdminController {
	@Autowired
	private AdminService adminService;
	
//	@Autowired
//	private AdminRepository adminRepository; 
	
	@Autowired
	private ApplicantRepository applicantRepository;
	
	@GetMapping("/form2")
    public String showForm(Model model) {
        model.addAttribute("applicant", applicantRepository.findFirstByOrderByIdDesc());        
        return "form2";
    }
	
	@PostMapping("/admin-page/form2")
    public String submitForm(Applicant applicant) {
		Applicant applicant2 = applicantRepository.findById(applicant.getId()).get();
		applicant2.setRemark(applicant.getRemark());
		applicant2.setAction(applicant.getAction());
		applicantRepository.save(applicant2);
		
        return "redirect:/form2";
    }
}

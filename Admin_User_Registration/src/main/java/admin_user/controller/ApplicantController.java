package admin_user.controller;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import admin_user.model.Applicant;
import admin_user.repositories.ApplicantRepository;
import admin_user.service.ApplicantService;

@Controller
public class ApplicantController {
	@Autowired
	private ApplicantService applicantService;
	
	@Autowired
	private ApplicantRepository applicantRepository;
	
	
	 @GetMapping("/form")
	    public String showForm(Model model) {
	        model.addAttribute("applicant", new Applicant());
	        return "form";
	    }
	 
	//@PreAuthorize("hasAuthority('USER')")
	 @PostMapping("/user-page/form")
	    public String submitForm(@ModelAttribute Applicant applicant) {
	        try {
//	            // Save the uploaded photo to a directory @RequestParam("photo") MultipartFile photo
//	            byte[] bytes = photo.getBytes();
//	            Path path = Paths.get("/path/to/photo/directory/" + photo.getOriginalFilename());
//	            Files.write(path, bytes);
//
//	            // Set the photo URL in the User object
//	            applicant.setPhoto(path.toString());

	            // Save user to the database
	            applicantRepository.save(applicant);

	            return "redirect:/user-page/form/success";
	        } catch (Exception e) {
	            e.printStackTrace();
	            // Handle file upload error
	            return "redirect:/error";
	        }
	    }

		
	    @GetMapping("/user-page/form/success")
	    public String showSuccess() {
	        return "success";
	    }
	}

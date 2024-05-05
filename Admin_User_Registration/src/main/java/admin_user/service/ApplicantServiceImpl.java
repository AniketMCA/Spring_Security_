package admin_user.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import admin_user.dto.ApplicantDto;
import admin_user.model.Applicant;
import admin_user.repositories.ApplicantRepository;

@Service
public class ApplicantServiceImpl implements ApplicantService {
	@Autowired
	private ApplicantRepository applicantRepository; 
	
	@Override
	public Applicant save(ApplicantDto applicantDto) {
		//Applicant applicant = new Applicant(applicantDto.getName(),applicantDto.getGender(),applicantDto.getDob(), applicantDto.getAddress(),applicantDto.getPhoto());				
		//return applicantRepository.save(applicant);
		return null;
	}
	
}

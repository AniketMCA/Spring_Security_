package admin_user.service;

import admin_user.dto.ApplicantDto;
import admin_user.model.Applicant;

public interface ApplicantService {
	Applicant save(ApplicantDto applicantDto);
}

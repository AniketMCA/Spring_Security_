package admin_user.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import admin_user.model.Applicant;
@Repository
public interface ApplicantRepository extends JpaRepository<Applicant, Integer> {
	
	Applicant findByName (String name);

	Applicant findFirstByOrderByIdDesc();
}

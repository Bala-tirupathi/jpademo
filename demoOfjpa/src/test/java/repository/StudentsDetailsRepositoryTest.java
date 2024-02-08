package repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.apijpaproject.demoOfjpa.model.StudentsDetails;
import com.apijpaproject.demoOfjpa.reposiotry.StudentsDetailsRepository;

@DataJpaTest    // For SB application knowing that it should be using embedded in-memory database for database related activities
public class StudentsDetailsRepositoryTest {
	
	@Autowired
	private StudentsDetailsRepository studentsDetailsRepository;
	StudentsDetails studentsDetails;
	
	@BeforeEach
	void setup() {
		studentsDetails = new StudentsDetails("1", "allam", "eee", "srinager", 798110656);
		studentsDetailsRepository.save(studentsDetails);
	}
	
	@AfterEach
	void tearDown() {
		studentsDetails = null;
		studentsDetailsRepository.deleteAll();
	}
	
	//For Positive scenario
	@Test
	public void testFindByStudentId_Found() {
		Optional<StudentsDetails> studentsList = studentsDetailsRepository.findById("1");
		assertThat(studentsList.get().getStudentId()).isEqualTo(studentsDetails.getStudentId());      // If we need we can add more attributes like this
	}
	
	//For Negative scenario
	@Test
	public void testFindByStudentId_NotFound() {
		//List<StudentsDetails> studentDetailsList = studentsDetailsRepository.findById("2");
		Optional<StudentsDetails> studentDetailsList = studentsDetailsRepository.findById("2");
		assertThat(studentDetailsList.isEmpty()).isTrue();
	}

}

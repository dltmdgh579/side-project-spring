package ministryofeducation.sideprojectspring.unit.Personnel.presentation.dto.response;

import static org.assertj.core.api.Assertions.*;

import java.time.LocalDate;
import ministryofeducation.sideprojectspring.personnel.domain.department_type.DepartmentType;
import ministryofeducation.sideprojectspring.personnel.presentation.dto.response.PersonnelListResponse;
import org.junit.jupiter.api.DisplayNameGeneration;
import org.junit.jupiter.api.DisplayNameGenerator;
import org.junit.jupiter.api.Test;

@DisplayNameGeneration(DisplayNameGenerator.ReplaceUnderscores.class)
class PersonnelListResponseTest {

    @Test
    public void PersonnelListResponse를_Builder로_생성할_수_있다(){
        //given
        Long expectedId = 1l;
        String expectedName = "test";
        LocalDate expectedDateOfBirth = LocalDate.now();
        String expectedPhone = "010-0000-0000";
        String expectedAddress = "인천광역시 서구 신현동";
        String expectedProfileImage = "testImage.jpg";
        DepartmentType expectedDepartmentType = DepartmentType.JOSHUA;

        //when
        PersonnelListResponse personnelListResponse = PersonnelListResponse.builder()
            .id(1l)
            .name("test")
            .dateOfBirth(LocalDate.now())
            .phone("010-0000-0000")
            .address("인천광역시 서구 신현동")
            .profileImage("testImage.jpg")
            .departmentType(DepartmentType.JOSHUA)
            .build();

        //then
        assertThat(expectedId).isEqualTo(personnelListResponse.getId());
        assertThat(expectedName).isEqualTo(personnelListResponse.getName());
        assertThat(expectedDateOfBirth).isEqualTo(personnelListResponse.getDateOfBirth());
        assertThat(expectedPhone).isEqualTo(personnelListResponse.getPhone());
        assertThat(expectedAddress).isEqualTo(personnelListResponse.getAddress());
        assertThat(expectedProfileImage).isEqualTo(personnelListResponse.getProfileImage());
        assertThat(expectedDepartmentType).isEqualTo(personnelListResponse.getDepartmentType());
    }

}
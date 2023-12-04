package ministryofeducation.sideprojectspring.personnel.presentation.dto.response;

import java.time.LocalDate;
import lombok.Builder;
import lombok.Getter;
import ministryofeducation.sideprojectspring.personnel.domain.Personnel;
import ministryofeducation.sideprojectspring.personnel.domain.department.Department;

@Getter
@Builder
public class PersonnelDetailResponse {

    private Long id;
    private String name;
    private LocalDate dateOfBirth;
    private String phone;
    private String landline;
    private String email;
    private String address;
    private String profileImage;
    private Department department;

    private PersonnelDetailResponse(){}

    public PersonnelDetailResponse(Long id, String name, LocalDate dateOfBirth, String phone, String landline, String email,
        String address, String profileImage, Department department){
        this.id = id;
        this.name = name;
        this.dateOfBirth = dateOfBirth;
        this.phone = phone;
        this.landline = landline;
        this.email = email;
        this.address = address;
        this.profileImage = profileImage;
        this.department = department;
    }

    public static PersonnelDetailResponse from(Personnel personnel){
        return PersonnelDetailResponse.builder()
            .id(personnel.getId())
            .name(personnel.getName())
            .dateOfBirth(personnel.getDateOfBirth())
            .phone(personnel.getPhone())
            .landline(personnel.getLandline())
            .email(personnel.getEmail())
            .address(personnel.getAddress())
            .profileImage(personnel.getProfileImage())
            .department(personnel.getDepartment())
            .build();
    }
}

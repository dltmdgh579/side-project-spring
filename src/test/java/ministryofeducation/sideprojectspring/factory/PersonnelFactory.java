package ministryofeducation.sideprojectspring.factory;

import ministryofeducation.sideprojectspring.personnel.domain.Personnel;
import ministryofeducation.sideprojectspring.personnel.domain.department_type.DepartmentType;

import java.time.LocalDate;
import java.util.List;

public class PersonnelFactory {

    public static Personnel testPersonnel(Long id, String name, String email, String phone){
        return Personnel.createPersonnel(
            id,
            name,
            LocalDate.now(),
            phone,
            "032-000-0000",
            email,
            "인천광역시 서구 석남동",
            "",
            DepartmentType.JOSHUA
        );
    }

    public static Personnel testPersonnel(Long id, String name){
        return testPersonnel(id, name, "test@email.com", "010-0000-0000");
    }

    public static Personnel testPersonnel(Long id, String name, String email){
        return testPersonnel(id, name, email, "010-0000-0000");
    }

}

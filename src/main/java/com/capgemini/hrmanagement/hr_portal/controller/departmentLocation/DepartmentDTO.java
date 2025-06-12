package com.capgemini.hrmanagement.hr_portal.controller.departmentLocation;

import lombok.Data;

@Data
public class DepartmentDTO {
    private Long departmentId;
    private String departmentName;
    private LocationDTO location;
}

package com.capgemini.hrmanagement.hr_portal.controller.departmentLocation;

import lombok.Data;

@Data
public class ApiResponseDto<T> {
    private PageDTO<T> data;
}

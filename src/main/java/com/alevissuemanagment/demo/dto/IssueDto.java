package com.alevissuemanagment.demo.dto;

import com.alevissuemanagment.demo.Entity.IssueStatus;
import lombok.Data;

import java.util.Date;

@Data
public class IssueDto {
    private  Long id;
    private Date date;
    private String description;
    private String details;
    private IssueStatus issueStatus;
    private UserDto assigne;
    private  ProjectDto project;

}

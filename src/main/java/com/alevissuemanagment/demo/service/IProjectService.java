package com.alevissuemanagment.demo.service;

import com.alevissuemanagment.demo.Entity.Project;
import com.alevissuemanagment.demo.dto.ProjectDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IProjectService {

    Project save(Project project) ;

    Project getById(Long id);

    Page<ProjectDto> getAllPageable(Pageable pageable);

    Project getByProjectCode(Project project);

    List<Project> getByProjectCodeContains(Project project);

    Boolean delete(ProjectDto projectDto);

    ProjectDto update(Long id, ProjectDto projectDto);
}


package com.alevissuemanagment.demo.service.implementation;

import com.alevissuemanagment.demo.Entity.Project;
import com.alevissuemanagment.demo.dto.ProjectDto;
import com.alevissuemanagment.demo.repository.ProjectRepository;
import com.alevissuemanagment.demo.service.IProjectService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProjectService implements IProjectService {
    private final ProjectRepository projectRepository;

    public ProjectService(ProjectRepository projectRepository) {
        this.projectRepository = projectRepository;
    }


    @Override
    public Project save(Project project) {
        if (project.getProjectCode() == null) {
            throw new IllegalArgumentException("Proje kodu boş olamaz");
        }

        return project;
    }


    @Override
    public Project getById(Long id) {


        return null;
    }

    @Override
    public Page<ProjectDto> getAllPageable(Pageable pageable) {
        return null;
    }

    @Override
    public Project getByProjectCode(Project project) {
        return project;
    }

    @Override
    public List<Project> getByProjectCodeContains(Project project) {
        return null;
    }

    @Override
    public Boolean delete(ProjectDto projectDto) {
        return null;
    }

    @Override
    public ProjectDto update(Long id, ProjectDto projectDto) {
        return projectDto;
    }
}

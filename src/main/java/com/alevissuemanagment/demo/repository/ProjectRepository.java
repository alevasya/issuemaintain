package com.alevissuemanagment.demo.repository;

import com.alevissuemanagment.demo.Entity.Project;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ProjectRepository extends JpaRepository<Project, Long> {
    Project findByProjectCode(String projectCode);
    List<Project> getAllByProjectCodeContains(String projectCode);
    Project getByProjectCodeAAndIdNot(String projectcode, Long id);
    Page <Project> findAll(Pageable pageable);
    List< Project> findAll(Sort sort);
}

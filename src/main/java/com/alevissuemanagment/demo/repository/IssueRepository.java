package com.alevissuemanagment.demo.repository;

import com.alevissuemanagment.demo.Entity.Issue;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueRepository extends JpaRepository<Issue,Long> {
}

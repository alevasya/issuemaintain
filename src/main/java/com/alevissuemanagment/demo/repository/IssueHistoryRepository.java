package com.alevissuemanagment.demo.repository;

import com.alevissuemanagment.demo.Entity.IssueHistory;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IssueHistoryRepository extends JpaRepository<IssueHistory,Long> {
}

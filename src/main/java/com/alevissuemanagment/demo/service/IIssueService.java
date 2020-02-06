package com.alevissuemanagment.demo.service;

import com.alevissuemanagment.demo.Entity.Issue;
import com.alevissuemanagment.demo.dto.IssueDto;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface IIssueService {
    IssueDto save (IssueDto issue);
    IssueDto getByID(Long id);
    Page< IssueDto> getAllPageable(Pageable pageable);
    Boolean delete(IssueDto issue);
}

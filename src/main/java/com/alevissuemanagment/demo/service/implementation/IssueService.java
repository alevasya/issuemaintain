package com.alevissuemanagment.demo.service.implementation;

import com.alevissuemanagment.demo.Entity.Issue;
import com.alevissuemanagment.demo.dto.IssueDto;
import com.alevissuemanagment.demo.repository.IssueRepository;
import com.alevissuemanagment.demo.service.IIssueService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;


@Service
public class IssueService implements IIssueService {
    private  final IssueRepository issueRepository;
    private final ModelMapper modelMapper;
    public IssueService(IssueRepository issueRepository,ModelMapper modelMapper){
        this.issueRepository=issueRepository;
        this.modelMapper = modelMapper;
    }
    @Override
    public IssueDto save(IssueDto issue) {
        if(issue.getDate()==null){
            throw new IllegalArgumentException("Tarih boş olamaz!");
        }

        return null;

    }

    @Override
    public IssueDto getByID(Long id) {
        return null;
    }

    @Override
    public Page<IssueDto> getAllPageable(Pageable pageable) {
        return null;
    }

    @Override
    public Boolean delete(IssueDto issue) {
        return null;
    }
}

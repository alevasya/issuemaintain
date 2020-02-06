package com.alevissuemanagment.demo.service.implementation;


import com.alevissuemanagment.demo.Entity.IssueHistory;
import com.alevissuemanagment.demo.repository.IssueHistoryRepository;
import com.alevissuemanagment.demo.service.IIssueHistoryService;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

@Service
public class IssueHistoryService implements IIssueHistoryService {
    private final IssueHistoryRepository issueHistoryRepository;

    public IssueHistoryService(IssueHistoryRepository issueHistoryRepository) {
        this.issueHistoryRepository= issueHistoryRepository;
    }



    @Override
    public IssueHistory save(IssueHistory issueHistory) {
        if(issueHistory.getDate()==null){
            throw new IllegalArgumentException("Talep tarihi boş olamaz!");
        }
      issueHistory=issueHistoryRepository.save(issueHistory);
        return issueHistory;
    }

    @Override
    public IssueHistory getById(Long id) {
        return issueHistoryRepository.getOne(id);
    }

    @Override
    public Page<IssueHistory> getAllPageable(Pageable pageable) {
        return null;
    }

    @Override
    public Boolean delete(IssueHistory issueHistory) {
        return null;
    }
}

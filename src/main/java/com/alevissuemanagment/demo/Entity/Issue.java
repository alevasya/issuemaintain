package com.alevissuemanagment.demo.Entity;

import lombok.*;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name = "issue")
@Data
@NoArgsConstructor // Issue nesnesinin boş bir constructorını yaratıyor.
@AllArgsConstructor
@ToString          // To sTring metodunu pverride ediyoruz.
@EqualsAndHashCode // override ettik.
public class Issue extends BaseEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private Long id;

    @Column(name = "description", length = 1000)
    private String description;


    @Column(name = "details", length = 4000)
    private String details;


    @Column(name = "date")
    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    @Column(name = "description")
    @Enumerated(EnumType.STRING)
    private IssueStatus issueStatus;

    @JoinColumn(name = "assigne_user_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private User assigne;
}


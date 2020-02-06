package com.alevissuemanagment.demo.Entity;

import lombok.Data;


import javax.persistence.*;

@Entity
@Table(name = "project")
@Data
public class Project extends BaseEntity {


    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private Long id;
    @Column(name = "project_code")
    private String projectCode;
    @Column(name = "project_name")
    private  String projectName;
    @JoinColumn(name = "user_manager_id")
    @ManyToOne(optional = true, fetch = FetchType.LAZY)
    private  User manager;
}

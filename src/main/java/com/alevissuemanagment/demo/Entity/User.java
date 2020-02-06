package com.alevissuemanagment.demo.Entity;



import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor // Issue nesnesinin boş bir constructorını yaratıyor.
@AllArgsConstructor
@ToString          // To sTring metodunu pverride ediyoruz.
@EqualsAndHashCode // override ettik.
public class User extends BaseEntity{
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name = "uname", length = 100, unique = true)
    private String username;
    @JsonIgnore
    @Column(name="pwd", length = 200)
    private String password;

    @Column(name = "name_surname", length = 200)
    private String nameSurname;

    @Column(name = "email", length = 100)
    private String email;
@Column(name = "issue_id")
@OneToMany( fetch = FetchType.LAZY)
    private List<Issue> issues;
}




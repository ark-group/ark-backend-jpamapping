package com.arkbackendjpamapping.manytomany;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Teacher {


    @Id
    @GeneratedValue( strategy = GenerationType.AUTO )
    private int tid;
    private String tname;
    private String subject;

    @ManyToMany(targetEntity = Clas.class)
    private Set clasSet;
}

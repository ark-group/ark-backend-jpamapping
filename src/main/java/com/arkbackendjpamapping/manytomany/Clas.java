package com.arkbackendjpamapping.manytomany;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Clas {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cid;
    private String cname;

    @ManyToMany(targetEntity = Teacher.class)
    private Set teacherSet;

}

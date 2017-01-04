/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewabackend.entity;

import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

/**
 *
 * @author Milan
 */

@Entity(name="ewa_subject")
public class Subject {
        
    @Id
    @Column
    private Integer id;
    
    @Column
    private String name;
    
    @Column 
    private int points;

//    @OneToMany(targetEntity=SubjectPart.class, mappedBy="subject", fetch = FetchType.EAGER)
//    private Set<SubjectPart> subjectPart;
    
   
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
//
//    public Set<SubjectPart> getSubjectPart() {
//        return subjectPart;
//    }
//
//    public void setSubjectPart(Set<SubjectPart> subjectPart) {
//        this.subjectPart = subjectPart;
//    }
    
    
    
}

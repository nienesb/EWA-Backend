/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewabackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Milan
 */

@Entity(name="ewa_subject_part")
public class SubjectPart {
   
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    private Integer id;
    
    @Column
    private String name;

    @ManyToOne
    @PrimaryKeyJoinColumn(name="parentsubject_id")
    private Subject parentSubject;

    @Column(name="parentsubject_id", insertable=false, updatable=false)
    private Integer parentSubjectId;
    
    @Column
    private Integer points;

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

    public void setParentSubject(Subject parentSubject) {
        this.parentSubject = parentSubject;
    }

    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public Integer getParentSubjectId() {
        return parentSubjectId;
    }

    public void setParentSubjectId(Integer parentSubjectId) {
        this.parentSubjectId = parentSubjectId;
    }

    
}

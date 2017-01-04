/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewabackend.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Milan
 */

@Entity(name="ewa_result")
public class Result {
 
    @Id
    @Column
    private long id;
    
    @Column(name="user_id")
    private Integer userId;
    
    
    @Column
    private Timestamp date;
    
    @Column
    private double grade;
    
    @Column (name="subject_part_id")
    private Integer SubjectPartId;
    
    @ManyToOne
    @PrimaryKeyJoinColumn(name="subject_part_id")
    private SubjectPart subjectPart;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public double getGrade() {
        return grade;
    }

    public void setGrade(double Grade) {
        this.grade = Grade;
    }

    public SubjectPart getSubjectPart() {
        return subjectPart;
    }  
    
}

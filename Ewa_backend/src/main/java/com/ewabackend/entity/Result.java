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
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author ServiceDesk
 */

@Entity(name="result")
@NamedQueries({
    @NamedQuery(name="Result.getResultsForUser", query="SELECT r FROM result r WHERE r.userId = :userId ORDER BY r.date desc")})
public class Result {
 
    @Id
    @Column
    private long id;
    
    @ManyToOne
    @PrimaryKeyJoinColumn(name="user")
    private User user;
    
    
    @Column
    private Timestamp date;
    
    @Column
    private double Grade;
    
    @Column(name="subject_part")
    private long subjectPartId;
    
    @ManyToOne
    @PrimaryKeyJoinColumn(name="subject_part")
    private SubjectPart subjectPart;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public User getUser() {
        return user;
    }

    public Timestamp getDate() {
        return date;
    }

    public void setDate(Timestamp date) {
        this.date = date;
    }

    public double getGrade() {
        return Grade;
    }

    public void setGrade(double Grade) {
        this.Grade = Grade;
    }

    public long getSubjectPartId() {
        return subjectPartId;
    }

    public void setSubjectPartId(long subjectPartId) {
        this.subjectPartId = subjectPartId;
    }

    public SubjectPart getSubjectPart() {
        return subjectPart;
    }  
    
}

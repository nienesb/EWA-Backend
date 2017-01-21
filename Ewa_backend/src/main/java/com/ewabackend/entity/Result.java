/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewabackend.entity;

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author Milan
 */
@Entity(name = "ewa_result")
public class Result {

    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)    
    @Column
    private Integer id;

    @Column(name = "user_id")
    private Integer userId;

    @Column
    private Timestamp date;

    @Column
    private double grade;

    @Column(name = " subjectpart_id", insertable=false, updatable=false)
    private Integer subjectPartId;
    
    @ManyToOne
    @PrimaryKeyJoinColumn(name = "subjectpart_id")
    private SubjectPart subjectPart;

    @Column
    private Integer year;
    
    @Column
    private Integer block;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public void setSubjectPart(SubjectPart subjectPart) {
        this.subjectPart = subjectPart;
    }

    public Integer getSubjectPartId() {
        return subjectPartId;
    }

    public void setSubjectPartId(Integer subjectPartId) {
        this.subjectPartId = subjectPartId;
    }

    public Integer getBlock() {
        return block;
    }

    public void setBlock(Integer block) {
        this.block = block;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    
}

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
import javax.persistence.Transient;

/**
 *
 * @author Milan
 */

@Entity(name="ewa_group_has_subject")
public class GroupHasSubject {
    
    @Id    
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column
    private Integer id;
    
    @ManyToOne
    @PrimaryKeyJoinColumn(name="group_id")
    private Group group;
    
    @ManyToOne
    @PrimaryKeyJoinColumn(name="subject_id")
    private Subject subject;
    
    @Column
    private int semester;
    
    @Column
    private int block;
    
    @ManyToOne
    @PrimaryKeyJoinColumn(name="teacher")
    private User teacher;

    @Column(name="exam_date")
    private Timestamp examDate;
    
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
    
    public void setGroup(Group group) {
        this.group = group;
    }

   
    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getBlock() {
        return block;
    }

    public void setBlock(int block) {
        this.block = block;
    }

    public User getTeacher() {
        return teacher;
    }

    public void setTeacher(User teacher) {
        this.teacher = teacher;
    }

    public Timestamp getExamDate() {
        return examDate;
    }

    public void setExamDate(Timestamp examDate) {
        this.examDate = examDate;
    }

    
    
    
}


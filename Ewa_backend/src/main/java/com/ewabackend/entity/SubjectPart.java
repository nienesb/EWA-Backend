/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewabackend.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author ServiceDesk
 */

@Entity(name="ewa_subject_part")
public class SubjectPart {
   
    @Id
    @Column
    private Integer id;
    
    @Column
    private String name;

    @ManyToOne
    @PrimaryKeyJoinColumn(name="parent_subject")
    private Subject subject;
    
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

    public int getPoints() {
        return points;
    }

    public void setPoints(int points) {
        this.points = points;
    }
    
    public Subject getSubject() {
        return subject;
    }
}

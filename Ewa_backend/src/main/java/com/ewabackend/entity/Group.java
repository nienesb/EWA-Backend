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
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 *
 * @author Milan
 */

@Entity(name="ewa_group")
public class Group {
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column()
    private long id;
    
    @Column()
    private String name;
    
    @Column()
    private int year;
    
    @OneToMany(targetEntity=GroupHasSubject.class, mappedBy="group", fetch = FetchType.EAGER)
    private Set<GroupHasSubject> subjects;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public Set<GroupHasSubject> getSubjects() {
        return subjects;
    }
    
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.ewabackend.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;
import javax.persistence.Table;

/**
 *
 * @author Milan
 */

@Entity
@Table(name="ewa_user")
public class User implements Serializable{
    
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY) 
    @Column()
    private Integer id;
    
    @Column()
    private String email;
    
    @ManyToOne()
    @PrimaryKeyJoinColumn(name="group_id")
    private Group group;
    
    @ManyToOne()
    @PrimaryKeyJoinColumn(name="role_id")
    private UserRole userRole;
    
    @Column(name="userRole_id", insertable=false, updatable=false)
    private Integer userRoleId;
    
    @Column(name="studentnr")
    private Integer studentNumber;

    @Column(name="first_name")
    private String firstName;
    
    @Column(name="last_name")
    private String lastName;

    public Group getGroup() {
        return group;
    }

    public UserRole getUserRole() {
        return userRole;
    }
    
    public void setGroup(Group group) {
        this.group = group;
    }

    public Integer getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(Integer studentNumber) {
        this.studentNumber = studentNumber;
    }



    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Integer getUserRoleId() {
        return userRoleId;
    }

    public void setUserRoleId(Integer userRoleId) {
        this.userRoleId = userRoleId;
    }

    

}

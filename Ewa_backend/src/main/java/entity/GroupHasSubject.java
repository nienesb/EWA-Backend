/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.PrimaryKeyJoinColumn;

/**
 *
 * @author ServiceDesk
 */

@Entity(name="group_has_subject")
public class GroupHasSubject {
    
    @Id
    @Column
    private long id;
    
    @Column(name="group_id")
    private long groupId;
    
    @ManyToOne
    @PrimaryKeyJoinColumn(name="group_id")
    private Group group;
    
    @Column(name="subject_id")
    private long subjectId;
    
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

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getGroupId() {
        return groupId;
    }

    public Group getGroup() {
        return group;
    }

    public long getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(long subjectId) {
        this.subjectId = subjectId;
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
    
    
}


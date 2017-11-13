package com.thom.springboot.Model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * @author Thomas Boel Micheelsen
 * @date Created 11/13/2017
 */
@Entity
public class Lesson {
    @Id
    private int id;

    private String name;
    private String description;

    @ManyToOne
    private Course course;

    public Lesson() {

    }

    public Lesson(int id, String name, String description, int topicId, int courseId) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.course = new Course(courseId,"","",topicId);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }
}

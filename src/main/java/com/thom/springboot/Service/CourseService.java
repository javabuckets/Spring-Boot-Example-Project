package com.thom.springboot.Service;

import com.thom.springboot.Model.Course;
import com.thom.springboot.Repository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Thomas Boel Micheelsen
 * @date Created 11/13/2017
 */
@Service
public class CourseService {
    @Autowired
    private CourseRepository courseRepository;

    /**
     * Gets all the course objects from the course list
     * @return List<Course> of all the courses
     */
    public List<Course> getAllCourses(int topicId) {
        List<Course> courses = new ArrayList<>();
        courseRepository.findByTopicId(topicId).forEach(courses::add);
        return courses;
    }

    /**
     * Gets the course object with an id equal to that of the specified id
     * @param id id of wanted course object
     * @return the course object
     */
    public Course getCourse(int id) {
        return courseRepository.findOne(id);
    }

    /**
     * Adds a new course object to the course list
     * @param course course to add
     */
    public void addCourse(Course course) {
        courseRepository.save(course);
    }

    /**
     * Updates a specific course in the course list
     * @param course the new course update that will 'replace' the old course object
     */
    public void updateCourse(Course course) {
        courseRepository.save(course);
    }

    /**
     * Deletes a course with the specified id
     * @param id id of course to delete
     */
    public void deleteCourse(int id) {
        courseRepository.delete(id);
    }
}

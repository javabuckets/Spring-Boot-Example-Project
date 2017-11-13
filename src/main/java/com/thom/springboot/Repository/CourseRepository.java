package com.thom.springboot.Repository;

import com.thom.springboot.Model.Course;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Thomas Boel Micheelsen
 * @date Created 11/13/2017
 */
public interface CourseRepository extends CrudRepository<Course, Integer> {
    List<Course> findByTopicId(int topicId);
}

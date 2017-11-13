package com.thom.springboot.Repository;

import com.thom.springboot.Model.Lesson;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * @author Thomas Boel Micheelsen
 * @date Created 11/13/2017
 */
public interface LessonRepository extends CrudRepository<Lesson, Integer> {
    List<Lesson> findByCourseId(int courseId);
}

package com.thom.springboot.Repository;

import com.thom.springboot.Model.Topic;
import org.springframework.data.repository.CrudRepository;

/**
 * @author Thomas Boel Micheelsen
 * @date Created 11/13/2017
 */
public interface TopicRepository extends CrudRepository<Topic, Integer> {
    
}

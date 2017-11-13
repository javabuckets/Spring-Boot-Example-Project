package com.thom.springboot.Service;

import com.thom.springboot.Model.Topic;
import com.thom.springboot.Repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Thomas Boel Micheelsen
 * @date Created 11/13/2017
 */
@Service
public class TopicService {
    @Autowired
    private TopicRepository topicRepository;

    /**
     * Gets all the topic objects from the topic list
     * @return List<Topic> of all the topics
     */
    public List<Topic> getAllTopics() {
        List<Topic> topics = new ArrayList<>();
        topicRepository.findAll().forEach(topics::add);
        return topics;
    }

    /**
     * Gets the topic object with an id equal to that of the specified id
     * @param id id of wanted topic object
     * @return the topic object
     */
    public Topic getTopic(int id) {
        return topicRepository.findOne(id);
    }

    /**
     * Adds a new topic object to the topic list
     * @param topic topic to add
     */
    public void addTopic(Topic topic) {
        topicRepository.save(topic);
    }

    /**
     * Updates a specific topic in the topic list given that there is a topic with the specified id
     * @param id the id in the topics list where a topic-update is wanted
     * @param topic the new topic update that will 'replace' the old topic object
     */
    public void updateTopic(int id, Topic topic) {
        topicRepository.save(topic);
    }

    /**
     * Deletes a topic with the specified id
     * @param id id of topic to delete
     */
    public void deleteTopic(int id) {
        topicRepository.delete(id);
    }
}

package com.thom.springboot.Service;

import com.thom.springboot.Model.Topic;
import com.thom.springboot.Repository.TopicRepository;
import org.springframework.beans.factory.annotation.Autowired;
// import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @author Thomas Boel Micheelsen
 * @date Created 11/13/2017
 */
//@Service
public class TopicServiceOld {
    @Autowired
    private TopicRepository topicRepository;

    private List<Topic> topics = new ArrayList<>(Arrays.asList(
            new Topic(0, "spring","Spring Framework Desc."),
            new Topic(1,"java","Java Language Desc."),
            new Topic(2,"VBS","Visual Basic Scripting Language Desc.")
    ));

    /**
     * Gets all the topic objects from the topic list
     * @return List<Topic> of all the topics
     */
    public List<Topic> getAllTopics() {
        return topics;
    }

    /**
     * Gets the topic object with an id equal to that of the specified id
     * @param id id of wanted topic object
     * @return the topic object
     */
    public Topic getTopic(int id) {
        return topics.stream().filter(t -> t.getId() == id).findFirst().get();
    }

    // Non-Lambda method for getTopic(int id)
    /*public Topic getTopic(int id) {
        for (Topic topic : topics) {
            if (topic.getId() == id) {
                return topic;
            }
        }
        return null;
    }*/

    /**
     * Adds a new topic object to the topic list
     * @param topic topic to add
     */
    public void addTopic(Topic topic) {
        topics.add(topic);
    }

    /**
     * Updates a specific topic in the topic list given that there is a topic with the specified id
     * @param id the id in the topics list where a topic-update is wanted
     * @param topic the new topic update that will 'replace' the old topic object
     */
    public void updateTopic(int id, Topic topic) {
        for (int i = 0; i < topics.size(); i++) {
            Topic t = topics.get(i);

            if (t.getId() == id) {
                topics.set(i, topic);
                return; // Loop Break
            }
        }
    }

    /**
     * Deletes a topic with the specified id
     * @param id id of topic to delete
     */
    public void deleteTopic(int id) {
        topics.removeIf(t -> t.getId() == id);
    }
}

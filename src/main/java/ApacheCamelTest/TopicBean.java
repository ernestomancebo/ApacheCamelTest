package ApacheCamelTest;

import ApacheCamelTest.model.Topic;

/**
 * Bean that generates and process a Topic
 * Created by Ernesto Mancebo T on 2/17/15.
 */
public class TopicBean {

    /**
     * Processes the NewTopic
     *
     * @param data
     * @return the transformed NewTopic
     */
    public String processNewTopic(Topic data) {
        return "Processed NewTopic " + data.toString();
    }
}

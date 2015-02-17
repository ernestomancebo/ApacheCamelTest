package ApacheCamelTest.model;

import java.util.Date;
import java.util.Random;

/**
 * Created by Ernesto Mancebo T on 2/17/15.
 */
public class Topic {

    private Random random = new Random();

    private int topicId;
    private String topicName;
    private String topicURL;
    private int moduleId;
    private Date createDate;

    private Topic() {
        topicId = random.nextInt();
        topicName = "Camel in Action";
        topicURL = "Camel in Action";
        moduleId = random.nextInt();
        createDate = new Date();
    }

    public int getTopicId() {
        return topicId;
    }

    public void setTopicId(int topicId) {
        this.topicId = topicId;
    }

    public String getTopicName() {
        return topicName;
    }

    public void setTopicName(String topicName) {
        this.topicName = topicName;
    }

    public String getTopicURL() {
        return topicURL;
    }

    public void setTopicURL(String topicURL) {
        this.topicURL = topicURL;
    }

    public int getModuleId() {
        return moduleId;
    }

    public void setModuleId(int moduleId) {
        this.moduleId = moduleId;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    @Override
    public String toString() {
        return "Topic{" +
                "random=" + random +
                ", topicId=" + topicId +
                ", topicName='" + topicName + '\'' +
                ", topicURL='" + topicURL + '\'' +
                ", moduleId=" + moduleId +
                ", createDate=" + createDate +
                '}';
    }
}

package com.dongchanglong.demo02;

public class Client {
    public static void main(String[] args) {
        Topic[] topics = new Topic[3];
        topics[0] = new Topic("t1");
        topics[1] = new Topic("t2");
        topics[2] = new Topic("t3");
        TopicList topicList = new TopicList(topics);
        IteratorIterator<Topic> iterator = topicList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().getName());
        }
    }
}

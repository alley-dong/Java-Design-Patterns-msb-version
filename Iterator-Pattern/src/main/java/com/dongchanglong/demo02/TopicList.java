package com.dongchanglong.demo02;

/**
 * 具体集合类
 * @date 2023/10/31 21:48
 * @author DongCL
 */
public class TopicList implements ListList<Topic>{
    private Topic[] topics;

    public TopicList(Topic[] topics) {
        this.topics = topics;
    }

    @Override
    public IteratorIterator<Topic> iterator() {
        return new TopicIterator(topics);
    }
}

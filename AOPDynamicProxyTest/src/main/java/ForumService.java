package com.zjg;

/**
 *
 *
 * @ClassName: ForumService
 *
 * @Description: ForumService接口
 *
 * @author: Mr.zjg
 *
 * @date: 2018/03/05 YYYY/MM/DD
 */
public interface ForumService {
    /**
     *
     *
     * @Title: removeTopic
     *
     * @Description: 根据topicId删除Topic
     *
     * @param topicId
     *
     * @return: void
     */
    void removeTopic(int topicId);

    /**
     *
     *
     * @Title: removeForum
     *
     * @Description: 根据forumId删除Forum
     *
     * @param forumId
     *
     * @return: void
     */
    void removeForum(int forumId);
}
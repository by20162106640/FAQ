package com.czxt.bean;
import java.io.Serializable;

    /**
 * 实体类
 */
public class djj implements Serializable {
    private String question;//待解决问题
    private User User;//所属用户

    /**
     * 无参构造方法
     */
    public djj() {
    }

    /**
     * 有参构造方法
     * @param question
     * @param user
     */
    public djj(question_answer question_answer, String question, User user) {
        this.question = question;
        this.User = User;
    }

    public String getDate() {
        return question;
    }

    public void setDate(String question) {
        this.question = question;
    }

    public User getUser() {
        return User;
    }

    public void setUser(User user) {
        this.User = User;
    }
}


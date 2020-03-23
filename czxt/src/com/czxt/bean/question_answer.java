package com.czxt.bean;

import java.io.Serializable;
import java.util.List;

/**
 * 实体类
 */
public class question_answer implements Serializable {

    private int qid;
    private String question;
    private String answer;
    private int tid;


    private teacher teacher;


    /**
     * 无参构造方法
     */
    public question_answer() {
    }

    /**
     * 有参构造方法
     *
     * @param qid
     * @param question
     * @param answer
     * @param tid
     */
    public question_answer(int qid, String question, String answer, int tid) {
        this.qid = qid;
        this.question = question;
        this.answer = answer;
        this.tid = tid;

    }

    public int getQid() {
        return qid;
    }

    public void setQid(int qid) {
        this.qid = qid;
    }

    public teacher getTeacher() {
        return teacher;
    }

    public void setTeacher(teacher teacher) {
        this.teacher = teacher;
    }

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public String getAnswer() {
        return answer;
    }

    public void setAnswer(String answer) {
        this.answer = answer;
    }
}


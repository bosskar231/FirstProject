package com.auxo.model;

import java.util.List;

public class Questions {
    public float getQsno() {
        return qsno;
    }

    @Override
    public String toString() {
        return "Questions{" +
                "qsno=" + qsno +
                ", question=" + question +
                ", answer=" + answer +
                ", ehrField='" + ehrField + '\'' +
                ", fieldType='" + fieldType + '\'' +
                ", fieldValue='" + fieldValue + '\'' +
                ", inference='" + inference + '\'' +
                ", ds=" + ds +
                ", go_to='" + go_to + '\'' +
                '}';
    }

    public Questions(float qsno, List<String> question, List<String> answer, String ehrField, String fieldType, String fieldValue, String inference, List<String> ds, String go_to) {
        this.qsno = qsno;
        this.question = question;
        this.answer = answer;
        this.ehrField = ehrField;
        this.fieldType = fieldType;
        this.fieldValue = fieldValue;
        this.inference = inference;
        this.ds = ds;
        this.go_to = go_to;
    }

    public void setQsno(float qsno) {
        this.qsno = qsno;
    }

    public List<String> getQuestion() {
        return question;
    }

    public void setQuestion(List<String> question) {
        this.question = question;
    }

    public List<String> getAnswer() {
        return answer;
    }

    public void setAnswer(List<String> answer) {
        this.answer = answer;
    }

    public String getEhrField() {
        return ehrField;
    }

    public void setEhrField(String ehrField) {
        this.ehrField = ehrField;
    }

    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public String getFieldValue() {
        return fieldValue;
    }

    public void setFieldValue(String fieldValue) {
        this.fieldValue = fieldValue;
    }

    public String getInference() {
        return inference;
    }

    public void setInference(String inference) {
        this.inference = inference;
    }

    public List<String> getDs() {
        return ds;
    }

    public void setDs(List<String> ds) {
        this.ds = ds;
    }

    public String getGo_to() {
        return go_to;
    }

    public void setGo_to(String go_to) {
        this.go_to = go_to;
    }

    private float qsno;
    private List<String> question;
    private List<String> answer;
    private String ehrField;
    private String fieldType;
    private  String fieldValue;
    private String inference;
    private  List<String> ds;
    private String go_to;

}

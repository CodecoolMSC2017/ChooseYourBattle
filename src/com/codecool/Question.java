package com.codecool;

public class Question {
    private String id;
    private String question;
    private Answer answer;

    public Question(String id, String question, Answer answer) {
        this.id = id;
        this.question = question;
        this.answer = answer;
    }

    public String getId(){
        return id;
    }

    public String getQuestion() {
        return question;
    }

    public Answer getAnswer() {
        return answer;
    }

    public String getEvaulatedAnswer(String input) {
        return answer.evaluateAnswerByInput(input);
    }
}
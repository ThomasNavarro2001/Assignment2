package com.Thomas.Extras;

import com.Thomas.Extras.QuestionService;

import javax.enterprise.context.SessionScoped;
import javax.faces.application.FacesMessage;
import javax.faces.context.FacesContext;
import javax.inject.Inject;
import javax.inject.Named;
import java.io.Serializable;
import java.nio.charset.StandardCharsets;
import java.util.Base64;
import java.util.stream.Stream;


@Named("trivia")
@SessionScoped
public class Store implements Serializable {

    private long correctAnswersCount = 0;

    public long getCorrectAnswersCount() {
        return correctAnswersCount;
    }

    @Inject
    private QuestionService questionService;

    private String question1;

    private String question2;

    private String question3;

    private String question4;

    private String question5;

    private String question6;


    public String GoToStore() {
        //creates stream from the answers
        Stream<String> GoToStore = Stream.of(question1, question2,
                question3, question4, question5, question6);

        //encode answers to Base64
        correctAnswersCount = GoToStore.map(a ->
                Base64.getEncoder().encodeToString(a.getBytes(StandardCharsets.UTF_8)))
                .filter(a -> questionService.getResults().contains(a))

                .count();

        return "results";
    }


    public String getQuestion1() {
        return question1;
    }

    public void setQuestion1(String question1) {
        this.question1 = question1;
    }

    public String getQuestion2() {
        return question2;
    }

    public void setQuestion2(String question2) {
        this.question2 = question2;
    }

    public String getQuestion3() {
        return question3;
    }

    public void setQuestion3(String question3) {
        this.question3 = question3;
    }

    public String getQuestion4() {
        return question4;
    }

    public void setQuestion4(String question4) {
        this.question4 = question4;
    }

    public void tip() {
        FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(FacesMessage.SEVERITY_INFO, "Question 6", "One of them is Ecuador"));
    }
}


package com.example.android.my_recycler_view;

/**
 * Created by Raina on 17-10-2017.
 */

public class qna {
    private static String question;
    private static String answer;
    private static int qna_icon;

    public qna(String question, String answer, int qna_icon) {
        this.question = question;
        this.answer = answer;
        this.qna_icon = qna_icon;
    }

    public static String getQuestion() {return question;}

    public static void setQuestion(String question) {
        this.question = question;
    }

    public static String getAnswer() {
        return answer;
    }

    public static void setAnswer(String answer) {
        this.answer = answer;
    }

    public static int getQna_icon() {
        return qna_icon;
    }

    public static void setQna_icon(int qna_icon) {
        this.qna_icon = qna_icon;
    }
}

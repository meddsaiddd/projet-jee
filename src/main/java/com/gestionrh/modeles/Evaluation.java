package com.gestionrh.modeles;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Evaluation {
    private int employeId;
    private String commentaire;
    private int note;
    private String dateEvaluation;

    public Evaluation(int employeId, String commentaire, int note) {
        this.employeId = employeId;
        this.commentaire = commentaire;
        this.note = note;
        this.dateEvaluation = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
    }

    public int getEmployeId() { return employeId; }
    public String getCommentaire() { return commentaire; }
    public int getNote() { return note; }
    public String getDateEvaluation() { return dateEvaluation; }
}

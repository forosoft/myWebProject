package com.xyf.entity;

import java.util.Date;

public class RunoobTbl {
    private String runoobId;
    private String runoobTitle;
    private String runoobAuthor;
    private Date submissionDate;

    public String getRunoobId() {
        return runoobId;
    }

    public void setRunoobId(String runoobId) {
        this.runoobId = runoobId;
    }

    public String getRunoobTitle() {
        return runoobTitle;
    }

    public void setRunoobTitle(String runoobTitle) {
        this.runoobTitle = runoobTitle;
    }

    public String getRunoobAuthor() {
        return runoobAuthor;
    }

    public void setRunoobAuthor(String runoobAuthor) {
        this.runoobAuthor = runoobAuthor;
    }

    public Date getSubmissionDate() {
        return submissionDate;
    }

    public void setSubmissionDate(Date submissionDate) {
        this.submissionDate = submissionDate;
    }
}

package com.debao.defiles.vo;

import java.util.Date;

public class FeedbackLogVO {
    private Integer feedbacklogid;

    private Integer fileid;

    private Integer fileoptid;

    private String changedesc;

    private Integer userid;

    private Date datestamp;

    public Integer getFeedbacklogid() {
        return feedbacklogid;
    }

    public void setFeedbacklogid(Integer feedbacklogid) {
        this.feedbacklogid = feedbacklogid;
    }

    public Integer getFileid() {
        return fileid;
    }

    public void setFileid(Integer fileid) {
        this.fileid = fileid;
    }

    public Integer getFileoptid() {
        return fileoptid;
    }

    public void setFileoptid(Integer fileoptid) {
        this.fileoptid = fileoptid;
    }

    public String getChangedesc() {
        return changedesc;
    }

    public void setChangedesc(String changedesc) {
        this.changedesc = changedesc == null ? null : changedesc.trim();
    }

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Date getDatestamp() {
        return datestamp;
    }

    public void setDatestamp(Date datestamp) {
        this.datestamp = datestamp;
    }
}
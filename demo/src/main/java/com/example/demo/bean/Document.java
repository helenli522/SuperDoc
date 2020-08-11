package com.example.demo.bean;

import javax.persistence.*;
import java.sql.Date;

@Entity
@Table(name = "Document")
public class Document {

    @Id
    @GeneratedValue
    private Integer DocID;
    private Integer UserID;
    private String Title;
    @Temporal(TemporalType.TIMESTAMP)
    private Date DateTime;
    private String Content;
    private Integer Privilege;
    private Integer IsTeam;
    private Integer Team;
    @Temporal(TemporalType.TIMESTAMP)
    private Date RecycleDateTime;
    private Integer IsRecycle;
    private Integer CommentNumber;
    private Integer CollectNumber;

    public Document(Integer docID, Integer userID, String title, Date dateTime, String content, Integer privilege, Integer isTeam, Integer team, Date recycleDateTime, Integer isRecycle, Integer commentNumber, Integer collectNumber) {
        DocID = docID;
        UserID = userID;
        Title = title;
        DateTime = dateTime;
        Content = content;
        Privilege = privilege;
        IsTeam = isTeam;
        Team = team;
        RecycleDateTime = recycleDateTime;
        IsRecycle = isRecycle;
        CommentNumber = commentNumber;
        CollectNumber = collectNumber;
    }

    public Document() {
    }

    public Integer getDocID() {
        return DocID;
    }

    public void setDocID(Integer docID) {
        DocID = docID;
    }

    public Integer getUserID() {
        return UserID;
    }

    public void setUserID(Integer userID) {
        UserID = userID;
    }

    public String getTitle() {
        return Title;
    }

    public void setTitle(String title) {
        Title = title;
    }

    public Date getDateTime() {
        return DateTime;
    }

    public void setDateTime(Date dateTime) {
        DateTime = dateTime;
    }

    public String getContent() {
        return Content;
    }

    public void setContent(String content) {
        Content = content;
    }

    public Integer getPrivilege() {
        return Privilege;
    }

    public void setPrivilege(Integer privilege) {
        Privilege = privilege;
    }

    public Integer getIsTeam() {
        return IsTeam;
    }

    public void setIsTeam(Integer isTeam) {
        IsTeam = isTeam;
    }

    public Integer getTeam() {
        return Team;
    }

    public void setTeam(Integer team) {
        Team = team;
    }

    public Date getRecycleDateTime() {
        return RecycleDateTime;
    }

    public void setRecycleDateTime(Date recycleDateTime) {
        RecycleDateTime = recycleDateTime;
    }

    public Integer getIsRecycle() {
        return IsRecycle;
    }

    public void setIsRecycle(Integer isRecycle) {
        IsRecycle = isRecycle;
    }

    public Integer getCommentNumber() {
        return CommentNumber;
    }

    public void setCommentNumber(Integer commentNumber) {
        CommentNumber = commentNumber;
    }

    public Integer getCollectNumber() {
        return CollectNumber;
    }

    public void setCollectNumber(Integer collectNumber) {
        CollectNumber = collectNumber;
    }

    @Override
    public String toString() {
        return "Document{" +
                "DocID=" + DocID +
                ", UserID=" + UserID +
                ", Title='" + Title + '\'' +
                ", DateTime=" + DateTime +
                ", Content='" + Content + '\'' +
                ", Privilege=" + Privilege +
                ", IsTeam=" + IsTeam +
                ", Team=" + Team +
                ", RecycleDateTime=" + RecycleDateTime +
                ", IsRecycle=" + IsRecycle +
                ", CommentNumber=" + CommentNumber +
                ", CollectNumber=" + CollectNumber +
                '}';
    }
}

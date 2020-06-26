package com.entity;

public class Session {
    private Integer id;

    private String sname;

    private Integer chapterid;

    private String sessionurl;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname == null ? null : sname.trim();
    }

    public Integer getChapterid() {
        return chapterid;
    }

    public void setChapterid(Integer chapterid) {
        this.chapterid = chapterid;
    }

    public String getSessionurl() {
        return sessionurl;
    }

    public void setSessionurl(String sessionurl) {
        this.sessionurl = sessionurl == null ? null : sessionurl.trim();
    }
}
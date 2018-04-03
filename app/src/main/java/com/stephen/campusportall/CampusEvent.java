package com.stephen.campusportall;

import java.io.Serializable;

/**
 * Created by jyothish on 10/2/18.
 */

public class CampusEvent implements Serializable{

    private String uniqueId;
    private String eventTitle;
    private String shortDesc;
    private String dept;
    private String eventDate;
    private String isLive;
    private String location;
    private String longDesc;
    private int hits;
    private String timing;

    public CampusEvent(){}

    public CampusEvent(String uniqueId, String eventTitle, String shortDesc, String dept, String eventDate,
                       String isLive, String location, String longDesc, int hits, String timing) {
        this.uniqueId=uniqueId;
        this.eventTitle = eventTitle;
        this.shortDesc = shortDesc;
        this.dept = dept;
        this.eventDate = eventDate;
        this.isLive = isLive;
        this.location=location;
        this.longDesc=longDesc;
        this.hits=hits;
        this.timing=timing;
    }

    public String getEventTitle() {
        return eventTitle;
    }

    public void setEventTitle(String eventTitle) {
        this.eventTitle = eventTitle;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getEventDate() {
        return eventDate;
    }

    public void setEventDate(String eventDate) {
        this.eventDate = eventDate;
    }

    public String getUniqueId() {
        return uniqueId;
    }

    public void setUniqueId(String uniqueId) {
        this.uniqueId = uniqueId;
    }

    public String getIsLive() {
        return isLive;
    }

    public void setIsLive(String isLive) {
        this.isLive = isLive;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLongDesc() {
        return longDesc;
    }

    public void setLongDesc(String longDesc) {
        this.longDesc = longDesc;
    }

    public int getHits() {
        return hits;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }

    public String getTiming() {
        return timing;
    }

    public void setTiming(String timing) {
        this.timing = timing;
    }
}

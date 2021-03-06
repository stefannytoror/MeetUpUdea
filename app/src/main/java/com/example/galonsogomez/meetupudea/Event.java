package com.example.galonsogomez.meetupudea;

public class Event {

    private String eventUID;
    private String title;
    private String place;
    private String date;
    private String starHour;
    private String finishHour;
    private String picture;
    private String quantity;
    private String description;



    public Event(String eventUID, String title, String place, String date, String starHour,String finishHour, String picture, String description) {
        this.eventUID = eventUID;
        this.title = title;
        this.place = place;
        this.date = date;
        this.starHour = starHour;
        this.picture = picture;
        this.finishHour = finishHour;
        this.description = description;
    }

    public Event(String eventUID) {
        this.eventUID = eventUID;
    }

    public Event(String eventUID, String title, String place, String date, String starHour, String picture, String description) {
        this.eventUID = eventUID;
        this.title = title;
        this.place = place;
        this.date = date;
        this.starHour = starHour;
        this.picture = picture;
        this.description = description;
    }


    public Event() {

    }

    public String getEventUID() {
        return eventUID;
    }

    public void setEventUID(String eventUID) {
        this.eventUID = eventUID;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStarHour() {
        return starHour;
    }

    public void setStarHour(String starHour) {
        this.starHour = starHour;
    }

    public String getFinishHour() {
        return finishHour;
    }

    public void setFinishHour(String finishHour) {
        this.finishHour = finishHour;
    }

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public String getQuantity() {
        return quantity;
    }

    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}

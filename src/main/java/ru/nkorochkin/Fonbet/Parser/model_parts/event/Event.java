package ru.nkorochkin.Fonbet.Parser.model_parts.event;

import com.google.gson.annotations.SerializedName;
import ru.nkorochkin.Fonbet.Parser.model_parts.sub.Sub;

import java.util.List;

public class Event {

    private String name;

    private long id;

    private long parentId;

    @SerializedName("subcategories")
    private List<Sub> subList;

    private String startTime;

    private String timer;

    private String score;

    private String team1;

    private String team2;

    private String sportName;


    public Event(String name, long id, long parentId, List<Sub> subList, String startTime, String timer, String score, String team1, String team2, String sportName) {
        this.name = name;
        this.id = id;
        this.parentId = parentId;
        this.subList = subList;
        this.startTime = startTime;
        this.timer = timer;
        this.score = score;
        this.team1 = team1;
        this.team2 = team2;
        this.sportName = sportName;
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Sub> getSubList() {
        return subList;
    }

    public void setSubList(List<Sub> subList) {
        this.subList = subList;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getTimer() {
        return timer;
    }

    public void setTimer(String timer) {
        this.timer = timer;
    }

    public String getScore() {
        return score;
    }

    public void setScore(String score) {
        this.score = score;
    }

    public String getTeam1() {
        return team1;
    }

    public void setTeam1(String team1) {

        this.team1 = team1;
    }

    public String getTeam2() {
        return team2;
    }

    public void setTeam2(String team2) {
        this.team2 = team2;
    }

    public String getSportName() {
        return sportName;
    }

    public void setSportName(String sportName) {
        this.sportName = sportName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getParentId() {
        return parentId;
    }

    public void setParentId(long parentId) {
        this.parentId = parentId;
    }

    @Override
    public String toString() {
        return "Event{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", parentId='" + parentId + '\'' +
                ", subList=" + subList +
                ", startTime='" + startTime + '\'' +
                ", sportName='" + sportName + '\'' +
                '}';
    }

}

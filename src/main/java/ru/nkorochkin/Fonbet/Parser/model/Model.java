package ru.nkorochkin.Fonbet.Parser.model;

import com.google.gson.annotations.SerializedName;
import ru.nkorochkin.Fonbet.Parser.model_parts.event.Event;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Model {

    @SerializedName("events")
    private List<Event> eventList;

    private List<Event> newEventList;

    private List<Event> children;


    public Model(List<Event> eventList) {
        this.eventList = eventList;
    }

    @Override
    public String toString() {
        return "Результат: " + eventList.toString() + '\n';
    }

    @SerializedName("events")
    public List<Event> getEventList() {
        return eventList;
    }

    @SerializedName("events")
    public void setEventList(List<Event> eventList) {
        this.eventList = eventList;
    }

    public Map<Event, List<Event>> getResult() {
        Map<Event, List<Event>> result = new HashMap<>();
        List<Event> temp;

        for (Event event : eventList) {
            if (event.getParentId() == 0) {
                if (newEventList == null) {
                    newEventList = new ArrayList<>();
                }
                newEventList.add(event);
            } else {
                if (children == null) {
                    children = new ArrayList<>();
                }
                children.add(event);
            }
        }

        for (int i = 0; i < newEventList.size(); i++) {
            temp = new ArrayList<>();
            for (int j = 0; j < children.size(); j++) {
                if (children.get(j).getParentId() == newEventList.get(i).getId()) {
                    temp.add(children.get(j));
                }
            }
            result.put(newEventList.get(i), temp);
        }
        return result;
    }

    public List<Event> getChildren() {
        return children;
    }

    public void setChildren(List<Event> children) {
        this.children = children;
    }

    public List<Event> getNewEventList() {
        return newEventList;
    }

    public void setNewEventList(List<Event> childEventList) {
        this.newEventList = childEventList;
    }

}

package model;

import api.Resource;

public class Photo implements Resource{
    String title;
    int size;

    public Photo(String title, int size) {
        this.title = title;
        this.size = size;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return this.title + " " + this.size + "Kb";
    }
}

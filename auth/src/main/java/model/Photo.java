package model;

import api.Resource;

public class Photo implements Resource {
    String title;
    int size;

    public Photo(String title, int size){
        this.title = title;
        this.size = size;
    }

    public int getSize() {
        return size;
    }

    public String getTitle() {
        return title;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "Photo[" + title + ", " + size + "]";
    }
}

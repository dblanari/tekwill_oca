package model;

import api.Resource;

import java.util.Random;

public class Photo implements Resource {
    private String title;
    private int size;

    public Photo(String title) {
        this.title = title;
        this.size = new Random().nextInt();
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String resourceName() {
        return "photo-" + title;
    }

    @Override
    public String toString() {
        return "Photo[" + title + ", " + size + "]";
    }
}

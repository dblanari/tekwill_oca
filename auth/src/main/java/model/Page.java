package model;

import api.Resource;

public class Page implements Resource {
    private String title;
    private String body;

    public Page(String title) {
        this.title = title;
        this.body = title + " body page";
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String resourceName() {
        return "page-" + title;
    }

    @Override
    public String toString() {
        return "Page[" + title + ", " + body + "]";
    }
}

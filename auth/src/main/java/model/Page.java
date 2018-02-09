package model;

import api.Resource;

public class Page implements Resource{
    private String title;
    private String body;

    public Page(String title, String body){
        this.title = title;
        this.body = body;
    }

    @Override
    public String getTitle(){
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getBody() {
        return body;
    }

    public void setBody(String body){
        this.body = body;
    }

    @Override
    public String toString() {
        return this.title + " " + this.body;
    }
}

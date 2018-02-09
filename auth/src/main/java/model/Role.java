package model;

import api.Authorization;
import api.Resource;

import java.util.List;

public class Role implements Authorization {
    private String name;
    private List<Resource> resources;


    public Role(String name, List<Resource> resources) {
        this.name = name;
        this.resources = resources;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean hasAcces(Resource resource) {
        return resources.contains(resource);
    }
}

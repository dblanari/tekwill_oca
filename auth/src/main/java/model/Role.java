package model;

import api.Authorization;
import api.Resource;

import java.util.List;

public class Role implements Authorization {

    String name;
    List<Resource> resourceList;


    public Role(String name, List<Resource> resources){
        this.name = name;
        this.resourceList = resources;

    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public boolean hasAcces(Resource resource) {
        return resourceList.contains(resource);
    }
}

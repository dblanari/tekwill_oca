package model;

import api.Authorization;
import api.Resource;

import java.util.List;

public class Role implements Authorization {

    protected String name;
    protected List<Resource> resourceList;

    public Role(String name, List<Resource> resourceList) {
        this.name = name;
        this.resourceList = resourceList;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean hasAccess(Resource resource) {
        return resourceList.contains(resource);
    }
}

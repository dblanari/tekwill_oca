package service;

import api.Resource;
import model.Page;
import model.Photo;
import model.Role;

import java.util.ArrayList;
import java.util.List;

public class Resources {
    public static List<Resource> resources;

    static {
        resources = new ArrayList<>();
        resources.add(new Page( "main", "Add something in Main Page"));
        resources.add(new Photo("best",64));
        resources.add(new Page("admin", "Admin Page"));
    }
    public static List<Resource> findAdminPage(){
        List<Resource> resourcesList = new ArrayList<>();
        for (Resource resource : resources){
            if (resource.getTitle().toLowerCase().contains("admin")) {
                resourcesList.add(resource);
            }
        }
        return resourcesList;
    }

    public static List<Resource> findUserPage(){
        List<Resource> resourceList = new ArrayList<>();
        for (Resource resource : resources){
            if (!resource.getTitle().toLowerCase().contains("admin")){
                resourceList.add(resource);
            }
        }
        return resourceList;
    }
    public static Resource findByTitle(String name) {

        for (int i = 0; i < resources.size(); i++) {
            if (resources.get(i).getTitle().equals(name)) {
                return resources.get(i);
            }
        }
        return null;

    }
}

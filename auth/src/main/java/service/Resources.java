package service;

import api.Resource;
import model.Page;
import model.Photo;

import java.util.ArrayList;
import java.util.List;

public class Resources {
   public static List<Resource> resources;

   static {
       resources = new ArrayList<>();
       resources.add(new Page("Home", "Hello my HomePage"));
       resources.add(new Photo("Footer", 256));
       resources.add(new Page("Admin-Page", "LogIn to admin"));
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

   public static Resource findByTitle(String title){
       for (Resource resource : resources){
           if (resource.getTitle().toLowerCase().contains(title)){
               return resource;
           }
       }
       return null;
   }
}
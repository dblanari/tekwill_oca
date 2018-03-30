import api.Resource;
import model.Page;
import model.Photo;
import model.Role;
import model.User;
import service.Authentication;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Cli {
    public static void main(String[] args) {
        Resource res1 = new Page("home");
        List<Resource> resourceList = new ArrayList<>();
        resourceList.add(res1);

        Resource res2 = new Page("admin");
        Resource res3 = new Photo("img1");
        List<Resource> resourceListAdmin = new ArrayList<>();
        resourceListAdmin.add(res2);
        resourceListAdmin.add(res3);
        resourceListAdmin.addAll(resourceList);

        Role userRole = new Role("user", resourceList);
        Role adminRole = new Role("admin", resourceListAdmin);


        User user = new User("test", "test", userRole);
        User admin = new User("admin", "1234", adminRole);

        List<User> userList = new ArrayList<>();
        userList.add(user);
        userList.add(admin);

        Authentication authentication = new Authentication(userList);
        Scanner in = new Scanner(System.in);
        boolean exit = false;
        while (!exit && in.hasNext()) {
            String line = in.nextLine();
            String[] command = line.split("\\s");

            switch (command[0]) {
                case "login":
                    if (authentication.login(command[1], command[2])) {
                        System.out.println("success login : " + authentication.getUser());
                    } else {
                        System.out.println("error login");
                    }
                    break;
                case "info":
                    if (authentication.getUser() != null) {
                        System.out.println("current user : " + authentication.getUser());
                    } else {
                        System.out.println("please login");
                    }
                    break;
                case "logout":
                    authentication.setUser(null);
                    System.out.println("logout");
                    break;
                case "get":
                    Resource resource = Resource.valueOf(resourceListAdmin, command[1]);
                    if (authentication.getUser() != null && authentication.getUser().getRole().hasAccess(resource)) {
                        System.out.println(resource);
                    } else {
                        System.out.println("Error access : " + resource);
                    }
                    break;
                case "exit":
                    exit = true;
                    break;
            }
        }
    }
}

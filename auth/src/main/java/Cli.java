import api.Resource;
import service.Authentification;
import service.Resources;
import service.UserList;

import java.util.Scanner;

public class Cli {
    public static void main(String[] args) {
        Authentification auth = new Authentification();
        Scanner in = new Scanner(System.in);

        while (in.hasNext()) {
            String currentInput = in.nextLine();
            String[] currentArr = currentInput.split(" ");

            switch (currentArr[0]) {
                case "login":
                    if (auth.login(currentArr[1], currentArr[2])) {
                        System.out.println(auth.getCurrentUser().getName());
                    } else {
                        System.out.println("invalid user or password");
                    }
                    break;
                case "info":
                    if (auth.getCurrentUser() != null) {
                        System.out.println(auth.getCurrentUser());
                    } else {
                        System.out.println("No login users");
                    }
                    break;
                case "logout":
                    if (auth.getCurrentUser() != null) {
                        auth.logout();
                        System.out.println("logout");
                    } else {
                        System.out.println("No login users");
                    }
                    break;
                case "get":
                    Resource resource = Resources.findByTitle(currentArr[1]);
                    if (auth.getCurrentUser().getRole().hasAcces(resource)){
                        System.out.println("You have access to " +resource+ " resources");
                    } else {
                        System.out.println("Access is denied");
                    }
                    break;
                case "new":
                    String userName = currentArr[1];
                    String password = currentArr[2];
                    UserList.createUser(userName, password);
                    System.out.println("User was created: " + userName);

                    // delete just admin user;
            }
        }
    }
}

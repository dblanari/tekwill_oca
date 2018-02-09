import api.Resource;
import model.User;
import service.Authentification;
import service.Resources;
import service.UserList;

import java.util.Scanner;

public class Cli {
    public static void main(String[] args) {

        Authentification signIn = new Authentification();
        Scanner sc = new Scanner(System.in);

        while (sc.hasNext()) {
            String line = sc.nextLine();
            // line.split itereaza tot ce e pana la spatiu si dupa, transformand din String in Array.
            String[] com = line.split(" ");
            if (com[0].equals("login")) {
                if (signIn.login(com[1], com[2])) {
                    System.out.println("You login: "+signIn.getCurrentUser());
                } else {
                    System.out.println("Incorrect user,try again .");
                }
            }
            if (com[0].equals("logout")) {
                signIn.setCurrentUser(null);
                System.out.println("You logout");
            }
            if (com[0].equals("info")) {
                if (signIn.getCurrentUser() != null) {
                    System.out.println(signIn.getCurrentUser());
                } else {
                    System.out.println("Please login");
                }
            }
            if (com[0].equals("exit")) {
                signIn.setCurrentUser(null);
                System.out.println("You exit");
                break;
            }
            if (com[0].equals("get")){
                Resource res = Resources.findByTitle(com[1]);
                if (signIn.getCurrentUser().getRole().hasAcces(res)) {
                    System.out.println("You have acces to"+res);
                } else {
                    System.out.println("You don't have acces to"+res);
                }
            }
            if (com[0].equals("new")){
                String userName = com[1];
                String password = com[2];
                User user = UserList.createUser(userName,password);
                System.out.println("User was created "+user);
            }

        }
    }
}

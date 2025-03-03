package dmdew.map.homeworkUser.chat;


import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class UserExample {
    public static void main(String[] args) {
        List<User> users = new ArrayList<>();
        users.add(new User(12, "Petr", 13));
        users.add(new User(16, "Ivan", 23));
        users.add(new User(34, "Masha", 15));
        users.add(new User(14, "Anna", 33));
        users.add(new User(18, "Alina", 19));

        Chat chat = new Chat("ChatA", users);
        System.out.println(users);
        List<User> adultUsers = new ArrayList<>();
        for (User user : chat.getUser()) {
            if(user.getAge() > 18){
                adultUsers.add(user);
            }
        }
        System.out.println(adultUsers);

        int totalAge = 0;
        int count = 0;

        Iterator<User> iterator = adultUsers.iterator();
        while (iterator.hasNext()){
            User user = iterator.next();
            totalAge += user.getAge();
            count++;
        }
        int averageAge = totalAge/count;
        System.out.println("Average age " + averageAge);


    }

}

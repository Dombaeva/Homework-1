package dmdew.map.homeworkUser.chatSort;
import java.util.*;

/**
 * Дан список чатов.
 * Каждый чат состоит из двух полей: название и количество пользователей в этом чате.
 * Задача:
 * - Удалить с помощью итератора из этого списка те чаты, что содержат менее 1000 пользователей.
 * - Оставшиеся чаты отсортировать с помощью компараторов по убыванию по количеству пользователей, а если это количество совпадает, то по названию в алфавитном порядке.
 * - Также предоставить сортировку чатов по названию по умолчанию.
 */

public class ChatList {
    public static void main(String[] args) {

        List<Chat> chatList = Arrays.asList(
                new Chat("ChatA", 356),
                new Chat("ChatB", 734),
                new Chat("ChatC", 1566),
                new Chat("ChatD", 26),
                new Chat("ChatE", 1002),
                new Chat("ChatF", 19),
                new Chat("ChatG", 1002),
                new Chat("ChatH", 1032)

        );
        List<Chat> chatArrayList = new ArrayList<>(chatList);
        Iterator<Chat> iterator = chatArrayList.iterator();
        while (iterator.hasNext()) {
            if (iterator.next().getNumberOfUsers() < 1000) {
                iterator.remove();
            }
        }

        chatList.sort(Comparator.comparing(Chat::getNumberOfUsers).reversed().thenComparing(Chat::getName));
        System.out.println(chatArrayList);

        List<Chat> sortedByName = new ArrayList<>(chatArrayList);
        sortedByName.sort(Comparator.comparing(Chat::getName));
        System.out.println(sortedByName);
    }

}

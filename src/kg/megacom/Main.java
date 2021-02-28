package kg.megacom;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> books = new ArrayList<>(Arrays.asList("Курочка ряба", "Каштанка", "Колобок", "Буратино", "Мойдодыр")); //  список из задания 33.1
        LinkedList<String> linkedBooks = new LinkedList<>(books); // превратил в LinkedList
        linkedBooks.addFirst("Чиполино"); // добавил 1 книгу в начало
        linkedBooks.addFirst("Чиполино"); // добавил еще 1 в начало
        linkedBooks.addLast("Красная шапочка"); // добавил 1 книгу в конец
        linkedBooks.addLast("Красная шапочка"); // добавил еще 1 в конец
        linkedBooks.remove("Чиполино"); // удалил первое вхождение книги из начала списка
        int index = linkedBooks.lastIndexOf("Красная шапочка"); // нашел индекс последнего вхождения книги из конца списка
        linkedBooks.remove(index); //удалил последнее вхождение из конца списка
        System.out.println(linkedBooks.toString()); //распечатал
    }
}
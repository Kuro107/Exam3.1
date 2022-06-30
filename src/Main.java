import java.util.Arrays;
import java.util.HashSet;

public class Main {


    public static void main(String[] args) {

        // создаем массив
        int [] array = new int[100];

        //Заполняем массив числами от 1 до 100 через цикл
        for (int i = 0; i < 100 ; i++){
            array[i] = i+1;
        }

        //Создаем хэшсет
        HashSet<Integer> hashSet = new HashSet<>();



        //заполняем хэшсет четными числами из нашего массива
        for (int i = 0; i < 100; i++) {
            if (array[i] % 2 == 0) {
                hashSet.add(array[i]);
            }
        }
        System.out.println(hashSet);
        // Мы не сможем отсортировать HashSet поскольку он не гарантирует порядка элементов, у него нет метода get()
        // что бы мы смогли получить индекс, поэтому - для своей сортировки лучше использовать списки
        // или сохранить в LinkedHashSet нашу сортировку по порядку

    }

}
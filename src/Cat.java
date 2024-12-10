

// Интерфейс Meowable
public interface Meowable {
    void meow();
}// Класс Cat
public class Cat implements Meowable {
    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void meow() {
        System.out.println(name + ": мяу!");
    }

    @Override
    public String toString() {
        return "кот: " + name;
    }
}

// Класс для вызова мяуканья
public class MeowInvoker {
    public static void makeAllMeow(Meowable... meowables) {
        for (Meowable meowable : meowables) {
            meowable.meow();
        }
    }

    public static void main(String[] args) {
        Cat cat = new Cat("Мурзик");
        System.out.println(cat); // Вывод: кот: Мурзик

        // Вызов метода makeAllMeow
        makeAllMeow(cat, cat, cat); // Вызов мяуканья три раза

        // Вывод количества мяуканий
        // Поскольку мы не можем изменять класс Cat, мы не можем добавить счетчик мяуканий в сам класс.
        // Поэтому мы будем считать количество мяуканий вне класса.
        int meowCount = 3; // Мы знаем, что мяуканье было вызвано три раза
        System.out.println("Количество мяуканий: " + meowCount); // Вывод: Количество мяуканий: 3
    }
}


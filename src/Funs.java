// Класс MeowCounter
public class MeowCounter implements Meowable {
    private Cat cat;
    private int meowCount;

    public MeowCounter(Cat cat) {
        this.cat = cat;
        this.meowCount = 0;
    }

    @Override
    public void meow() {
        cat.meow();
        meowCount++;
    }

    public int getMeowCount() {
        return meowCount;
    }
}

import java.util.Objects;

public class Fraction {
    private int numerator;
    private int denominator;
    private Double realValue;

    // Конструктор для создания дроби с указанием числителя и знаменателя
    public Fraction(int numerator, int denominator) {
        if (denominator < 0) {
            this.numerator = -numerator;
            this.denominator = -denominator;
        } else {
            this.numerator = numerator;
            this.denominator = denominator;
        }
        this.realValue = null; // Инициализация кэша
    }

    // Метод для получения вещественного значения
    public double getRealValue() {
        if (realValue == null) {
            realValue = (double) numerator / denominator;
        }
        return realValue;
    }

    // Метод для установки числителя
    public void setNumerator(int numerator) {
        this.numerator = numerator;
        this.realValue = null; // Сброс кэша
    }

    // Метод для установки знаменателя
    public void setDenominator(int denominator) {
        if (denominator < 0) {
            this.numerator = -this.numerator;
            this.denominator = -denominator;
        } else {
            this.denominator = denominator;
        }
        this.realValue = null; // Сброс кэша
    }

    // Метод для получения строкового представления дроби
    @Override
    public String toString() {
        return numerator + "/" + denominator;
    }

    // Переопределение метода equals для сравнения дробей по состоянию
    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Fraction fraction = (Fraction) obj;
        return numerator == fraction.numerator && denominator == fraction.denominator;
    }

    // Переопределение метода hashCode для корректной работы equals
    @Override
    public int hashCode() {
        return Objects.hash(numerator, denominator);
    }

    // Интерфейс для методов получения вещественного значения и установки числителя и знаменателя
    public interface FractionInterface {
        double getRealValue();
        void setNumerator(int numerator);
        void setDenominator(int denominator);
    }

    // Реализация интерфейса
    public static class FractionImpl implements FractionInterface {
        private Fraction fraction;

        public FractionImpl(int numerator, int denominator) {
            this.fraction = new Fraction(numerator, denominator);
        }

        @Override
        public double getRealValue() {
            return fraction.getRealValue();
        }

        @Override
        public void setNumerator(int numerator) {
            fraction.setNumerator(numerator);
        }

        @Override
        public void setDenominator(int denominator) {
            fraction.setDenominator(denominator);
        }
    }


}


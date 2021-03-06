package sample.Brain;

import java.util.ArrayList;
import java.util.List;

public class Init {
    private static List<Param> paramsIn;
    private static List<Param> paramsOut;
    private static List<Rule> rules;

    public static void init() {
        initParams();
        initRules();
        boolean f = false;
        if (f) {
            for (Param p : paramsIn) {
                paramToT(p);
            }
            for (Param p : paramsOut) {
                paramToT(p);
            }
        }
    }

    public static void initParams1() {
        paramsIn = new ArrayList<>();
        Param i1 = new Param("Необходимая освещённость",
                new Term("Очень слабая", 0d, 1d, 50d, 1d, 75d, 0d),
                new Term("Слабая", 50d, 0d, 75d, 1d, 100d, 1d, 150d, 0d),
                new Term("Средняя", 120d, 0d, 150d, 1d, 200d, 1d, 250d, 0d),
                new Term("Сильная", 200d, 0d, 250d, 1d, 300d, 1d, 400d, 0d),
                new Term("Очень сильная", 300d, 0d, 400d, 1d, 500d, 1d)
        );
        paramsIn.add(i1);
        Param i2 = new Param("Размер проёма",
                new Term("Очень маленький", 0d, 1d, 0.3d, 1d, 0.5d, 0d),
                new Term("Маленький", 0.3d, 0d, 0.6d, 1d, 1.2d, 1d, 1.5d, 0d),
                new Term("Средний", 1d, 0d, 1.5d, 1d, 2d, 1d, 3d, 0d),
                new Term("Большой", 2d, 0d, 3d, 1d, 4d, 1d, 5d, 0d),
                new Term("Огромный", 4d, 0d, 6d, 1d, 7d, 1d)
        );
        paramsIn.add(i2);
        Param i3 = new Param("Объём помещения",
                new Term("Малое", 10d, 1d, 12d, 1d, 20d, 0d),
                new Term("Среднее", 15d, 0d, 20d, 1d, 30d, 1d, 40d, 0d),
                new Term("Большое", 35d, 0d, 45d, 1d, 50d, 1d)
        );
        paramsIn.add(i3);
        Param i4 = new Param("Температура в помещении",
                new Term("Холодно", 10d, 1d, 19d, 1d, 22d, 0d),
                new Term("Тепло", 18d, 0d, 20d, 1d, 22d, 1d, 24d, 0d),
                new Term("Жарко", 22d, 0d, 24d, 1d, 30d, 1d)
        );
        paramsIn.add(i4);
        Param i5 = new Param("Этаж",
                new Term("Нижний", 0d, 1d, 3d, 1d, 5d, 0d),
                new Term("Средний", 3d, 0d, 5d, 1d, 8d, 1d, 12d, 0d),
                new Term("Верхний", 8d, 0d, 12d, 1d, 15d, 1d)
        );
        paramsIn.add(i5);
        Param i6 = new Param("Посещаемость",
                new Term("Почти отсутствует", 0d, 1d, 1d, 1d, 3d, 0d),
                new Term("Редкая", 1d, 0d, 3d, 1d, 8d, 1d, 10d, 0d),
                new Term("Умеренная", 8d, 0d, 10d, 1d, 14d, 1d, 16d, 0d),
                new Term("Частая", 14d, 0d, 16d, 1d, 18d, 1d)
        );
        paramsIn.add(i6);
        Param i7 = new Param("Шумность на улице",
                new Term("Тихо", 20d, 1d, 30d, 1d, 35d, 0d),
                new Term("Незначительный шум", 30d, 0d, 35d, 1d, 40d, 1d, 45d, 0d),
                new Term("Приемлимо", 40d, 0d, 45d, 1d, 50d, 1d, 60d, 0d),
                new Term("Шумно", 50d, 0d, 60d, 1d, 70d, 1d, 80d, 0d),
                new Term("Очень шумно", 70d, 0d, 80d, 1d, 90d, 1d)
        );
        paramsIn.add(i7);
        Param i8 = new Param("Бюджет",
                new Term("Скромный", 0d, 1d, 3d, 1d, 5d, 0d),
                new Term("Умеренный", 4d, 0d, 5d, 1d, 8d, 1d, 10d, 0d),
                new Term("Широкий", 8d, 0d, 10d, 1d, 14d, 1d, 20d, 0d),
                new Term("Неограниченный", 15d, 0d, 20d, 1d, 25d, 1d)
        );
        paramsIn.add(i8);
        Param i9 = new Param("Количество детей",
                new Term("Нет", 0d, 1d, 1d, 0d),
                new Term("Мало", 0d, 0d, 1d, 1d, 2d, 0d),
                new Term("Много", 1d, 0d, 2d, 1d, 3d, 1d)
        );
        paramsIn.add(i9);
        Param o1 = new Param("Теплозащита",
                new Term("Отсутствует", 20d, 1d, 30d, 1d, 40d, 0d),
                new Term("Слабая", 30d, 0d, 35d, 1d, 45d, 1d, 50d, 0d),
                new Term("Сильная", 45d, 0d, 50d, 1d, 60d, 1d, 70d, 0d)
        );
        paramsIn.add(o1);
        Param o2 = new Param("Сетка",
                new Term("Антикошка", 2d, 1d, 1.5d, 1d, 1d, 0d),
                new Term("Обычная", 1.5d, 0d, 1.2d, 1d, 0.8d, 1d, 0.4d, 0d),
                new Term("Антипыльца", 0.6d, 0d, 0.4d, 1d, 0.2d, 1d)
        );
        paramsIn.add(o2);
    }

    public static void paramToT(Param param) {
        for (int j = 0; j < param.getTerms().size(); j++) {
            Term t = param.getTerms().get(j);
            List<Point> points = new ArrayList<>(t.getPoints());
            for (int i = points.size() - 3; i > 0; i--) {
                Point s = points.get(i);
                Point e = points.get(i + 1);
                if (s.getY().equals(e.getY())) {
                    Point n = new Point((s.getX() + e.getX()) / 2, s.getY());
                    points.set(i, n);
                    points.remove(i + 1);
                }
            }
            if (points.get(0).getY().equals(points.get(1).getY())) {
                points.remove(1);
            }
            int last = points.size() - 1;
            if (points.get(last).getY().equals(points.get(last - 1).getY())) {
                points.remove(last - 1);
            }
            param.getTerms().set(j, new Term(t.getName(), points));
        }
    }

    public static void initParams() {
        paramsIn = new ArrayList<>();
        paramsOut = new ArrayList<>();
        Param i1 = new Param("Размер проёма",
                new Term("Очень маленький", 0d, 1d, 0.3d, 1d, 0.5d, 0d),
                new Term("Маленький", 0.3d, 0d, 0.6d, 1d, 1.2d, 1d, 1.5d, 0d),
                new Term("Средний", 1d, 0d, 1.5d, 1d, 2d, 1d, 3d, 0d),
                new Term("Большой", 2d, 0d, 3d, 1d, 4d, 1d, 5d, 0d),
                new Term("Огромный", 4d, 0d, 6d, 1d, 7d, 1d)
        );
        paramsIn.add(i1);
        Param i2 = new Param("Отапливаемость",
                new Term("Слабая", 10d, 1d, 19d, 1d, 22d, 0d),
                new Term("Умеренная", 18d, 0d, 20d, 1d, 22d, 1d, 24d, 0d),
                new Term("Сильная", 22d, 0d, 24d, 1d, 30d, 1d)
        );
        paramsIn.add(i2);
        Param i3 = new Param("Посещаемость",
                new Term("Почти отсутствует", 0d, 1d, 1d, 1d, 3d, 0d),
                new Term("Редкая", 1d, 0d, 3d, 1d, 8d, 1d, 10d, 0d),
                new Term("Умеренная", 8d, 0d, 10d, 1d, 14d, 1d, 16d, 0d),
                new Term("Частая", 14d, 0d, 16d, 1d, 18d, 1d)
        );
        paramsIn.add(i3);
        Param i4 = new Param("Бюджет",
                new Term("Скромный", 0d, 1d, 3d, 1d, 5d, 0d),
                new Term("Умеренный", 4d, 0d, 5d, 1d, 8d, 1d, 10d, 0d),
                new Term("Широкий", 8d, 0d, 10d, 1d, 14d, 1d, 20d, 0d),
                new Term("Неограниченный", 15d, 0d, 20d, 1d, 25d, 1d)
        );
        paramsIn.add(i4);
        Param o1 = new Param("Теплозащита",
                new Term("Отсутствует", 20d, 1d, 30d, 1d, 40d, 0d),
                new Term("Слабая", 30d, 0d, 35d, 1d, 45d, 1d, 50d, 0d),
                new Term("Сильная", 45d, 0d, 50d, 1d, 60d, 1d, 70d, 0d)
        );
        paramsOut.add(o1);
    }

    public static void initRules() {
        rules = new ArrayList<>();
        rules.add(new Rule(
                new Alt("Теплозащита", "Отсутствует"),
                new Alt("Посещаемость", "Почти отсутствует"),
                new Alt("Бюджет", "Скромный")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Отсутствует"),
                new Alt("Отапливаемость", "Сильная"),
                new Alt("Посещаемость", "Редкая"),
                new Alt("Бюджет", "Скромный")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Отсутствует"),
                new Alt("Отапливаемость", "Умеренная"),
                new Alt("Посещаемость", "Редкая"),
                new Alt("Бюджет", "Скромный")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Слабая"),
                new Alt("Отапливаемость", "Слабая"),
                new Alt("Посещаемость", "Редкая"),
                new Alt("Бюджет", "Скромный")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Отсутствует"),
                new Alt("Отапливаемость", "Сильная"),
                new Alt("Посещаемость", "Умеренная"),
                new Alt("Бюджет", "Скромный")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Слабая"),
                new Alt("Отапливаемость", "Умеренная"),
                new Alt("Посещаемость", "Умеренная"),
                new Alt("Бюджет", "Скромный")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Слабая"),
                new Alt("Отапливаемость", "Слабая"),
                new Alt("Посещаемость", "Умеренная"),
                new Alt("Бюджет", "Скромный")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Слабая"),
                new Alt("Посещаемость", "Частая"),
                new Alt("Бюджет", "Скромный")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Отсутствует"),
                new Alt("Посещаемость", "Почти отсутствует"),
                new Alt("Бюджет", "Умеренный")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Отсутствует"),
                new Alt("Размер проёма", "Очень маленький"),
                new Alt("Отапливаемость", "Умеренная"),
                new Alt("Посещаемость", "Редкая"),
                new Alt("Бюджет", "Умеренный")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Отсутствует"),
                new Alt("Размер проёма", "Маленький"),
                new Alt("Отапливаемость", "Умеренная"),
                new Alt("Посещаемость", "Редкая"),
                new Alt("Бюджет", "Умеренный")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Отсутствует"),
                new Alt("Размер проёма", "Средний"),
                new Alt("Отапливаемость", "Умеренная"),
                new Alt("Посещаемость", "Редкая"),
                new Alt("Бюджет", "Умеренный")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Слабая"),
                new Alt("Размер проёма", "Большой"),
                new Alt("Отапливаемость", "Умеренная"),
                new Alt("Посещаемость", "Редкая"),
                new Alt("Бюджет", "Умеренный")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Слабая"),
                new Alt("Размер проёма", "Огромный"),
                new Alt("Отапливаемость", "Умеренная"),
                new Alt("Посещаемость", "Редкая"),
                new Alt("Бюджет", "Умеренный")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Слабая"),
                new Alt("Отапливаемость", "Сильная"),
                new Alt("Посещаемость", "Умеренная"),
                new Alt("Бюджет", "Умеренный")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Слабая"),
                new Alt("Отапливаемость", "Умеренная"),
                new Alt("Посещаемость", "Умеренная"),
                new Alt("Бюджет", "Умеренный")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Сильная"),
                new Alt("Отапливаемость", "Слабая"),
                new Alt("Посещаемость", "Умеренная"),
                new Alt("Бюджет", "Умеренный")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Слабая"),
                new Alt("Отапливаемость", "Сильная"),
                new Alt("Посещаемость", "Частая"),
                new Alt("Бюджет", "Умеренный")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Слабая"),
                new Alt("Отапливаемость", "Умеренная"),
                new Alt("Посещаемость", "Частая"),
                new Alt("Бюджет", "Умеренный")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Сильная"),
                new Alt("Отапливаемость", "Слабая"),
                new Alt("Посещаемость", "Частая"),
                new Alt("Бюджет", "Умеренный")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Слабая"),
                new Alt("Посещаемость", "Почти отсутствует"),
                new Alt("Бюджет", "Широкий")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Слабая"),
                new Alt("Посещаемость", "Редкая"),
                new Alt("Бюджет", "Широкий")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Слабая"),
                new Alt("Отапливаемость", "Сильная"),
                new Alt("Посещаемость", "Умеренная"),
                new Alt("Бюджет", "Широкий")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Слабая"),
                new Alt("Отапливаемость", "Умеренная"),
                new Alt("Посещаемость", "Умеренная"),
                new Alt("Бюджет", "Широкий")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Сильная"),
                new Alt("Отапливаемость", "Слабая"),
                new Alt("Посещаемость", "Умеренная"),
                new Alt("Бюджет", "Широкий")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Слабая"),
                new Alt("Размер проёма", "Очень маленький"),
                new Alt("Отапливаемость", "Сильная"),
                new Alt("Посещаемость", "Частая"),
                new Alt("Бюджет", "Широкий")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Слабая"),
                new Alt("Размер проёма", "Маленький"),
                new Alt("Отапливаемость", "Сильная"),
                new Alt("Посещаемость", "Частая"),
                new Alt("Бюджет", "Широкий")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Слабая"),
                new Alt("Размер проёма", "Средний"),
                new Alt("Отапливаемость", "Сильная"),
                new Alt("Посещаемость", "Частая"),
                new Alt("Бюджет", "Широкий")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Сильная"),
                new Alt("Размер проёма", "Большой"),
                new Alt("Отапливаемость", "Сильная"),
                new Alt("Посещаемость", "Частая"),
                new Alt("Бюджет", "Широкий")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Сильная"),
                new Alt("Размер проёма", "Огромный"),
                new Alt("Отапливаемость", "Сильная"),
                new Alt("Посещаемость", "Частая"),
                new Alt("Бюджет", "Широкий")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Слабая"),
                new Alt("Размер проёма", "Очень маленький"),
                new Alt("Отапливаемость", "Умеренная"),
                new Alt("Посещаемость", "Частая"),
                new Alt("Бюджет", "Широкий")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Слабая"),
                new Alt("Размер проёма", "Маленький"),
                new Alt("Отапливаемость", "Умеренная"),
                new Alt("Посещаемость", "Частая"),
                new Alt("Бюджет", "Широкий")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Сильная"),
                new Alt("Размер проёма", "Средний"),
                new Alt("Отапливаемость", "Умеренная"),
                new Alt("Посещаемость", "Частая"),
                new Alt("Бюджет", "Широкий")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Сильная"),
                new Alt("Размер проёма", "Большой"),
                new Alt("Отапливаемость", "Умеренная"),
                new Alt("Посещаемость", "Частая"),
                new Alt("Бюджет", "Широкий")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Сильная"),
                new Alt("Размер проёма", "Огромный"),
                new Alt("Отапливаемость", "Умеренная"),
                new Alt("Посещаемость", "Частая"),
                new Alt("Бюджет", "Широкий")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Сильная"),
                new Alt("Отапливаемость", "Слабая"),
                new Alt("Посещаемость", "Частая"),
                new Alt("Бюджет", "Широкий")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Слабая"),
                new Alt("Посещаемость", "Почти отсутствует"),
                new Alt("Бюджет", "Неограниченный")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Слабая"),
                new Alt("Посещаемость", "Редкая"),
                new Alt("Бюджет", "Неограниченный")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Сильная"),
                new Alt("Посещаемость", "Умеренная"),
                new Alt("Бюджет", "Неограниченный")
        ));

        rules.add(new Rule(
                new Alt("Теплозащита", "Сильная"),
                new Alt("Посещаемость", "Частая"),
                new Alt("Бюджет", "Неограниченный")
        ));
        System.out.println("Все правила:");
        for (Rule r : rules) {
            System.out.println(r.toString());
        }
    }

    public static List<Param> getParamsIn() {
        return paramsIn;
    }

    public static List<Param> getParamsOut() {
        return paramsOut;
    }

    public static List<Rule> getRules() {
        return rules;
    }
}

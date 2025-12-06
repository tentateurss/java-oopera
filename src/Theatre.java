public class Theatre {
    private static final String LOW_BOARD = "=================================================================";

    public static void main(String[] args) {
        Actor actor1 = new Actor("Рената", "Литвинова", Gender.FEMALE, 176);
        Actor actor2 = new Actor("Эдгард", "Запашный", Gender.MALE, 189);
        Actor actor3 = new Actor("Сергей", "Иванов", Gender.MALE, 175);

        Director director1 = new Director("Франко", "Дзеффирелли", Gender.MALE, 50);
        Director director2 = new Director("Каликсто", "Биейто", Gender.MALE, 80);

        String musicAuthor = "Пётр Чайковский";
        String choreographer = "Мариус Петипа";

        Show regullarShow = new Show("Ревизор", 200, director1);

        Opera opera = new Opera("Травиата", 140, director2, musicAuthor,
                "История любви куртизанки Виолетты и молодого аристократа Альфреда",
                30);

        Ballet newYearBallet = new Ballet("Щелкунчик", 120, director1, musicAuthor,
                "История девочки Мари, получившей в подарок на Рождество деревянного Щелкунчика",
                "Лев Иванов");

        System.out.println("============== Распределение актеров по спектаклям ==============\n");
        System.out.printf("=========== Распределяем актеров в спектакль %s ============\n", regullarShow.getTitle());

        regullarShow.addActor(actor1);
        regullarShow.addActor(actor2);

        System.out.println(LOW_BOARD);
        System.out.printf("\n============= Распределяем актеров в оперу %s =============\n", opera.getTitle());

        opera.addActor(actor2);
        opera.addActor(actor3);

        System.out.println(LOW_BOARD);
        System.out.printf("\n====== Распределяем актеров в новогодний баллет %s =======\n", newYearBallet.getTitle());

        newYearBallet.addActor(actor1);
        newYearBallet.addActor(actor3);

        // Проверка на добавление уже добавленного актера
        newYearBallet.addActor(actor3);

        System.out.println(LOW_BOARD);
        System.out.println("""
                \n                  Распределение завершено!
                """ + LOW_BOARD);

        System.out.printf("\n================ Список актеров в спектакле %s =============\n", regullarShow.getTitle());

        regullarShow.printAllActors();

        System.out.println(LOW_BOARD);
        System.out.printf("\n================= Список актеров в опере %s ===============\n", opera.getTitle());

        opera.printAllActors();

        System.out.println(LOW_BOARD);
        System.out.printf("\n========== Список актеров в новогоднем баллете %s ========\n", newYearBallet.getTitle());

        newYearBallet.printAllActors();

        System.out.println(LOW_BOARD);
        System.out.printf("\n=============== Заменяем актера в спектакте %s =============\n", regullarShow.getTitle());

        regullarShow.changeActor(actor3, "Литвинова");
        System.out.printf("\n=============== Текущий список актеров спектакля %s =============\n", regullarShow.getTitle());

        regullarShow.printAllActors();

        System.out.println(LOW_BOARD);

        System.out.println("Попытка заменить актера на несуществующего:");

        opera.changeActor(actor1, "Иванович");

        System.out.println(LOW_BOARD);

        System.out.printf("\n=============== Либретто для оперы %s =============\n", opera.getTitle());

        opera.printLibrettoText();

        System.out.printf("\n=============== Либретто для балета %s =============\n", newYearBallet.getTitle());

        newYearBallet.printLibrettoText();

        System.out.println(LOW_BOARD);
    }
}
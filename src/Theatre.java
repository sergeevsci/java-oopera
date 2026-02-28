import java.util.ArrayList;

/*
 * Добрый вечер, Сергей! Вроде поправил, спасибо за проверку работы)
 * Хорошего дня!
 * */

public class Theatre {
    public static void main(String[] args){
        Director director1 = new Director("Петр","Чайковский", Gender.MALE, 3);
        Director director2 = new Director("Питер","Уир", Gender.MALE, 4);
        Actor actor1 = new Actor("Карлотта", "Брианца", Gender.FEMALE, 160);
        Actor actor2 = new Actor("Джим", "Керри", Gender.MALE, 192);
        Actor actor3 = new Actor("Варвара", "Никитина", Gender.FEMALE, 165);

        Person musicAuthor = new Person("Эннио", "Морриконе", Gender.MALE);
        Person choreographer = new Person("Мариус", "Петипа", Gender.MALE);

        Show showTrueman = new Show("Шоу Трумана", 103, director2, new ArrayList<>());
        showTrueman.addActor(actor1);
        showTrueman.addActor(actor2);
        showTrueman.addActor(actor3);

        Opera operaBorisGodunov = new Opera("Борис Годунов", 140, director1, new ArrayList<>(),
                musicAuthor, "Действие происходит в 1598–1605 годах.\n" +
                "\n" +
                "Пролог и первая картина\n" +
                "Двор Новодевичьего монастыря под Москвой. Стрельцы и приставы сгоняют народ «просить на царство» Бориса" +
                " Годунова. Думный дьяк Щелкалов выходит к народ" +
                "у с вестью о том, что Борис отказывается от трона. Пристав оглашает боярский указ: «Завтра быть в" +
                " Кремле и ждать там приказаний».", 15);
        operaBorisGodunov.addActor(actor1);
        operaBorisGodunov.addActor(actor3);

        Ballet balletSleepingBeauty = new Ballet("Спящая красавица", 130, director2, new ArrayList<>(),
                musicAuthor, "Пролог. Король и королева празднуют рождение дочери — " +
                "принцессы Авроры. Каталабют объявляет о прибытии гостей: появляются фея Беззаботности, фея Нежности," +
                " фея Щедрости, фея Резвости, фея Смелости и крестная Авроры — фея Сирени. Каждая приносит новоро" +
                "ждённой свой дар: честность, изящество, процветание, прекрасный голос и великодушие.\n" +
                "Первый акт, 2-я картина. Принцессе Авроре минуло шестнадцать лет. Король и королева счастливы — " +
                "предсказание злой феи не исполнилось. В толпе Аврора замечает старуху, которая протягивает ей букет со" +
                " спрятанным веретеном. Принцесса берёт букет, ничего не подозревая, кружится с ним. И вдруг она укололась! " +
                "Аврора теряет силы и засыпает, старуха снимает плащ и радуется — это злая фея Карабос.\n" +
                "Второй акт, апофеоз. Пышная свадьба принцессы Авроры и принца Дезире. Аврору и Дезире пришли поздравить" +
                " феи Бриллиантов, Сапфиров, Золота и Серебра, а также много сказочных героев: принцесса Флорина" +
                " и Голубая птица, Белая кошечка и кот, Волк и Красная шапочка. Принц и принцесса женятся, фея Сирени " +
                "благословляет их брак.", choreographer);
        balletSleepingBeauty.addActor(actor2);
        balletSleepingBeauty.addActor(actor3);

        System.out.println("Список актеров Шоу");
        showTrueman.printActors();

        System.out.println();
        System.out.println("Список актеров Оперы");
        operaBorisGodunov.printActors();

        System.out.println();
        System.out.println("Список актеров Балета");
        balletSleepingBeauty.printActors();

        balletSleepingBeauty.changeActor(actor1, "Керри");
        System.out.println();
        System.out.println("Новый список актеров Балета");
        balletSleepingBeauty.printActors();

        System.out.println();
        operaBorisGodunov.changeActor(actor2, "Кто-то");
        System.out.println();
        System.out.println("Список актеров Оперы");
        operaBorisGodunov.printActors();

        System.out.println();
        System.out.println("Либретто оперы:");
        operaBorisGodunov.printLibrettoText();
        System.out.println();
        System.out.println("Либретто балета:");
        balletSleepingBeauty.printLibrettoText();
    }
}
package Home_Work_1._1;

public class Main {
    // 1. Реализовать, с учетом ооп подхода, приложение для проведения исследований с генеалогическим древом.
    //Идея: описать некоторое количество компонент, например:
    //* модель человека
    //* компонента хранения связей и отношений между людьми: родитель, ребёнок - классика,
    // но можно подумать и про отношение, брат, свекровь, сестра и т. д.
    //* компонент для проведения исследований
    //* дополнительные компоненты, например отвечающие за вывод данных в консоль,
    // загрузку и сохранения в файл, получение\построение отдельных моделей человека
    //Под “проведением исследования” можно понимать получение всех детей выбранного человека.
    public static void main (String[] args) {
        Person irina = new Person("Ирина");
        Person vasya = new Person("Вася");
        Person masha = new Person("Маша");
        Person jane = new Person("Женя");
        Person ivan = new Person("Ваня");
        Person katya = new Person("Катя");
        GeoTree gt = new GeoTree();
        gt.append(irina, vasya);
        gt.append(irina, masha);
        gt.append(vasya, jane);
        gt.append(vasya, ivan);
        gt.append(ivan, katya);

        System.out.println(new Reserch(gt).spend(irina,
                Relationship.parent));
        // поиск всех потомков
        System.out.println(new Reserch(gt).all_descendants(irina));
        System.out.println(new Reserch(gt).all_descendants(vasya));
        // поиск всех предков
        System.out.println(new Reserch(gt).all_ancestors(katya));



    }

}

public class homework_001 {

    public static void main(String[] args) {
        Human ya = new Human("Иван", "Иванов", Gender.man,
                20, 1, 2000);
        Human mom = new Human("Дарина", "Добронравова", Gender.woman,
                28, 3, 1973);
        ya.indicateParents(mom);
        HumanInfo inf = new HumanInfo(mom);
        inf.printFullInfo();

        Family family = new Family(ya);
        System.out.println(family.getSizeFamily());

        for (Human hum : family.sortByAge()) {
            System.out.println(hum.getName());
            System.out.println(hum.getAge());
        }
    }
}
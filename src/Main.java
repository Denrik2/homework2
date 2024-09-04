public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println("Задача №1");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println("Задача №2");
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println("Задача №3");
        System.out.println(dog - 3.5);
        System.out.println(cat - 1.6);
        System.out.println(paper - 7639);

        System.out.println("Задача №4");
        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        System.out.println("Задача №5");
        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var boxer1 = 78.2;
        var boxer2 = 82.7;
        var totalWeightOfTheFighters = boxer1 + boxer2;
        var weightDifference = boxer2 - boxer1;
        System.out.println("Задача №6");
        System.out.println(totalWeightOfTheFighters);
        System.out.println(weightDifference);

        System.out.println("Задача №7");
        var remainingWeight = boxer2 % boxer1;
        System.out.println(remainingWeight);

        System.out.println("Задача №8");
        var allTheTime = 640;
        var workingHours = 8;
        var numberOfEmployees = allTheTime / workingHours;
        System.out.println("Всего работников в компании — " + numberOfEmployees + " человек");
        numberOfEmployees = numberOfEmployees + 94;
        System.out.println("Если в компании работает " + numberOfEmployees + " человек, то всего " +
                (allTheTime / numberOfEmployees) + " часов работы может быть поделено между сотрудниками");
    }
}
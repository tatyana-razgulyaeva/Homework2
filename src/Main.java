public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog + 4;
        cat = cat + 4;
        paper = paper + 4;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        dog = dog - 3.5;
        cat = cat - 1.6;
        paper = paper - 7639;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var friend = 19;
        System.out.println(friend);
        friend = friend + 2;
        System.out.println(friend);
        friend = friend / 7;
        System.out.println(friend);

        var frog = 3.5;
        System.out.println(frog);
        frog = frog * 10;
        System.out.println(frog);
        frog = frog / 3.5;
        System.out.println(frog);
        frog = frog + 4;
        System.out.println(frog);

        var firstBoxer = 78.2;
        var secondBoxer = 82.7;
        var totalWeight = firstBoxer + secondBoxer;
        var massDifference = Math.abs(firstBoxer - secondBoxer);
        System.out.println(firstBoxer);
        System.out.println(secondBoxer);
        System.out.println(totalWeight);
        System.out.println(massDifference);

        var firstNumber = 9;
        var secondNumber = 19;
        var remains = secondNumber % firstNumber;
        System.out.println(firstNumber);
        System.out.println(secondNumber);
        System.out.println(remains);

        var totalHours = 640;
        var workingHours = 8;
        System.out.println("Всего работников в компании — " + (totalHours / workingHours) + " человек");
        System.out.println("Если в компании работает " + (totalHours / workingHours + 94) + " человек, то всего " + ((totalHours / workingHours + 94) * 8) + " часов работы может быть поделено между сотрудниками");

    }
}
public class Main {
    public static void main(String[] args) {
        var dog = 8.0;
        var cat = 3.6;
        var paper = 763789;
        System.out.println(dog);
        System.out.println(cat);
        System.out.println(paper);

        var result1 = dog + 4;
        var result2 = cat + 4;
        var result3 = paper + 4;
        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);

        var result4 = dog - 3.5;
        var result5 = cat - 1.6;
        var result6 = paper - 7639;
        System.out.println(result4);
        System.out.println(result5);
        System.out.println(result6);

        var friend = 19;
        var result7 = friend + 2;
        var result8 = friend / 7;
        System.out.println(friend);
        System.out.println(result7);
        System.out.println(result8);

        var frog = 3.5;
        var result9 = frog * 10;
        var result10 = frog / 3.5;
        var result11 = result10 + 4;
        System.out.println(frog);
        System.out.println(result9);
        System.out.println(result10);
        System.out.println(result11);

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
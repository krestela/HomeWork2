public class DZ2 {
    public static void main(String[] args) {
        System.out.println("1 задание");
        int age = 18;
        if (age >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {System.out.println("Возраст совершеннолетия ещё не наступил, нужно немного подождать");}

        System.out.println("2 задание");
        int years = 24;
        if (7 >= years) {
            System.out.println("Ребенок ходит в школу");
        }
        else {System.out.println("Ребенок не ходит в школу");}
        if (18 >= years) {
            System.out.println("Ребенок закончил школу");
        }
        else {System.out.println("Ребенок ходит в школу или окончил университет");}
        if (years >= 24) {
            System.out.println("Человек окончил университет и ему пора искать первую работу");


    }
        else {System.out.println("Ребенок ходит в школуили в университет");}

        System.out.println("3 задание");
        int quantityPlace = 102;
        int quantitySeats = 60;
        int quantityStandingPlace = 42;
        int placeSeats = 55;
        int placeStand = 42;
        int summaSeats = placeSeats + placeStand;
        if (placeSeats < quantitySeats) {
            System.out.println("Есть свободные сидячие места");
        }
        else {System.out.println("Нет свободных сидячих мест");

        }
        if (placeStand < quantityStandingPlace) {
            System.out.println("Есть свободные стоячие места");

        }
        else {System.out.println("Нет свободных стоячих мест");
        }
        if (summaSeats < quantityPlace){
            System.out.println("Есть свободные места");}
        else{System.out.println("Нет свободных мест");}
    }
}

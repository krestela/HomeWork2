public class DZ3 {public static void main(String[] args){
    System.out.println("1 задание");
    int age = 23;
    if (age>=2 && age<=6)
    {System.out.println("Если возраст человека равен "  +age+ " то ему нужно ходить в детский сад");}
    else if (age >=7 && age<18)
    {System.out.println("Если возраст человека равен "  +age+ " то ему нужно ходить в школу");}
    else if (age >=18 && age<24)
    {System.out.println("Если возраст человека равен "  +age+ " то ему нужно ходить в университет");}
    else if (age >=24)
    {System.out.println("Если возраст человека равен "  +age+ " то ему нужно ходить на работу");}

    System.out.println("2 задание");
    int oldChildren = 15;
    if (oldChildren<=5)
    {System.out.println("Если возраст ребенка равен "  +oldChildren+ " то ему нельзя кататься на аттракционе");}
    else if (oldChildren >=5 && oldChildren<=14)
    {System.out.println("Если возраст ребенка равен "  +oldChildren+ " то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя.");}
    else if (oldChildren >14)
    {System.out.println("Если возраст человека равен "  +oldChildren+ " то он может кататься на аттракционе без сопровождении взрослого");}

    System.out.println("3 задание");
    int one = 15;
    int two = 0;
    int free = 650;
    if (one >= two) {
        if (one > free) {
            System.out.println("Максимальное число " + one);
        } else if (free > one) {
            System.out.println("Максимальное число " + free);
        } else {
            System.out.println("Числа равны ");
        }

    }

}
}


/* 
Трикотаж
*/

public class Solution {
    public static void main(String[] args) {
        //напишите тут ваш код
        Cat cat1 = new Cat();
        cat1.name = "1111";
        cat1.age = 11;
        cat1.weight = 111;
        cat1.strength = 1111;
        
        Cat cat2 = new Cat();
        cat2.name = "2222"
        cat2.age = 22;
        cat2.weight = 222;
        cat2.strength = 2222;
        
        Cat cat3 = new Cat();
        cat3.name = "3333";
        cat3.age = 22;
        cat3.weight = 333;
        cat3.strength = 3333;
    }

    public static class Cat {
        private String name;
        private int age;
        private int weight;
        private int strength;

        public Cat(String name, int age, int weight, int strength) {
            this.name = name;
            this.age = age;
            this.weight = weight;
            this.strength = strength;
        }
    }
}

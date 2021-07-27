public class Dog{
    private static Object Dog;
    public int size;
    public String name;

    /*constructor*/
    public Dog(int s){
        name = "";
        size = s;
    }

    public void makeNoise() {
        if(size < 20) {
            System.out.println("hideous yapping");
        } else if (size < 50) {
            System.out.println("bark!");
        } else{
            System.out.println("Aroooooo!");
        }
    }

    public static boolean isBiggestOfFourDogs(Dog[] dogs, int i){
        boolean isBiggest = true;
        for (int j =-2; j <= 2; j++){

        }
    }

    public static boolean validIndex(Dog[] dogs, int i){
        if (i < 0){
            return false;
        }
        if (i >= dogs.length){
            return false;
        }
        return true;
    }

    public static Dog[] largerThanFourNeighbors(Dog[] dogs){
        Dog[] returnDogs = new Dog[dogs.length];
        int cnt = 0;

        for (int i = 0; i < dogs.length; i++){
            returnDogs[cnt] = dogs[i];
            cnt++;
        }
        return dogs;
    }

    public static void main(String[] args) {
        Dog[] dogs = new Dog[]{
                new Dog(10),
                new Dog(15),
                new Dog(20),
                new Dog(15),
                new Dog(10),
                new Dog(5),
                new Dog(10),
                new Dog(15),
                new Dog(22),
                new Dog(15),
                new Dog(20),
        };

        System.out.println(largerThanFourNeighbors(dogs));
    }
}

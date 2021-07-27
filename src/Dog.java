public class Dog{
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
    public static void Barky(){
        System.out.println("Woof Woof!");
    }

    public static Dog[] largerThanFourNeighbors(Dog[] dogs){

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
    }
}

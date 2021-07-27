public class DogExamples {
    public static void main(String[] args) {
        Dog maya = new Dog(67);
        Dog humphrey = new Dog(69);
        maya.size = 15;
        System.out.printf("%d\n", maya.size);
        maya.makeNoise();
        maya.name = "Maya";
        System.out.printf("%s\n", maya.name);
        Dog[] someDogs = new Dog[2];
        someDogs[0] = new Dog(90);
        someDogs[1] = new Dog(15);
        Dog.Barky();
        someDogs[0].makeNoise();
        System.out.printf("%s", maxDog(humphrey, maya));
    }

    public static Dog maxDog(Dog d1, Dog d2){
        if (d1.size > d2.size){
            return d1;
        }
        else{
            return d2;
        }

    }
}

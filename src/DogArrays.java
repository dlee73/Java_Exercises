public class DogArrays {
    public static void main(String[] args) {
        Dog[] dogList;

        dogList = new Dog[5];

        for (int i = 0; i < 5; i++){
            dogList[i] = new Dog(i + 5);
            dogList[i].name = "Fido";
        }
    }
}

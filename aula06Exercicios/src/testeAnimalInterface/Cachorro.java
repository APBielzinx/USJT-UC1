package testeAnimalInterface;

public class Cachorro implements Animal{
    public void fazerSom(){
        System.out.println("au au");
    }


    public void mover() {
        System.out.println("O cachorro está correndo");
    }
}

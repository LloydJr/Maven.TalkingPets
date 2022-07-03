package io.zipcoder.polymorphism;
import java.util.Scanner;

public class MainApplication {
    public static void main(String[]arg) {
    Scanner scanner = new Scanner(System.in);
    Integer amount = numberOfPets(scanner);
    Pet[] pets = typeNamePet(scanner, amount);
//    System.out.println(petSpeak(pets));
    }
    public static String petList(Integer numberOfPets, String[] typePet, String[] typeNamePet){
        String list = "";
        for (Integer i = 0; i < numberOfPets; i++)
            list += String.format("%s %s \n", typePet[i], typeNamePet[i]);
        return list;
}
    private static String stringPetType (Pet pets) {
        if (pets instanceof Cat) {
            return "cat";
        } else if (pets instanceof Dog) {
            return "dog";
        }
        return null;
    }


    private static Integer numberOfPets(Scanner scanner){
        System.out.println("How many pets do you own? ");
        return scanner.nextInt();
    }
    private String typeAndNamePet(Scanner scanner, Integer amount){

        String[] typePet = new String[amount];
        String[] namePet = new String[amount];

        for(Integer i = 0; i < amount; i++){
            System.out.println("What kind of pet do you have? ");
            typePet[i] = scanner.next();
            System.out.println("What is the name of your pet? ");
            namePet[i] = scanner.next();
        }
        return petList(amount, typePet, namePet);
    }
    private static Pet[] typeNamePet(Scanner scanner, Integer amount) {
//        String[] typePet = new String[amount];
//        String[] namePet = new String[amount];
        Pet[] numberOfPets = new Pet[amount];

        for ( Integer i = 0; i < amount; i++) {
            System.out.println("What kind of pet is it? ");
            Pet pet = makePet(scanner.next());
            System.out.println("What is the name ouf your pet? ");
            pet.setName(scanner.next());
            numberOfPets[i] = pet;
        }
        return numberOfPets;
    }
    private static Pet makePet(String typePet) {
        if (typePet.equals("dog")) {
            return new Dog();
        }else if (typePet.equals("cat")){
            return new Cat();
        } else{
            return null;
        }
    }

//    public static String petSpeak(Pet[] pets){
//        String result = "";
//        for(Pet pet : pets){
//            result += String.format("%s the %s says\n\t%s\n");
//            pet.getName(), stringPetType(pets), pet.speak();
//        }
//        return result.substring(0, result.length() -1);
//    }

}

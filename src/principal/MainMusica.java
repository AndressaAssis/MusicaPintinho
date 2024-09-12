package principal;

import java.util.ArrayList;
import java.util.List;

import classes.Animais;
import classes.Cachorro;
import classes.Galinha;
import classes.Galo;
import classes.Gato;
import classes.Pintinho;

public class MainMusica extends Animais {

	public static void main(String[] args) {
		String inicio = "Lá em casa tinha um";
			
		List<Animais> animais = new ArrayList<>();
        animais.add(new Pintinho()); 
        animais.add(new Galo()); 
        animais.add(new Galinha());
        animais.add(new Cachorro());
        animais.add(new Gato());
       
        for (int i = 0; i < animais.size(); i++) {
        	Animais AnimalAtual = animais.get(i);
       
        System.out.println(inicio + " " + AnimalAtual.getAnimal().toLowerCase());
        System.out.println(inicio + " " + AnimalAtual.getAnimal().toLowerCase());
        
        
        for (int j = i; j >= 0; j--) {
            Animais animal = animais.get(j);

            if (animal.getAnimal().toLowerCase().equals("pintinho")) {
               for (int k = 0; k < 5; k++) {
                   System.out.println("E o " + animal.getAnimal().toLowerCase() + " "+ animal.getSom());
                }
              } else {
                System.out.println("E o " + animal.getAnimal().toLowerCase() + " "+ animal.getSom());
            }
            System.out.println(); 
           }
        }
	}
}

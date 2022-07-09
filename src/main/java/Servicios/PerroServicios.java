package Servicios;

import Animal.Perro;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class PerroServicios {

  //Creo la lista de objetos Perro
  private final ArrayList<Perro> newList;
  private final Scanner read;

  //Creo un constructor para instanciar las dos variables creadas previamente. Así quedarán encapsuladas
  //y sólo se habilitará el flujo de datos cuando sea llamado este método.
  public PerroServicios() {
    this.newList = new ArrayList<>();
    this.read = new Scanner(System.in).useDelimiter("\n");
  }

  public void cargarPerro() {
    System.out.println("Ingrese la raza del perro");
    String newRace = read.next().toUpperCase();
    newList.add(new Perro(newRace));
  }

  public void printRace() {
    for (Perro unitaryDog : newList) {
      System.out.println(unitaryDog.toString());
    }
  }


  public void deleteRace(String dogRace) {
    newList.removeIf(perro -> perro.getRaza().equals(dogRace));
  }
}

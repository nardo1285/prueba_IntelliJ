package Main;

import Servicios.PerroServicios;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {

    Scanner read = new Scanner(System.in).useDelimiter("\n");

    PerroServicios newDogService = new PerroServicios();

    //A partir de aquí empieza la interfaz con el usuario
    //Primero consulta la cantidad de razas a cargar
    System.out.println(
        "Sistema para la carga de razas de perros" + "\n" + "¿Cuantas razas desea agregar?");
    byte qtty = read.nextByte();

    //Luego irá cargando una a una las razas.
    for (int i = 0; i < qtty; i++) {
      System.out.println("Raza de perro " + (i + 1) + " de " + qtty);
      newDogService.cargarPerro();
    }
    System.out.println("Razas cargadas!");

    //Una vez cargada, preguntará si se desea mostrar el listado o eliminar alguna del mismo
    System.out.println("---- ELIJA LA OPCIÓN QUE DESEE----");
    System.out.println("1 - Imprimir listado de razas" + "\n" +
        "2 - Eliminar alguna raza" + "\n" + "3 - Fin programa.");

    switch (read.nextByte()) {
      case 1:
        newDogService.printRace();
        break;
      case 2:
        System.out.println(
            "-> Del siguiente listado de razas " + "\n");
        newDogService.printRace();
        System.out.println("escriba a continuación cuál quiere eliminar: ");
        String race = read.next().toUpperCase();
        newDogService.deleteRace(race);
        System.out.println("\n" + "Raza " + race + " eliminada con éxito");
        break;
      default:
        break;
    }


  }
}

/*Elaborar una aplicación con clases, funciones y constructores para 
hallar el valor el bruto, el descuento y el valor neto a pagar
por un cliente si los datos de entrada son la cantidad de películas 
y el valor por película prestada en una tienda de video, el descuento 
se calcula dependiendo de la cantidad de películas prestadas así: 
es del 10% sobre el valor bruto si llevo 5 o más películas y no se 
le da descuento si lleva menos de 5 películas. Hacer el programa 
principal correspondiente para instanciar la clase y mostrar su funcionamiento.
Nota: hacer una función para cada tarea (hallar valor bruto, descuento y valor neto).
*/
package tiendavideo;

import java.util.Scanner;

public class TiendaVideo {

    public static void main(String[] args) {
        
        int valorPelicula=5000;
        System.out.println("El valor actual del prestamo de cada pelicula es: "+ valorPelicula);
        System.out.println("Cuantas peliculas va a llevar?");
        int CantPeliculas=new Scanner(System.in).nextInt();
        Operaciones objOperaciones = new Operaciones(CantPeliculas);
        System.out.println("El total de tu compra es de: " + objOperaciones.ValorBruto());
        System.out.println("Con un descuento de: "+objOperaciones.Descuento());
        System.out.println("Siendo un total de: "+objOperaciones.ValorNeto());
        
    }
    
}

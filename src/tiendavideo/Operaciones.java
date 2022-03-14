
package tiendavideo;

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
public class Operaciones {

    //el valor el bruto, el descuento y el valor neto a pagar
    int CantPeliculas;

    public Operaciones(int CantPeliculas) {
        this.CantPeliculas = CantPeliculas;
    }

    public int ValorBruto() {
        int valorBruto, valorPelicula = 5000;
        valorBruto = valorPelicula * this.CantPeliculas;
        return valorBruto;
    }

    public int Descuento() {
        int descuento;
        if (this.CantPeliculas >= 5) {
            descuento = (ValorBruto() * 10) / 100;                        
        }
        else 
        {
        descuento=0;        
        }
        return descuento;
    }
  
    public int ValorNeto() {
            int valorNeto;
            valorNeto = ValorBruto()-Descuento();
            return valorNeto;
        }
    }
        


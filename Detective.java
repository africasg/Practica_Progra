import java.util.ArrayList;
import java.util.List;

public class Detective extends Personajes {
    private List<Objeto> inventario;
    public Detective(String nombre, String imagen, String descripcion) {
        super(nombre="Allyson Jayce", imagen, descripcion="Detective");
           this.inventario = new ArrayList<>();
    }
    //METODOS:

    public void cogerObjeto(Objeto objeto) {
        // Añadir el objeto al inventario
        inventario.add(objeto);
        System.out.println(getNombre() + " ha cogido " + objeto.getNombreobj());
    }
}



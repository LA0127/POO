public class Principal{
    public static void main(String[] args){
        Proveedores cost = new Proveedores("La Cumbre Escarlata", "Nancy Holder", "12345-B", "Terror, Ficcion gotica, Literatura fantastica.", 5, 500);
        
        Proveedores costdos = new Proveedores("Escarlata", "Nancy ", "1234555-B", "Terror, Literatura fantastica.", 7, 600);
        cost.mostrarProveedores();
        costdos.mostrarProveedoresDos();

    }
}
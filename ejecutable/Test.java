package ejecutable;

import javax.swing.JOptionPane;
import modelo.Circulo;
import modelo.Rectangulo;

public class Test {
    //Metodo principal
    public static void main(String[] args) 
    {
        //Entrada de datos
        double radio = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor para el radio del circulo: "));
        double base = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor para la base del rectangulo: "));
        double altura = Double.parseDouble(JOptionPane.showInputDialog("Digite el valor para la altura del rectangulo: "));


        //Creacion de un objeto Circulo 
        Circulo miCirculo = new Circulo(0,0, radio);
        miCirculo.calcularAreaPerimetro();
        JOptionPane.showMessageDialog(null,"El area del circulo es :"+ miCirculo.mostrarArea() + " y su perimetro es :" + miCirculo.mostrarPerimetro());

        //Creacion de un objeto Circulo 
        Rectangulo miRectangulo = new Rectangulo(0,0,base, altura );
        miRectangulo.calcularAreaPerimetro();
        JOptionPane.showMessageDialog(null,"El area del rectangulo es :"+ miRectangulo.mostrarArea() + " y su perimetro es :" + miRectangulo.mostrarPerimetro());

          
    }
    
}

package modelo;

public class Circulo  extends Figura{

    private double radio;

    //Constructor
    public Circulo(double area, double perimetro , double radio)
    {
        super(area,perimetro);
        this.radio = radio;
    }

    //Metodos
    public void calcularAreaPerimetro()
    {
        area = Math.PI *radio * radio;
        perimetro = Math.PI * radio + radio;
    }
}
    


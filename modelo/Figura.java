package modelo;

public class Figura
{
    //Atributos
    protected double perimetro;
    protected double area;
    protected double resultado;

    //Constructor
    public Figura(double perimetro, double area)
    {
        this.perimetro = perimetro;
        this.area = area;
    }

    //Metodos
    public double mostrarArea()
    {
        return area;
    }

    public double mostrarPerimetro()
    {
        return perimetro;
    }

}
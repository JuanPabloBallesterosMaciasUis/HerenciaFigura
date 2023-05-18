package modelo;

public class Rectangulo extends Figura{

    private double base;
    private double altura;
    

    //Constructor
    public Rectangulo(double area, double perimetro, double base, double altura)
    {
        super(area,perimetro);
        this.base = base;
        this.altura = altura;
    }

    //Metodos
    public void calcularAreaPerimetro()
    {
        area = base * altura;
        perimetro = base + base  + altura + altura;
    }

    
    
}

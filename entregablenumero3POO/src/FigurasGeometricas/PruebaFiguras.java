package FigurasGeometricas;

public class PruebaFiguras {
    /**
     * Método main que crea un círculo, un rectángulo, un cuadrado y
     * un triángulo rectángulo. Para cada uno de estas figuras geométricas,
     * se calcula su área y perímetro.
     */
    public static void main(String[] args) {
        Circulo miCirculo = new Circulo(3);
        Rectangulo miRectangulo = new Rectangulo(1, 2);
        Cuadrado miCuadrado = new Cuadrado(3);
        TrianguloRectangulo miTrianguloRectangulo = new TrianguloRectangulo(3, 5);
        Rombo miRombo = new Rombo(5,8,4);
        Trapecio miTrapecio = new Trapecio(16,12,8);

        System.out.println("El área del círculo es = " + miCirculo.getArea());
        System.out.println("El perímetro del círculo es = " + miCirculo.getPerimetro());
        System.out.println();
        System.out.println("El área del rectángulo es = " + miRectangulo.getArea());
        System.out.println("El perímetro del rectángulo es = " + miRectangulo.getPerimetro());
        System.out.println();
        System.out.println("El área del cuadrado es = " + miCuadrado.getArea());
        System.out.println("El perímetro del cuadrado es = " + miCuadrado.getPerimetro());
        System.out.println();
        System.out.println("El área del triángulo es = " + miTrianguloRectangulo.getArea());
        System.out.println("El perímetro del triángulo es = " + miTrianguloRectangulo.getPerimetro());
        miTrianguloRectangulo.determinarTipoTriangulo();
        System.out.println();
        System.out.println("El área del rombo es = " + miRombo.getArea());
        System.out.println("El perímetro del rombo es = " + miRombo.getPerimetro());
        System.out.println();
        System.out.println("El área de mi trapecio es = " + miTrapecio.getArea());
        System.out.println("El perímetro de mi trapecio es = " + miTrapecio.getPerimetro());
    }
}


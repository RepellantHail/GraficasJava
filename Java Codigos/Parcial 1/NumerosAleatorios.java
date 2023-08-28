public class NumerosAleatorios {
    public static void main(String[] args){
        double num1 = Math.random();
        double num2 = Math.random();
        System.out.println("Número 1: " + num1);
        System.out.println("Número 2: " + num2);
        double numMayor = Math.max(num1,num2);
        System.out.println("El número mayor es: " + numMayor);
    }
}

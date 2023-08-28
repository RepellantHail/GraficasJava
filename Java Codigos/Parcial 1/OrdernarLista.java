import java.util.Arrays;

public class OrdernarLista {
    public static void main(String[] args){
        if (args.length == 0) {
            System.out.println("Debe proporcionar al menos un número como argumento");
            return;
        }
        double[] numeros = new double[args.length];
        for (int i = 0; i < args.length; i++) {
            try {
                numeros[i] = Double.parseDouble(args[i]);
            } catch (NumberFormatException e) {
                System.out.println("El argumento " + args[i] + " no es un número válido.");
                return;
            }
        }      
        Arrays.sort(numeros);
        System.out.println("Lista de números aleatorios ordenada:");
        for (double numero : numeros) 
            System.out.println(numero);
    }
}

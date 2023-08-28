public class Subcadenas {
    public static void main(String[] args){
        if (args.length == 0) {
            System.out.println("Debe proporcionar una cadena");
            return;
        }
        String cadena = args[0];
        for(int i = cadena.length(); i > 0; i--){
            String subString = cadena.substring(0, i);
            System.out.println(subString);
        }
        for(int i = 1; i <= cadena.length(); i++){
            String subString = cadena.substring(cadena.length()-i, cadena.length());
            System.out.println(subString);
        }
    }
}

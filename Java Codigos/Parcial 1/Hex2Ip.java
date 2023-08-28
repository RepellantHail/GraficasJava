import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Hex2Ip{
    public static void main(String[] args){
        if (args.length != 2) {
            System.out.println("Proporcione argumentos necesarios");
            return;
        }
        String tipo = args[0];
        String direccion = args[1];
        String octetos[] = direccion.split("\\.");

        Pattern ipPattern = Pattern.compile("^\\d{1,3}(\\.\\d{1,3}){3}$");
        Pattern hexPattern = Pattern.compile("^[0-9A-Fa-f]+$");

        Matcher ipMatcher = ipPattern.matcher(direccion);
        Matcher hexMatcher = hexPattern.matcher(direccion);

        if("-hex".equals(tipo) && hexMatcher.matches() && convertirHex(direccion)){
            System.out.println("Hex: "+ direccion);
        }  else if ("-ip".equals(tipo) && ipMatcher.matches() && convertirIp(octetos)) {
            System.out.println("IP Address: " + direccion);
        } else {
            System.out.println("Direccion Invalida");
        }
    }

    public static boolean convertirHex(String hexIp){
        boolean flag = true;
        String octetString = "";
        
        for (int i = 0; i < hexIp.length(); i += 2) {
            String hexOctet = hexIp.substring(i, i + 2);
            int decimalValue = Integer.parseInt(hexOctet, 16);
            octetString += decimalValue;
            octetString += ".";
        }
        if(flag){
            System.out.println("Conversion :" + octetString);
        }
        return flag;
    }
    
    public static boolean convertirIp(String octetos[]){
        boolean flag = true;
        String hexIp = "";
        for(String octeto: octetos){
            String hexOcteto = "";
            int octetoInt = Integer.parseInt(octeto);
            if(!(octetoInt >= 0 && octetoInt <= 255))
                flag = false;
            hexOcteto += Integer.toHexString(octetoInt).toUpperCase();
            if(hexOcteto.length() == 1)
                hexOcteto = "0" + hexOcteto;
            hexIp += hexOcteto;
        }
        if(flag){
            System.out.println("Conversion :"+hexIp);
        }
        return flag;
    }
}

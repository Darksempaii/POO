package ITCV_Biblioteca;

import com.sun.org.apache.xml.internal.security.utils.Base64;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
//import javax.swing.JOptionPane;

public class Security_Module {
    private String LLAVE = "";
    public String encriptada = "";
    public String aEnccriptar = "";

    public Security_Module() {

    }
    
    public void Login(){
    }

    // Clave de encriptación / desencriptación
    public SecretKeySpec CrearCalve(String llave) {
        try {
            byte[] cadena = llave.getBytes("UTF-8");
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            cadena = md.digest(cadena);
            cadena = Arrays.copyOf(cadena, 16);
            SecretKeySpec secretKeySpec = new SecretKeySpec(cadena, "AES");
            return secretKeySpec;
        } catch (Exception e) {
            return null;
        }

    }

    // Encriptar
    public String Encriptar(String encriptar) {
        try {
            SecretKeySpec secretKeySpec = CrearCalve(LLAVE);
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);

            byte[] cadena = encriptar.getBytes("UTF-8");
            byte[] encriptada = cipher.doFinal(cadena);
            String cadena_encriptada = Base64.encode(encriptada);
            return cadena_encriptada;

        } catch (Exception e) {
            return "a ocurrido un error en el modulo de seguridad: Encritar";
        }
    }

    // Des-encriptación
    public String Desencriptar(String desencriptar) {
        try {
            SecretKeySpec secretKeySpec = CrearCalve(LLAVE);
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);

            byte[] cadena = Base64.decode(desencriptar);
            byte[] desencriptacioon = cipher.doFinal(cadena);
            String cadena_desencriptada = new String(desencriptacioon);
            return cadena_desencriptada;

        } catch (Exception e) {
            return "a ocurrido un error en el modulo de seguridad: Desencritar";
        }

    }

}

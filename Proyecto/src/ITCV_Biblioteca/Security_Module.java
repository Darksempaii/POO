package ITCV_Biblioteca;

import com.sun.org.apache.xml.internal.security.utils.Base64;
import java.security.MessageDigest;
import java.util.Arrays;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import javax.swing.JOptionPane;

public class Security_Module {

    private String LLAVE = "";
    public String encriptada = "";
    public String aEnccriptar = "";
    public String cadena_encriptada = "";
    public String cadena_desencriptada = "";
    
    public Security_Module() {

    }

    //Inicio de Sesion
    public void Login() {
        //Numero de Control
        int NUser = 659831;
        int user = 1;
        while (user != NUser) {
            try {
                user = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte su Numero de control", "Login", JOptionPane.DEFAULT_OPTION));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "solo se permite ingresar numeros por faver intente de nuevo", "Login", JOptionPane.ERROR_MESSAGE);
            }
            if (user != NUser) {
                JOptionPane.showMessageDialog(null, "El numero de control ingresado no existe.\nPor favor prueve con otro", "Login", JOptionPane.WARNING_MESSAGE);
            }
        }
        
        //NIP
        int NIP = 8560;
        int pass = 1;
        while (pass != NIP) {
            try {
                pass = Integer.parseInt(JOptionPane.showInputDialog(null, "Inserte su NIP", "Login", JOptionPane.DEFAULT_OPTION));
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "solo se permite ingresar numeros por faver intente de nuevo", "Login", JOptionPane.ERROR_MESSAGE);
            }

            if (pass == NIP) {
                this.LLAVE = "6855968031";
            }
            if (pass != NIP) {
                JOptionPane.showMessageDialog(null, "El numero de control ingresado no existe.\nPor favor prueve con otro", "Login", JOptionPane.WARNING_MESSAGE);
            }
        }
        JOptionPane.showMessageDialog(null, "La contraseña es correcta, Acceso permitido", "Login", JOptionPane.INFORMATION_MESSAGE);
        Visor vista = new Visor();
        LibrosDAO modelo = new LibrosDAO();
        Controlador controlador = new Controlador(vista, modelo);
    }
//Codigo huerfano///////////////////////////////////////////////////////////////////////////////////////////////
    // Clave de encriptación / desencriptación
    public SecretKeySpec CrearCalve(String llave) {
        try {
            byte[] cadena = llave.getBytes("UTF-8");
            MessageDigest md = MessageDigest.getInstance("SHA-1");
            cadena = md.digest(cadena);
            cadena = Arrays.copyOf(cadena, 16);
            SecretKeySpec secretKeySpec = new SecretKeySpec(cadena, "AES");
            System.out.println(secretKeySpec);
            return secretKeySpec;
        } catch (Exception e) {
            return null;
        }

    }

    // Encriptar
    public void Encriptar(String encriptar) {
        try {
            SecretKeySpec secretKeySpec = CrearCalve(LLAVE);
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.ENCRYPT_MODE, secretKeySpec);

            byte[] cadena = encriptar.getBytes("UTF-8");
            byte[] encriptada = cipher.doFinal(cadena);
            cadena_encriptada = Base64.encode(encriptada);
//            return cadena_encriptada;

        } catch (Exception e) {
//            return "a ocurrido un error en el modulo de seguridad: Encritar";
        }
    }

    // Des-encriptación
    public void Desencriptar(String desencriptar) {
        try {
            SecretKeySpec secretKeySpec = CrearCalve(LLAVE);
            Cipher cipher = Cipher.getInstance("AES");
            cipher.init(Cipher.DECRYPT_MODE, secretKeySpec);

            byte[] cadena = Base64.decode(desencriptar);
            byte[] desencriptacioon = cipher.doFinal(cadena);
            String cadena_desencriptada = new String(desencriptacioon);
//            return cadena_desencriptada;

        } catch (Exception e) {
//            return "a ocurrido un error en el modulo de seguridad: Desencritar";
        }

    }

    public String getCadena_encriptada() {
        return cadena_encriptada;
    }

    public String getCadena_desencriptada() {
        return cadena_desencriptada;
    }
}

import uade.edu.ar.controller.Controller;
import uade.edu.ar.model.Usuario;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {

    public static void main(String[] args) throws FileNotFoundException {
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        Date date = new Date();
        System.out.println(formatter.format(date));
        //try {
        //    Controller controller = Controller.getInstances();
        //} catch (Exception e) {
        //    e.printStackTrace();
        //}
    }
}

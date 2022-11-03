import uade.edu.ar.controller.Controller;
import uade.edu.ar.controller.ControllerPaciente;
import uade.edu.ar.model.Usuario;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.text.SimpleDateFormat;
import java.util.Date;

public class App {

    public static void main(String[] args) throws FileNotFoundException {
        ControllerPaciente cont = null;
        try {
            cont = ControllerPaciente.getInstances();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        //cont.crearPaciente(123,"test","123412","asd@das.com",14);
        //cont.eliminarPaciente(1);
        cont.editarPaciente(1,12345,"asd","ree 213","reeemplazo@sad.com",123);
    }
}

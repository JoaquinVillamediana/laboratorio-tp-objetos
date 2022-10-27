package uade.edu.ar.controller;

import uade.edu.ar.dao.ModelDao;
import uade.edu.ar.dao.PacienteDao;
import uade.edu.ar.dto.ModelDto;
import uade.edu.ar.model.Model;
import uade.edu.ar.model.Paciente;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ControllerPaciente {

    private static ControllerPaciente CONTROLLER = null;

    private static PacienteDao pacienteDao;

    private static List<Paciente> pacienteList;


    private ControllerPaciente(){}

    public static synchronized ControllerPaciente getInstances() throws Exception {
        if(CONTROLLER == null) {
            CONTROLLER = new ControllerPaciente();
            pacienteDao = new PacienteDao(Paciente.class,getPathOutModel(Paciente.class.getSimpleName()));
            pacienteList = pacienteDao.getAll(Paciente.class);
        }
        return CONTROLLER;
    }

    public void eliminarPaciente( int pacienteID )
    {
        int index = getIndex(pacienteID);
        if(index != -1)
        {
            pacienteList.remove(index);
        }
        try {
            pacienteDao.delete(pacienteID);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void crearPaciente(int dni, String nombre, String domicilio, String email, int edad)
    {
        try {
            int lastId = pacienteDao.getLastInsertId();

            Paciente paciente = new Paciente(lastId + 1,dni,nombre,domicilio,email,edad);
            pacienteList.add(paciente);
            try {
                pacienteDao.save(paciente);
            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public void editarPaciente(int id, int dni, String nombre, String domicilio, String email, int edad)
    {
        try {
            Paciente paciente = pacienteDao.search(id);

            paciente.setDni(dni);
            paciente.setNombre(nombre);
            paciente.setDomicilio(domicilio);
            paciente.setEmail(email);
            paciente.setEdad(edad);

            try {
                Boolean status = pacienteDao.update(paciente);
                System.out.print(status);

            } catch (Exception e) {
                throw new RuntimeException(e);
            }

        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
    }


    //public void addModel(ModelDto dto) throws Exception {
    //    if(getByIdModel(dto.getIdModel()) == null){
    //       modelDao.save(toModel(dto));
    //    }
    //}

    //public ModelDto getByIdModel(String id) throws Exception {
    //    for (Model model: modelList) {
    //        if (model.getId().equals(id)){
    //            return toDto(model);
    //        }
    //    }
    //    return  null;
    //}

    //public void deleteByIdModel(String id){
    //    int index = getIndex(id);
    //    if(index != -1){
    //         modelList.remove(index);
    //    }
    //}

    private int getIndex(int id){
        for (int i=0;i<pacienteList.size();i++){
            if(pacienteList.get(i).getId() == id){
                return i;
            }
        }
        return -1;
    }

    //public List<ModelDto> getAll() throws Exception {
    //    List<ModelDto> dtoList = new ArrayList<>();
    //    for (Model model : modelDao.getAll(Model.class)) {
    //        dtoList.add(toDto(model));
    //    }
    //    return dtoList;
    //}

    private static String getPathOutModel(String name){
        String dir = "D:/Escritorio/Facu/POO/TPO/data";
        return  new File(dir+name+".json").getPath();
    }

    //public static Model toModel(ModelDto dto){
    //    return new Model(dto.getIdModel(),dto.getNameModel());
    //}

    //public static ModelDto toDto(Model model){
    //    return new ModelDto(model.getId(),model.getName());
    //}

}

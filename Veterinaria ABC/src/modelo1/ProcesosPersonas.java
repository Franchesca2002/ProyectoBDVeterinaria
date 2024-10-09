package modelo1.procesos;
package modelo.procesos;

import java.util.ArrayList;

import javax.swing.JOptionPane;

import DAO.*;
import VO.PersonaVo;

		public class ProcesosPersona extends ProcesosGenerales {
		    public boolean registrar (String documento, String nombre, String telefono) {
		        if (documento.length() < 1){
		            JOptionPane.showMessageDialog(null, "Se debe ingresar el documento de la persona", "Error", JOptionPane.ERROR_MESSAGE);
		            return false;
		        }
		        if (nombre.length() < 1) {
		            JOptionPane.showMessageDialog(null, "Se debe ingresar el nombre de la persona", "Error", JOptionPane.ERROR_MESSAGE);
		            return false;
		        }
		        if (telefono.length() < 1) {
		            JOptionPane.showMessageDialog(null, "Se debe ingresar el telefono de la persona", "Error", JOptionPane.ERROR_MESSAGE);
		            return false;
		        }
		        PersonaDAO personaDAO = new PersonaDAO();
		        return personaDAO.registrar(documento, nombre, telefono);
		    }
		    
		    public void actualizar (String documento, String nombre, String telefono) {
		        if (consultar(documento) != null) {
		            if (documento.length() < 1){
		                JOptionPane.showMessageDialog(null, "Se debe ingresar el documento de la persona", "Error", JOptionPane.ERROR_MESSAGE);
		                return;
		            }
		            if (nombre.length() < 1) {
		                JOptionPane.showMessageDialog(null, "Se debe ingresar el nombre de la persona", "Error", JOptionPane.ERROR_MESSAGE);
		                return;
		            }
		            if (telefono.length() < 1) {
		                JOptionPane.showMessageDialog(null, "Se debe ingresar el telefono de la persona", "Error", JOptionPane.ERROR_MESSAGE);
		                return;
		            }
		            PersonaDAO personaDAO = new PersonaDAO();
		            personaDAO.actualizar(documento, nombre, telefono);
		        } else {
		            JOptionPane.showMessageDialog(null, "La persona no está registrada", "Error", JOptionPane.ERROR_MESSAGE);
		        }
		    }
		    
		    public ArrayList<PersonaVo> listarPersonas() {
		        PersonaDAO personaDAO = new PersonaDAO();
		        return personaDAO.listar();
		    }
		    
		    public PersonaVo consultar(String documento) {
		        if (documento.length() < 1) {
		            JOptionPane.showMessageDialog(null, "Se debe ingresar el documento de la persona", "Error", JOptionPane.ERROR_MESSAGE);
		            return null;
		        }
		        PersonaDAO personaDAO = new PersonaDAO();
		        return personaDAO.consultar(documento);
		    }
		    
		    public PersonaVo consultar(String documento, boolean mensaje) {
		        if (mensaje && documento.length() < 1) {
		            JOptionPane.showMessageDialog(null, "Se debe ingresar el documento de la persona", "Error", JOptionPane.ERROR_MESSAGE);
		            return null;
		        }
		        PersonaDAO personaDAO = new PersonaDAO();
		        return personaDao.consultar(documento);
		    }
		    
		    public boolean eliminarPersona(String documento) {
		        if (documento.length() < 1) {
		            return false;
		        }
		        PersonaDAO personaDAO = new PersonaDAO();
		        return personaDao.eliminar(documento);
		    }
		}
	}

}

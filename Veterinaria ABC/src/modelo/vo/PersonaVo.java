package VO;

public class PersonaVo {
    private String documento;
    private String nombre;
    private String telefono;

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    public String toString() {
        return "documento=" + documento + ", nombre=" + nombre + ", telefono=" + telefono;
    }
}

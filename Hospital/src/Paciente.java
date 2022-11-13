public class Paciente 
{
    
	private static int numpaciente =0;
    private int id;
    private String nombre;

    public Paciente(String nombre)
    {
        this.nombre = nombre;
        numpaciente++;
        this.id = numpaciente;
    }
    
    public String toString(){
        return id +":"+nombre;
    }    

    public int getId(){
        return id;
    }    
    
    public String getNombre() {
		return nombre;
	}

}
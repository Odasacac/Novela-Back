package CCASolutions.modelos;

import java.io.Serializable;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="personaje")
public class PersonajeModelo implements Serializable
{

	private static final long serialVersionUID = 2295713737690829300L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nombre;
	private int miedo;
	private int olvido;
	private int suerte;
	private int nivelDeMiedo;
	private int nivelDeTranquilidad;
	private int impactos;
	private boolean master;
	private int capitulo;
	private int exploracion;
	
	
	public Long getId() 
	{
		return id;
	}
	
	public void setId(Long id) 
	{
		this.id = id;
	}
	
	public String getNombre() 
	{
		return nombre;
	}
	
	public void setNombre(String nombre) 
	{
		this.nombre = nombre;
	}
	public int getMiedo() {
		return miedo;
	}
	
	public void setMiedo(int miedo) 
	{
		this.miedo = miedo;
	}
	
	public int getOlvido() 
	{
		return olvido;
	}
	
	public void setOlvido(int olvido) 
	{
		this.olvido = olvido;
	}
	
	public int getSuerte() 
	{
		return suerte;
	}
	
	public void setSuerte(int suerte) 
	{
		this.suerte = suerte;
	}
	
	public int getNivelDeMiedo() 
	{
		return nivelDeMiedo;
	}
	
	public void setNivelDeMiedo(int nivelDeMiedo) 
	{
		this.nivelDeMiedo = nivelDeMiedo;
	}
	
	public int getNivelDeTranquilidad() 
	{
		return nivelDeTranquilidad;
	}
	
	public void setNivelDeTranquilidad(int nivelDeTranquilidad) 
	{
		this.nivelDeTranquilidad = nivelDeTranquilidad;
	}
	
	public int getImpactos() 
	{
		return impactos;
	}
	
	public void setImpactos(int impactos) 
	{
		this.impactos = impactos;
	}
	
	public boolean isMaster() 
	{
		return master;
	}
	
	public void setMaster(boolean master) 
	{
		this.master = master;
	}
	
	public int getCapitulo() 
	{
		return capitulo;
	}
	
	public void setCapitulo(int capitulo) 
	{
		this.capitulo = capitulo;
	}
	
	public int getExploracion() 
	{
		return exploracion;
	}
	
	public void setExploracion(int exploracion)
	{
		this.exploracion = exploracion;
	}
	
	public static long getSerialversionuid() 
	{
		return serialVersionUID;
	}
    
	
    
	
}

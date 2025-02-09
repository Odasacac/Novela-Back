package CCASolutions.servicios;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import CCASolutions.dao.IPersonajesDao;
import CCASolutions.modelos.PersonajeModelo;
import CCASolutions.others.IFuncionesUtiles;
import CCASolutions.respuestas.RespuestaPersonajes;

@Service
public class PersonajesServicios implements IPersonajesServicios
{
	@Autowired 
	private IPersonajesDao personajesDao;
	
	@Autowired
	private IFuncionesUtiles fU;

	



	@Override
	public ResponseEntity<RespuestaPersonajes> recuperarPersonaje(PersonajeModelo personaje) 
	{
		HttpStatus estado = HttpStatus.OK;
		RespuestaPersonajes cuerpo = new RespuestaPersonajes();
		
		try
		{
			Optional<PersonajeModelo> personajeRecuperado = personajesDao.findByNombreAndMiedo(personaje.getNombre(), personaje.getMiedo());
			
			if (personajeRecuperado.isPresent())
			{
				cuerpo.setRespuesta("Personaje recuperado con éxito.");
				
				personajeRecuperado.get().setNombre(fU.capitalizar(personajeRecuperado.get().getNombre()));
				cuerpo.setPersonaje(personajeRecuperado.get());
			}
			else
			{		
				estado = HttpStatus.NOT_FOUND;
				cuerpo.setRespuesta("Error al recuperar el personaje: Personaje no existente.");
				cuerpo.setPersonaje(null);
			}
		}
		catch (Exception e)
		{
			estado = HttpStatus.INTERNAL_SERVER_ERROR;
			cuerpo.setRespuesta("Error al recuperar personaje:" + e);
			cuerpo.setPersonaje(null);
		}
		
		
		ResponseEntity<RespuestaPersonajes> respuesta = new ResponseEntity<RespuestaPersonajes>(cuerpo, estado);
		return respuesta;
	}
	
	
	
	
	
	
	
	@Override
	public ResponseEntity<RespuestaPersonajes> guardarNuevoPersonaje(PersonajeModelo personaje) 
	{
		HttpStatus estado = HttpStatus.OK;
		RespuestaPersonajes cuerpo = new RespuestaPersonajes();
		
		personaje.setNombre(personaje.getNombre().trim().toUpperCase());
		

		personaje.setSuerte(fU.getNumeroAleatorioEntre(0, 9));
		personaje.setNivelDeMiedo(0);
		personaje.setNivelDeTranquilidad(0);
		personaje.setImpactos(0);
		personaje.setMaster(false);
		
		
		try
		{
			if(personajesDao.existsByNombreAndMiedo(personaje.getNombre(), personaje.getMiedo()))
			{
				estado = HttpStatus.BAD_REQUEST;
				cuerpo.setRespuesta("Error al guardar nuevo personaje: Personaje ya existente.");
				cuerpo.setPersonaje(null);
			}
			else
			{
				PersonajeModelo personajeGuardado = personajesDao.save(personaje);
				
				if (personajeGuardado.getId() == null)
				{
					estado = HttpStatus.INTERNAL_SERVER_ERROR;
					cuerpo.setRespuesta("Error al guardar nuevo personaje.");
					cuerpo.setPersonaje(null);
				}
				else
				{
					cuerpo.setRespuesta("Personaje guardado con éxito.");
					cuerpo.setPersonaje(null);
				}
				
			}
		}
		catch (Exception e)
		{
			estado = HttpStatus.INTERNAL_SERVER_ERROR;
			cuerpo.setRespuesta("Error al guardar nuevo personaje:" + e);
			cuerpo.setPersonaje(null);
		}
		
		
		ResponseEntity<RespuestaPersonajes> respuesta = new ResponseEntity<RespuestaPersonajes>(cuerpo, estado);
		return respuesta;
	}



}

package CCASolutions.servicios;

import org.springframework.http.ResponseEntity;

import CCASolutions.modelos.PersonajeModelo;
import CCASolutions.respuestas.RespuestaPersonajes;

public interface IPersonajesServicios 
{
	public ResponseEntity<RespuestaPersonajes> guardarNuevoPersonaje (PersonajeModelo personaje);
	
	public ResponseEntity<RespuestaPersonajes> recuperarPersonaje (PersonajeModelo personaje);
}

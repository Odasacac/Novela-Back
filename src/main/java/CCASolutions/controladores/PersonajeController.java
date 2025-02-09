package CCASolutions.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import CCASolutions.modelos.PersonajeModelo;
import CCASolutions.respuestas.RespuestaPersonajes;
import CCASolutions.servicios.IPersonajesServicios;

@CrossOrigin (origins= {"http://localhost:4200"})
@RestController
@RequestMapping("/personajes")
public class PersonajeController 
{
	@Autowired
	private IPersonajesServicios personajesServicios;
	
	@PostMapping("/guardar")
	public ResponseEntity<RespuestaPersonajes> guardarNuevoPersonaje (@RequestBody PersonajeModelo personaje)
	{
		return personajesServicios.guardarNuevoPersonaje(personaje);
	}
	
	@PostMapping("/recuperar")
	public ResponseEntity<RespuestaPersonajes> recuperarPersonaje (@RequestBody PersonajeModelo personaje)
	{
		return personajesServicios.recuperarPersonaje(personaje);
	}
	
}

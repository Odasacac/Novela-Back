package CCASolutions.others;

import java.util.Random;

import org.springframework.stereotype.Service;

@Service
public class FuncionesUtiles implements IFuncionesUtiles
{

	@Override
	public int getNumeroAleatorioEntre(int a, int b) 
	{
	    Random random = new Random();
	    int suerte = random.nextInt(b - a + 1) + a;
		return suerte;
	}

	@Override
	public String capitalizar(String cadena)
	{
		if (cadena == null || cadena.isEmpty()) 
		{
			return cadena; 
		}
	    return cadena.substring(0, 1).toUpperCase() + cadena.substring(1).toLowerCase();
	}

}

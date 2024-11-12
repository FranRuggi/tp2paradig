package hechizos;

import personajes.Personaje;

public class ExpectoPatronum implements Hechizo {
	private static final int COSTO = 30;

	@Override
	public boolean ejecutar(Personaje lanzador, Personaje objetivo) {
		if (lanzador.getNivelMagia() < COSTO)
			return false;
		lanzador.disminuirNivelMagia(COSTO);
		lanzador.recibirDaño(-25);
		return true;
	}

	@Override
	public String obtenerNombre() {
		return "ExpectoPatronum";
	}
}

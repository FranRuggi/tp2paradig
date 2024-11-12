package hechizos;

import personajes.Personaje;

public class Protego implements Hechizo {
	private static final int COSTO = 40;

	@Override
	public boolean ejecutar(Personaje lanzador, Personaje objetivo) {
		if (lanzador.getNivelMagia() < COSTO)
			return false;
		lanzador.disminuirNivelMagia(COSTO);
		lanzador.recibirDaño(-20); // Incremento de defensa
		System.out.println("Un escudo mágico protege a " + lanzador.getNombre());
		return true;
	}

	@Override
	public String obtenerNombre() {
		return "Protego";
	}
}

package hechizos;

import personajes.Personaje;

public class PetrificusTotalus implements Hechizo {
	private static final int COSTO = 60;

	@Override
	public boolean ejecutar(Personaje lanzador, Personaje objetivo) {
		if (lanzador.getNivelMagia() < COSTO)
			return false;
		lanzador.disminuirNivelMagia(COSTO);
		objetivo.petrificar(); // El personaje pierde un turno
		objetivo.recibirDaño(25);
		System.out.println(objetivo.getNombre() + " ha sido petrificado con Petrificus Totalus.");
		return true;
	}

	@Override
	public String obtenerNombre() {
		return "PetrificusTotalus";
	}
}

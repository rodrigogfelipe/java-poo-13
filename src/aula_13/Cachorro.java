package aula_13;

public class Cachorro extends Lobo {

	/*
	 * Declarando metados da Classe Cachorro. Obs: Os parametros dos metados s�o
	 * indentificados como ASSINATURAS, que por vez as variveis atributos s�o
	 * DIFERENTE, identificados como (Poliformismo de SOBRECARGA)
	 */
	public void reagiar(String frase) {
		if ((frase == "Toma comida") || (frase == "Ol�")) {
			System.out.println("Abanar e latir");
		} else {
			System.out.println("Rosnar");
		}

	}

	public void reagiar(int hora, int min) {
		if (hora < 12) {
			System.out.println("Abanar");

		} else if (hora >= 18) {
			System.out.println("Ignora");

		} else {
			System.out.println("Abanar e latir");
		}

	}

	public void reagiar(boolean dono) {
		if (dono == true) {
			System.out.println("Abanar");

		} else {
			System.out.println("Rosnar e latir");

		}

	}

	public void reagiar(int idade, float peso) {
		if (idade < 5) {
			if (peso < 10) {
				System.out.println("Abanar");
			} else {
				System.out.println("Latir");

			}
			if (peso < 10) {
				System.out.println("Rosnar");

			} else {
				System.out.println("Ignorar");
			}
		}

	}

	/* Sobrepor metados da Superclasse Lobo */
	@Override
	public void emitirSom() {
		System.out.println("Au!Au! Au!");

	}

}

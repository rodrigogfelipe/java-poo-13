package aula_13;

public class Mamifero extends Animal {

	private String corPelo;

	/* Construtor padrao */
	public Mamifero() {

	}

	/* GETTERS AND SETTERS */
	public String getCorPelo() {
		return corPelo;
	}

	public void setCorPelo(String corPelo) {
		this.corPelo = corPelo;
	}

	/*Sobrepor metados da Superclasse Animal */
	@Override
	public void emitirSom() {
		System.out.println("Som de mamifero");

	}

}


package exemplosartigo;

public class ExemploString1 {

	public String deixarMaiusculoEretirarPrimeiraLetra(String palavra) {

		palavra = palavra.toUpperCase();

		palavra = palavra.substring(1);

		return palavra;
	}
}
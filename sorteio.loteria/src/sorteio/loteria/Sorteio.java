package sorteio.loteria;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

/**
 * @author Alex
 *
 */
public class Sorteio {

	public static void main(String[] args) {

		ArrayList<Integer> lista = new ArrayList<>();

		Random numSoteado = new Random();
		
		Double valorCartão = 2.50, valorArrecadado = 10.0;
		int numerosJogos = (int)(valorArrecadado / valorCartão);
		
		int i = 0, getNumSoteado = 0, contJogos = 0;
		
		System.out.println(numerosJogos);
		
		for (int j = 0; j < numerosJogos; j++) {
			//System.out.print("Números Aleatórios: ");
			while (i < 6) {
				getNumSoteado = numSoteado.nextInt(60) + 1;

				//System.out.print(getNumSoteado + " ");

				if (!lista.contains(getNumSoteado)) {
					lista.add(getNumSoteado);
					i++;
				}
			}
			contJogos++;
			Collections.sort(lista);
			System.out.println("\nJOGO Nº " + contJogos + ": " + lista);
			System.out.println();
			i = 0;
			lista.clear();
		}

	}

}

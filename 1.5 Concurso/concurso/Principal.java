package concurso;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//Exemplo de uso de interfaces visto na 5 semana do curso de Especialização do ITA
public class Principal {

	public static void main(String[] args) {
		
		List<Candidato> lista = new ArrayList<>();
		
		lista.add(new Candidato(80, true, 30));
		lista.add(new Candidato(80, false, 25));
		lista.add(new Candidato(80, false, 28));
		lista.add(new Candidato(90, false, 20));
		
		//chamando o metodo sort da classe Collectios que utiliza o metodo Comparable
		Collections.sort(lista);
		
		//imprimir uma ArrayList
		for (Candidato c : lista) {
			System.out.println(c);
		}
	}
}

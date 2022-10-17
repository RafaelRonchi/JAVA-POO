package classes;

import java.util.ArrayList;

public class AnimalMain {

	public static void main(String[] args) {

		Gato gato1 = new Gato();
		ArrayList<Gato> listaGato = new ArrayList<>();

		gato1.setNome("Gato 1");
		gato1.setComprimento((float) 2.3);
		gato1.setCor("Branco");
		gato1.setEcossistema("Casa");
		gato1.setNumeroPatas(4);
		gato1.setRaca("Pelado");

		listaGato.add(gato1);

		Gato gato2 = new Gato();

		gato2.setNome("Gato 2");
		gato2.setComprimento((float) 3.4);
		gato2.setCor("Preto");
		gato2.setEcossistema("Rua");
		gato2.setNumeroPatas(3);
		gato2.setRaca("Viralata");

		listaGato.add(gato2);

		Gato gato3 = new Gato();

		gato3.setNome("Gato 3");
		gato3.setComprimento((float) 6.23);
		gato3.setCor("Marrom");
		gato3.setEcossistema("Hibrido");
		gato3.setNumeroPatas(4);
		gato3.setRaca("Persan");

		listaGato.add(gato3);

		Cachorro cachorro1 = new Cachorro();
		ArrayList<Cachorro> listaCachorro = new ArrayList<>();

		cachorro1.setNome("Cachorro 1");
		cachorro1.setComprimento((float) 10.3);
		cachorro1.setCor("Caramelo");
		cachorro1.setEcossistema("Casa");
		cachorro1.setNumeroPatas(4);
		cachorro1.setRaca("Viralata");

		listaCachorro.add(cachorro1);

		Cachorro cachorro2 = new Cachorro();

		cachorro2.setNome("Cachorro 2");
		cachorro2.setComprimento((float) 32.9);
		cachorro2.setCor("Amarelo");
		cachorro2.setEcossistema("Casa");
		cachorro2.setNumeroPatas(4);
		cachorro2.setRaca("Golden");

		listaCachorro.add(cachorro2);

		Cachorro cachorro3 = new Cachorro();

		cachorro3.setNome("Cachorro 3");
		cachorro3.setComprimento((float) 52.9);
		cachorro3.setCor("Marrom");
		cachorro3.setEcossistema("Rua");
		cachorro3.setNumeroPatas(3);
		cachorro3.setRaca("Chiaua");

		listaCachorro.add(cachorro3);

		for (Cachorro cachorro : listaCachorro) {
			System.out.println("Cachorro nome: " + cachorro.getNome());
			System.out.println("Cachorro core: " + cachorro.getCor());
			System.out.println("Cachorro ecossistema: " + cachorro.getEcossistema());
			System.out.println("Cachorro raça: " + cachorro.getRaca());
			System.out.println("Cachorro comprimento: " + cachorro.getComprimento());
			System.out.println("Cachorro pata: " + cachorro.getNumeroPatas());
			cachorro1.late();
			System.out.println(" ");
		}

		System.out.println(" ");

		for (Gato gato : listaGato) {
			System.out.println("Gato nome: " + gato.getNome());
			System.out.println("Gato cor: " + gato.getCor());
			System.out.println("Gato ecossistema: " + gato.getEcossistema());
			System.out.println("Gato raça: " + gato.getRaca());
			System.out.println("Gato comprimento: " + gato.getComprimento());
			System.out.println("Gato patas: " + gato.getNumeroPatas());
			gato1.mia();
			System.out.println(" ");
		}

	}

}

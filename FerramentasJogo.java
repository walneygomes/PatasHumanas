package ListaPOO;

public class FerramentasJogo implements Ferramentas {

	@Override
	public Animal[] filtraEspecie(Animal[] completo, String especie) {

		Animal[] animais = new Animal[completo.length];
		;
		for (int i = 0; i < completo.length; i++) {
			if (completo[i].getNomeEspecie().equals(especie)) {
				animais[i] = completo[i];
			}
		}

		return animais;
	}

	@Override
	public String classificaEspecies(Animal[] completo) {
		String especies = "";
		int count = 0;
		while (completo.length > count) {
			especies += " " + completo[count].getNomeEspecie() + " ";
			count++;
		}
		return especies;
	}

}

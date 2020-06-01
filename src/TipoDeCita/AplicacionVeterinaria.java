package TipoDeCita;

import Citas.Citas;

public class AplicacionVeterinaria extends Citas {

	Citas a1;

	public AplicacionVeterinaria(String type, String doctor, int year, int month, int day) {
		super(type, doctor, year, month, day);
		a1 = new Citas(type, doctor, year, month, day);
	}

	public void display() {
		super.display();

	}
}

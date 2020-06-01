package FechaDeCita;

import Citas.Citas;

public class Mensual extends Citas {
	Citas a1;

	public Mensual(String type, String doctor, int year, int month, int day) {
		super(type, doctor, year, month, day);
		a1 = new Citas(type, doctor, year, month, day);
		super.occursOn(year, month, day);

	}

	public void occursOn(int year, int month, int day) {

//		getApp();
		for (Citas test : appointments) {

			System.out.println("Fecha marcada: " + day);
			System.out.println("FechaCita: " + test.getDay());

			if (test.getDay() == day) {
				System.out.println("TIENES una cita mensual en " + getDate());

			} else {
				System.out.println("\n" + "NO tiene una cita mensual el " + getDate());
			}
		}

	}
}

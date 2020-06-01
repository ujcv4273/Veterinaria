package FechaDeCita;

import Citas.Citas;

public class Hora extends Citas {
	Citas a1;

	public Hora(String type, String doctor, int year, int month, int day) {
		super(type, doctor, year, month, day);
		a1 = new Citas(type, doctor, year, month, day);
		super.occursOn(year, month, day);

	}

	public void occursOn(int year, int month, int day) {

		for (Citas test : appointments) {

			if (test.getYear() == year && test.getMonth() == month && test.getDay() == day) {
				System.out.println("TIENES una cita por única vez el " + getDate());

			} else {
				System.out.println("NO tiene una cita única para " + getDate());
			}
		}

	}
}

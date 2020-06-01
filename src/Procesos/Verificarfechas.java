package Procesos;

import Citas.EjecutarCita;
import FechaDeCita.Mensual;
import FechaDeCita.Hora;

public class Verificarfechas extends EjecutarCita {

	private static int times = 0;

	public static void display() {

		while (isRun == true) {
			if (times == 0) {
				times++;
			}

			System.out.println("¿Qué día le gustaría verificar las citas?");

			m1 = new Mensual(type, doctor, year, month, day);
			o1 = new Hora(type, doctor, year, month, day);

			System.out.println("año: ");
			year = in.nextInt();
			System.out.println("mes: ");
			month = in.nextInt();
			System.out.println("dia: ");
			day = in.nextInt();

			checkDate();

			if (times >= 1) {
				System.out.println();
				System.out.println();

				System.out.println("¿Le gustaría consultar otra fecha para las citas?");
				System.out.println("y/n?");

				continueCreate = in.next();
				times--;
				if (continueCreate.equals("n")) {
					isRun = true;
				}
			}

		}

	}

	public static void checkDate() {

		if (frequency.equals("m")) {
			m1.occursOn(year, month, day);
		}

		if (frequency.equals("o")) {
			o1.occursOn(year, month, day);
		}
	}
}

package Citas;

import java.util.Scanner;

import FechaDeCita.Mensual;
import FechaDeCita.Hora;
import Procesos.Verificarfechas;
import Procesos.Opciones;
import Procesos.CrearCita;

public class EjecutarCita {

	public static int year;
	public static int month;
	public static int day;

	public static String type = "veterinario";
	public static String doctor = type;
	public static String frequency;
	private static int mode;

	public static int times;
	public static String continueCreate;
	public static boolean newCreate;
	public static boolean isRun;

	public static Citas a1;
	public static Mensual m1;
	public static Hora o1;

	public static Scanner in = new Scanner(System.in);

	public void program() {
		continueCreate = "y";
		isRun = false;
		newCreate = true;
		times = 0;
		while (newCreate == true) {
			while (isRun == false) {
				Opciones.display();

				mode = in.nextInt();
				isRun = true;
			}

			switch (mode) {
			case 1:

				if (continueCreate.equals("y")) {

					CrearCita.display();
					continueCreate = in.next();

				} else if (continueCreate.equals("n")) {

					isRun = false;
					continueCreate = "y";

				}
				break;

			case 2:

				if (continueCreate.equals("y")) {

					Verificarfechas.display();

				} else if (continueCreate.equals("n")) {

					isRun = false;
					times = 0;
//					continueCreate = "y";
				}

				break;
			default:
				System.out.println("ERROR: 'MODE' DEFAULT RAN");
			}
		}
		in.close();

	}
}

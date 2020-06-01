package Procesos;

import Citas.EjecutarCita;

public class CrearCita extends EjecutarCita {

	public static void createAppointment() {

	}

	public static void display() {
		appType();
		appDate();
		System.out.println("¿Te gustaría crear otra cita?");
		System.out.println("y/n?");
	}
	
	private static void appType() {
		System.out.println("¿Te gustaría programar una cita ? (m)es cita, o  (1) hora de cita?");
		frequency = in.next();
	}
	
	private static void appDate() {
		
		System.out.println("año: ");
		year = in.nextInt();
		System.out.println("mes: ");
		month = in.nextInt();
		System.out.println("dia: ");
		day = in.nextInt();
		
	}
}

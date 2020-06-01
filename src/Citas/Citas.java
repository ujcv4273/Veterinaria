package Citas;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class Citas {

	public LocalDate appDate, aMonth, mDay;

	public String description, type, doctor;

	public int year, month, day;

	public ArrayList<Citas> appointments = new ArrayList<Citas>();

	public Citas(String type, String doctor, int year, int month, int day) {
		this.type = type;
		this.doctor = doctor;
		this.year = year;
		this.month = month;
		this.day = day;

	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getType() {
		return type;
	}

	public int getYear() {
		return year;
	}

	public int getMonth() {
		return month;
	}

	public int getDay() {
		return day;
	}

	public String Doctor() { // Randomly selects the doctors name
		Random random = new Random();
		int select = random.nextInt(3) + 1;
		System.out.println("Random int: " + select);
		if (doctor.equals("veterinario")) {
			switch (select) {
			case 1:
				doctor = "Dr. Daniel Alvarez";
				break;
			case 2:
				doctor = "Dr. Toothache";
				break;
			case 3:
				doctor = "Dr. Godo";
				break;
			default:
				doctor = "ERROR OCCURED WITH 'RANDOM INT' IN DOCTOR";
				break;

			}
		}
		return doctor;
	}

	public String getDate() {

		appDate = LocalDate.of(year, month, day);

		return appDate.getMonth() + "/" + appDate.getDayOfMonth() + "TH/" + appDate.getYear();
	}

	public ArrayList<Citas> getApp() {

		getDate();

		appointments.add(new Citas(type, doctor, year, month, day));

		return appointments;
	}

	public void display() {

		System.out.print("Su cita será un " + type + "cita con" + Doctor()); // + date
	}

	public String toString() {
		return Integer.toString(this.year + this.day);
	}

	@SuppressWarnings("unused")
	public void occursOn(int year, int month, int day) {

		getApp();

	}

}

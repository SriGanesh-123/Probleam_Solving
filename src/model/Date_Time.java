package model;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Date_Time {
	public static void main(String args[]) {
		String s = "22-08-2025";
//	LocalDate id=LocalDate.of(2025, 8, 22);

		// LocalDate future=id.plusDays(10);
		// LocalDate past=id.minusMonths(2);

		DateTimeFormatter stm = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		LocalDate ll = LocalDate.now();
//LocalDate idm=id.parse(s, stm);
//String pattern=id.format(stm);
		LocalDate idm = ll.parse(s, stm);
		System.out.println(idm);
//System.out.println(pattern);
		// System.out.println(future);
		// System.out.println(past);
	}
}

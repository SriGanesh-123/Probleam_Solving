package Date_Time;

import java.time.LocalDate;
import java.time.Period;

public class BirthDay_Finder {
public static void main(String[] args) {
	LocalDate current = LocalDate.now();
	LocalDate birthday =LocalDate.of(2006, 3, 1);
	Period p=Period.between(current, birthday);
	System.out.println(p.getYears()+"Years"+p.getMonths() + "Months"+p.getDays()+"Days");
	
}
}

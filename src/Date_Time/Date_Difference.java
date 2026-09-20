package Date_Time;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class Date_Difference {
	public static void main(String[] args) {
		LocalDate current = LocalDate.now();
		LocalDate future=LocalDate.of(2027, 6, 25);
		Period p=Period.between(current, future);
		//DateTimeFormatter dtm=DateTimeFormatter.ofPattern("dd-MM-yyyy");
		//String mypattern =future.format(dtm);
		//System.out.println(current);
		//System.out.println(mypattern);
		//System.out.println(future);
		System.out.println(p.getDays()+"-"+p.getMonths()+"-"+p.getYears());

}
}

package lab.s9;

import java.time.LocalDate;
public class Kiemtranamnhuan {
    LocalDate ld= LocalDate.parse("2001-12-31");
    public void check(){
        while (ld.getYear()<2101) {
            if (ld.getDayOfYear() == 366) {
                System.out.println(ld.getYear());
            }
            ld=ld.plusYears(1);
        }
    }
}

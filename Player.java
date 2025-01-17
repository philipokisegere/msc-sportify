import java.time.LocalDate;
import java.util.List;

public class Player extends Individual{
    protected Gender gender;
    protected LocalDate dateOfBirth;

    public Player(String name_, 
                String desc,
                Sport sp,
                List<String> nick, 
                Gender g, 
                LocalDate dob 
                ) {
        super(name_, desc, sp, nick, g, dob);
    }
    //Constructor initiated
    public Player (String name_,
                   String desc,
                   Sport sp,
                   Gender g,
                   LocalDate dob
                   ) {
        super(name_, desc, sp, g, dob);
    }
}

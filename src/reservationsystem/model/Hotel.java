package reservationsystem.model;

import java.util.List;

public class Hotel {
    private String name;
    List<Reservation> reservations;

 
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}

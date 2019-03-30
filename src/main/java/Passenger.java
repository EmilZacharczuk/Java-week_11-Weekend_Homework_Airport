import java.util.ArrayList;

public class Passenger {

    private String name;
    private ArrayList<Ticket> tickets;

    public Passenger(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

}

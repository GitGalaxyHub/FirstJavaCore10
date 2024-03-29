package modul5;

abstract class Passenger {
    public abstract String getType();

    public abstract int getTicketPrice();

    public static void main(String[] args) {

    }
}
class RegularPassenger extends Passenger{
    @Override
    public String getType() {
        return "Regular";
    }

    @Override
    public int getTicketPrice() {
        return 199;
    }
}


class VIPPassenger extends Passenger{
    @Override
    public String getType() {
        return "VIP";
    }

    @Override
    public int getTicketPrice() {
        return 399;
    }
}



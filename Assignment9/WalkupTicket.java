
public class WalkupTicket extends Ticket{

	public WalkupTicket(int ticketNumber) {
		super(ticketNumber);
	}

	@Override
	public double getTicketPrice() {
		return 50;
	}

}


public class StudentAdvanceTicket extends AdvancedTicket {

	public StudentAdvanceTicket(int ticketNumber, int daysInAdvance) {
		super(ticketNumber, daysInAdvance);
	}

	@Override
	public double getTicketPrice() {
		if (getDaysInAdvance() >= 10) {
			return 15;
		} else {
			return 20;
		}
	}

}

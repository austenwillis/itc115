
public class AdvancedTicket extends Ticket {

	private int daysInAdvance;

	public AdvancedTicket(int ticketNumber, int daysInAdvance) {
		super(ticketNumber);
		this.daysInAdvance = daysInAdvance;

	}

	public int getDaysInAdvance() {
		return daysInAdvance;
	}

	public void setDaysInAdvance(int daysInAdvance) {
		this.daysInAdvance = daysInAdvance;
	}

	@Override
	public double getTicketPrice() {
		if (daysInAdvance >= 10) {
			return 30;
		} else {
			return 40;
		}
	}

}

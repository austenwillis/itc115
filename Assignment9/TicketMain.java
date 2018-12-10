
public class TicketMain {

	public static void main(String[] args) {
		Ticket[] eventTicket = new Ticket[5];
		eventTicket[0] = new WalkupTicket(1);
		eventTicket[1] = new AdvancedTicket(2, 2);
		eventTicket[2] = new AdvancedTicket(3, 10);
		eventTicket[3] = new StudentAdvanceTicket(4, 8);
		eventTicket[4] = new StudentAdvanceTicket(5, 10);

		for (int i = 0; i < eventTicket.length; i++) {
			System.out.println(eventTicket[i]);

		}

	}

}

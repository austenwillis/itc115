import java.text.NumberFormat;

public abstract class Ticket {
	private int ticketNumber;
	
	
    public Ticket(int ticketNumber) {
    	this.ticketNumber = ticketNumber;
    }


	public int getTicketNumber() {
		return ticketNumber;
	}


	public void setTicketNumber(int ticketNumber) {
		this.ticketNumber = ticketNumber;
	}

	public abstract double getTicketPrice();

	public String getPriceFormatted() {
		String formattedPrice = NumberFormat.getCurrencyInstance().format(getTicketPrice());
		return formattedPrice;
	}
	
	public String toString() {
		return  "Number: " + ticketNumber+ "," + " Price: "+ getPriceFormatted() ;
	}
	
	
}

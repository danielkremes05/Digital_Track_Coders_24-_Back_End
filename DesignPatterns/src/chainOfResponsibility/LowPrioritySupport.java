package chainOfResponsibility;

public class LowPrioritySupport implements SupportHandler {
    private SupportHandler nextHandler;

    @Override
    public void handleRequest (HelpDeskTicket ticket) {
        if (ticket.getPriority() <= 3) {
            System.out.println("Low priority ticket handled by Low Priority Support.");
            // Handle the ticket here
        } else if (nextHandler != null) {
            nextHandler.handleRequest(ticket);
        }
    }

    public void setNextHandler (SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}

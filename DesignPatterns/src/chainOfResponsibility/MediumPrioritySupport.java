package chainOfResponsibility;

public class MediumPrioritySupport implements SupportHandler {
    private SupportHandler nextHandler;

    @Override
    public void handleRequest (HelpDeskTicket ticket) {
        if (ticket.getPriority() <= 6) {
            System.out.println("Medium priority ticket handled by Medium Priority Support.");
            // Handle the ticket here
        } else if (nextHandler != null) {
            nextHandler.handleRequest(ticket);
        }
    }

    public void setNextHandler (SupportHandler nextHandler) {
        this.nextHandler = nextHandler;
    }
}

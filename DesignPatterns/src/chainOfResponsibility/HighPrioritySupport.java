package chainOfResponsibility;

public class HighPrioritySupport implements SupportHandler {

    @Override
    public void handleRequest (HelpDeskTicket ticket) {
        System.out.println("High priority ticket handled by High Priority Support.");
        // Handle the ticket here
    }
}

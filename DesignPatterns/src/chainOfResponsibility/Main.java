package chainOfResponsibility;

public class Main {
    public static void main (String[] args) {
        SupportHandler lowPrioritySupport = new LowPrioritySupport();
        SupportHandler mediumPrioritySupport = new MediumPrioritySupport();
        SupportHandler highPrioritySupport = new HighPrioritySupport();

        // Chain the handlers
        ((LowPrioritySupport) lowPrioritySupport).setNextHandler(mediumPrioritySupport);
        ((MediumPrioritySupport) mediumPrioritySupport).setNextHandler(highPrioritySupport);


        // Create tickets with different priorities
        HelpDeskTicket ticket1 = new HelpDeskTicket("John Doe", "Printer not working", 5);
        HelpDeskTicket ticket2 = new HelpDeskTicket("Jane Smith", "Network issue", 2);
        HelpDeskTicket ticket3 = new HelpDeskTicket("Alice Johnson", "Server down", 8);

        // Process the tickets
        lowPrioritySupport.handleRequest(ticket1);
        System.out.println("---------------------");
        lowPrioritySupport.handleRequest(ticket2);
        System.out.println("---------------------");
        lowPrioritySupport.handleRequest(ticket3);

    }
}

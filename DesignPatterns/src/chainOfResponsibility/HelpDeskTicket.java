package chainOfResponsibility;

public class HelpDeskTicket {
    private String customerName;
    private String issueDescription;
    private int priority;

    public HelpDeskTicket (String customerName, String issueDescription, int priority) {
        this.customerName = customerName;
        this.issueDescription = issueDescription;
        this.priority = priority;
    }

    public String getCustomerName () {
        return customerName;
    }

    public String getIssueDescription () {
        return issueDescription;
    }

    public int getPriority () {
        return priority;
    }
}

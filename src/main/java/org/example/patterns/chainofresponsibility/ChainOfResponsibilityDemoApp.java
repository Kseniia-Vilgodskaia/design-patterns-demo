package org.example.patterns.chainofresponsibility;

import java.time.LocalDate;

public class ChainOfResponsibilityDemoApp {
    public static void main(String[] args) {
        LeaveApplication application =
                new LeaveApplication(LeaveApplication.Type.MATERNITY_LEAVE, LocalDate.now(), LocalDate.of(2022, 12, 12));

        LeaveApprover approver = createChain();
        approver.processLeaveApplication(application);
    }

    public static LeaveApprover createChain() {
        Director director = new Director(null);
        Manager manager = new Manager(director);
        Lead lead = new Lead(manager);
        return lead;
    }
}

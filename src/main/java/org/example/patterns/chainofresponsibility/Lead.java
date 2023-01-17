package org.example.patterns.chainofresponsibility;

public class Lead extends Employee{

    public Lead(LeaveApprover nextApprover) {
        super(Role.LEAD, nextApprover);
    }

    @Override
    public boolean approveLeaveApplication(LeaveApplication application) {
        return application.getType() == LeaveApplication.Type.SICK;
    }
}

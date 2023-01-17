package org.example.patterns.chainofresponsibility;

public class Director extends Employee{
    public Director(LeaveApprover nextApprover) {
        super(Role.DIRECTOR, nextApprover);
    }

    @Override
    public boolean approveLeaveApplication(LeaveApplication application) {
        return application.getType() == LeaveApplication.Type.MATERNITY_LEAVE;
    }
}

package org.example.patterns.chainofresponsibility;

public class Manager extends Employee{
    public Manager(LeaveApprover nextApprover) {
        super(Role.MANAGER, nextApprover);
    }

    @Override
    public boolean approveLeaveApplication(LeaveApplication application) {
        return application.getType() == LeaveApplication.Type.VACATION;
    }
}

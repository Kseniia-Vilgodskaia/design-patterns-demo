package org.example.patterns.chainofresponsibility;

public abstract class Employee implements LeaveApprover {

    public enum Role {LEAD, MANAGER, DIRECTOR}

    private Role role;
    private LeaveApprover nextApprover;

    public Employee(Role role, LeaveApprover nextApprover) {
        this.role = role;
        this.nextApprover = nextApprover;
    }

    public Role getRole() {
        return role;
    }

    public void setRole(Role role) {
        this.role = role;
    }

    public LeaveApprover getNextApprover() {
        return nextApprover;
    }

    public void setNextApprover(LeaveApprover nextApprover) {
        this.nextApprover = nextApprover;
    }

    @Override
    public void processLeaveApplication(LeaveApplication application) {
        if (!approveLeaveApplication(application) && getNextApprover() != null) {
            nextApprover.processLeaveApplication(application);
        } else {
            System.out.println("Application of type " + application.getType() + " approved by " + getRole());
        }
    }
}

package org.example.patterns.chainofresponsibility;

public interface LeaveApprover {

    void processLeaveApplication(LeaveApplication application);

    boolean approveLeaveApplication(LeaveApplication application);
}

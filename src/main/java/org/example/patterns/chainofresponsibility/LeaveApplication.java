package org.example.patterns.chainofresponsibility;

import java.time.LocalDate;

public class LeaveApplication {

    public enum Type {SICK, VACATION, MATERNITY_LEAVE}

    private Type type;

    private LocalDate fromDate;

    private LocalDate toDate;

    public LeaveApplication(Type type, LocalDate fromDate, LocalDate toDate) {
        this.type = type;
        this.fromDate = fromDate;
        this.toDate = toDate;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public LocalDate getFromDate() {
        return fromDate;
    }

    public void setFromDate(LocalDate fromDate) {
        this.fromDate = fromDate;
    }

    public LocalDate getToDate() {
        return toDate;
    }

    public void setToDate(LocalDate toDate) {
        this.toDate = toDate;
    }
}

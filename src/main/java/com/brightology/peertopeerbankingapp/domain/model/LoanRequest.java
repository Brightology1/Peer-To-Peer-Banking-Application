package com.brightology.peertopeerbankingapp.domain.model;

import java.time.Duration;

public final class LoanRequest {

    private final int amount;
    private final User borrower;
    private final Duration repaymentTerm;
    private final double interestRate;

    public LoanRequest(int amount, User borrower, Duration repaymentTerm, double interestRate) {
        this.amount = amount;
        this.borrower = borrower;
        this.repaymentTerm = repaymentTerm;
        this.interestRate = interestRate;
    }

    //1:40mins.
}


package kn18012.librarymanagement.service;

import kn18012.librarymanagement.domain.Loan;
import java.util.List;

public interface LoanService {

    Loan saveLoan(Loan loan);

    List<Loan> findAllLoans();

    void deleteLoan(Long id);

    Loan updateLoan(Long id);
}
package com.example.demo.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@Entity
@Table(name = "loan_registers")
@Data
public class LoanRegister implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    // Mapping column

    @Column(name = "user_id")
    private int UserId;

    @Column(name = "document_date")
    private Date DocumentDate;

    @Column(name = "interest_rate")
    private float InterestRate;

    @Column(name = "amount")
    private Long Amount;

    @Column(name = "loan_term")
    private Long LoanTerm;

    @Column(name = "approve")
    private int Approve;

    @Column(name = "created_at")
    private Date CreatedAt;

    @Column(name = "created_by")
    private Long CreatedBy;

    @Column(name = "updated_at")
    private Date UpdatedAt;

    @Column(name = "updated_by")
    private Long UpdatedBy;
}

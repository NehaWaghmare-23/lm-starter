package com.lmpay.starter.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "transaction")
@Data
public class Transaction {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  Long id;

    @NotNull
    @Column(name = "transaction_no")
    private Long transactionNo;

    @Size(max = 12)
    @Column(name = "sending_agent_coded")
    private String sendingAgentCode;

    @Size(max = 12)
    @Column(name = "provider_code")
    private String providerCode;

    @Column(name = "payin_date")
    private Date payinDate;

    @Size(max = 2)
    @Column(name = "delivery_option")
    private String deliveryOption;

    @Column(name = "card_charges")
    private BigDecimal cardCharges;

    @NotNull
    @Column(name = "value_date")
    private Date valueDate;

    @Column(name = "payout_amount")
    private BigDecimal[] payoutAmount;

    @NotNull
    @Size(min = 1)
    @Column(name = "payin_amount")
    private BigDecimal[] payinAmount;

    @NotNull
    @Size(min = 1)
    @Column(name = "commission")
    private BigDecimal[] commission;


    @NotNull
    @Size(min = 1)
    @Column(name = "tax")
    private BigDecimal[] tax;

    @NotNull
    @Size(min = 1)
    @Column(name = "other_charges")
    private BigDecimal[] otherCharges;

    @NotNull
    @Size(min = 1)
    @Column(name = "additional_charges")
    private BigDecimal[] additionalCharges;

    @NotNull
    @Size(min = 1)
    @Column(name = "total_payin_amount")
    private BigDecimal[] totalPayinAmount;

    @NotNull
    @Column(name = "xrateusd2payin")
    private BigDecimal xRateUSD2Payin;

    @NotNull
    @Column(name = "xrateusd2payout")
    private BigDecimal xRateUSD2Payout;

    @NotNull
    @Column(name = "agent_xchange_ratee")
    private BigDecimal agentExchangeRate;

    @NotNull
    @Column(name = "tax_in_settlement_ccy")
    private BigDecimal taxInSettlementCCY;

    @NotNull
    @Column(name = "commission_in_settlement_ccy")
    private BigDecimal commissionInSettlementCCY;

    @NotNull
    @Column(name = "card_charges_in_settlement_ccy")
    private BigDecimal cardChargesInSettlementCCY;

    @NotNull
    @Column(name = "xrateusd2_settlement_ccy")
    private BigDecimal xRateUSD2SettlementCCY;

    @NotNull
    @Column(name = "xrate_settlementccy2_payin")
    private BigDecimal xRateSettlementCCY2Payin;

    @NotNull
    @Column(name = "amount_in_settlement_ccy")
    private BigDecimal amountInSettlementCCY;

    @NotNull
    @Column(name = "other_charges_settlemment_ccy")
    private BigDecimal otherChargesSettlementCCY;

    @NotNull
    @Column(name = "additional_charges_in_settlement_ccy")
    private BigDecimal additionalChargesInSettlementCCY;

    @NotNull
    @Column(name = "total_amount_in_settlement_ccy")
    private BigDecimal totalAmountInSettlementCCY;

    @Column(name = "created_on")
    private Date createdOn;

    @NotBlank
    @Size(max = 20)
    @Column(name = "created_by", length = 20)
    private String createdBy;

    @Column(name = "updated_on")
    private Date updatedOn;

    @NotBlank
    @Size(max = 20)
    @Column(name = "update_by", length = 20)
    private String updatedBy;

    @NotNull
    @Column(name = "txn_status_type")
    private Integer transactionStatusType;

    @NotBlank
    @Size(max = 20)
    @Column(name = "purpose_of_transfer")
    private String purposeOfTransfer;

    @NotBlank
    @Size(max = 20)
    @Column(name = "source_of_income")
    private String sourceOfIncome;

    @Size(max =  10)
    @Column(name = "channel_type")
    private String channelType;

}

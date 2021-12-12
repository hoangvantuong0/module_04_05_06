package com.example.furama.model.contract;


import javax.persistence.*;

@Entity
public class ContractDetail {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne(targetEntity = Contract.class)
    private Contract contract;

    @ManyToOne(targetEntity = AttachService.class)
    private AttachService attachService;

    public ContractDetail() {
    }

    public ContractDetail(Integer id, Contract contract, AttachService attachService) {
        this.id = id;
        this.contract = contract;
        this.attachService = attachService;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Contract getContract() {
        return contract;
    }

    public void setContract(Contract contract) {
        this.contract = contract;
    }

    public AttachService getAttachService() {
        return attachService;
    }

    public void setAttachService(AttachService attachService) {
        this.attachService = attachService;
    }
}

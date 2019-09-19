package com.beelab.intranet.models;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;
import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;


@Entity
@Table(name = "TICKET_TICKETS")
@DynamicUpdate
@DynamicInsert
public class TicketModel {
    @Id
    @SequenceGenerator(name = "TICKETS_SEQUNCE", sequenceName = "TICKETS_SEQ", allocationSize = 1, initialValue = 1)
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "TICKETS_SEQUNCE")
    private Long ID;
    @Column(name = "TYPE")

    private String type;
    @OneToOne(fetch = FetchType.EAGER)
    @JoinColumn(name = "SITE",nullable = false)
    private SiteModel site;

    //private String SITE;
    @Column(name = "PRIORITY")
    private Integer priority;
    @Column(name = "SHORT_DESC")
    private String shortDesc;
    @Column(name = "FULL_DESC")
    private String fullDesc;
    @Column(name = "SOLUTION_TEXT")
    private String solutionText;
    @ManyToMany
    @JoinTable (name="TICKET_SYSTEM_LINK",
            joinColumns=@JoinColumn (name="TICKET_ID"),
            inverseJoinColumns=@JoinColumn(name="SYSTEM_ID"))
    private List<SystemModel> systemList;

    @Column(name = "STATUS",nullable = false)
    private String status;
    @Column(name = "ADD_DT",nullable = false)
    private LocalDateTime addDt;
    @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
    @Column(name = "PLANNED_DT")
    private LocalDateTime plannedDt;
    @Column(name = "SOLUTION_DT")
    private String solutionDt;
    @Column(name = "FROZEN_DT")
    private String frozenDt;
    @Column(name = "RESPONSIBLE_UID")
    private Long responsibleUid;
    @Column(name = "CREATOR_UID")
    private Long creatorUid;
    @Column(name = "CONTACT_INFO")
    private String contactInfo;
    @Column(name = "CONTACT_EMAIL")
    private String contactEmail;
    //========== Constructor ========//
    public TicketModel(){}


    public List<SystemModel> getSystem() {
        return systemList;
    }

    public void setSystem(List<SystemModel> system) {
        this.systemList = system;
    }

    public Long getID() {
        return ID;
    }

    public void setID(Long ID) {
        this.ID = ID;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public SiteModel getSite() {
        return site;
    }

    public void setSite(SiteModel site) {
        this.site = site;
    }

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public String getShortDesc() {
        return shortDesc;
    }

    public void setShortDesc(String shortDesc) {
        this.shortDesc = shortDesc;
    }

    public String getFullDesc() {
        return fullDesc;
    }

    public void setFullDesc(String fullDesc) {
        this.fullDesc = fullDesc;
    }

    public String getSolutionText() {
        return solutionText;
    }

    public void setSolutionText(String solutionText) {
        this.solutionText = solutionText;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public LocalDateTime getAddDt() {
        return addDt;
    }

    public void setAddDt(LocalDateTime addDt) {
        this.addDt = addDt;
    }

    public LocalDateTime getPlannedDt() {
        return plannedDt;
    }

    public void setPlannedDt(LocalDateTime plannedDt) {
        this.plannedDt = plannedDt;
    }

    public String getSolutionDt() {
        return solutionDt;
    }

    public void setSolutionDt(String solutionDt) {
        this.solutionDt = solutionDt;
    }

    public String getFrozenDt() {
        return frozenDt;
    }

    public void setFrozenDt(String frozenDt) {
        this.frozenDt = frozenDt;
    }

    public Long getResponsibleUid() {
        return responsibleUid;
    }

    public void setResponsibleUid(Long responsibleUid) {
        this.responsibleUid = responsibleUid;
    }

    public Long getCreatorUid() {
        return creatorUid;
    }

    public void setCreatorUid(Long creatorUid) {
        this.creatorUid = creatorUid;
    }

    public String getContactInfo() {
        return contactInfo;
    }

    public void setContactInfo(String contactInfo) {
        this.contactInfo = contactInfo;
    }

    public List<SystemModel> getSystemList() {
        return systemList;
    }

    public void setSystemList(List<SystemModel> systemList) {
        this.systemList = systemList;
    }

    public String getContactEmail() {
        return contactEmail;
    }

    public void setContactEmail(String contactEmail) {
        this.contactEmail = contactEmail;
    }
}


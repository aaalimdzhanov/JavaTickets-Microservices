package com.beelab.intranet.models;

import javax.persistence.*;

@Entity
@Table(name = "TICKET_SYSTEM_LINK")
public class SystemLinkModel {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "SystemLinkSeq")
    @SequenceGenerator(sequenceName = "TICKET_SYSTEM_LINK_SEQ", name="SystemLinkSeq")
    private Integer id;

    @OneToOne (optional=false, cascade=CascadeType.ALL)
    @JoinColumn (name="TICKET_ID")
    private TicketModel tickets;

    @ManyToOne (optional=false, cascade=CascadeType.ALL)
    @JoinColumn(name="SYSTEM_ID")
    private SystemModel system;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public TicketModel getTickets() {
        return tickets;
    }

    public void setTickets(TicketModel tickets) {
        this.tickets = tickets;
    }

    public SystemModel getSystem() {
        return system;
    }

    public void setSystem(SystemModel system) {
        this.system = system;
    }
}

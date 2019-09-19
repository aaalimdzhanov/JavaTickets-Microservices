package com.beelab.intranet.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TICKET_PRIORITY")
public class PriorityModel {
    @Id
    @Column(name = "ID")
    private long id;

    @Column(name = "NUMBER_HRS")
    private long numberHour;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getNumberHour() {
        return numberHour;
    }

    public void setNumberHour(long numberHour) {
        this.numberHour = numberHour;
    }

    @Override
    public String toString() {
        return "PriorityModel{" +
                "id=" + id +
                ", numberHour=" + numberHour +
                '}';
    }
}

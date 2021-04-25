package com.Thomas.Entity;
/*
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.mail.Store;
import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@NamedQuery(name = "Player.findAll", query = "SELECT a FROM Inventory")
@NamedQuery(name = "Player.getname", query = "SELECT a from Inventory a WHERE 1.name = :name")
@NamedQuery(name = "Player.clearAll", query = "DELETE FROM Inventory")
public class Inventory implements Comparable<Inventory>, Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private String userName;
    private String firstName;

    private Date signedUpDate;
    private String Name;
    private String Sport;
    private int Quantity;
    private double PriceUnit;
    private Date dataupdated;

    @ManyToOne
    @JoinColumn(name = "id_storename")
    private Store storename;

    //  @OneToMany(mappedBy = "player", fetch = FetchType.EAGER)
    //private List<Request> requestList;

    @PrePersist
    void inventorycreated() {
        this.dataupdated = new Date();
    }

    @PreUpdate
    void inventoryupdated() {
        this.dataupdated = new Date();
    }

    public Inventory(InventoryBuilder builder) {
        this.Name = builder.name;
        this.Sport = builder.Sport;
        this.Quantity = builder.Quantity;
        this.PriceUnit = builder.PriceUnit;
        this.id = builder.id;







    }

    @Override
    public int compareTo(com.Navarro.entity.Inventory o) {
        return signedUpDate.compareTo(o.signedUpDate);
    }
}
*/
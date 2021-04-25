package com.Thomas.Entity;

public class StoreInv {

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

public class StoreInv implements Comparable<Inventory>, Serializable {
    @Id
    @GeneratedValue
    private Long id;
    @Column(unique = true)
    private Date signedUpDate;
    private String Name;
    private String Location;
    private String Add;

    @ManyToOne
    @JoinColumn(name = "id_Store")
    private Store Store;

    //  @OneToMany(mappedBy = "player", fetch = FetchType.EAGER)
    //private List<Request> requestList;


    public Inventory(InventoryBuilder builder) {
        this.Name = builder.name;
        this.Sport = builder.Location;
        this.Quantity = builder.Quantity;
        this.PriceUnit = builder.Add;
        this.id = builder.id;

    }

    @Override
    public int compareTo(com.Navarro.entity.Inventory o) {
        return signedUpDate.compareTo(o.signedUpDate);
    }
}
*/
}

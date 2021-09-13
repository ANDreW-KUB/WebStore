
package org.example.model.order;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.model.shop.Shop;
import org.example.model.user_account.UserAccount;

import javax.persistence.*;
import java.util.Date;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "order")
@Entity
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "order_id", nullable = false)
    private Long id;

    @ManyToOne(optional = false)
    @JoinColumn(name = "customer", nullable = false)
    private UserAccount customer;

    @ManyToOne(optional = false)
    @JoinColumn(name = "seller", nullable = false)
    private Shop seller;

    @Column(name = "last_change_date", nullable = false)
    private Date lastChangeDate;

    @Column(name = "state", nullable = false, length = 50)
    private String state;


}

package org.example.model.communication;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.example.model.order.Order;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@NoArgsConstructor
@Table(name = "dialog")
@Entity
public class Dialog {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "dialog_id", nullable = false)
    private Long id;

    @Column(name = "name", nullable = false, length = 50)
    private String name;

    @ManyToOne(optional = false)
    @JoinColumn(name = "order_id", nullable = false)
    private Order order;
    
    @OneToMany
    @JoinColumn(name = "message_id")
    private List<Message> messages;
}
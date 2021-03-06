package org.example.model.user_account;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@NoArgsConstructor
@Table(name = "communication")
@Entity
public class Communication {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "communication_id", nullable = false)
    private Long id;

    @Column(name = "email", length = 50)
    private String email;

    @Column(name = "phone_number", length = 50)
    private String phoneNumber;

    @ManyToOne(optional = false, fetch = FetchType.LAZY)
    @JoinColumn(name = "user_account", nullable = false)
    private UserAccount userAccount;

   
}
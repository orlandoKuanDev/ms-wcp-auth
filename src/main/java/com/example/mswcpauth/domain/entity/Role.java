package com.example.mswcpauth.domain.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.hibernate.annotations.NaturalId;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;
/**
 * The type Role. Defines the role and the list of users who are associated with that role
 */
@Getter
@Setter
@RequiredArgsConstructor
@AllArgsConstructor
@Entity
public class Role {
    @Id
    @Column(name = "ROLE_ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ROLE_NAME")
    @Enumerated(EnumType.STRING)
    @NaturalId
    private RoleName role;

    @ManyToMany(mappedBy = "roles", fetch = FetchType.LAZY)
    private Set<User> userList = new HashSet<>();
    public boolean isAdminRole() {
        return this.role.equals(RoleName.ROLE_ADMIN);
    }
}

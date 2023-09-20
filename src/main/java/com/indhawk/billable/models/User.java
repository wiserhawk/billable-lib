package com.indhawk.billable.models;

import lombok.*;

import java.time.LocalDateTime;

@Data
@Getter
@Setter
@Builder(toBuilder = true)
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class User {
    private String userId;
    private String name;
    private String surname;
    private String userName;
    private String email;
    private String password;
    private LocalDateTime createdOn;
    private LocalDateTime lastLoginOn;
    // Single Sign On
    private boolean sso;
    private boolean active;
    private int orgId;
}

package com.indhawk.billable.models;

import lombok.*;
import java.util.List;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@ToString
public class UserRoles {
    private int userId;
    private List<UserRoleType> roles;
}

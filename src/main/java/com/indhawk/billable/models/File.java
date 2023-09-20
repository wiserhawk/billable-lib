package com.indhawk.billable.models;

import lombok.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
@ToString
public class File {
    private int fileId;
    private String fileName;
    private String fileType;
    private byte[] bytes;
    private int orgId;
}

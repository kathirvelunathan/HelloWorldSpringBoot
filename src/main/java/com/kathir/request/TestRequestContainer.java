package com.kathir.request;


import lombok.*;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@AllArgsConstructor
@SuperBuilder
@Data
public class TestRequestContainer {
    public String fname;
    public String lname;
    public String dob;
}

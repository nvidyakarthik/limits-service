package com.gymnasticbodies.microservices.limitsservice.bean;

import lombok.*;

//@Data
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LimitConfiguration {

    private int maximum;
    private int minimum;

}

package com.nttdata.gpc.demorestapi.models;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@AllArgsConstructor
@NoArgsConstructor
public class TimeModel implements Serializable {
    @Getter @Setter private Date time;
}

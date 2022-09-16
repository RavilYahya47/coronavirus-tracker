package com.ravilyahya.coronavirustracker.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class LocationStats {
    private String state;
    private String country;
    private Integer latestTotalCases;
    private Integer diffFromPreviousDay;


}

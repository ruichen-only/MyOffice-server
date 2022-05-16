package com.rea.myoffice.bean;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.rea.myoffice.model.Schedule;

import java.util.Date;
import java.util.List;

/**
 * @author CRR
 */
public class ScheduleBean extends Schedule {
  @JsonProperty("timeRanges")
  private List<Date> timeRanges;
}

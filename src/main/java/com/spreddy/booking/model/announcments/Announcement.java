package com.spreddy.booking.model.announcments;


import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Announcement {

    String color;
    String announcement;
    Integer level;

}

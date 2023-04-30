package com.spreddy.booking.controller;

import com.spreddy.booking.model.announcments.Announcement;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

import static com.spreddy.booking.common.constants.PathConstants.ANNOUNCEMENT_PATH;

@Slf4j
@RestController
@CrossOrigin
public class AnnouncementController {


    @GetMapping(ANNOUNCEMENT_PATH)
    public List<Announcement> getAnnouncement(){
        return null;
    }


    @PutMapping(ANNOUNCEMENT_PATH)
    public ResponseEntity<Announcement> setNewAnnouncement(@RequestBody Announcement announcement){
        return ResponseEntity.ok(announcement);
    }

}

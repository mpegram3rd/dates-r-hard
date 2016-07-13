package com.mpegram.controller;

import com.mpegram.models.Timing;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

import static org.springframework.web.bind.annotation.RequestMethod.POST;

/**
 * Created by mpegram on 7/13/16.
 */
@RestController
@RequestMapping("/timing")
public class TimingController {

    private static final long MILLIS_IN_DAY = 1000 * 60 * 60 * 24;

    /**
     * Accepts a timing model, and returns a timing model 1 day later.
     *
     * @param timingIn
     *      Start/Stop times
     *
     * @return The same Start/Stop times rolled forward a day.
     */
    @RequestMapping(consumes="application/json", produces="application/json", method=POST)
    public ResponseEntity<Timing> updateTiming(@RequestBody final Timing timingIn) {
        final Timing timingOut = new Timing();

        // Bump date/times by 1 day if they are not null.
        timingOut.setStart(timingIn.getStart() == null ? null : new Date(timingIn.getStart().getTime() + MILLIS_IN_DAY));
        timingOut.setStop(timingIn.getStop() == null ? null : new Date(timingIn.getStop().getTime() + MILLIS_IN_DAY));

        return ResponseEntity.ok(timingOut);
    }

}

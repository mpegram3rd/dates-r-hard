package com.mpegram.models;

import java.util.Date;

/**
 * Created by mpegram on 7/13/16.
 */
public class Timing {

    private Date start;
    private Date stop;

    public Date getStart() {
        return start == null ? null : new Date(start.getTime());
    }

    public void setStart(Date start) {
        this.start = start;
    }

    public Date getStop() {
        return stop == null ? null : new Date(stop.getTime()) ;
    }

    public void setStop(Date stop) {
        this.stop = stop;
    }
}

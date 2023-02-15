package com.example.booklooth.data;

public class AlarmListViewData {
    private int memberImage;
    private String memberAlarm;
    private String memberAlarmContent;
    private long time;

    public AlarmListViewData(String memberAlarm, String memberAlarmContent) {
        this.memberAlarm = memberAlarm;
        this.memberAlarmContent = memberAlarmContent;
    }

    public int getMemberImage() {
        return this.memberImage;
    }

    public String getMemberAlarm() {
        return this.memberAlarm;
    }

    public String getMemberAlarmContent() {
        return this.memberAlarmContent;
    }

    public long getTime() {
        return time;
    }

    public void setTime(long time) {
        this.time = time;
    }

}

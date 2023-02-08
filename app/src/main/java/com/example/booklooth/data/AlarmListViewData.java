package com.example.booklooth.data;

public class AlarmListViewData {
    private int memberImage;
    private String memberAlarm;
    private String memberAlarmContent;

    public AlarmListViewData(int memberImage, String memberAlarm, String memberAlarmContent) {
        this.memberImage = memberImage;
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
}

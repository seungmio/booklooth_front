package com.example.booklooth.data;

public class ProfileWritingData {
    private int memberProfile;
    private String memberName;
    private String memberIntro;
    private String memberFollow;

    public ProfileWritingData(int memberProfile, String memberName, String memberIntro, String memberFollow) {
        this.memberProfile = memberProfile;
        this.memberName = memberName;
        this.memberIntro = memberIntro;
        this.memberFollow = memberFollow;
    }

    public int getMemberProfile() {
        return memberProfile;
    }

    public void setMemberProfile(int memberProfile) {
        this.memberProfile = memberProfile;
    }

    public String getMemberName() {
        return memberName;
    }

    public void setMemberName(String memberName) {
        this.memberName = memberName;
    }

    public String getMemberIntro() {
        return memberIntro;
    }

    public void setMemberIntro(String memberIntro) {
        this.memberIntro = memberIntro;
    }

    public String getMemberFollow() {
        return memberFollow;
    }

    public void setMemberFollow(String memberFollow) {
        this.memberFollow = memberFollow;
    }
}

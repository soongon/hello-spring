package kr.re.kitri.hello.model;

import java.time.LocalDateTime;

public class Member {
    private int memberSeq;
    private String userid;
    private String password;
    private String email;
    private int point;
    private LocalDateTime joinDate;

    public Member() {
    }

    public Member(int memberSeq, String userid, String password, String email, int point, LocalDateTime joinDate) {
        this.memberSeq = memberSeq;
        this.userid = userid;
        this.password = password;
        this.email = email;
        this.point = point;
        this.joinDate = joinDate;
    }

    public Member(String userid, String password, String email, int point, LocalDateTime joinDate) {
        this.userid = userid;
        this.password = password;
        this.email = email;
        this.point = point;
        this.joinDate = joinDate;
    }

    public int getMemberSeq() {
        return memberSeq;
    }

    public void setMemberSeq(int memberSeq) {
        this.memberSeq = memberSeq;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getPoint() {
        return point;
    }

    public void setPoint(int point) {
        this.point = point;
    }

    public LocalDateTime getJoinDate() {
        return joinDate;
    }

    public void setJoinDate(LocalDateTime joinDate) {
        this.joinDate = joinDate;
    }

    @Override
    public String toString() {
        return "Member{" +
                "memberSeq=" + memberSeq +
                ", userid='" + userid + '\'' +
                ", password='" + password + '\'' +
                ", email='" + email + '\'' +
                ", point=" + point +
                ", joinDate=" + joinDate +
                '}';
    }
}

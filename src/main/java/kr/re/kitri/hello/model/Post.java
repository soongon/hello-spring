package kr.re.kitri.hello.model;

import java.time.LocalDateTime;

public class Post {

    private int postSeq;
    private String title;
    private String content;
    private LocalDateTime writeDate;
    private int memberSeq;

    public Post() {
    }

    public Post(int postSeq, String title, String content, LocalDateTime writeDate, int memberSeq) {
        this.postSeq = postSeq;
        this.title = title;
        this.content = content;
        this.writeDate = writeDate;
        this.memberSeq = memberSeq;
    }

    public Post(String title, String content, LocalDateTime writeDate, int memberSeq) {
        this.title = title;
        this.content = content;
        this.writeDate = writeDate;
        this.memberSeq = memberSeq;
    }

    public int getPostSeq() {
        return postSeq;
    }

    public void setPostSeq(int postSeq) {
        this.postSeq = postSeq;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDateTime getWriteDate() {
        return writeDate;
    }

    public void setWriteDate(LocalDateTime writeDate) {
        this.writeDate = writeDate;
    }

    public int getMemberSeq() {
        return memberSeq;
    }

    public void setMemberSeq(int memberSeq) {
        this.memberSeq = memberSeq;
    }

    @Override
    public String toString() {
        return "Post{" +
                "postSeq=" + postSeq +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", writeDate=" + writeDate +
                ", memberSeq=" + memberSeq +
                '}';
    }
}

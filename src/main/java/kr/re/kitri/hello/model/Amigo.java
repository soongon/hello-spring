package kr.re.kitri.hello.model;

/**
 * Created by danawacomputer on 2017-06-15.
 */
public class Amigo {

    private int amigoId;
    private String name;
    private String hpNum;
    private String email;

    public Amigo() {}

    public Amigo(int amigoId, String name, String hpNum, String email) {
        this.amigoId = amigoId;
        this.name = name;
        this.hpNum = hpNum;
        this.email = email;
    }

    public int getAmigoId() {
        return amigoId;
    }

    public void setAmigoId(int amigoId) {
        this.amigoId = amigoId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHpNum() {
        return hpNum;
    }

    public void setHpNum(String hpNum) {
        this.hpNum = hpNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Amigo{" +
                "amigoId=" + amigoId +
                ", name='" + name + '\'' +
                ", hpNum='" + hpNum + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}

package fzu.concerto.meething_system.pojo;

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.Date;

@Slf4j
@Builder
public class User implements Serializable {
    private Integer uid;

    private String name;

    private String password;

    private Integer character;

    private Date signupDate;

    private static final long serialVersionUID = 1L;

    public User(Integer uid, String name, String password, Integer character, Date signupDate) {
        this.uid = uid;
        this.name = name;
        this.password = password;
        this.character = character;
        this.signupDate = signupDate;
    }

    public User() {
        super();
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Integer getCharacter() {
        return character;
    }

    public void setCharacter(Integer character) {
        this.character = character;
    }

    public Date getSignupDate() {
        return signupDate;
    }

    public void setSignupDate(Date signupDate) {
        this.signupDate = signupDate;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", uid=").append(uid);
        sb.append(", name=").append(name);
        sb.append(", password=").append(password);
        sb.append(", character=").append(character);
        sb.append(", signupDate=").append(signupDate);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
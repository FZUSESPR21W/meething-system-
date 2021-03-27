package fzu.concerto.meething_system.pojo;

import java.io.Serializable;

public class UserForum implements Serializable {
    private Integer ufid;

    private Integer fid;

    private Integer uid;

    private static final long serialVersionUID = 1L;

    public UserForum(Integer ufid, Integer fid, Integer uid) {
        this.ufid = ufid;
        this.fid = fid;
        this.uid = uid;
    }

    public UserForum() {
        super();
    }

    public Integer getUfid() {
        return ufid;
    }

    public void setUfid(Integer ufid) {
        this.ufid = ufid;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", ufid=").append(ufid);
        sb.append(", fid=").append(fid);
        sb.append(", uid=").append(uid);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
package fzu.concerto.meething_system.pojo;

import java.io.Serializable;
import java.util.Date;

public class Forum implements Serializable {
    private Integer fid;

    private String name;

    private String description;

    private Date time;

    private static final long serialVersionUID = 1L;

    public Forum(Integer fid, String name, String description, Date time) {
        this.fid = fid;
        this.name = name;
        this.description = description;
        this.time = time;
    }

    public Forum() {
        super();
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Date getTime() {
        return time;
    }

    public void setTime(Date time) {
        this.time = time;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", fid=").append(fid);
        sb.append(", name=").append(name);
        sb.append(", description=").append(description);
        sb.append(", time=").append(time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
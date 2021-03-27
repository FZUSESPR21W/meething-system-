package fzu.concerto.meething_system.pojo;

import lombok.Builder;
import lombok.extern.slf4j.Slf4j;

import java.io.Serializable;
import java.util.Date;

@Slf4j
@Builder
public class Message implements Serializable {
    private Integer mid;

    private Integer publisher;

    private Integer fid;

    private String title;

    private String content;

    private Date time;

    private static final long serialVersionUID = 1L;

    public Message(Integer mid, Integer publisher, Integer fid, String title, String content, Date time) {
        this.mid = mid;
        this.publisher = publisher;
        this.fid = fid;
        this.title = title;
        this.content = content;
        this.time = time;
    }

    public Message() {
        super();
    }

    public Integer getMid() {
        return mid;
    }

    public void setMid(Integer mid) {
        this.mid = mid;
    }

    public Integer getPublisher() {
        return publisher;
    }

    public void setPublisher(Integer publisher) {
        this.publisher = publisher;
    }

    public Integer getFid() {
        return fid;
    }

    public void setFid(Integer fid) {
        this.fid = fid;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
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
        sb.append(", mid=").append(mid);
        sb.append(", publisher=").append(publisher);
        sb.append(", fid=").append(fid);
        sb.append(", title=").append(title);
        sb.append(", content=").append(content);
        sb.append(", time=").append(time);
        sb.append(", serialVersionUID=").append(serialVersionUID);
        sb.append("]");
        return sb.toString();
    }
}
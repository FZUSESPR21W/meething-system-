package team.concerto.forum.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {

  private long mid;
  private long publisher;
  private long fid;
  private String title;
  private String content;
  private java.sql.Timestamp time;

}

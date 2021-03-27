package team.concerto.forum.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Forum {

  private long fid;
  private String name;
  private String description;
  private String  time;

}

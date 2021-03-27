package team.concerto.forum.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Userforum {

  private long ufid;
  private long fid;
  private long uid;

}

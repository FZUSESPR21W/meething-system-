package team.concerto.forum.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

  //@TableId(type = IdType.AUTO)
  private long uid;
  private String name;
  private String password;
  private long role;
  private String signDate;


}

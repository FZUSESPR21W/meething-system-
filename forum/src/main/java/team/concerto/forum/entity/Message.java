package team.concerto.forum.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Message {
  @TableId(type= IdType.AUTO)
  private long mid;
  private long publisher;
  private long fid;
  private String title;
  private String content;
  private String time;

}

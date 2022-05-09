package com.springboot.learn.VO;

import com.springboot.learn.entity.User;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ResponseTemplateVO {
    private User user;
    private Department department;
}

package com.example.demo;

import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class UserController {

    @GetMapping(value = "/user") /* Get이나 SetMapping으로 바로 작성 */
    public void test(){
        System.out.println("test() 실행");

        UserDto userDto = new UserDto();
        userDto.setAge(33);
        userDto.setName("Jesus_Christ");

        System.out.printf("name : %s, age : %d\n",
                userDto.getName(), userDto.getAge());

    }
}

package com.mid.alcohol.web;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.mid.alcohol.domain.User;
import com.mid.alcohol.dto.UserModifyDto;
import com.mid.alcohol.dto.UserSignupDto;
import com.mid.alcohol.service.UserService;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@RequiredArgsConstructor
@RequestMapping("/signup")
@Controller
public class UserController {

    private final UserService userService;
    
    // 이메일 페이지로 이동하기 위해
    @GetMapping("/signupEmail")
    public void signupEmail() {
        log.info("signupEmail()");
    }
    
    // 이메일 페이지에서 받은 이메일 정보를 보내기위해
    @PostMapping("/signupEmail")
    public String signupEmail(UserSignupDto dto,
            @RequestParam("userEmail") String userEmail, Model model) {
        log.info("signupEmail()", dto);
        log.info("email={}",userEmail);
        
        model.addAttribute("userEmail",userEmail);
        
        return "/signup/signup";
    }
    
    // 회원가입 페이지로 이동
    @GetMapping("/signup")
    public void signup() {
        log.info("signup()");
    }
    


    // 회원가입 처리
    @PostMapping("/signup")
    public String signup(UserSignupDto dto,
            @RequestParam("userEmail") String userEmail) {
        log.info("signup({})", dto);
        
        dto.setUserEmail(userEmail);

        int result = userService.signup(dto);
        log.info("회원가입 결과 = {}", result);
        
        // 회원가입 완료 페이지로 넘겨줌
        return "/signup/signupCompletion";
    }

    // 회원가입 완료 페이지로 이동
    @GetMapping("/signupCompletion")
    public void signupCompletion() {
        log.info("signupCompletion()");
    }
        

 
    // 메인 페이지 이동
     @GetMapping("/main")
     public void main() {
         log.info("main()");
     }
    

    
    // 계정 페이지 이동 
     @GetMapping("/userModify")
     public String userModify(@RequestParam("userEmail") String userEmail, Model model) {
       log.info("userModify");

       UserModifyDto dto = userService.read(userEmail);

       model.addAttribute("User", dto);
       
       return "/signup/userModify";
     }
     
    // 로그인된 상태에 메인 페이지에서 계정을 눌렀을 때 보여줄 계정 정보 
    @PostMapping("/userModify")
    public String userModify(UserSignupDto dto) {
    	
    	return"/signup/userPasswordModify";
    }
    
    // 비밀번호 수정 페이지로 이동하기 위해
    @GetMapping("/userPasswordModify")
    public void userPasswordModify() {
    	
    }
    
    // 비밀번호를 수정하기위한(미완성)
    @PostMapping("/userPasswordModify")
    public String userPasswordModify(UserSignupDto dto) {
        
     
      return "/signup/userModify"; // 수정 후 사용자 수정 페이지로 이동
    }
    
    
    
    // 전화번호를 수정하기위해
    @PostMapping("/userPhoneModify")
    public String userPhoneModify() {
      // 전화번호 수정 로직 구현
      return "/signup/userModify"; // 수정 후 사용자 수정 페이지로 이동
    }
    

}

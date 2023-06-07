package com.mid.alcohol.repository;

import com.mid.alcohol.domain.User;
import com.mid.alcohol.dto.UserSignupDto;

public interface UserRepository {
    
	// 이메일을 DB에 넣기위해
    int userEmailSignup(User user);
    
    // 회원정보를 DB에 넣기위해
    int userMainSignup(User user);
    
    // 수정할 때 정보를 가져오기위해
    User findByUserEmail(String userEmail);
    
//    User findByUserNickname(String userNickname);
    
    // 중복된 별명이 있는지
    UserSignupDto findByUserNickname(String userNickname);
}

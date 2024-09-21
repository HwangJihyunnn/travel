package com.demo.travel.global.utils;

import java.util.Optional;

import com.demo.travel.domain.user.User;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

/*
 * CommonUtil
 * 공통 유틸리티 클래스
 */
public class CommonUtil {

    private static final String SESSION_USERINFO = "userInfo";

    public static Optional<Long> getUserId(HttpServletRequest request) {
        return getUserInfo(request).map(User::getId);
    }

    public static Optional<Long> getUserId(HttpSession session) {
        return getUserInfo(session).map(User::getId);
    }

    /**
     * request 객체에서 userInfo를 가져오는 메소드
     * @param request
     * @return
     */
    public static Optional<User> getUserInfo(HttpServletRequest request) {
        HttpSession session = request.getSession();
        return getUserInfo(session);
    }

    /**
     * 세션 객체에서 userInfo를 가져오는 메소드
     * @param session HttpSession 객체
     * @return Optional<User> 사용자 정보
     */
    public static Optional<User> getUserInfo(HttpSession session) {
        return Optional.ofNullable(session.getAttribute(SESSION_USERINFO))
                .filter(User.class::isInstance)
                .map(User.class::cast);
    }

    /**
     * 문자열이 비어있는지 확인하는 메소드
     * @param str
     * @return
     */
    public static boolean isEmptyString(String str) {
        return str == null || str.trim().isEmpty();
    }

    /**
     * 이메일 형식이 맞는지 확인하는 메소드
     * TODO 정규식 확인
     * @param email
     * @return
     */
    public static boolean isValidEmail(String email) {
        if(isEmptyString(email)){
            return false;
        };
        return email.matches("^[a-zA-Z0-9._%+-]+@[a-zA-Z0-9.-]+\\.[a-zA-Z]{2,6}$");
    }

}

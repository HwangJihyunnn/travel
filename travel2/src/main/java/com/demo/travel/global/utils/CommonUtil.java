package com.demo.travel.global.utils;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpSession;

/*
 * CommonUtil
 * 공통 유틸리티 클래스
 */
public class CommonUtil {

    private static final String SESSION_USERINFO = "userInfo";

    /**
     * request 객체에서 userInfo를 가져오는 메소드
     * @param request
     * @return
     */
    public static Object getUserInfo(HttpServletRequest request) {
        HttpSession session = request.getSession();
        return getUserInfo(session);
    }

    /**
     * session 객체에서 userInfo를 가져오는 메소드
     * @param session
     * @return
     */
    public static Object getUserInfo(HttpSession session) {
        return session.getAttribute(SESSION_USERINFO);
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

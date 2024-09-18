package com.demo.travel.global.utils;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Optional;

/*
 * TimeUtil
 * 시간 관련 유틸리티 클래스
 */
public class TimeUtil {

    public static String DEFAULT_DATETIME_FORMAT = "yyyy-MM-dd HH:mm:ss";
    public static String DEFAULT_DATETIME_FORMAT_KOR = "yyyy년 MM월 dd일 HH시 mm분 ss초";

	public static String DEFAULT_DATE_FORMAT = "yyyy-MM-dd";
	public static String DEFAULT_DATE_FORMAT_KOR = "yyyy년 MM월 dd일";

    public static String DEFAULT_TIME_FORMAT = "HH:mm:ss";
    public static String DEFAULT_TIME_FORMAT_KOR = "HH시 mm분 ss초";


    /*
     * 시간을 문자열로 반환하는 메소드
     */

    public static String getNowStr() {
        return convertDateTimeToStr(DEFAULT_DATETIME_FORMAT, LocalDateTime.now());
    }

    public static String getNowStr(String format) {
        return convertDateTimeToStr(format, LocalDateTime.now());
    }

    public static String getDateTimeStr(LocalDateTime time) {
        return convertDateTimeToStr(DEFAULT_DATETIME_FORMAT, time);
    }

    public static String convertDateTimeToStr(String format, LocalDateTime time) {
        return DateTimeFormatter.ofPattern(format).format(time);
    }

    public static Optional<String> safeConvertDateTimeToStr(String format, LocalDateTime time) {
        try {
            return Optional.of(DateTimeFormatter.ofPattern(format).format(time));
        } catch (Exception e) {
            return Optional.empty();
        }
    }

    /*
     * 문자열을 시간으로 변환하는 메소드
     */

    public static LocalDateTime convertStrToDateTime(String time) {
        return convertStrToDateTime(time, DEFAULT_DATETIME_FORMAT);
    }

    public static LocalDateTime convertStrToDateTime(String time, String format) {
        return LocalDateTime.parse(time, DateTimeFormatter.ofPattern(format));
    }

    public static Optional<LocalDateTime> safeConvertStrToDateTime(String time) {
        return safeConvertStrToDateTime(time, DEFAULT_DATETIME_FORMAT);
    }

    public static Optional<LocalDateTime> safeConvertStrToDateTime(String time, String format) {
        try {
            // LocalDateTime now = LocalDateTime.now();
            // LocalDateTime targetTime = LocalDateTime.now().plusDays(1);
            // now.isAfter(targetTime);
            // now.isBefore(targetTime);
            return Optional.of(LocalDateTime.parse(time, DateTimeFormatter.ofPattern(format)));
        } catch (Exception e) {
            return Optional.empty();
        }
    }

}

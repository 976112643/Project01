package com.wq.common.quest;


/**
 * 接口参数帮助类
 */
public class BaseQuestConfig implements NetQuestConfig {

    //获取验证码（通用）
    public static String GET_VERIFICATION_CODE_URL = HTTP_API + "User/User/Register/send_code";
    public static final int QUEST_GET_VERIFICATION_CODE = 0X001;



}




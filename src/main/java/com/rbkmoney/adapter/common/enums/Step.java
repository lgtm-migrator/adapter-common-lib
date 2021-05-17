package com.rbkmoney.adapter.common.enums;

public enum Step {

    PRE_AUTH,
    AUTH,
    AUTH_MOBILE_PAY,
    FINISH_THREE_DS,
    FINISH_THREE_DS_V1,
    FINISH_THREE_DS_V2,
    AWAIT_CALLBACK,
    CANCEL,
    REFUND,
    CHECK_STATUS,
    CAPTURE,
    DO_NOTHING,

    RECURRENT,
    AUTH_RECURRENT,

    GENERATE_TOKEN_AUTH,
    GENERATE_TOKEN_AUTH_MOBILE_PAY,
    GENERATE_TOKEN_FINISH_THREE_DS,
    GENERATE_TOKEN_FINISH_THREE_DS_V1,
    GENERATE_TOKEN_FINISH_THREE_DS_V2,
    GENERATE_TOKEN_AWAIT_CALLBACK,
    GENERATE_TOKEN_CAPTURE,
    GENERATE_TOKEN_CANCEL,
    GENERATE_TOKEN_REFUND,
    GENERATE_TOKEN_CHECK_STATUS,
    GENERATE_TOKEN_FINISH

}

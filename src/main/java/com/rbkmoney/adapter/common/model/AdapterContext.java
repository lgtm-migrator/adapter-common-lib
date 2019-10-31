package com.rbkmoney.adapter.common.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.rbkmoney.adapter.common.enums.Step;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.time.Instant;

@Getter
@Setter
@ToString
@JsonInclude(JsonInclude.Include.NON_NULL)
@JsonIgnoreProperties(ignoreUnknown = true)
public class AdapterContext {

    private String md;
    private String paReq;
    private String paRes;
    private String acsUrl;
    private String termUrl;

    private Instant maxDateTimePolling;
    private String trxId;

    private Step step;

}
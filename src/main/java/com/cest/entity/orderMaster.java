package com.cest.entity;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;

@Data
public class orderMaster implements Serializable {
    private String orderId;

    private String buyerName;

    private String buyerPhone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;

    private Byte orderStatus;

    private Byte payStatus;

    private Date createTime;

    private Date updateTime;

    private static final long serialVersionUID = 1L;
}
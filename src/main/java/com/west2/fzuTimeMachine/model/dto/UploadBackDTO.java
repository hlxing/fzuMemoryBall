package com.west2.fzuTimeMachine.model.dto;

import lombok.Data;

import java.io.Serializable;

/**
 * @description: 时光上传回调的传输对象
 * @author: hlx 2018-10-03
 **/
@Data
public class UploadBackDTO implements Serializable{

    private String id;

    private String encryptedId;

    public UploadBackDTO() {
    }

    public UploadBackDTO(String id, String encryptedId) {
        this.id = id;
        this.encryptedId = encryptedId;
    }
}

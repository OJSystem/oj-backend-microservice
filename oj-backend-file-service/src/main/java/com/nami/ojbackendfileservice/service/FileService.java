package com.nami.ojbackendfileservice.service;

import org.springframework.web.multipart.MultipartFile;

/**
 * @author Nami
 */
public interface FileService {
    /**
     * 上传头像到OSS
     *
     * @param file
     * @return
     */
    String uploadFileAvatar(MultipartFile file);
}

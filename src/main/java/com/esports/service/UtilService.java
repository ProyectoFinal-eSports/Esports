package com.esports.service;

import org.springframework.web.multipart.MultipartFile;

public interface UtilService {
	String getResourcesPath(String classPath);
	String saveResourceFile(MultipartFile file, String path);
}

package com.esports.service.impl;

import com.esports.service.UtilService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.FileOutputStream;
import java.io.IOException;

@Service
public class UtilServiceImpl implements UtilService {

	private Logger logger = LoggerFactory.getLogger(UtilServiceImpl.class);

	@Autowired
	ResourceLoader resourceLoader;

	@Override
	public String getResourcesPath(String classPath) {
		String resourcePath = null;
		Resource resource = resourceLoader.getResource(classPath);
		try {
			logger.info("resource path: "+resource.getURL().getPath());
			resourcePath = resource.getURL().getPath();
		} catch(IOException ex) {
			logger.error("no se localiza el path de recursos: "+classPath);
		}
		return resourcePath;
	}

	@Override
	public String saveResourceFile(MultipartFile file, String path) {
		String dir = getResourcesPath("classpath:"+path) +
										file.getOriginalFilename();

		try {
			FileOutputStream stream = new FileOutputStream(dir);
			stream.write(file.getBytes());
			stream.close();
		} catch(Exception ex) {
			logger.error("No se puede persistir el archivo: "+dir);
			return null;
		}
		return file.getOriginalFilename();
	}

}

package com.dev.delta.dto;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.util.zip.Deflater;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.ClassPathResource;
import org.springframework.stereotype.Service;

import com.dev.delta.entities.ImageModel;
import com.dev.delta.repositories.CategoryRepository;
import com.dev.delta.repositories.ImageRepository;
import com.dev.delta.repositories.i18n.BuyRepositoryI18n;
import com.dev.delta.repositories.i18n.CategoryRepositoryI18n;

import io.micrometer.core.instrument.util.IOUtils;

@Service
public class CategoryDTO implements DTO {

	@Autowired
	CategoryRepository   categoryRepository;
	

	@Autowired
	CategoryRepositoryI18n   categoryRepositoryI18n;
	
	@Autowired
	ImageRepository   imageRepository;
	
	
	@Override
	public void populate() {
		category.setCategory_name("cat 1");
		categoryRepository.save(category);
		
		
		categoryI18n.setAddButtonI18n("Create");
		categoryI18n.setAddTitleI18n("Add category");
		categoryI18n.setAllTitleI18n("Categories");
		categoryI18n.setCloseButtonI18n("Close");
		categoryI18n.setEditButtonI18n("Edit");
		categoryI18n.setEditTitleI18n("Edit Category");
		categoryI18n.setResetButtonI18n("Reset");
		categoryI18n.setCategory_namei18n("Category Name");
		categoryI18n.setLangI18n("EN");
		categoryRepositoryI18n.save(categoryI18n);
		
		File resource;
		try {
			resource = new ClassPathResource("images/img.jpg").getFile();
			Files.readAllBytes(resource.toPath());
			ImageModel img = new ImageModel("img.jpg", "image/jpeg",

					compressBytes(Files.readAllBytes(resource.toPath())));
			imageRepository.save(img);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		

	}
	
	public static byte[] compressBytes(byte[] data) {

		Deflater deflater = new Deflater();

		deflater.setInput(data);

		deflater.finish();

		ByteArrayOutputStream outputStream = new ByteArrayOutputStream(data.length);

		byte[] buffer = new byte[1024];

		while (!deflater.finished()) {

			int count = deflater.deflate(buffer);

			outputStream.write(buffer, 0, count);
		}
		try {

			outputStream.close();

		} catch (IOException e) {

		}

		System.out.println("Compressed Image Byte Size - " + outputStream.toByteArray().length);

		return outputStream.toByteArray();

	}

}

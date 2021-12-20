package com.dev.delta;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.dev.delta.entities.Category;
import com.dev.delta.repositories.CategoryRepository;
import com.dev.delta.services.CategoryService;

@SpringBootTest
class SpringbootPharmalifeCodecanyon1ApplicationTests {

	@InjectMocks
	CategoryService categoryService;

	@Mock
	CategoryRepository categoryRepository;

	List<Category> list;

	@BeforeEach
	public void init() {
		MockitoAnnotations.openMocks(this);
		list = new ArrayList<Category>();
	}
	
	

	@Test
	public void getAllCategorysTest() {

		Category category1 = new Category();

		Category category2 = new Category();
		Category category3 = new Category();

		list.add(category1);
		list.add(category2);
		list.add(category3);
		when(categoryRepository.findAll()).thenReturn(list);
		// test
		List<Category> categoryList = (List<Category>) categoryService.findAll();
		assertEquals(3, categoryList.size());
		verify(categoryRepository, times(1)).findAll();
	}

	@Test
	public void getCategoryByIdTest() {

		when(categoryRepository.findById(1L)).thenReturn(Optional.of(new Category(1L, "hello")));

		Category category = categoryService.findById(1L);

		assertEquals("hello", category.getCategory_name());
		assertEquals(1L, category.getId());

	}

	@Test
	public void saveCategoryTest() {
		Category category1 = new Category();
		categoryService.saveOrUpdate(category1);
		verify(categoryRepository, times(1)).save(category1);
	}

}

package com.skillsmap.sfia.application.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultHandlers;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.skillsmap.sfia.application.repository.SfiaSkillRepository;

@RunWith(SpringJUnit4ClassRunner.class)
public class ContollerTests {

	private MockMvc mockMvc;
	
	@InjectMocks
	private SfiaSkillController controller;
	
	@Mock
	private SfiaSkillRepository repo;
	
	@Before
	public void setUp() throws Exception {
		mockMvc = MockMvcBuilders.standaloneSetup(controller).build();
	}
	
	@Test
	public void listTest() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/sfia/list"))
			.andExpect(MockMvcResultMatchers.content().contentType("application/json;charset=UTF-8"))
			.andExpect(MockMvcResultMatchers.status().isOk());
	}
	
	@Test
	public void listIDTest() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/sfia/id/{sfia_id}",
				"1"))
		.andDo(MockMvcResultHandlers.print())
		.andExpect(MockMvcResultMatchers.content().contentType("application/json;charset=UTF-8"))
		.andExpect(MockMvcResultMatchers.status().isOk());
	}
	
	@Test
	public void listCategories() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/sfia/listcategory"))
		.andDo(MockMvcResultHandlers.print())
		.andExpect(MockMvcResultMatchers.content().contentType("application/json;charset=UTF-8"))
		.andExpect(MockMvcResultMatchers.status().isOk());
	}
	
	@Test
	public void listSkillCodeTest() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/sfia/skillcode/{skillcode}",
				"GOVN"))
		.andDo(MockMvcResultHandlers.print())
		.andExpect(MockMvcResultMatchers.content().contentType("application/json;charset=UTF-8"))
		.andExpect(MockMvcResultMatchers.status().isOk());
	}
	
	@Test
	public void listSkillCategoryTest() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.get("/sfia/category/{skill_category}",
				"Strategy and architecture"))
		.andDo(MockMvcResultHandlers.print())
		.andExpect(MockMvcResultMatchers.content().contentType("application/json;charset=UTF-8"))
		.andExpect(MockMvcResultMatchers.status().isOk());
	}
	
	@Test
	public void deleteTest() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.delete("/sfia/delete/{skill_id}",
				"1"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
		.andExpect(MockMvcResultMatchers.content().string("Skill deleted"));
	}
	
	@Test
	public void putCategoryTest() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.put("http://localhost:9900/sfia/edit/category?skill_category={skill_category}"
				+ "&version_id={version_id}"
				+ "&skill_id={skill_id}",
				"Testing","9","1"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
		.andExpect(MockMvcResultMatchers.content().string("Updated category"));
	}
	
	@Test
	public void putSubCategoryTest() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.put("/sfia/edit/subcategory?skill_sub_category={skill_sub_category}"
				+ "&version_id={version_id}"
				+ "&skill_id={skill_id}",
				"Testing","9","1"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
		.andExpect(MockMvcResultMatchers.content().string("Updated subcategory"));
	}
	
	@Test
	public void putSkillCodeTest() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.put("/sfia/edit/skillcode?skillcode={skillcode}"
				+ "&version_id={version_id}"
				+ "&skill_id={skill_id}",
				"Testing","9","1"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
		.andExpect(MockMvcResultMatchers.content().string("Updated skillcode"));
	}
	
	@Test
	public void putSkillTest() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.put("/sfia/edit/skill?skill={skill}"
				+ "&version_id={version_id}"
				+ "&skill_id={skill_id}",
				"Testing","9","1"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
		.andExpect(MockMvcResultMatchers.content().string("Updated skill"));
	}
	
	@Test
	public void putDescriptionTest() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.put("/sfia/edit/description?skill_description={skill_description}"
				+ "&version_id={version_id}"
				+ "&skill_id={skill_id}",
				"Testing","9","1"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
		.andExpect(MockMvcResultMatchers.content().string("Updated description"));
	}
	
	@Test
	public void putLevel1Test() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.put("/sfia/edit/level1?level1={level1}"
				+ "&version_id={version_id}"
				+ "&skill_id={skill_id}",
				"Testing","9","1"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
		.andExpect(MockMvcResultMatchers.content().string("Updated Level 1"));
	}
	
	@Test
	public void putLevel2Test() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.put("/sfia/edit/level2?level2={level2}"
				+ "&version_id={version_id}"
				+ "&skill_id={skill_id}",
				"Testing","9","1"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
		.andExpect(MockMvcResultMatchers.content().string("Updated Level 2"));
	}
	
	@Test
	public void putLevel3Test() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.put("/sfia/edit/level3?level3={level3}"
				+ "&version_id={version_id}"
				+ "&skill_id={skill_id}",
				"Testing","9","1"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
		.andExpect(MockMvcResultMatchers.content().string("Updated Level 3"));
	}
	
	@Test
	public void putLevel4Test() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.put("/sfia/edit/level4?level4={level4}"
				+ "&version_id={version_id}"
				+ "&skill_id={skill_id}",
				"Testing","9","1"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
		.andExpect(MockMvcResultMatchers.content().string("Updated Level 4"));
	}
	
	@Test
	public void putLevel5Test() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.put("/sfia/edit/level5?level5={level5}"
				+ "&version_id={version_id}"
				+ "&skill_id={skill_id}",
				"Testing","9","1"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
		.andExpect(MockMvcResultMatchers.content().string("Updated Level 5"));
	}
	
	@Test
	public void putLevel6Test() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.put("/sfia/edit/level6?level6={level6}"
				+ "&version_id={version_id}"
				+ "&skill_id={skill_id}",
				"Testing","9","1"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
		.andExpect(MockMvcResultMatchers.content().string("Updated Level 6"));
	}
	
	@Test
	public void putLevel7Test() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.put("/sfia/edit/level7?level7={level7}"
				+ "&version_id={version_id}"
				+ "&skill_id={skill_id}",
				"Testing","9","1"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
		.andExpect(MockMvcResultMatchers.content().string("Updated Level 7"));
	}
	
	@Test
	public void postTest() throws Exception {
		mockMvc.perform(MockMvcRequestBuilders.post("/sfia/create?skill_category={skill_category}"
				+ "&skill_sub_category={skill_sub_category}"
				+ "&skill={skill}&skillcode={skillcode}"
				+ "&skill_description={skill_description}"
				+ "&level1={level1}"
				+ "&level2={level2}"
				+ "&level3={level3}"
				+ "&level4={level4}"
				+ "&level5={level5}"
				+ "&level6={level6}"
				+ "&level7={level7}"
				+ "&version_id={version_id}",
				"TestingSkillCategory","TestingSkillSubCategory","TestingSkill","TestingSkillCode","TestingDescription",
				"TestingLevel1","TestingLevel2","TestingLevel3","TestingLevel4","TestingLevel5","TestingLevel6","TestingLevel7",
				"1"))
		.andExpect(MockMvcResultMatchers.status().isOk())
		.andExpect(MockMvcResultMatchers.content().contentType("text/plain;charset=ISO-8859-1"))
		.andExpect(MockMvcResultMatchers.content().string("Saved"));
	}

}

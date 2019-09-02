package com.skillsmap.sfia.application.controller;

import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.skillsmap.sfia.application.entity.SfiaSkillBean;
import com.skillsmap.sfia.application.repository.SfiaSkillRepository;

@RestController
@Component
@CrossOrigin(origins = "http://localhost:4200") 
@RequestMapping("/sfia")
public class SfiaSkillController {
	
	SfiaSkillRepository repo;
	
	public SfiaSkillRepository getRepo() {
		return repo;
	}

	@Autowired
	public void setRepo(SfiaSkillRepository repo) {
		this.repo = repo;
	}

	@GetMapping("/list")
	public Iterable<SfiaSkillBean> getSkills() {
		return getRepo().findAll();
	}
	
	@GetMapping("/id/{skill_id}")
	public Optional<SfiaSkillBean> getSkillById(@PathVariable int skill_id){
		return getRepo().findById(skill_id);
	}
	
	@GetMapping("/listcategory")
	public List<String> listCategories() {
		return getRepo().findCategories();
	}
	
	@GetMapping("/skillcode/{skillcode}")
	public Optional<SfiaSkillBean> getSkillCode(@PathVariable String skillcode) {
		return getRepo().findBySkillCode(skillcode);
	}

	@GetMapping("/category/{skill_category}")
	public List<SfiaSkillBean> getSkillViaCategory(@PathVariable String skill_category) {
		return getRepo().findBySkillCategory(skill_category);
	}

	@DeleteMapping("/delete/{skill_id}")
	public String deleteSkillById(@PathVariable int skill_id) {
		getRepo().deleteById(skill_id);
		return "Skill deleted";
	}

	@PutMapping("/edit/category")
	public @ResponseBody String updateCategory(
			@RequestParam String skill_category,
			@RequestParam int version_id,
			@RequestParam int skill_id) {
		getRepo().updateSkillCategory(skill_category,version_id, skill_id);
		return "Updated category";
	}

	@PutMapping("/edit/subcategory")
	public @ResponseBody String updatesubcategory(
			@RequestParam String skill_sub_category,
			@RequestParam int version_id,
			@RequestParam int skill_id) {
		getRepo().updateSkillSubCategory(skill_sub_category, version_id, skill_id);
		return "Updated subcategory";
	}

	@PutMapping("/edit/skillcode")
	public @ResponseBody String updateskillcode(
			@RequestParam String skillcode,
			@RequestParam int version_id,
			@RequestParam int skill_id) {
		getRepo().updateSkillCode(skillcode, version_id, skill_id);
		return "Updated skillcode";
	}

	@PutMapping("/edit/skill")
	public @ResponseBody String updateskill(
			@RequestParam String skill,
			@RequestParam int version_id,
			@RequestParam int skill_id) {
		getRepo().updateSkill(skill, version_id, skill_id);
		return "Updated skill";
	}

	@PutMapping("/edit/description")
	public @ResponseBody String updateDescription(
			@RequestParam String skill_description,
			@RequestParam int version_id,
			@RequestParam int skill_id) {
		getRepo().updateSkillDescription(skill_description, version_id, skill_id);
		return "Updated description";
	}

	@PutMapping("/edit/level1")
	public @ResponseBody String level1(
			@RequestParam String level1,
			@RequestParam int version_id,
			@RequestParam int skill_id) {
		getRepo().updateSkillLevel1(level1, version_id, skill_id);
		return "Updated Level 1";
	}

	@PutMapping("/edit/level2")
	public @ResponseBody String level2(
			@RequestParam String level2,
			@RequestParam int version_id,
			@RequestParam int skill_id) {
		getRepo().updateSkillLevel2(level2, version_id, skill_id);
		return "Updated Level 2";
	}

	@PutMapping("/edit/level3")
	public @ResponseBody String level3(
			@RequestParam String level3,
			@RequestParam int version_id,
			@RequestParam int skill_id) {
		getRepo().updateSkillLevel3(level3, version_id, skill_id);
		return "Updated Level 3";
	}

	@PutMapping("/edit/level4")
	public @ResponseBody String level4(
			@RequestParam String level4,
			@RequestParam int version_id,
			@RequestParam int skill_id) {
		getRepo().updateSkillLevel4(level4, version_id, skill_id);
		return "Updated Level 4";
	}

	@PutMapping("/edit/level5")
	public @ResponseBody String level5(
			@RequestParam String level5,
			@RequestParam int version_id,
			@RequestParam int skill_id) {
		getRepo().updateSkillLevel5(level5, version_id, skill_id);
		return "Updated Level 5";
	}

	@PutMapping("/edit/level6")
	public @ResponseBody String level6(
			@RequestParam String level6,
			@RequestParam int version_id,
			@RequestParam int skill_id) {
		getRepo().updateSkillLevel6(level6, version_id, skill_id);
		return "Updated Level 6";
	}
	
	@PutMapping("/edit/level7")
	public @ResponseBody String level7(
			@RequestParam String level7,
			@RequestParam int version_id,
			@RequestParam int skill_id) {
		getRepo().updateSkillLevel7(level7, version_id, skill_id);
		return "Updated Level 7";
	}
	
	@PostMapping("/create")
	public @ResponseBody String addNewSkill (
			@RequestParam String skill_category,
			@RequestParam String skill_sub_category,
			@RequestParam String skill,
			@RequestParam String skillcode,
			@RequestParam String skill_description,
			@RequestParam String level1,
			@RequestParam String level2,
			@RequestParam String level3,
			@RequestParam String level4,
			@RequestParam String level5,
			@RequestParam String level6,
			@RequestParam String level7,
			@RequestParam int version_id
			) {
		
		SfiaSkillBean n = new SfiaSkillBean();
		n.setSkillCategory(skill_category);
		n.setSkillSubCategory(skill_sub_category);
		n.setSkill(skill);
		n.setSkillcode(skillcode);
		n.setSkillDescription(skill_description);
		n.setLevel1(level1);
		n.setLevel2(level2);
		n.setLevel3(level3);
		n.setLevel4(level4);
		n.setLevel5(level5);
		n.setLevel6(level6);
		n.setLevel7(level7);
		n.setVersion_id(version_id);
		
		repo.save(n);
		
		return "Saved";
	}
	
}

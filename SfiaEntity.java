package com.skillsmap.sfia.application.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.ws.rs.FormParam;
import javax.xml.bind.annotation.XmlRootElement;

import org.springframework.transaction.annotation.EnableTransactionManagement;

@Entity
@Table(name="sfia_skill")
@XmlRootElement
@EnableTransactionManagement
public class SfiaSkillBean {
	
	@FormParam("skill_id")
	public int skill_id;
	
	@FormParam("skill_category")
	public String skill_category;
	
	@FormParam("skill_sub_category")
	public String skill_sub_category;
	@FormParam("skill")
	public String skill;
	@FormParam("skillcode")
	public String skillcode;
	@FormParam("skill_description")
	public String skill_description;
	@FormParam("level1")
	public String level1;
	@FormParam("level2")
	public String level2;
	@FormParam("level3")
	public String level3;
	@FormParam("level4")
	public String level4;
	@FormParam("level5")
	public String level5;
	@FormParam("level6")
	public String level6;
	@FormParam("level7")
	public String level7;
	@FormParam("version_id")
	public int version_id;
		
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public int getSkillId() {
		return skill_id;
	}
	public void setSkillId(int skill_id) {
		this.skill_id = skill_id;
	}
	public String getSkillCategory() {
		return skill_category;
	}
	public void setSkillCategory(String skill_category) {
		this.skill_category = skill_category;
	}
	public String getSkillSubCategory() {
		return skill_sub_category;
	}
	public void setSkillSubCategory(String skill_sub_category) {
		this.skill_sub_category = skill_sub_category;
	}
	public String getSkill() {
		return skill;
	}
	public void setSkill(String skill) {
		this.skill = skill;
	}
	public String getSkillcode() {
		return skillcode;
	}
	public void setSkillcode(String skillcode) {
		this.skillcode = skillcode;
	}
	public String getSkillDescription() {
		return skill_description;
	}
	public void setSkillDescription(String skill_description) {
		this.skill_description = skill_description;
	}
	public String getLevel1() {
		return level1;
	}
	public void setLevel1(String level1) {
		this.level1 = level1;
	}
	public String getLevel2() {
		return level2;
	}
	public void setLevel2(String level2) {
		this.level2 = level2;
	}
	public String getLevel3() {
		return level3;
	}
	public void setLevel3(String level3) {
		this.level3 = level3;
	}
	public String getLevel4() {
		return level4;
	}
	public void setLevel4(String level4) {
		this.level4 = level4;
	}
	public String getLevel5() {
		return level5;
	}
	public void setLevel5(String level5) {
		this.level5 = level5;
	}
	public String getLevel6() {
		return level6;
	}
	public void setLevel6(String level6) {
		this.level6 = level6;
	}
	public String getLevel7() {
		return level7;
	}
	public void setLevel7(String level7) {
		this.level7 = level7;
	}
	public int getVersion_id() {
		return version_id;
	}
	public void setVersion_id(int version_id) {
		this.version_id = version_id;
	}
}

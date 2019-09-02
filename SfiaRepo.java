package com.skillsmap.sfia.application.repository;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import com.skillsmap.sfia.application.entity.SfiaSkillBean;

@Repository
@Component
public interface SfiaSkillRepository extends JpaRepository<SfiaSkillBean, Integer> {


	@Query(value="SELECT * FROM sfia_skill WHERE skillcode = ?1", nativeQuery = true)
	public Optional<SfiaSkillBean> findBySkillCode(@Param("skillcode") String skillcode);

	@Query(value="SELECT * FROM sfia_skill WHERE skill_category = ?1", nativeQuery = true)
	public List<SfiaSkillBean> findBySkillCategory(@Param("skill_category") String skill_category);
	
	@Query(value="SELECT DISTINCT(skill_category) from sfia_skill;", nativeQuery = true)
	public List<String> findCategories();
	
	@Modifying
	@Transactional
	@Query(value="UPDATE sfia_skill SET skill_category = ?1, version_id = ?2 WHERE skill_id = ?3", nativeQuery = true)
	public void updateSkillCategory(@Param("skill_category") String skill_category,
			@Param("version_id") int version_id,
			@Param("skill_id") int skill_id);
	
	@Modifying
	@Transactional
	@Query(value="UPDATE sfia_skill SET skill_sub_category = ?1, version_id = ?2 WHERE skill_id = ?3", nativeQuery = true)
	public void updateSkillSubCategory(@Param("skill_sub_category") String skill_sub_category,
			@Param("version_id") int version_id,
			@Param("skill_id") int skill_id);
	
	@Modifying
	@Transactional
	@Query(value="UPDATE sfia_skill SET skill = ?1, version_id = ?2 WHERE skill_id = ?3", nativeQuery = true)
	public void updateSkill(@Param("skill") String skill,
			@Param("version_id") int version_id,
			@Param("skill_id") int skill_id);
	
	@Modifying
	@Transactional
	@Query(value="UPDATE sfia_skill SET skillcode = ?1, version_id = ?2 WHERE skill_id = ?3", nativeQuery = true)
	public void updateSkillCode(@Param("skillcode") String skillcode,
			@Param("version_id") int version_id,
			@Param("skill_id") int skill_id);
	
	@Modifying
	@Transactional
	@Query(value="UPDATE sfia_skill SET skill_description = ?1, version_id = ?2 WHERE skill_id = ?3", nativeQuery = true)
	public void updateSkillDescription(@Param("skill_description") String skill_description,
			@Param("version_id") int version_id,
			@Param("skill_id") int skill_id);
	
	@Modifying
	@Transactional
	@Query(value="UPDATE sfia_skill SET level1 = ?1, version_id = ?2 WHERE skill_id = ?3", nativeQuery = true)
	public void updateSkillLevel1(@Param("level1") String level1,
			@Param("version_id") int version_id,
			@Param("skill_id") int skill_id);
	
	@Modifying
	@Transactional
	@Query(value="UPDATE sfia_skill SET level2 = ?1, version_id = ?2 WHERE skill_id = ?3", nativeQuery = true)
	public void updateSkillLevel2(@Param("level2") String level2,
			@Param("version_id") int version_id,
			@Param("skill_id") int skill_id);
	
	@Modifying
	@Transactional
	@Query(value="UPDATE sfia_skill SET level3 = ?1, version_id = ?2 WHERE skill_id = ?3", nativeQuery = true)
	public void updateSkillLevel3(@Param("level3") String level3,
			@Param("version_id") int version_id,
			@Param("skill_id") int skill_id);
	
	@Modifying
	@Transactional
	@Query(value="UPDATE sfia_skill SET level4 = ?1, version_id = ?2 WHERE skill_id = ?3", nativeQuery = true)
	public void updateSkillLevel4(@Param("level4") String level4,
			@Param("version_id") int version_id,
			@Param("skill_id") int skill_id);
	
	@Modifying
	@Transactional
	@Query(value="UPDATE sfia_skill SET level5 = ?1, version_id = ?2 WHERE skill_id = ?3", nativeQuery = true)
	public void updateSkillLevel5(@Param("level5") String level5,
			@Param("version_id") int version_id,
			@Param("skill_id") int skill_id);
	
	@Modifying
	@Transactional
	@Query(value="UPDATE sfia_skill SET level6 = ?1, version_id = ?2 WHERE skill_id = ?3", nativeQuery = true)
	public void updateSkillLevel6(@Param("level6") String level6,
			@Param("version_id") int version_id,
			@Param("skill_id") int skill_id);
	
	@Modifying
	@Transactional
	@Query(value="UPDATE sfia_skill SET level7 = ?1, version_id = ?2 WHERE skill_id = ?3", nativeQuery = true)
	public void updateSkillLevel7(@Param("level7") String level7,
			@Param("version_id") int version_id,
			@Param("skill_id") int skill_id);
	
}

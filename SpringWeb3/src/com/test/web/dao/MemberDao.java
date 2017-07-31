package com.test.web.dao;

import java.util.List;

import com.test.web.bean.MemberBean;

public interface MemberDao {

	public MemberBean selectMember(MemberBean bean);
	
	public List<MemberBean> selectMemberList();
	
	/** 회원가입 */
	public int insertMember(MemberBean bean);
	
	/** 회원수정 **/
	public int updateMember(MemberBean bean);
	
	/** 회원삭제 **/
	public int deleteMember(MemberBean bean);
	
	
	
}

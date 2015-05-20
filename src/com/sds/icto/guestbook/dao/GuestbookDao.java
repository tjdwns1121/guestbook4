package com.sds.icto.guestbook.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.ibatis.SqlMapClientTemplate;
import org.springframework.stereotype.Repository;

import com.sds.icto.guestbook.exception.UserDeleteException;
import com.sds.icto.guestbook.exception.UserInsertException;
import com.sds.icto.guestbook.vo.GuestbookVo;

@Repository
public class GuestbookDao {
	
	@Autowired
	SqlMapClientTemplate sqlMapClientTemplate;

	public void insert(GuestbookVo vo) {
		sqlMapClientTemplate.insert(
				"guestbook.insert", vo );
	}

	public void delete(Long id) {
	}

	public void delete() {
	}

	@SuppressWarnings("unchecked")
	public List<GuestbookVo> fetchList() {
		List<GuestbookVo> list = 
			sqlMapClientTemplate.queryForList( "guestbook.list" );
		return list;
	}
}

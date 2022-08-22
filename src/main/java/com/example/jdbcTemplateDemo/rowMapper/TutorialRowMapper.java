package com.example.jdbcTemplateDemo.rowMapper;


import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.jdbcTemplateDemo.model.Tutorial;

public class TutorialRowMapper implements RowMapper<Tutorial>
{
	@Override
	public Tutorial mapRow(ResultSet rs, int rowNum) throws SQLException 
	{
		Tutorial tutorial=new Tutorial();
		tutorial.setId(rs.getInt("id"));
		tutorial.setTitle(rs.getString("title"));
		tutorial.setDescription(rs.getString("description"));
		tutorial.setPublished(true);

		return tutorial;
	}
}

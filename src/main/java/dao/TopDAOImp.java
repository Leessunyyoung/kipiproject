package dao;

import java.util.List;

import org.mybatis.spring.SqlSessionTemplate;

import dto.TopDTO;

public class TopDAOImp implements TopDAO {
	private SqlSessionTemplate sqlSession;
	public TopDAOImp() {
	
	}
	
	public void setSqlSession(SqlSessionTemplate sqlSession) {
		this.sqlSession = sqlSession;
	}

	@Override
	public List<TopDTO> selectGetFile(String data) {
		return sqlSession.selectList("cafe.cafetop1",data);
	}



}

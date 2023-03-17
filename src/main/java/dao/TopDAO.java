package dao;

import java.util.List;

import dto.TopDTO;
public interface TopDAO {
	
	public List<TopDTO> selectGetFile(String data);
	

}

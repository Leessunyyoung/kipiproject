package service;

import java.util.List;

import dto.TopDTO;

public interface TopService {
	
	public List<TopDTO> selectGetFile(String data)throws Exception;

}

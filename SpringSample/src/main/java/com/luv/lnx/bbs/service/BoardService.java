package com.luv.lnx.bbs.service;

import java.util.List;

import com.luv.lnx.bbs.model.BoardVo;

public interface BoardService {
	
	public int insertBoard(BoardVo boardVo) throws Exception;
	
	public int updateBoard(BoardVo boardVo) throws Exception;
	
	public int deleteBoard(BoardVo boardVo) throws Exception;
		
	public BoardVo selectBoardDetail(BoardVo boardVo) throws Exception;
	
	public List<BoardVo> selectBoardList(BoardVo boardVo) throws Exception;
	
	public int selectBoardListCount(BoardVo boardVo) throws Exception;
	
}

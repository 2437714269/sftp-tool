package com.windaka.service.impl;

import com.windaka.entity.Ftps;
import com.windaka.mapper.FtpsMapper;
import com.windaka.service.FtpsService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

/**
 * @Description: 小区操作
 * @Author: zhj
 * @Date: 2022/11/12 12:38
 */
@Service
@RequiredArgsConstructor
public class FtpsServiceImpl implements FtpsService {

	private final FtpsMapper mapper;

	/**
	 * 获取小区信息
	 * @author zhj
	 * @date 12:53 2022/11/12
	 * @return com.windaka.entity.Ftps
	**/
	@Override
	public Ftps queryFtps() {
		return mapper.queryFtps();
	}






}

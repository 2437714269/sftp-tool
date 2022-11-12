package com.windaka.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;


/**
 * @author acer
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Ftps implements Serializable{
	/** 小区id */
	private String id ;
	/** 小区名字 */
	private String name ;
	/** 小区数据库sql文件 */
	private String originalpathSql ;
	/** 小区要上传的图片路径 */
	private String originalpathImg ;
	/** 压缩路径 */
	private String compresspath ;
	/** 上传到服务器的路径 */
	private String uploadpath ;
	/** 设置定时任务的时间 */
	private String scheduledtasktime ;

}

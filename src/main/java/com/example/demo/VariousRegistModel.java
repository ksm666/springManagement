package com.example.demo;

import lombok.Data;

@Data
public class VariousRegistModel {
	
	/** 管理番号 */
	private Integer id;

	/** 性 */
	private String sei;
	
	/** 名 */
	private String mei;
	
	/** 電話番号 */
	private Integer tel;
	
	/** メールアドレス */
	private String adress;
}

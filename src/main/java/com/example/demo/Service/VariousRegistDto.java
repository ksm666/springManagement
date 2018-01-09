package com.example.demo.Service;

import lombok.Data;

@Data
public class VariousRegistDto {

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

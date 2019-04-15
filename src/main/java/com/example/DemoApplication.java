package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DemoApplication {

	/**
	 *springboot的启动项
	 *
	 * git提交的步骤：
	 * 		1.将文件添加到提交文件中；红色：没有添加到提交文件中
	 * 		2.将文件提交到本地仓库；绿色：没有提交到本地仓库
	 * 		3.将文件从本地仓库提交到远程仓库
	 */

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}

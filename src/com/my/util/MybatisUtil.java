package com.my.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class MybatisUtil {

	private static SqlSessionFactory sqlSessionFactory;
	static {
		try {
			InputStream inputStream = Resources.getResourceAsStream("mybatis.cfg.xml");

			// 初始化mybatis，创建SqlSessionFactory类的实例
			SqlSessionFactoryBuilder sqlSessionFactorybuilder = new SqlSessionFactoryBuilder();
			sqlSessionFactory = sqlSessionFactorybuilder.build(inputStream);

		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public static SqlSession openseesion() {

		return sqlSessionFactory.openSession();

	}
}

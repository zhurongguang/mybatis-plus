/**
 * Copyright (c) 2011-2014, hubin (jobob@qq.com).
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not
 * use this file except in compliance with the License. You may obtain a copy of
 * the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS, WITHOUT
 * WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the
 * License for the specific language governing permissions and limitations under
 * the License.
 */
package com.baomidou.mybatisplus.mapper;

/**
 * <p>
 * MybatisPlus 数据库类型
 * </p>
 * 
 * @author hubin
 * @Date 2016-04-15
 */
public enum DBType {
	/**
	 * MYSQL
	 */
	MYSQL("mysql", "MySql数据库"),
	/**
	 * ORACLE
	 */
	ORACLE("oracle", "Oracle数据库"),
	/**
	 * DB2
	 */
	DB2("db2", "DB2数据库"),
	/**
	 * H2
	 */
	H2("h2", "H2数据库"),
	/**
	 * HSQL
	 */
	HSQL("hsql", "HSQL数据库"),
	/**
	 * SQLITE
	 */
	SQLITE("sqlite", "SQLite数据库"),
	/**
	 * POSTGRE
	 */
	POSTGRE("postgre", "Postgre数据库"),
	/**
	 * SQLSERVER2005
	 */
	SQLSERVER2005("sqlserver2005", "SQLServer2005数据库"),
	/**
	 * SQLSERVER
	 */
	SQLSERVER("sqlserver", "SQLServer数据库"),
	/**
	 * UNKONWN DB
	 */
	OTHER("other", "其他数据库");

	private final String db;

	private final String desc;

	DBType(final String db, final String desc) {
		this.db = db;
		this.desc = desc;
	}

	/**
	 * <p>
	 * 获取数据库类型（默认 MySql）
	 * </p>
	 * 
	 * @param dbType
	 *            数据库类型字符串
	 * @return
	 */
	public static DBType getDBType(String dbType) {
		for (DBType dt : DBType.values()) {
			if (dt.getDb().equals(dbType)) {
				return dt;
			}
		}
		return MYSQL;
	}

	public String getDb() {
		return this.db;
	}

	public String getDesc() {
		return this.desc;
	}

}

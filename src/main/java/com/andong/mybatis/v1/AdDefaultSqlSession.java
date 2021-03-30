package com.andong.mybatis.v1;

/**
 * @Author: andong
 */
public class AdDefaultSqlSession {
    private AdConfiguration configuration;

    private AdExecutor executor;

    public AdDefaultSqlSession(AdConfiguration configuration, AdExecutor executor){
        this.configuration = configuration;
        this.executor = executor;
    }

    public <T> T selectOne(String statementId, Object paramater){
        // 根据statementId拿到SQL
        String sql = AdConfiguration.sqlMappings.getString(statementId);
        if(null != sql && !"".equals(sql)){
            return executor.query(sql, paramater );
        }
        return null;
    }

    public <T> T getMapper(Class clazz){
        return configuration.getMapper(clazz, this);
    }

}

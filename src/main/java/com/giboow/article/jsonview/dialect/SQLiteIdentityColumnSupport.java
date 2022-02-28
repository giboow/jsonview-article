package com.giboow.article.jsonview.dialect;

import lombok.extern.log4j.Log4j2;
import org.hibernate.MappingException;
import org.hibernate.dialect.identity.IdentityColumnSupportImpl;

@Log4j2
public class SQLiteIdentityColumnSupport extends IdentityColumnSupportImpl {

    @Override
    public boolean supportsIdentityColumns() {
        return true;
    }

    @Override
    public String getIdentitySelectString(String table, String column, int type) throws MappingException {
        return "select last_insert_rowid()";
    }

    @Override
    public String getIdentityColumnString(int type) throws MappingException {
        return "integer";
    }
}

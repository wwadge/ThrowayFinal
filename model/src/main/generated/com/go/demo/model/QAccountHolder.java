package com.go.demo.model;

import static com.mysema.query.types.PathMetadataFactory.*;

import com.mysema.query.types.path.*;

import com.mysema.query.types.PathMetadata;
import javax.annotation.Generated;
import com.mysema.query.types.Path;


/**
 * QAccountHolder is a Querydsl query type for AccountHolder
 */
@Generated("com.mysema.query.codegen.EntitySerializer")
public class QAccountHolder extends EntityPathBase<AccountHolder> {

    private static final long serialVersionUID = -1570168094L;

    public static final QAccountHolder accountHolder = new QAccountHolder("accountHolder");

    public final StringPath emailAddress = createString("emailAddress");

    public final NumberPath<Long> id = createNumber("id", Long.class);

    public QAccountHolder(String variable) {
        super(AccountHolder.class, forVariable(variable));
    }

    public QAccountHolder(Path<? extends AccountHolder> path) {
        super(path.getType(), path.getMetadata());
    }

    public QAccountHolder(PathMetadata<?> metadata) {
        super(AccountHolder.class, metadata);
    }

}


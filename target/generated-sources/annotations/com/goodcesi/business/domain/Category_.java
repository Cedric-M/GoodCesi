package com.goodcesi.business.domain;

import com.goodcesi.business.domain.Item;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2019-04-08T16:19:25")
@StaticMetamodel(Category.class)
public class Category_ { 

    public static volatile SingularAttribute<Category, Long> id;
    public static volatile SingularAttribute<Category, String> title;
    public static volatile ListAttribute<Category, Item> items;

}
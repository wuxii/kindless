package com.kindless.moment.domain;

import com.kindless.apis.domain.BaseEntity;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import java.util.List;

/**
 * @author wuxii
 */
@Getter
@Setter
@Entity
@Table(name = "m_moment")
public class Moment extends BaseEntity {

    private static final long serialVersionUID = 8771195580832724400L;
    private long userId;
    private String content;
    private int status;
    private int type;
    private int resourceSize;
    private String source;

    @OneToMany(mappedBy = "moment", orphanRemoval = true, cascade = CascadeType.PERSIST)
    private List<MomentResource> resources;

}

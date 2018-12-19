package com.harmony.kindless.apis.domain.user;

import com.harmony.kindless.apis.domain.BaseEntity;
import com.harmony.kindless.apis.domain.Tables;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

/**
 * @author wuxii
 */
@Getter
@Setter
@Entity
@Table(name = Tables.USER_TABLE_PREFIX + "user_account", schema = Tables.USER_SCHEMA)
public class UserAccount extends BaseEntity {

    public static final int TYPE_OF_PHONE = 0;
    public static final int TYPE_OF_EMAIL = 1;
    public static final int TYPE_OF_WEIXIN = 2;

    public static final int STATUS_OF_PREPARE = 0;

    private static final long serialVersionUID = -4294906418539267902L;

    private int type;
    private int status;
    private String account;

    @ManyToOne
    @JoinColumn(name = "user_id", foreignKey = @ForeignKey(name = "fk_user_account_user_id"))
    private User user;

}

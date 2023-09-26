
CREATE TABLE tb_users_has_dev_role(
    user_id BIGINT,
    devrol_id BIGINT,
    PRIMARY KEY (user_id, devrol_id),
    FOREIGN KEY (user_id) REFERENCES tb_users(id),
    FOREIGN KEY (devrol_id) REFERENCES tb_dev_role(id)
);

CREATE TABLE tb_forms(
    id          BIGINT NOT NULL AUTO_INCREMENT,
    tittle      VARCHAR(255),
    description TEXT,
    start       DATETIME,
    end         DATETIME,
    user_id     BIGINT,
    PRIMARY KEY (id),
    FOREIGN KEY (user_id) REFERENCES tb_users (id)
);

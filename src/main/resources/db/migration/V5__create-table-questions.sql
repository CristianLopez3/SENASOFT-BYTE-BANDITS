CREATE TABLE tb_questions(
    id          BIGINT NOT NULL AUTO_INCREMENT,
    description TEXT,
    form_id     BIGINT,
    PRIMARY KEY (id),
    FOREIGN KEY (form_id) REFERENCES tb_forms(id)
);
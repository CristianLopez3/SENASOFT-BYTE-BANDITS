CREATE TABLE tb_options_question(
    id          bigint PRIMARY KEY AUTO_INCREMENT,
    description varchar(255),
    question_id bigint,
    FOREIGN KEY (question_id) REFERENCES tb_questions(id)
);

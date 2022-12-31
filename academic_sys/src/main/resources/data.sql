INSERT
    INTO TB_STUDENT (tb_student_id, student_name, student_age, student_cpf, student_registration)
    VALUES (1, 'Matilda Soares Mota', 19, '925.135.155-23', 202200078982);
INSERT
    INTO TB_STUDENT (tb_student_id, student_name, student_age, student_cpf, student_registration)
    VALUES (2, 'Paulo Sérgio Miranda Silva', 21, '251.512.333-23', 202200035112);
INSERT
    INTO TB_STUDENT (tb_student_id, student_name, student_age, student_cpf, student_registration)
    VALUES (3, 'Antonia Freire Santos Lima', 20, '023.512.531.23', 202200019815);
INSERT
    INTO TB_STUDENT (tb_student_id, student_name, student_age, student_cpf, student_registration)
    VALUES (4, 'João Melo e Silva', 18, '321.521.555-83', 202200083231);

INSERT INTO TB_COURSE (tb_course_id, course_name) VALUES (10001, 'Algoritmos e Lógica de Programação');
INSERT INTO TB_COURSE (tb_course_id, course_name) VALUES (10002, 'Programação Orientada a Objetos');
INSERT INTO TB_COURSE (tb_course_id, course_name) VALUES (10003, 'Banco de Dados');
INSERT INTO TB_COURSE (tb_course_id, course_name) VALUES (10004, 'Análise e Modelagem de Sistemas');
INSERT INTO TB_COURSE (tb_course_id, course_name) VALUES (10005, 'Gestão de Times Ágeis');
INSERT INTO TB_COURSE (tb_course_id, course_name) VALUES (10006, 'Gerência de Configuração');

INSERT INTO TB_COURSE (tb_course_id, course_name) VALUES (20001, 'Linguística I');
INSERT INTO TB_COURSE (tb_course_id, course_name) VALUES (20002, 'Língua Inglesa I');
INSERT INTO TB_COURSE (tb_course_id, course_name) VALUES (20003, 'Produção de Textos I');
INSERT INTO TB_COURSE (tb_course_id, course_name) VALUES (20004, 'Introdução aos Estudos Literários');
INSERT INTO TB_COURSE (tb_course_id, course_name) VALUES (20005, 'Língua Latina I');
INSERT INTO TB_COURSE (tb_course_id, course_name) VALUES (20006, 'Inglês Instrumental');

INSERT INTO TB_STUDENT_COURSE (STUDENT_ID, COURSE_ID) VALUES (1, 10001);
INSERT INTO TB_STUDENT_COURSE (STUDENT_ID, COURSE_ID) VALUES (1, 10002);
INSERT INTO TB_STUDENT_COURSE (STUDENT_ID, COURSE_ID) VALUES (1, 10004);
INSERT INTO TB_STUDENT_COURSE (STUDENT_ID, COURSE_ID) VALUES (2, 10001);
INSERT INTO TB_STUDENT_COURSE (STUDENT_ID, COURSE_ID) VALUES (2, 10002);
INSERT INTO TB_STUDENT_COURSE (STUDENT_ID, COURSE_ID) VALUES (2, 10003);
INSERT INTO TB_STUDENT_COURSE (STUDENT_ID, COURSE_ID) VALUES (2, 10005);

INSERT INTO TB_STUDENT_COURSE (STUDENT_ID, COURSE_ID) VALUES (3, 20001);
INSERT INTO TB_STUDENT_COURSE (STUDENT_ID, COURSE_ID) VALUES (3, 20003);
INSERT INTO TB_STUDENT_COURSE (STUDENT_ID, COURSE_ID) VALUES (3, 20005);
INSERT INTO TB_STUDENT_COURSE (STUDENT_ID, COURSE_ID) VALUES (4, 20001);
INSERT INTO TB_STUDENT_COURSE (STUDENT_ID, COURSE_ID) VALUES (4, 20002);
INSERT INTO TB_STUDENT_COURSE (STUDENT_ID, COURSE_ID) VALUES (4, 20005);

INSERT INTO TB_FINANCIAL_AID (tb_aid_id, aid_type, aid_amount) VALUES (1, 'FOOD', 200.00);
INSERT INTO TB_FINANCIAL_AID (tb_aid_id, aid_type, aid_amount) VALUES (2, 'HOUSING', 400.00);
INSERT INTO TB_FINANCIAL_AID (tb_aid_id, aid_type, aid_amount) VALUES (3, 'TRANSPORT', 100.00);
INSERT INTO TB_FINANCIAL_AID (tb_aid_id, aid_type, aid_amount) VALUES (4, 'BOOKS', 100.00);

INSERT INTO TB_STUDENT_AID (STUDENT_ID, AID_ID) VALUES (1, 1);
INSERT INTO TB_STUDENT_AID (STUDENT_ID, AID_ID) VALUES (1, 3);
INSERT INTO TB_STUDENT_AID (STUDENT_ID, AID_ID) VALUES (1, 4);
INSERT INTO TB_STUDENT_AID (STUDENT_ID, AID_ID) VALUES (2, 1);
INSERT INTO TB_STUDENT_AID (STUDENT_ID, AID_ID) VALUES (2, 2);
INSERT INTO TB_STUDENT_AID (STUDENT_ID, AID_ID) VALUES (2, 4);
INSERT INTO TB_STUDENT_AID (STUDENT_ID, AID_ID) VALUES (4, 1);
INSERT INTO TB_STUDENT_AID (STUDENT_ID, AID_ID) VALUES (4, 4);


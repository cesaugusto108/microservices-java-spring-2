INSERT INTO TB_OPERATOR (OPERATOR_EMAIL, OPERATOR_NAME, OPERATOR_PASSWORD) VALUES ('gerson@email.com', 'Gerson', '$2a$10$ffrTfPS0rRmh8kS3c7Gvbez/msCd3ya0GPluZpH8UVN0dK51Pob7C');
INSERT INTO TB_OPERATOR (OPERATOR_EMAIL, OPERATOR_NAME, OPERATOR_PASSWORD) VALUES ('juliana@email.com', 'Juliana', '$2a$10$ffrTfPS0rRmh8kS3c7Gvbez/msCd3ya0GPluZpH8UVN0dK51Pob7C');

INSERT INTO TB_ROLE (ROLE_DESCRIPTION) VALUES ('ROLE_OPERATOR');
INSERT INTO TB_ROLE (ROLE_DESCRIPTION) VALUES ('ROLE_ADMIN');

INSERT INTO TB_OPERATOR_ROLE (OPERATOR_ID, ROLE_ID) VALUES (1, 1);
INSERT INTO TB_OPERATOR_ROLE (OPERATOR_ID, ROLE_ID) VALUES (2, 1);
INSERT INTO TB_OPERATOR_ROLE (OPERATOR_ID, ROLE_ID) VALUES (2, 2);
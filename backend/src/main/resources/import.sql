INSERT INTO tb_vacation_dates(start_date,end_date) VALUES ('2021-01-01','2021-01-20');
INSERT INTO tb_vacation_dates(start_date,end_date) VALUES ('2021-01-21','2021-02-09');
INSERT INTO tb_vacation_dates(start_date,end_date) VALUES ('2021-02-10','2021-03-01');
INSERT INTO tb_vacation_dates(start_date,end_date) VALUES ('2021-03-02','2021-03-21');
INSERT INTO tb_vacation_dates(start_date,end_date) VALUES ('2021-03-22','2021-04-10');
INSERT INTO tb_vacation_dates(start_date,end_date) VALUES ('2021-04-11','2021-04-30');
INSERT INTO tb_vacation_dates(start_date,end_date) VALUES ('2021-05-01','2021-05-20');
INSERT INTO tb_vacation_dates(start_date,end_date) VALUES ('2021-05-21','2021-06-09');
INSERT INTO tb_vacation_dates(start_date,end_date) VALUES ('2021-06-10','2021-06-29');
INSERT INTO tb_vacation_dates(start_date,end_date) VALUES ('2021-06-30','2021-07-19');
INSERT INTO tb_vacation_dates(start_date,end_date) VALUES ('2021-07-20','2021-08-08');
INSERT INTO tb_vacation_dates(start_date,end_date) VALUES ('2021-08-09','2021-08-28');
INSERT INTO tb_vacation_dates(start_date,end_date) VALUES ('2021-08-29','2021-09-17');
INSERT INTO tb_vacation_dates(start_date,end_date) VALUES ('2021-09-18','2021-10-07');
INSERT INTO tb_vacation_dates(start_date,end_date) VALUES ('2021-10-08','2021-10-27');
INSERT INTO tb_vacation_dates(start_date,end_date) VALUES ('2021-10-28','2021-11-16');
INSERT INTO tb_vacation_dates(start_date,end_date) VALUES ('2021-11-17','2021-12-06');
INSERT INTO tb_vacation_dates(start_date,end_date) VALUES ('2021-12-07','2021-12-26');
INSERT INTO tb_vacation_dates(start_date,end_date) VALUES ('2021-12-27','2022-01-15');
INSERT INTO tb_vacation_dates(start_date,end_date) VALUES ('2022-01-16','2022-02-04');

INSERT INTO tb_users(name,email) VALUES ('tecnico1','tecnico1@email.com');
INSERT INTO tb_users(name,email) VALUES ('tecnico2','tecnico2@email.com');

INSERT INTO tb_choice_sequence(user_id) VALUES ('1');
INSERT INTO tb_choice_sequence(user_id) VALUES (null);
INSERT INTO tb_choice_sequence(user_id) VALUES (null);
INSERT INTO tb_choice_sequence(user_id) VALUES (null);
INSERT INTO tb_choice_sequence(user_id) VALUES (null);
INSERT INTO tb_choice_sequence(user_id) VALUES (null);
INSERT INTO tb_choice_sequence(user_id) VALUES (null);
INSERT INTO tb_choice_sequence(user_id) VALUES (null);
INSERT INTO tb_choice_sequence(user_id) VALUES (null);
INSERT INTO tb_choice_sequence(user_id) VALUES (null);

INSERT INTO tb_users_periods(start_date,end_date,semester_enum,user_id) VALUES ('2021-01-01','2021-06-30',1,1);
INSERT INTO tb_users_periods(start_date,end_date,semester_enum,user_id) VALUES ('2021-07-01','2021-12-31',2,1);
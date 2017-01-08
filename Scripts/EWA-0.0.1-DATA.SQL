INSERT INTO `ewa`.`ewa_user`
 (`id`,`email`, `group_id`, `studentnr`, `is_teacher`, `last_name`, `first_name`)
 VALUES (3, "b.taluy@hotmail.com", 1, 533678, 0 , "Taluy", "Berfu");
INSERT INTO `ewa`.`ewa_user` (`id`,`email`, `group_id`, `studentnr`, `is_teacher`, `last_name`, `first_name`) VALUES (4, "caatjeviaatje@hotmail.com", 1, 533679, 0 , "Swagmaster", "Janine");

INSERT INTO `ewa`.`ewa_result`
 (`id`,`user_id`, `date`, `grade`, `subjectpart_id`, `subject_id`)
 VALUES (5, 3, "2017-01-08 14:40:00", 9.0, 1 , NULL),
  (6, 3, "2017-01-08 14:40:00", 6.8, 2 , NULL),
  (7, 3, "2017-01-08 14:40:00", 8.8, 3 , NULL),
  (8, 3, "2017-01-08 14:40:00", 5.7, 4 , NULL),
        (9, 4, "2017-01-08 14:40:00", 7.4, 1 , NULL),
  (10, 4, "2017-01-08 14:40:00", 8.2, 2 , NULL),
  (11, 4, "2017-01-08 14:40:00", 10.0, 3 , NULL),
  (12, 4, "2017-01-08 14:40:00", 9.3, 4 , NULL);
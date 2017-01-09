INSERT INTO `ewa`.`ewa_subject` (`id`, `name`, `points`) VALUES ('3', 'Datastructures', '3');
INSERT INTO `ewa`.`ewa_subject` (`id`, `name`, `points`) VALUES ('4', 'Sorting & Searching', '3');
INSERT INTO `ewa`.`ewa_subject` (`id`, `name`, `points`) VALUES ('5', 'EWA', '15');
INSERT INTO `ewa`.`ewa_subject` (`id`, `name`, `points`) VALUES ('6', 'OOAD', '3');
UPDATE `ewa`.`ewa_subject_part` SET `name`='Prof. Skills - Casus' WHERE `id`='4';
UPDATE `ewa`.`ewa_subject_part` SET `name`='Essential Skills - Engels' WHERE `id`='3';
UPDATE `ewa`.`ewa_subject_part` SET `name`='Essential Skills - Nederlands' WHERE `id`='2';
UPDATE `ewa`.`ewa_subject_part` SET `name`='Essential Skills - Mathematics' WHERE `id`='1';
INSERT INTO `ewa`.`ewa_subject_part` (`id`, `name`, `parentsubject_id`, `points`) VALUES ('5', 'Datastructures: Tentamen', '3', '3');
INSERT INTO `ewa`.`ewa_subject_part` (`id`, `name`, `parentsubject_id`, `points`) VALUES ('6', 'Sorting & Searching - Tentamen', '4', '3');
INSERT INTO `ewa`.`ewa_subject_part` (`id`, `name`, `parentsubject_id`, `points`) VALUES ('7', 'EWA: Product', '5', '3');
INSERT INTO `ewa`.`ewa_subject_part` (`id`, `name`, `parentsubject_id`, `points`) VALUES ('8', 'EWA: Techno', '5', '3');
INSERT INTO `ewa`.`ewa_subject_part` (`id`, `name`, `parentsubject_id`, `points`) VALUES ('9', 'EWA: Proces', '5', '3');
INSERT INTO `ewa`.`ewa_subject_part` (`id`, `name`, `parentsubject_id`, `points`) VALUES ('10', 'EWA: Frond-End', '5', '3');
INSERT INTO `ewa`.`ewa_subject_part` (`id`, `name`, `parentsubject_id`, `points`) VALUES ('11', 'EWA: Back-end', '5', '3');
INSERT INTO `ewa`.`ewa_subject_part` (`id`, `name`, `parentsubject_id`, `points`) VALUES ('12', 'OOAD - Tentamen', '6', '3');
INSERT INTO `ewa`.`ewa_user` (`id`, `email`, `is_teacher`, `last_name`, `first_name`) VALUES ('5', 'm.mercera@hva.nl', '1', 'Mercera', 'Michel');
INSERT INTO `ewa`.`ewa_user` (`id`, `email`, `is_teacher`, `last_name`, `first_name`) VALUES ('6', 'j.somers@hva.nl', '1', 'Somers', 'John');
INSERT INTO `ewa`.`ewa_user` (`id`, `email`, `is_teacher`, `last_name`, `first_name`) VALUES ('7', 'e.ravenstijn@hva.nl', '1', 'Ravenstijn', 'Eric');
INSERT INTO `ewa`.`ewa_group_has_subject` (`group_id`, `subject_id`, `id`, `semester`, `block`, `teacher_id`) VALUES ('1', '3', '3', '1', '2', '7');
UPDATE `ewa`.`ewa_group_has_subject` SET `block`='1' WHERE `id`='1';
UPDATE `ewa`.`ewa_group_has_subject` SET `block`='1' WHERE `id`='2';
INSERT INTO `ewa`.`ewa_group_has_subject` (`group_id`, `subject_id`, `id`, `semester`, `block`, `teacher_id`) VALUES ('1', '4', '4', '2', '3', '7');
INSERT INTO `ewa`.`ewa_group_has_subject` (`group_id`, `subject_id`, `id`, `semester`, `block`, `teacher_id`) VALUES ('1', '5', '5', '1', '2', '5');
INSERT INTO `ewa`.`ewa_group_has_subject` (`group_id`, `subject_id`, `id`, `semester`, `block`, `teacher_id`) VALUES ('1', '6', '6', '1', '1', '6');
UPDATE `ewa`.`ewa_group_has_subject` SET `exam_date`='2016-12-12 20:00:00' WHERE `id`='1';
UPDATE `ewa`.`ewa_group_has_subject` SET `exam_date`='2016-12-12 21:00:00' WHERE `id`='2';
UPDATE `ewa`.`ewa_group_has_subject` SET `exam_date`='2017-01-08 18:00:00' WHERE `id`='3';
UPDATE `ewa`.`ewa_group_has_subject` SET `exam_date`='2017-01-09 22:00:00' WHERE `id`='4';
UPDATE `ewa`.`ewa_group_has_subject` SET `exam_date`='2017-01-10 20:30:00' WHERE `id`='5';
UPDATE `ewa`.`ewa_group_has_subject` SET `exam_date`='2017-01-11 19:30:00' WHERE `id`='6';





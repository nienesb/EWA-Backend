CREATE TABLE `ewa`.`ewa_user_role` (
  `id` INT NOT NULL,
  `name` VARCHAR(45) NULL,
  PRIMARY KEY (`id`));

INSERT INTO `ewa`.`ewa_user_role` (`id`, `name`) VALUES ('1', 'admin');
INSERT INTO `ewa`.`ewa_user_role` (`id`, `name`) VALUES ('2', 'docent');
INSERT INTO `ewa`.`ewa_user_role` (`id`, `name`) VALUES ('3', 'student');

ALTER TABLE `ewa`.`ewa_user` 
ADD COLUMN `userRole_id` INT(11) NULL;
UPDATE `ewa`.`ewa_user` SET `userRole_id`='1' WHERE `id`='1';
UPDATE `ewa`.`ewa_user` SET `userRole_id`='2' WHERE `id`='2';
UPDATE `ewa`.`ewa_user` SET `userRole_id`='3' WHERE `id`='3';
UPDATE `ewa`.`ewa_user` SET `userRole_id`='3' WHERE `id`='4';
UPDATE `ewa`.`ewa_user` SET `userRole_id`='2' WHERE `id`='5';
UPDATE `ewa`.`ewa_user` SET `userRole_id`='2' WHERE `id`='6';
UPDATE `ewa`.`ewa_user` SET `userRole_id`='2' WHERE `id`='7';
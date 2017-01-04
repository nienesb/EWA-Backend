ALTER TABLE `ewa`.`ewa_result` 
CHANGE COLUMN `user` `user_id` INT(11) NULL DEFAULT NULL ;

ALTER TABLE `ewa`.`ewa_result` 
CHANGE COLUMN `user` `user_id` INT(11) NULL DEFAULT NULL ;

ALTER TABLE `ewa`.`ewa_result` 
CHANGE COLUMN `subject_part` `subject_part_id` INT(11) NULL DEFAULT NULL ;

ALTER TABLE `ewa`.`ewa_subject_part` 
CHANGE COLUMN `parent_subect` `parent_subect_id` INT(11) NULL DEFAULT NULL ;

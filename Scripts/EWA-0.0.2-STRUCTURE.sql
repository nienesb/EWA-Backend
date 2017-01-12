ALTER TABLE `ewa`.`ewa_group_has_subject` 
ADD COLUMN `exam_date` TIMESTAMP NULL AFTER `teacher`;

ALTER TABLE `ewa`.`ewa_group_has_subject` 
CHANGE COLUMN `teacher` `teacher_id` INT(11) NULL DEFAULT NULL ;

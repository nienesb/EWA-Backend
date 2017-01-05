ALTER TABLE `ewa`.`ewa_result` 
CHANGE COLUMN `subject_part_id` `subjectpart_id` INT(11) NULL DEFAULT NULL ;

ALTER TABLE `ewa`.`ewa_subject_part` 
CHANGE COLUMN `parent_subject_id` `parentsubject_id` INT(11) NULL DEFAULT NULL ;

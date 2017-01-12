CREATE DATABASE  IF NOT EXISTS `ewa` /*!40100 DEFAULT CHARACTER SET utf8 */;
USE `ewa`;
-- MySQL dump 10.13  Distrib 5.7.12, for Win64 (x86_64)
--
-- Host: localhost    Database: ewa
-- ------------------------------------------------------
-- Server version	5.7.17-log

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `ewa_group`
--

DROP TABLE IF EXISTS `ewa_group`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ewa_group` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `year` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ewa_group`
--

LOCK TABLES `ewa_group` WRITE;
/*!40000 ALTER TABLE `ewa_group` DISABLE KEYS */;
INSERT INTO `ewa_group` VALUES (1,'ID2S01','2'),(2,'ID2S02','2');
/*!40000 ALTER TABLE `ewa_group` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ewa_group_has_subject`
--

DROP TABLE IF EXISTS `ewa_group_has_subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ewa_group_has_subject` (
  `group_id` int(11) NOT NULL,
  `subject_id` int(11) NOT NULL,
  `id` int(11) NOT NULL,
  `semester` int(11) DEFAULT NULL,
  `block` int(11) DEFAULT NULL,
  `teacher` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ewa_group_has_subject`
--

LOCK TABLES `ewa_group_has_subject` WRITE;
/*!40000 ALTER TABLE `ewa_group_has_subject` DISABLE KEYS */;
INSERT INTO `ewa_group_has_subject` VALUES (1,1,1,1,2,2),(1,2,2,NULL,2,2);
/*!40000 ALTER TABLE `ewa_group_has_subject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ewa_result`
--

DROP TABLE IF EXISTS `ewa_result`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ewa_result` (
  `id` int(11) NOT NULL,
  `user_id` int(11) DEFAULT NULL,
  `date` timestamp NULL DEFAULT NULL,
  `grade` double DEFAULT NULL,
  `subjectpart_id` int(11) DEFAULT NULL,
  `subject_id` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ewa_result`
--

LOCK TABLES `ewa_result` WRITE;
/*!40000 ALTER TABLE `ewa_result` DISABLE KEYS */;
INSERT INTO `ewa_result` VALUES (1,1,'2017-01-02 14:00:00',8.5,1,NULL),(2,1,'2017-01-02 14:00:00',6.3,2,NULL),(3,1,'2017-01-02 14:00:00',7.2,3,NULL),(4,1,'2017-01-02 14:00:00',7.2,4,NULL);
/*!40000 ALTER TABLE `ewa_result` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ewa_subject`
--

DROP TABLE IF EXISTS `ewa_subject`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ewa_subject` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `name` varchar(45) DEFAULT NULL,
  `points` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=3 DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ewa_subject`
--

LOCK TABLES `ewa_subject` WRITE;
/*!40000 ALTER TABLE `ewa_subject` DISABLE KEYS */;
INSERT INTO `ewa_subject` VALUES (1,'Essential Skills','9'),(2,'Prof Skills Adviesvaardigheden','3');
/*!40000 ALTER TABLE `ewa_subject` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ewa_subject_part`
--

DROP TABLE IF EXISTS `ewa_subject_part`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ewa_subject_part` (
  `id` int(11) NOT NULL,
  `name` varchar(45) DEFAULT NULL,
  `parentsubject_id` int(11) DEFAULT NULL,
  `points` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ewa_subject_part`
--

LOCK TABLES `ewa_subject_part` WRITE;
/*!40000 ALTER TABLE `ewa_subject_part` DISABLE KEYS */;
INSERT INTO `ewa_subject_part` VALUES (1,'Mathematics',1,3),(2,'Nederlands',1,3),(3,'Engels',1,3),(4,'Casus',2,3);
/*!40000 ALTER TABLE `ewa_subject_part` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `ewa_user`
--

DROP TABLE IF EXISTS `ewa_user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `ewa_user` (
  `id` int(11) NOT NULL,
  `email` varchar(45) DEFAULT NULL,
  `group_id` int(11) DEFAULT NULL,
  `studentnr` int(20) DEFAULT NULL,
  `is_teacher` int(1) DEFAULT '0',
  `last_name` varchar(45) DEFAULT NULL,
  `first_name` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `ewa_user`
--

LOCK TABLES `ewa_user` WRITE;
/*!40000 ALTER TABLE `ewa_user` DISABLE KEYS */;
INSERT INTO `ewa_user` VALUES (1,'milanosie@live.nl',1,533677,0,'Steenwinkel','Milan'),(2,'docent1@hva.nl',NULL,NULL,1,'Docent','Jan');
/*!40000 ALTER TABLE `ewa_user` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2017-01-06 13:20:20

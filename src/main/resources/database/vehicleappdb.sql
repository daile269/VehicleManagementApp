-- MySQL dump 10.13  Distrib 8.0.32, for Win64 (x86_64)
--
-- Host: localhost    Database: vehicleappdb
-- ------------------------------------------------------
-- Server version	8.0.32

/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!50503 SET NAMES utf8 */;
/*!40103 SET @OLD_TIME_ZONE=@@TIME_ZONE */;
/*!40103 SET TIME_ZONE='+00:00' */;
/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;

--
-- Table structure for table `client`
--

DROP TABLE IF EXISTS `client`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `client` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `details` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `website` varchar(255) DEFAULT NULL,
  `countryid` bigint DEFAULT NULL,
  `stateid` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKdl2uu6vavuggmw39eqog9ka84` (`countryid`),
  KEY `FKdhlcvwfpbu1g8mr22t95gfhha` (`stateid`),
  CONSTRAINT `FKdhlcvwfpbu1g8mr22t95gfhha` FOREIGN KEY (`stateid`) REFERENCES `state` (`id`),
  CONSTRAINT `FKdl2uu6vavuggmw39eqog9ka84` FOREIGN KEY (`countryid`) REFERENCES `country` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `client`
--

LOCK TABLES `client` WRITE;
/*!40000 ALTER TABLE `client` DISABLE KEYS */;
INSERT INTO `client` VALUES (1,'123 Main Street','Anytown','Some details about the client','client@example.com','Client Name','123-456-7890','www.clientwebsite.com',1,3),(2,'456 Elm Street','Othertown','Other details about the client','anotherclient@example.com','Another Client','987-654-3210','www.anotherclientwebsite.com',4,6),(3,'789 Oak Avenue','Sometown','Details for the third client','thirdclient@example.com','Third Client','555-555-5555','www.thirdclientwebsite.com',3,5),(4,'321 Pine Road','Anothertown','Additional details for the fourth client','fourthclient@example.com','Fourth Client','999-999-9999','www.fourthclientwebsite.com',1,9);
/*!40000 ALTER TABLE `client` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `contact`
--

DROP TABLE IF EXISTS `contact`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `contact` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `email` varchar(255) DEFAULT NULL,
  `firstname` varchar(255) DEFAULT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=11 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `contact`
--

LOCK TABLES `contact` WRITE;
/*!40000 ALTER TABLE `contact` DISABLE KEYS */;
INSERT INTO `contact` VALUES (2,'example2@email.com','Jane','Smith','987-654-3210','Remark 2'),(3,'example3@email.com','Alice','Johnson','555-555-5555','Remark 3'),(4,'example4@email.com','Bob','Williams','111-222-3333','Remark 4'),(5,'example5@email.com','Emily','Brown','444-555-6666','Remark 5'),(6,'example6@email.com','Michael','Taylor','777-888-9999','Remark 6'),(7,'example7@email.com','Sarah','Wilson','000-999-8888','Remark 7');
/*!40000 ALTER TABLE `contact` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `country`
--

DROP TABLE IF EXISTS `country`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `country` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `capital` varchar(255) DEFAULT NULL,
  `code` varchar(255) DEFAULT NULL,
  `continent` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `nationality` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `country`
--

LOCK TABLES `country` WRITE;
/*!40000 ALTER TABLE `country` DISABLE KEYS */;
INSERT INTO `country` VALUES (1,'Washington','01','North America','United States','American'),(3,'Ottawa','03','North America','Canada','Canadian'),(4,'Brasília','04','South America','Brazil','Brazilian'),(5,'Canberra','05','Oceania','Australia','Australian'),(6,'Paris','06','Europe','France','French'),(14,'HN','12','Asean','VietNamese','VietNam');
/*!40000 ALTER TABLE `country` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee`
--

DROP TABLE IF EXISTS `employee`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `date_of_birth` datetime(6) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `firstname` varchar(255) DEFAULT NULL,
  `gender` varchar(255) DEFAULT NULL,
  `initials` varchar(255) DEFAULT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  `marital_status` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `photo` varchar(255) DEFAULT NULL,
  `social_security_number` varchar(255) DEFAULT NULL,
  `title` varchar(255) DEFAULT NULL,
  `hire_date` datetime(6) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `employee_type_id` bigint DEFAULT NULL,
  `job_title_id` bigint DEFAULT NULL,
  `country_id` bigint DEFAULT NULL,
  `state_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKks0jnjwhw9tjwa2b1l0klv1fb` (`employee_type_id`),
  KEY `FKp3gjxglyx92kclcf5u6gwpt8v` (`job_title_id`),
  KEY `FKivtkrlfso4toqek7i2rul2ggy` (`country_id`),
  KEY `FKtr3cie22i7mo1h8kighbuq2x3` (`state_id`),
  CONSTRAINT `FKivtkrlfso4toqek7i2rul2ggy` FOREIGN KEY (`country_id`) REFERENCES `country` (`id`),
  CONSTRAINT `FKks0jnjwhw9tjwa2b1l0klv1fb` FOREIGN KEY (`employee_type_id`) REFERENCES `employee_type` (`id`),
  CONSTRAINT `FKp3gjxglyx92kclcf5u6gwpt8v` FOREIGN KEY (`job_title_id`) REFERENCES `job_title` (`id`),
  CONSTRAINT `FKtr3cie22i7mo1h8kighbuq2x3` FOREIGN KEY (`state_id`) REFERENCES `state` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee`
--

LOCK TABLES `employee` WRITE;
/*!40000 ALTER TABLE `employee` DISABLE KEYS */;
INSERT INTO `employee` VALUES (1,'123 Main St','New York','1990-05-15 00:00:00.000000','john@example.com','John','Male','J.D.','Doe','Single','+1234567890',NULL,'123-45-6789','Mr.','2020-01-15 00:00:00.000000','user3',1,3,1,3),(2,'456 Elm St','Los Angeles','1988-08-20 00:00:00.000000','jane@example.com','Jane','Female','J.L.','Smith','Married','+0987654321',NULL,'987-65-4321','Ms.','2018-05-10 00:00:00.000000','admin',1,1,5,5),(3,'789 Oak St','Chicago','1995-03-25 00:00:00.000000','mike@example.com','Đại','Male','M.A.','Lê','Single','+1122334455',NULL,'456-78-9123','Mr.','2021-09-20 00:00:00.000000','daile269',2,3,3,3),(4,'101 Pine St','Houston','1987-11-10 00:00:00.000000','sara@example.com','Sara','Female','S.M.','William','Married','+1122334455',NULL,'789-12-3456','Ms.','2017-03-05 00:00:00.000000','user1',2,1,6,4),(5,'202 Maple St','Miami','1992-07-01 00:00:00.000000','david@example.com','David','Male','D.P.','Brown','Single','+1122334455',NULL,'345-67-8901','Mr.','2019-11-15 00:00:00.000000','tester',1,3,14,9),(8,'Nghệ An','Nghệ An','2003-09-26 00:00:00.000000','daile2692003@gmail.com','Lê','Male','ĐL','Đại','Single','0326463260',NULL,'112-112-269','Mr.','2024-01-01 00:00:00.000000','daile',2,1,14,5);
/*!40000 ALTER TABLE `employee` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `employee_type`
--

DROP TABLE IF EXISTS `employee_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `employee_type` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `details` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `created_date` datetime(6) DEFAULT NULL,
  `last_modified_by` varchar(255) DEFAULT NULL,
  `last_modified_date` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `employee_type`
--

LOCK TABLES `employee_type` WRITE;
/*!40000 ALTER TABLE `employee_type` DISABLE KEYS */;
INSERT INTO `employee_type` VALUES (1,'Manager','Manager Sale',NULL,NULL,NULL,NULL),(2,'Employee ','Employee  A',NULL,NULL,NULL,NULL),(4,'Sale','Sale','daile','2024-02-29 22:41:02.517000','daile','2024-02-29 22:41:02.517000');
/*!40000 ALTER TABLE `employee_type` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invoice`
--

DROP TABLE IF EXISTS `invoice`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `invoice` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `invoice_date` datetime(6) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `client_id` bigint DEFAULT NULL,
  `invoice_status_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK6y01j0975eqwmnb0gckttrbj2` (`client_id`),
  KEY `FK7j1jy4k1c220v5lgsntiqh534` (`invoice_status_id`),
  CONSTRAINT `FK6y01j0975eqwmnb0gckttrbj2` FOREIGN KEY (`client_id`) REFERENCES `client` (`id`),
  CONSTRAINT `FK7j1jy4k1c220v5lgsntiqh534` FOREIGN KEY (`invoice_status_id`) REFERENCES `invoice_status` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=18 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invoice`
--

LOCK TABLES `invoice` WRITE;
/*!40000 ALTER TABLE `invoice` DISABLE KEYS */;
INSERT INTO `invoice` VALUES (9,'2024-02-19 00:00:00.000000','This is the first invoice for Client A',1,1),(10,'2003-09-26 00:00:00.000000','DDL',2,2),(11,'2024-02-21 00:00:00.000000','Invoice for Client C',3,1),(12,'2024-02-22 00:00:00.000000','Another invoice for Client A',1,2),(13,'2024-02-23 00:00:00.000000','Invoice for Client D',4,1),(14,'2024-02-24 00:00:00.000000','Invoice for Client E',2,1),(15,'2024-02-25 00:00:00.000000','Invoice for Client F',3,1),(16,'2024-02-26 00:00:00.000000','Invoice for Client G',1,1);
/*!40000 ALTER TABLE `invoice` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `invoice_status`
--

DROP TABLE IF EXISTS `invoice_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `invoice_status` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `details` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `created_date` datetime(6) DEFAULT NULL,
  `last_modified_by` varchar(255) DEFAULT NULL,
  `last_modified_date` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `invoice_status`
--

LOCK TABLES `invoice_status` WRITE;
/*!40000 ALTER TABLE `invoice_status` DISABLE KEYS */;
INSERT INTO `invoice_status` VALUES (1,'Paid','Paid',NULL,NULL,NULL,NULL),(2,'Debt','Debt',NULL,NULL,NULL,NULL),(4,'Waiting','Waiting','daile','2024-02-29 22:41:40.190000','daile','2024-02-29 22:41:40.190000');
/*!40000 ALTER TABLE `invoice_status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `job_title`
--

DROP TABLE IF EXISTS `job_title`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `job_title` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `details` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `created_date` datetime(6) DEFAULT NULL,
  `last_modified_by` varchar(255) DEFAULT NULL,
  `last_modified_date` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `job_title`
--

LOCK TABLES `job_title` WRITE;
/*!40000 ALTER TABLE `job_title` DISABLE KEYS */;
INSERT INTO `job_title` VALUES (1,'Job A','Job As',NULL,NULL,'daile','2024-02-29 22:40:28.258000'),(3,'Job B','This is Job B',NULL,NULL,NULL,NULL),(4,'Java','IT','daile','2024-02-29 22:40:45.940000','daile','2024-02-29 22:40:45.940000');
/*!40000 ALTER TABLE `job_title` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `location`
--

DROP TABLE IF EXISTS `location`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `location` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `details` varchar(255) DEFAULT NULL,
  `countryid` bigint DEFAULT NULL,
  `stateid` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKs7swryq3x80exyw5x7q9exk4` (`countryid`),
  KEY `FK4owleaia0nd955fr44srvdwhp` (`stateid`),
  CONSTRAINT `FK4owleaia0nd955fr44srvdwhp` FOREIGN KEY (`stateid`) REFERENCES `state` (`id`),
  CONSTRAINT `FKs7swryq3x80exyw5x7q9exk4` FOREIGN KEY (`countryid`) REFERENCES `country` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `location`
--

LOCK TABLES `location` WRITE;
/*!40000 ALTER TABLE `location` DISABLE KEYS */;
INSERT INTO `location` VALUES (1,'123 ABC Street','New York','Headquarters','Large office building',1,3),(3,'789 MNO Road','Chicago','Regional Office','Medium-sized office',1,4),(4,'101 Main Street','Houston','Branch Office','Small office space',3,6),(5,'555 Elm Street','San Francisco','Branch Office','Co-working space',6,5),(6,'777 Oak Avenue','Miami','Regional Office','Large office building',5,3),(7,'888 Pine Street','Seattle','Branch Office','Medium-sized office',14,4),(8,'999 Maple Drive','Boston','Headquarters','Corporate campus',3,6),(9,'Ky Son','Nghe An','VietNam','Ha Noi',14,9);
/*!40000 ALTER TABLE `location` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `role`
--

DROP TABLE IF EXISTS `role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `role` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `created_by` varchar(255) DEFAULT NULL,
  `created_date` datetime(6) DEFAULT NULL,
  `last_modified_by` varchar(255) DEFAULT NULL,
  `last_modified_date` datetime(6) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `details` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=8 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `role`
--

LOCK TABLES `role` WRITE;
/*!40000 ALTER TABLE `role` DISABLE KEYS */;
INSERT INTO `role` VALUES (1,'daile269','2024-03-04 21:47:43.460000','daile269','2024-03-04 21:47:43.460000','USER','Access to home page'),(2,'daile269','2024-03-04 21:48:35.642000','daile269','2024-03-04 21:48:35.642000','ADMIN','Access to all Application modules except Security'),(3,'daile269','2024-03-04 21:49:15.661000','daile269','2024-03-04 21:49:15.661000','SUPER_ADMIN','Have unrestricted access');
/*!40000 ALTER TABLE `role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `state`
--

DROP TABLE IF EXISTS `state`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `state` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `capital` varchar(255) NOT NULL,
  `code` varchar(255) DEFAULT NULL,
  `details` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `countryid` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `fk_st_ct` (`countryid`),
  CONSTRAINT `fk_st_ct` FOREIGN KEY (`countryid`) REFERENCES `country` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=10 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `state`
--

LOCK TABLES `state` WRITE;
/*!40000 ALTER TABLE `state` DISABLE KEYS */;
INSERT INTO `state` VALUES (3,'Austin','TX_4','Texas','Texas',4),(4,'Tallahassee','FL_5','Florida','Florida',3),(5,'Washington','CL_2','California','California',1),(6,'Olympia','WA_6','Washington','Washington',1),(9,'Ha Noi','84','Ha Noi','Ha Noi',14);
/*!40000 ALTER TABLE `state` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `supplier`
--

DROP TABLE IF EXISTS `supplier`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `supplier` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `address` varchar(255) DEFAULT NULL,
  `city` varchar(255) DEFAULT NULL,
  `details` varchar(255) DEFAULT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `phone` varchar(255) DEFAULT NULL,
  `website` varchar(255) DEFAULT NULL,
  `country_id` bigint DEFAULT NULL,
  `state_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKdp2i9p8sxew7tj0dksty5dw4t` (`country_id`),
  KEY `FKrwnu1j0xt66sxtrbgq21oycik` (`state_id`),
  CONSTRAINT `FKdp2i9p8sxew7tj0dksty5dw4t` FOREIGN KEY (`country_id`) REFERENCES `country` (`id`),
  CONSTRAINT `FKrwnu1j0xt66sxtrbgq21oycik` FOREIGN KEY (`state_id`) REFERENCES `state` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=6 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `supplier`
--

LOCK TABLES `supplier` WRITE;
/*!40000 ALTER TABLE `supplier` DISABLE KEYS */;
INSERT INTO `supplier` VALUES (1,' Main Street','Anytown','Some details about the client','client@example.com','Client Name','123-456-7890','www.clientwebsite.com',1,3),(2,' Elm Street','Othertown','Other details about the client','anotherclient@example.com','Another Client','987-654-3210','www.anotherclientwebsite.com',4,6),(3,' Oak Avenue','Sometown','Details for the third client','thirdclient@example.com','Third Client','555-555-5555','www.thirdclientwebsite.com',3,5),(4,' Pine Road','Anothertown','Additional details for the fourth client','fourthclient@example.com','Fourth Client','999-999-9999','www.fourthclientwebsite.com',1,9);
/*!40000 ALTER TABLE `supplier` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user`
--

DROP TABLE IF EXISTS `user`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `password` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL,
  `firstname` varchar(255) DEFAULT NULL,
  `lastname` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=13 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user`
--

LOCK TABLES `user` WRITE;
/*!40000 ALTER TABLE `user` DISABLE KEYS */;
INSERT INTO `user` VALUES (1,'$2a$10$ZUaMC46hKduhOqYw8yVOs.GFHfl8bdHyj2hiJU4pxVV7q5Gc5f.uW','user1','Kin','Woo'),(2,'$2a$10$TRb4nq3OWaWAfbp5k8D7Q.fGVtEZoCRJLVsdXBrT8jBMZxcUkUuAK','user2','Leo','Mas'),(3,'$2a$10$TRb4nq3OWaWAfbp5k8D7Q.fGVtEZoCRJLVsdXBrT8jBMZxcUkUuAK','user3','Thos','Mas'),(4,'$2a$10$TRb4nq3OWaWAfbp5k8D7Q.fGVtEZoCRJLVsdXBrT8jBMZxcUkUuAK','daile','Đại ','Lê'),(5,'$2a$10$y1PyXTmJ8NfOLXUSO/l1NuINyijeiMF7LM8ZSqSGtJOREsTApBJaO','admin','Admin','1'),(6,'$2a$10$TRb4nq3OWaWAfbp5k8D7Q.fGVtEZoCRJLVsdXBrT8jBMZxcUkUuAK','tester','Tester','2'),(7,'$2a$10$TRb4nq3OWaWAfbp5k8D7Q.fGVtEZoCRJLVsdXBrT8jBMZxcUkUuAK','lausr','Kins','Sonw'),(9,'$2a$10$TRb4nq3OWaWAfbp5k8D7Q.fGVtEZoCRJLVsdXBrT8jBMZxcUkUuAK','lausaw','Lau','Saw'),(11,'$2a$10$JHdwMUbCDPllxqH9rTdTcOtp7VxdglWChCDQksntW59V2vzQMl/D.','daile269','Lê','Đại');
/*!40000 ALTER TABLE `user` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `user_role`
--

DROP TABLE IF EXISTS `user_role`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `user_role` (
  `user_id` bigint NOT NULL,
  `role_id` bigint NOT NULL,
  PRIMARY KEY (`user_id`,`role_id`),
  KEY `FKa68196081fvovjhkek5m97n3y` (`role_id`),
  CONSTRAINT `FK859n2jvi8ivhui0rl0esws6o` FOREIGN KEY (`user_id`) REFERENCES `user` (`id`),
  CONSTRAINT `FKa68196081fvovjhkek5m97n3y` FOREIGN KEY (`role_id`) REFERENCES `role` (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `user_role`
--

LOCK TABLES `user_role` WRITE;
/*!40000 ALTER TABLE `user_role` DISABLE KEYS */;
INSERT INTO `user_role` VALUES (2,1),(3,1),(6,1),(7,1),(9,1),(1,2),(4,2),(5,2),(11,2),(1,3),(11,3);
/*!40000 ALTER TABLE `user_role` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicle`
--

DROP TABLE IF EXISTS `vehicle`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehicle` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `acquisition_date` datetime(6) DEFAULT NULL,
  `description` varchar(255) DEFAULT NULL,
  `fuel_capacity` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `net_weight` varchar(255) DEFAULT NULL,
  `power` varchar(255) DEFAULT NULL,
  `registration_date` datetime(6) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `vehicle_number` varchar(255) DEFAULT NULL,
  `employee_id` bigint DEFAULT NULL,
  `location_id` bigint DEFAULT NULL,
  `vehicle_make_id` bigint DEFAULT NULL,
  `vehicle_model_id` bigint DEFAULT NULL,
  `vehicle_status_id` bigint DEFAULT NULL,
  `vehicle_type_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKikhs0cb118qkjfwqn5wsgvl56` (`employee_id`),
  KEY `FKn44dl6cxj7t5neb7lj8n54a0y` (`location_id`),
  KEY `FKdndlik9opjw6eq2rnpdtkih9f` (`vehicle_make_id`),
  KEY `FKjtchj1qk6y3jdm3ycsbaoci6q` (`vehicle_model_id`),
  KEY `FKeqt396i95swer3o8g3p9piexs` (`vehicle_status_id`),
  KEY `FKddtxlc05rojc56bprvek17hnk` (`vehicle_type_id`),
  CONSTRAINT `FKddtxlc05rojc56bprvek17hnk` FOREIGN KEY (`vehicle_type_id`) REFERENCES `vehicle_type` (`id`),
  CONSTRAINT `FKdndlik9opjw6eq2rnpdtkih9f` FOREIGN KEY (`vehicle_make_id`) REFERENCES `vehicle_make` (`id`),
  CONSTRAINT `FKeqt396i95swer3o8g3p9piexs` FOREIGN KEY (`vehicle_status_id`) REFERENCES `vehicle_status` (`id`),
  CONSTRAINT `FKikhs0cb118qkjfwqn5wsgvl56` FOREIGN KEY (`employee_id`) REFERENCES `employee` (`id`),
  CONSTRAINT `FKjtchj1qk6y3jdm3ycsbaoci6q` FOREIGN KEY (`vehicle_model_id`) REFERENCES `vehicle_model` (`id`),
  CONSTRAINT `FKn44dl6cxj7t5neb7lj8n54a0y` FOREIGN KEY (`location_id`) REFERENCES `location` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=29 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicle`
--

LOCK TABLES `vehicle` WRITE;
/*!40000 ALTER TABLE `vehicle` DISABLE KEYS */;
INSERT INTO `vehicle` VALUES (21,'2023-05-14 00:00:00.000000','Sedan','60','Toyota Camry','1500','200','2023-05-19 00:00:00.000000','Regular maintenance required','ABC123',1,6,2,1,2,1),(22,'2022-11-10 00:00:00.000000','SUV','80','Ford Explorer','1800','250','2022-11-15 00:00:00.000000','Good condition, low mileage','XYZ456',3,3,1,3,2,1),(23,'2023-03-25 00:00:00.000000','Truck','100','Chevrolet Silverado','2500','300','2023-03-30 00:00:00.000000','Recently serviced, ready for heavy-duty use','DEF789',2,4,3,1,3,1),(24,'2024-01-05 00:00:00.000000','Compact car','50','Honda Civic','1200','150','2024-01-10 00:00:00.000000','Fuel-efficient, ideal for city driving','GHI012',4,7,3,1,3,1),(25,'2022-08-20 00:00:00.000000','Van','70','Mercedes Sprinter','2000','180','2022-08-25 00:00:00.000000','Spacious interior, suitable for cargo transportation','JKL345',5,9,2,2,1,3);
/*!40000 ALTER TABLE `vehicle` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicle_hire`
--

DROP TABLE IF EXISTS `vehicle_hire`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehicle_hire` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `date_in` datetime(6) DEFAULT NULL,
  `date_out` datetime(6) DEFAULT NULL,
  `price` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `time_in` varchar(255) DEFAULT NULL,
  `time_out` varchar(255) DEFAULT NULL,
  `client_id` bigint DEFAULT NULL,
  `location_id` bigint DEFAULT NULL,
  `vehicle_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKpb30s3nj2jid5yvukb066tvju` (`client_id`),
  KEY `FK1igj5d0gkab535ym0ofq6cmjt` (`location_id`),
  KEY `FKblq99h8rdg6rh5wrr97t8nnm6` (`vehicle_id`),
  CONSTRAINT `FK1igj5d0gkab535ym0ofq6cmjt` FOREIGN KEY (`location_id`) REFERENCES `location` (`id`),
  CONSTRAINT `FKblq99h8rdg6rh5wrr97t8nnm6` FOREIGN KEY (`vehicle_id`) REFERENCES `vehicle` (`id`),
  CONSTRAINT `FKpb30s3nj2jid5yvukb066tvju` FOREIGN KEY (`client_id`) REFERENCES `client` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicle_hire`
--

LOCK TABLES `vehicle_hire` WRITE;
/*!40000 ALTER TABLE `vehicle_hire` DISABLE KEYS */;
INSERT INTO `vehicle_hire` VALUES (1,'2024-02-14 00:00:00.000000','2024-02-19 00:00:00.000000','300','Weekend trip','2024-02-15','2024-02-20',2,4,21),(2,'2024-01-10 00:00:00.000000','2024-01-15 00:00:00.000000','450','Business travel','2024-01-10','2024-01-15',1,5,23),(3,'2023-12-05 00:00:00.000000','2023-12-10 00:00:00.000000','250','Family vacation','2023-12-05','2023-12-10',3,4,21),(4,'2023-11-01 00:00:00.000000','2023-11-05 00:00:00.000000','200','Short getaway','2023-11-01','2023-11-05',4,8,25),(5,'2023-10-20 00:00:00.000000','2023-10-25 00:00:00.000000','350','Road trip','2023-10-20','2023-10-25',1,7,24);
/*!40000 ALTER TABLE `vehicle_hire` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicle_maintenance`
--

DROP TABLE IF EXISTS `vehicle_maintenance`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehicle_maintenance` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `end_date` datetime(6) DEFAULT NULL,
  `price` varchar(255) DEFAULT NULL,
  `remarks` varchar(255) DEFAULT NULL,
  `start_date` datetime(6) DEFAULT NULL,
  `supplier_id` bigint DEFAULT NULL,
  `vehicle_id` bigint DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FKi8jlxhav5g83k32wes596k3oe` (`supplier_id`),
  KEY `FKtn9byqky5v6t62daliyay9hv4` (`vehicle_id`),
  CONSTRAINT `FKi8jlxhav5g83k32wes596k3oe` FOREIGN KEY (`supplier_id`) REFERENCES `supplier` (`id`),
  CONSTRAINT `FKtn9byqky5v6t62daliyay9hv4` FOREIGN KEY (`vehicle_id`) REFERENCES `vehicle` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicle_maintenance`
--

LOCK TABLES `vehicle_maintenance` WRITE;
/*!40000 ALTER TABLE `vehicle_maintenance` DISABLE KEYS */;
INSERT INTO `vehicle_maintenance` VALUES (1,'2024-02-14 00:00:00.000000','500','Routine checkup and oil change','2024-02-09 00:00:00.000000',3,21),(2,'2024-01-20 00:00:00.000000','700','Replaced brake pads and rotor','2024-01-15 00:00:00.000000',1,23),(3,'2023-12-28 00:00:00.000000','300','Tire rotation and alignment','2023-12-25 00:00:00.000000',4,24),(4,'2023-11-10 00:00:00.000000','600','Transmission fluid flush','2023-11-05 00:00:00.000000',3,23),(5,'2023-10-05 00:00:00.000000','400','Coolant system inspection','2023-10-01 00:00:00.000000',2,25);
/*!40000 ALTER TABLE `vehicle_maintenance` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicle_make`
--

DROP TABLE IF EXISTS `vehicle_make`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehicle_make` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `details` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `created_date` datetime(6) DEFAULT NULL,
  `last_modified_by` varchar(255) DEFAULT NULL,
  `last_modified_date` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=7 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicle_make`
--

LOCK TABLES `vehicle_make` WRITE;
/*!40000 ALTER TABLE `vehicle_make` DISABLE KEYS */;
INSERT INTO `vehicle_make` VALUES (1,'Japan','Tokyo',NULL,NULL,NULL,NULL),(2,'Germany','Berlin',NULL,NULL,NULL,NULL),(3,'VietNamese','SLNA',NULL,NULL,NULL,NULL),(5,'Korea','Seoul','daile','2024-02-29 22:13:36.487000','daile','2024-02-29 22:13:36.487000'),(6,'VietNamese','NA','daile','2024-02-29 22:37:38.784000','daile','2024-02-29 22:37:38.784000');
/*!40000 ALTER TABLE `vehicle_make` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicle_model`
--

DROP TABLE IF EXISTS `vehicle_model`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehicle_model` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `details` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `created_date` datetime(6) DEFAULT NULL,
  `last_modified_by` varchar(255) DEFAULT NULL,
  `last_modified_date` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=9 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicle_model`
--

LOCK TABLES `vehicle_model` WRITE;
/*!40000 ALTER TABLE `vehicle_model` DISABLE KEYS */;
INSERT INTO `vehicle_model` VALUES (1,'SUVS','Suv',NULL,NULL,'daile','2024-02-29 22:07:58.840000'),(2,'COUPE','Coupe',NULL,NULL,NULL,NULL),(3,'Sedan','Sedans',NULL,NULL,'user1','2024-02-29 22:18:08.048000'),(4,'SKW','Skaw','daile','2024-02-29 22:08:15.948000','daile','2024-02-29 22:08:15.948000'),(6,'Tesst','Test','daile','2024-02-29 22:12:16.683000','daile','2024-02-29 22:12:16.683000'),(7,'VietNamese','Ha Nois',NULL,NULL,'user2','2024-02-29 22:20:39.198000'),(8,'United Statess','Job A','user2','2024-02-29 22:22:11.126000','user2','2024-02-29 22:22:11.126000');
/*!40000 ALTER TABLE `vehicle_model` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicle_status`
--

DROP TABLE IF EXISTS `vehicle_status`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehicle_status` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `details` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `created_date` datetime(6) DEFAULT NULL,
  `last_modified_by` varchar(255) DEFAULT NULL,
  `last_modified_date` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=4 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicle_status`
--

LOCK TABLES `vehicle_status` WRITE;
/*!40000 ALTER TABLE `vehicle_status` DISABLE KEYS */;
INSERT INTO `vehicle_status` VALUES (1,'Active','This Vehicle is Active',NULL,NULL,'daile','2024-02-29 22:40:13.525000'),(2,'Inactive','This Vehicle is Inactive',NULL,NULL,NULL,NULL),(3,'Maintenancing','Maintenancing',NULL,NULL,NULL,NULL);
/*!40000 ALTER TABLE `vehicle_status` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `vehicle_type`
--

DROP TABLE IF EXISTS `vehicle_type`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `vehicle_type` (
  `id` bigint NOT NULL AUTO_INCREMENT,
  `description` varchar(255) DEFAULT NULL,
  `details` varchar(255) DEFAULT NULL,
  `created_by` varchar(255) DEFAULT NULL,
  `created_date` datetime(6) DEFAULT NULL,
  `last_modified_by` varchar(255) DEFAULT NULL,
  `last_modified_date` datetime(6) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=5 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `vehicle_type`
--

LOCK TABLES `vehicle_type` WRITE;
/*!40000 ALTER TABLE `vehicle_type` DISABLE KEYS */;
INSERT INTO `vehicle_type` VALUES (1,'Truck','Truck',NULL,NULL,NULL,NULL),(2,'CX-5','CX-5',NULL,NULL,NULL,NULL),(3,'VAN','VAN','','2024-02-28 00:00:00.000000','daile','2024-03-04 22:19:20.610000'),(4,'TX3','Ksuas','user3','2024-02-29 00:00:00.000000','daile','2024-03-04 22:18:53.867000');
/*!40000 ALTER TABLE `vehicle_type` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-03-12 13:49:25

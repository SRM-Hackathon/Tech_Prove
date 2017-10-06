/*
SQLyog Professional v12.09 (64 bit)
MySQL - 5.7.19-log : Database - projectdata
*********************************************************************
*/

/*!40101 SET NAMES utf8 */;

/*!40101 SET SQL_MODE=''*/;

/*!40014 SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0 */;
/*!40014 SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0 */;
/*!40101 SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='NO_AUTO_VALUE_ON_ZERO' */;
/*!40111 SET @OLD_SQL_NOTES=@@SQL_NOTES, SQL_NOTES=0 */;
CREATE DATABASE /*!32312 IF NOT EXISTS*/`projectdata` /*!40100 DEFAULT CHARACTER SET utf8 */;

USE `projectdata`;

/*Table structure for table `schemes` */

DROP TABLE IF EXISTS `schemes`;

CREATE TABLE `schemes` (
  `s_name` varchar(250) NOT NULL,
  `min_age` int(10) unsigned DEFAULT NULL,
  `max_age` int(10) unsigned DEFAULT NULL,
  `caste` varchar(20) NOT NULL,
  `present_work` varchar(30) DEFAULT NULL,
  `salary` float unsigned DEFAULT NULL,
  `s_area` varchar(50) NOT NULL,
  PRIMARY KEY (`s_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `schemes` */

insert  into `schemes`(`s_name`,`min_age`,`max_age`,`caste`,`present_work`,`salary`,`s_area`) values ('Atal Pension Scheme',18,40,'ALL','Retire',NULL,'Pension'),('Computer based',17,20,'ST','Education',NULL,'Scholarship'),('Ekloti Beti Ko Shikha Vikas Chatravarti for Girls in Madhya Pradesh',16,20,'ALL','Education',NULL,'Scholarship'),('Ground water conservation',NULL,NULL,'ALL','Farmer',25000,'Agriculture'),('Hostal facility',15,19,'ST','Education',NULL,'Scholarship'),('Indragandhi national old age pension',60,NULL,'ALL','REtire',NULL,'Pension'),('Integrated grain development program',NULL,NULL,'ALL','Farmer',22000,'Agriculture'),('Kisan vikas patra',18,NULL,'ALL',NULL,NULL,'Agriculture'),('Laptop Distribution',17,200,'ALL','Education',NULL,'Scholarship'),('Mission Indradhanush',1,5,'ALL',NULL,NULL,'Health'),('National bio gas',18,55,'ALL',NULL,10000,'Energy'),('One rank one pension',60,NULL,'ALL','Retire',NULL,'Pension'),('Pilet project for agro climatic zones',NULL,NULL,'ALL','Farmer',20000,'Agriculture'),('PM awas yojna',18,40,'ALL','Employee',50000,'Housing'),('PM fasal Bima yojna',NULL,NULL,'All',NULL,NULL,'Agriculture'),('PM garib kalyan yojna',18,70,'ALL',NULL,NULL,'Housing'),('PM gram sichai yojna',NULL,NULL,'ALL','Farmer',18000,'Agriculture'),('PM jan dhan yojna',10,90,'ALL','Employee',NULL,'Development'),('PM mudra yojna',20,60,'ALL','Development',25000,'Development'),('PM ujjwala yojna',18,NULL,'ALL',NULL,NULL,'Housing'),('Pradhan Mantri Jan Aushadhi Yojana',NULL,NULL,'ALL',NULL,NULL,'Health'),('Pradhan Mantri Jeevan Jyoti Bima Yojana',18,70,'ALL',NULL,NULL,'Health'),('Pradhan Mantri Suraksha Bima Yojana',18,0,'ALL',NULL,NULL,'Health'),('Rani Laxmi Bai Pension scheme',25,50,'ALL','Retire',NULL,'Pension'),('Sansad adarsh gram yojna',NULL,NULL,'ALL','Development',15000,'Development'),('Scholarship for foreign studies',17,30,'OBC','Education',NULL,'Scholarship'),('Smart city mission',NULL,NULL,'ALL','Development',NULL,'Development'),('Soil Health Card Scheme',18,70,'ALL',NULL,15000,'Agriculture'),('Soil testing for scheduled cast',NULL,NULL,'ALL','Farmer',18000,'Agriculture'),('Sudama pre matric',14,16,'GEN','Eduction',NULL,'Scholarship'),('Swamivivekanad post matric',16,20,'GEN','Education',NULL,'Scholarship'),('Training cum production',NULL,NULL,'ALL','Production',20000,'Agriculture'),('Training scheme for scheduled cast',NULL,NULL,'All','Farmer',30000,'Agriculture'),('Uajala Yojna for Distributing LED bulb',NULL,NULL,'ALL','Energy',15000,'Energy'),('Vikramaditya free education',17,20,'GEN','Education',NULL,'Scholarship'),('WOMEN AND CHILD DEVELOPMENT',12,15,'ALL','Education',NULL,'Scholarship');

/*Table structure for table `scholarship` */

DROP TABLE IF EXISTS `scholarship`;

CREATE TABLE `scholarship` (
  `ss_name` varchar(250) NOT NULL,
  `min_age` int(10) unsigned DEFAULT NULL,
  `max_age` int(10) unsigned DEFAULT NULL,
  `caste` varchar(12) NOT NULL,
  `percent_10` float unsigned DEFAULT NULL,
  `percent_12` float unsigned DEFAULT NULL,
  `percent_high` float unsigned DEFAULT NULL,
  PRIMARY KEY (`ss_name`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;

/*Data for the table `scholarship` */

insert  into `scholarship`(`ss_name`,`min_age`,`max_age`,`caste`,`percent_10`,`percent_12`,`percent_high`) values ('Computer-Based Modern Office Management Training Scheme for Youth ',17,25,'ST',55,55,NULL),('Ekloti Beti Ko Shikha Vikas Chatravarti for Girls in Madhya Pradesh',15,20,'ALL',60,60,NULL),('Free Bicycle Scheme in Madhya Pradesh',12,14,'ALL',NULL,NULL,NULL),('Hostel Facility Scheme for Scheduled Tribe Students Pursuing Higher Education in New Delhi ',17,19,'ST',40,40,NULL),('Laptop Distribution Scheme for Meritorious Students in Madhya Pradesh',17,20,'All',60,75,NULL),('Mukhyamantri Medhavi Vidyarthi Yojana in Madhya Pradesh ',17,20,'ALL',NULL,75,NULL),('Overseas Scholarship For Scheduled Caste',NULL,35,'ALL',50,50,50),('Scholarship for Foreign Studies to Backward Class Students in Madhya Pradesh',20,35,'ALL',60,60,60),('Sudama Pre Metric Scholarship Scheme for Students in Madhya Pradesh',12,16,'GEN',NULL,NULL,NULL),('Swami Vivekananda Post Metric Scholarship Scheme in Madhya Pradesh',15,19,'GEN',50,NULL,NULL),('Vidyarthi Suraksha Bima Yojana in Madhya Pradesh',NULL,NULL,'ALL',NULL,NULL,NULL),('Vikramaditya Free Education ',17,20,'GEN',60,60,NULL);

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

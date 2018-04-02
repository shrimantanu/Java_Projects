-- MySQL dump 10.13  Distrib 5.1.33, for Win32 (ia32)
--
-- Host: localhost    Database: redfins
-- ------------------------------------------------------
-- Server version	5.1.33-community

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
-- Table structure for table `bankac`
--

DROP TABLE IF EXISTS `bankac`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `bankac` (
  `tid` int(11) NOT NULL,
  `ac` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `bankac`
--

LOCK TABLES `bankac` WRITE;
/*!40000 ALTER TABLE `bankac` DISABLE KEYS */;
INSERT INTO `bankac` VALUES (4,'10080831280'),(6,'1020555584913'),(7,'1020555927228'),(3,'1090831280'),(1,'10987939092'),(2,'29612.0');
/*!40000 ALTER TABLE `bankac` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cap`
--

DROP TABLE IF EXISTS `cap`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cap` (
  `atmno` varchar(30) DEFAULT NULL,
  `name` varchar(30) DEFAULT NULL,
  `doe` varchar(20) DEFAULT NULL,
  `pin` varchar(20) DEFAULT NULL,
  `ac` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cap`
--

LOCK TABLES `cap` WRITE;
/*!40000 ALTER TABLE `cap` DISABLE KEYS */;
INSERT INTO `cap` VALUES ('10002900389020','shaurya','02-2016','b†¾P…«',10987939092),('1098734094202','shaurya','01-2013','ÂOçé`',29612),('100998120561287','shaurya','01-2016','¯|“',1020555584913),('75816587872','shaurya','01-2018','b†¾P…«',1020555927228),('1345676478896060','shaurya','02-2017','©ØÞ»',1090831280);
/*!40000 ALTER TABLE `cap` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `capc`
--

DROP TABLE IF EXISTS `capc`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `capc` (
  `value` varchar(30) DEFAULT NULL,
  `Addr` varchar(30) DEFAULT NULL,
  `inde` int(9) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `capc`
--

LOCK TABLES `capc` WRITE;
/*!40000 ALTER TABLE `capc` DISABLE KEYS */;
INSERT INTO `capc` VALUES ('warrok','C:\\Users\\user\\Pictures\\\0.png',NULL),('denty','C:\\Users\\user\\Pictures\\1.png',1),('starken','C:\\Users\\user\\Pictures\\2.png',2),('disbud','C:\\Users\\user\\Pictures\\3.png',3),('veiler','C:\\Users\\user\\Pictures\\4.png',4),('holistic','C:\\Users\\user\\Pictures\\5.png',5),('woziha','C:\\Users\\user\\Pictures\\6.png',6),('bijew','C:\\Users\\user\\Pictures\\7.png',7),('squiffed','C:\\Users\\user\\Pictures\\8.png',8),('braded','C:\\Users\\user\\Pictures\\9.png',9),('ingerob','C:\\Users\\user\\Pictures\\10.png',10);
/*!40000 ALTER TABLE `capc` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `cl`
--

DROP TABLE IF EXISTS `cl`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `cl` (
  `cl` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `cl`
--

LOCK TABLES `cl` WRITE;
/*!40000 ALTER TABLE `cl` DISABLE KEYS */;
INSERT INTO `cl` VALUES (2);
/*!40000 ALTER TABLE `cl` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `date`
--

DROP TABLE IF EXISTS `date`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `date` (
  `d1` date DEFAULT NULL,
  `d2` date DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `date`
--

LOCK TABLES `date` WRITE;
/*!40000 ALTER TABLE `date` DISABLE KEYS */;
INSERT INTO `date` VALUES ('2014-02-27','2014-02-13');
/*!40000 ALTER TABLE `date` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `deduct`
--

DROP TABLE IF EXISTS `deduct`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `deduct` (
  `pf` decimal(7,3) DEFAULT NULL,
  `hra` decimal(7,3) DEFAULT NULL,
  `da` decimal(7,3) DEFAULT NULL,
  `insurance` decimal(7,3) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `deduct`
--

LOCK TABLES `deduct` WRITE;
/*!40000 ALTER TABLE `deduct` DISABLE KEYS */;
INSERT INTO `deduct` VALUES ('20.000','12.000','90.000','10.000');
/*!40000 ALTER TABLE `deduct` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dept`
--

DROP TABLE IF EXISTS `dept`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dept` (
  `depart` varchar(30) NOT NULL,
  PRIMARY KEY (`depart`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dept`
--

LOCK TABLES `dept` WRITE;
/*!40000 ALTER TABLE `dept` DISABLE KEYS */;
INSERT INTO `dept` VALUES ('Account'),('Administration'),('Teaching');
/*!40000 ALTER TABLE `dept` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `detect`
--

DROP TABLE IF EXISTS `detect`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `detect` (
  `eid` int(11) DEFAULT NULL,
  `ltime` time DEFAULT NULL,
  `Ldate` date DEFAULT NULL,
  `status` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `detect`
--

LOCK TABLES `detect` WRITE;
/*!40000 ALTER TABLE `detect` DISABLE KEYS */;
INSERT INTO `detect` VALUES (1,'17:11:16','2014-01-21','Access Granted'),(1,'22:30:48','2014-01-22','Access Granted'),(1,'15:57:35','2014-01-23','Access Granted'),(1,'16:13:14','2014-01-23','Access Granted');
/*!40000 ALTER TABLE `detect` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `dummy`
--

DROP TABLE IF EXISTS `dummy`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `dummy` (
  `name` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `dummy`
--

LOCK TABLES `dummy` WRITE;
/*!40000 ALTER TABLE `dummy` DISABLE KEYS */;
/*!40000 ALTER TABLE `dummy` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `earning`
--

DROP TABLE IF EXISTS `earning`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `earning` (
  `tid` int(11) NOT NULL,
  `lta` decimal(7,3) DEFAULT NULL,
  `ma` decimal(7,3) DEFAULT NULL,
  `ca` decimal(7,3) DEFAULT NULL,
  `cca` decimal(7,3) DEFAULT NULL,
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `earning`
--

LOCK TABLES `earning` WRITE;
/*!40000 ALTER TABLE `earning` DISABLE KEYS */;
/*!40000 ALTER TABLE `earning` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `led`
--

DROP TABLE IF EXISTS `led`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `led` (
  `tid` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `led`
--

LOCK TABLES `led` WRITE;
/*!40000 ALTER TABLE `led` DISABLE KEYS */;
INSERT INTO `led` VALUES (2),(3);
/*!40000 ALTER TABLE `led` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `leve`
--

DROP TABLE IF EXISTS `leve`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `leve` (
  `tid` int(11) DEFAULT NULL,
  `tname` varchar(36) DEFAULT NULL,
  `dfrom_mm_dd_yy` date DEFAULT NULL,
  `dto_mm_dd_yy` date DEFAULT NULL,
  `typel` char(20) DEFAULT NULL,
  `hfday` char(10) DEFAULT NULL,
  UNIQUE KEY `tid` (`tid`,`dfrom_mm_dd_yy`,`dto_mm_dd_yy`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `leve`
--

LOCK TABLES `leve` WRITE;
/*!40000 ALTER TABLE `leve` DISABLE KEYS */;
INSERT INTO `leve` VALUES (2,'Piyush dfg','2014-01-15','2014-01-31','CASUAL','full day'),(3,'Pushpraj Singh','2014-01-15','2014-01-31','CASUAL','full day'),(1,'shaurya dsgwre','2014-01-21','2014-01-29','CASUAL','full day'),(1,'shaurya dsgwre','2014-02-13','2014-02-27','CASUAL','full day'),(2,'Piyush dfg','2014-02-13','2014-02-27','CASUAL','full day');
/*!40000 ALTER TABLE `leve` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `login`
--

DROP TABLE IF EXISTS `login`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `login` (
  `tid` int(11) NOT NULL,
  `ename` varchar(45) DEFAULT NULL,
  `epass` varchar(45) DEFAULT NULL,
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `login`
--

LOCK TABLES `login` WRITE;
/*!40000 ALTER TABLE `login` DISABLE KEYS */;
INSERT INTO `login` VALUES (1,'shaurya','pratap');
/*!40000 ALTER TABLE `login` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `maximum`
--

DROP TABLE IF EXISTS `maximum`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `maximum` (
  `i` int(11) DEFAULT NULL,
  `i2` varchar(40) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `maximum`
--

LOCK TABLES `maximum` WRITE;
/*!40000 ALTER TABLE `maximum` DISABLE KEYS */;
/*!40000 ALTER TABLE `maximum` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `pf1`
--

DROP TABLE IF EXISTS `pf1`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `pf1` (
  `tid` int(11) DEFAULT NULL,
  `pf` decimal(12,4) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pf1`
--

LOCK TABLES `pf1` WRITE;
/*!40000 ALTER TABLE `pf1` DISABLE KEYS */;
INSERT INTO `pf1` VALUES (1,'7220.0000'),(2,'7600.0000'),(2,'7600.0000'),(2,'7600.0000'),(1,'7220.0000'),(1,'7220.0000'),(2,'7600.0000'),(1,'7220.0000'),(1,'7220.0000'),(1,'7220.0000'),(1,'7220.0000'),(2,'7600.0000'),(1,'7220.0000'),(6,'7600.0000'),(3,'7600.0000'),(3,'7600.0000'),(7,'7600.0000'),(1,'7220.0000');
/*!40000 ALTER TABLE `pf1` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `picture`
--

DROP TABLE IF EXISTS `picture`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `picture` (
  `eid` int(11) DEFAULT NULL,
  `Adr` blob
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `picture`
--

LOCK TABLES `picture` WRITE;
/*!40000 ALTER TABLE `picture` DISABLE KEYS */;
INSERT INTO `picture` VALUES (1,'C:\\Users\\USER2\\Pictures\\logo.png'),(2,'C:\\Users\\Public\\aa.jpg'),(3,'C:\\Users\\Public\\IMAGG\\pppp.PNG'),(4,'null'),(5,'C:\\Users\\user\\Desktop\\Untitled-2 copy.jpg'),(6,'C:\\Users\\user\\Desktop\\Imagg\\\reload copy.png'),(6,'null'),(7,'null'),(8,'C:\\Users\\user\\Downloads\\2_4_1_3_eng.png');
/*!40000 ALTER TABLE `picture` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `post`
--

DROP TABLE IF EXISTS `post`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `post` (
  `post` varchar(40) NOT NULL DEFAULT '',
  PRIMARY KEY (`post`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `post`
--

LOCK TABLES `post` WRITE;
/*!40000 ALTER TABLE `post` DISABLE KEYS */;
INSERT INTO `post` VALUES ('Accountant'),('Junior(Sec.) Teacher'),('Primary(Sec.) Teacher'),('Principal'),('Senior(Sec.) Teacher');
/*!40000 ALTER TABLE `post` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `salary`
--

DROP TABLE IF EXISTS `salary`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `salary` (
  `Tid` int(11) NOT NULL,
  `bsal` decimal(10,2) DEFAULT NULL,
  `lta` decimal(10,2) DEFAULT NULL,
  `ma` decimal(10,2) DEFAULT NULL,
  `ca` decimal(10,2) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `salary`
--

LOCK TABLES `salary` WRITE;
/*!40000 ALTER TABLE `salary` DISABLE KEYS */;
INSERT INTO `salary` VALUES (1,'19000.00','100.00','100.00','100.00'),(2,'20000.00','12.00','100.00','100.00'),(3,'20000.00','10.00','10.00','10.00'),(4,'4545.00','10000.00','2000.00','0.00'),(6,'20000.00','10.00','10.00','10.00'),(7,'20000.00','12.00','10.00','12.00');
/*!40000 ALTER TABLE `salary` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `saldet`
--

DROP TABLE IF EXISTS `saldet`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `saldet` (
  `tid` int(11) DEFAULT NULL,
  `bl` decimal(12,4) DEFAULT NULL,
  `month` varchar(30) DEFAULT NULL,
  `year` varchar(30) DEFAULT NULL,
  `status` varchar(39) DEFAULT NULL,
  UNIQUE KEY `tid` (`tid`,`month`,`year`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `saldet`
--

LOCK TABLES `saldet` WRITE;
/*!40000 ALTER TABLE `saldet` DISABLE KEYS */;
INSERT INTO `saldet` VALUES (4,'19453.9000','12','2013','DELAYED'),(3,'22096.6667','1','2014','PAID'),(1,'21313.3333','1','2014','PAID'),(2,'29612.0000','1','2014','PAID'),(6,'29430.0000','1','2014','PAID'),(7,'39396.0000','1','2014','PAID');
/*!40000 ALTER TABLE `saldet` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `schoolinfo`
--

DROP TABLE IF EXISTS `schoolinfo`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `schoolinfo` (
  `schna` blob,
  `schad` blob,
  `pincode` int(11) DEFAULT NULL,
  `schlweb` blob
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `schoolinfo`
--

LOCK TABLES `schoolinfo` WRITE;
/*!40000 ALTER TABLE `schoolinfo` DISABLE KEYS */;
INSERT INTO `schoolinfo` VALUES ('R.R MORARKA PUBLIC SCHOOL','Dwarikesh Nagar,Dist.Bijnor,U.P(West)',234567,'www.rrmps.com');
/*!40000 ALTER TABLE `schoolinfo` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `substi`
--

DROP TABLE IF EXISTS `substi`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `substi` (
  `tid` int(11) DEFAULT NULL,
  `period` varchar(20) DEFAULT NULL,
  `Subs` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `substi`
--

LOCK TABLES `substi` WRITE;
/*!40000 ALTER TABLE `substi` DISABLE KEYS */;
/*!40000 ALTER TABLE `substi` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `td`
--

DROP TABLE IF EXISTS `td`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `td` (
  `tid` int(11) NOT NULL,
  `Fname` varchar(30) DEFAULT NULL,
  `Lname` varchar(30) DEFAULT NULL,
  `DOb` date DEFAULT NULL,
  `Ad` blob,
  `Gender` set('M','F') DEFAULT NULL,
  `Q1` blob,
  `Q2` blob,
  `Q3` blob,
  `Q4` blob,
  `Q5` blob,
  `Phn` bigint(20) DEFAULT NULL,
  `Exper` varchar(30) DEFAULT NULL,
  `Presc` blob,
  `house` set('Patel','Vivekanand','Baghat','Tagore') DEFAULT NULL,
  `st` varchar(20) DEFAULT NULL,
  `sm` varchar(20) DEFAULT NULL,
  `post` varchar(40) DEFAULT NULL,
  `dep` varchar(40) DEFAULT NULL,
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `td`
--

LOCK TABLES `td` WRITE;
/*!40000 ALTER TABLE `td` DISABLE KEYS */;
INSERT INTO `td` VALUES (5,'srishti','singh','1960-07-20','s\ns\ns\ns','F','df f','l','l','l','l',1,'1','as','Vivekanand','null','Non-Married','Principal','Account'),(6,'Aditiya','Chauhan','1960-10-07','','M','','','','','',67571231,'0','R.K Public School','Vivekanand','Teaching','Non-Married','Primary(Sec.) Teacher','Teaching'),(7,'Anita','chauhan','1960-00-01','Punjabi Colony,\nNagina,\nBijnor','F','Adarsh gramidrgh Inter coolege','Adarsh gramidrgh Inter coolege','Vardhman college','Vardhman college','',7417496969,'18','Holi Child','Vivekanand','Teaching','Married','Accountant','Account'),(8,'hgfc','','1960-00-01','','M','','','','','',72225555555,'2','st.mary','Tagore','Teaching','Married','Senior(Sec.) Teacher','Teaching');
/*!40000 ALTER TABLE `td` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `tdetail`
--

DROP TABLE IF EXISTS `tdetail`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `tdetail` (
  `tid` int(11) NOT NULL,
  `Fname` varchar(30) DEFAULT NULL,
  `Lname` varchar(30) DEFAULT NULL,
  `DOb` date DEFAULT NULL,
  `Ad` blob,
  `Gender` set('M','F') DEFAULT NULL,
  `Q1` blob,
  `Q2` blob,
  `Q3` blob,
  `Q4` blob,
  `Q5` blob,
  `Phn` bigint(20) DEFAULT NULL,
  `Exper` varchar(30) DEFAULT NULL,
  `Presc` blob,
  `clal` varchar(20) DEFAULT NULL,
  `house` set('Patel','Vivekanand','Baghat','Tagore') DEFAULT NULL,
  PRIMARY KEY (`tid`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `tdetail`
--

LOCK TABLES `tdetail` WRITE;
/*!40000 ALTER TABLE `tdetail` DISABLE KEYS */;
INSERT INTO `tdetail` VALUES (1,'shaurya','Pratap singh','1960-00-01','edf','M','d','d','gf','ghj','hgt',99876,'fv','gngh',NULL,'Tagore');
/*!40000 ALTER TABLE `tdetail` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `timetable`
--

DROP TABLE IF EXISTS `timetable`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `timetable` (
  `tid` int(11) DEFAULT NULL,
  `tname` varchar(30) DEFAULT NULL,
  `Day` varchar(10) DEFAULT NULL,
  `Period` int(11) DEFAULT NULL,
  `class` varchar(20) DEFAULT NULL,
  UNIQUE KEY `tid` (`tid`,`Period`,`Day`),
  UNIQUE KEY `tid_2` (`tid`,`Period`,`Day`),
  UNIQUE KEY `tid_3` (`tid`,`Period`,`Day`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `timetable`
--

LOCK TABLES `timetable` WRITE;
/*!40000 ALTER TABLE `timetable` DISABLE KEYS */;
INSERT INTO `timetable` VALUES (1,'shaurya dsgwre','Monday',1,'null'),(1,'shaurya dsgwre','Monday',2,'Free'),(1,'shaurya dsgwre','Monday',3,'Free'),(1,'shaurya dsgwre','Monday',4,'Free'),(1,'shaurya dsgwre','Monday',5,'12'),(1,'shaurya dsgwre','Monday',6,'11'),(1,'shaurya dsgwre','Monday',7,'11'),(1,'shaurya dsgwre','Monday',8,'Free'),(2,'Piyush dfg','Monday',1,'null'),(2,'Piyush dfg','Monday',2,'11'),(2,'Piyush dfg','Monday',3,'11'),(2,'Piyush dfg','Monday',4,'11'),(2,'Piyush dfg','Monday',5,'11'),(2,'Piyush dfg','Monday',6,'11'),(2,'Piyush dfg','Monday',7,'Free'),(2,'Piyush dfg','Monday',8,'Free'),(1,'shaurya','WednesDay',1,'null'),(1,'shaurya','WednesDay',2,'11'),(1,'shaurya','WednesDay',3,'11'),(1,'shaurya','WednesDay',4,'Free');
/*!40000 ALTER TABLE `timetable` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `timeu`
--

DROP TABLE IF EXISTS `timeu`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `timeu` (
  `tid` int(11) DEFAULT NULL,
  `tname` varchar(30) DEFAULT NULL,
  `Day` varchar(10) DEFAULT NULL,
  `Period` int(11) DEFAULT NULL,
  `class` varchar(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `timeu`
--

LOCK TABLES `timeu` WRITE;
/*!40000 ALTER TABLE `timeu` DISABLE KEYS */;
INSERT INTO `timeu` VALUES (1,'shaurya dsgwre','Monday',1,'null'),(1,'shaurya dsgwre','Monday',2,'Free'),(1,'shaurya dsgwre','Monday',3,'Free'),(1,'shaurya dsgwre','Monday',4,'Free'),(1,'shaurya dsgwre','Monday',5,'12'),(1,'shaurya dsgwre','Monday',6,'11'),(1,'shaurya dsgwre','Monday',7,'11'),(1,'shaurya dsgwre','Monday',8,'Free'),(2,'Piyush dfg','Monday',1,'null'),(2,'Piyush dfg','Monday',2,'11'),(2,'Piyush dfg','Monday',3,'11'),(2,'Piyush dfg','Monday',4,'11'),(2,'Piyush dfg','Monday',5,'11'),(2,'Piyush dfg','Monday',6,'11'),(2,'Piyush dfg','Monday',7,'Free'),(2,'Piyush dfg','Monday',8,'Free'),(1,'shaurya','WednesDay',1,'null'),(1,'shaurya','WednesDay',2,'11'),(1,'shaurya','WednesDay',3,'11'),(1,'shaurya','WednesDay',4,'Free');
/*!40000 ALTER TABLE `timeu` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2014-01-23 14:45:51

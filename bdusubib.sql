-- MySQL dump 10.13  Distrib 5.7.9, for Win64 (x86_64)
--
-- Host: localhost    Database: bdusubib
-- ------------------------------------------------------
-- Server version	5.7.12-log

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
-- Table structure for table `libro`
--

DROP TABLE IF EXISTS `libro`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `libro` (
  `id_libro` varchar(25) NOT NULL,
  `titulo` varchar(50) NOT NULL,
  `autor` varchar(50) NOT NULL,
  `anio` smallint(4) DEFAULT NULL,
  `ubicacion` smallint(2) NOT NULL,
  `stock` smallint(2) NOT NULL,
  PRIMARY KEY (`id_libro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `libro`
--

LOCK TABLES `libro` WRITE;
/*!40000 ALTER TABLE `libro` DISABLE KEYS */;
INSERT INTO `libro` VALUES ('004.36T1641s','Sistemas distribuidos','Tanenbaum, Andrew S',2008,2,5),('004.36T1641sI','Distributed Systems','Tanenbaum, Andrew S',2005,2,3),('005.756O642g','Gestión de bases de datos con SQL, MySQL y Access','Orbegozo Arana, Borja	',2013,1,4),('664C56922','Ciencia de los alimentos','Jeantet, R. y Croguennec, T',2010,9,7),('664H399F','Fundamentos de la ciencia de los alimentos','Hawthorn, J',1983,6,2),('745.2019N8425e','Emotional design','Norman, Donald A.',2005,8,4),('813.4M531m','Moby Dick','Melville, Herman',2000,15,2),('813.4M531m1','Moby Dick','Melville, Herman',2010,15,5),('813.4M531mI','Moby Dick or The Whale','Melville, Herman',1999,15,4),('813.52F5535g','El gran Gatsby','Fitzgerald, F. Scott',2005,13,5),('813.52F5535gI','The Great Gatsby','Fitzgerald, F. Scott',2008,13,2),('813.52H488v','El viejo y el mar','Hemingway, Ernest',2010,8,3),('813.52H488vI','Old man and the sea','Hemingway, Ernest',2005,8,2),('813.54R186r21','La rebelion de Atlas','Ayn Rand',2003,15,3),('813.54R186r21I','Atlas shrugged','Ayn Rand',2004,15,1),('823.8W672f','El fantasma de Canterville','Wilde, Oscar',2009,3,6),('823.8W672fI','The Canterville Ghost','Wilde, Oscar',1998,3,2),('833.914S77434p','El perfume','Süskind, Patrick',2006,7,5),('833.914S77434pI','Perfume: The Story of a Murderer','Süskind, Patrick',2001,7,1),('843.9S137p','El principito','Saint-Exupéry, Antoine',2002,13,2),('843.9S137pI','The Little Prince ','Saint-Exupéry, Antoine',1990,13,2),('863.3C3553r','Don Quijote','Cervantes Saavedra, Miguel de',2014,10,10),('863.3C3553rI','Don Quixote','Cervantes Saavedra, Miguel de',2008,10,3);
/*!40000 ALTER TABLE `libro` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usa`
--

DROP TABLE IF EXISTS `usa`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usa` (
  `id_prestamo` int(11) NOT NULL,
  `id_usuario` int(4) NOT NULL,
  `id_libro` varchar(25) NOT NULL,
  `fecha_pres` date NOT NULL,
  `fecha_dev` date NOT NULL,
  `devuelto` tinyint(1) DEFAULT NULL,
  `renovacion` smallint(1) DEFAULT NULL,
  PRIMARY KEY (`id_prestamo`,`id_usuario`,`id_libro`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usa`
--

LOCK TABLES `usa` WRITE;
/*!40000 ALTER TABLE `usa` DISABLE KEYS */;
INSERT INTO `usa` VALUES (1,195268,'833.914S77434p','2018-04-13','2018-04-18',0,NULL),(2,194178,'745.2019N8425e','2018-01-12','2018-01-16',1,NULL),(3,195268,'863.3C3553r','2017-10-20','2017-10-25',1,NULL),(4,190798,'004.36T1641s','2018-04-01','2018-04-08',0,NULL),(5,194364,'813.52H488v','2015-06-28','2015-07-03',1,NULL);
/*!40000 ALTER TABLE `usa` ENABLE KEYS */;
UNLOCK TABLES;

--
-- Table structure for table `usuario`
--

DROP TABLE IF EXISTS `usuario`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!40101 SET character_set_client = utf8 */;
CREATE TABLE `usuario` (
  `id_usuario` int(4) NOT NULL,
  `password` longtext NOT NULL,
  `nombre` varchar(20) NOT NULL,
  `appat` varchar(20) NOT NULL,
  `apmat` varchar(20) NOT NULL,
  `puntaje` int(11) DEFAULT NULL,
  PRIMARY KEY (`id_usuario`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `usuario`
--

LOCK TABLES `usuario` WRITE;
/*!40000 ALTER TABLE `usuario` DISABLE KEYS */;
INSERT INTO `usuario` VALUES (190798,'070996','Erick','Sanches Ruiz','Esparza',200),(194178,'040496','José Carlos','Loera','Salazar',0),(194364,'040796','Luis Antonio','Quezada','Hernández',0),(195268,'210696','José','Quintero','Benitez',100);
/*!40000 ALTER TABLE `usuario` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2018-05-18 18:36:34

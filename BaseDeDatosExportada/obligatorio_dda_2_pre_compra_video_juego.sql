-- MySQL dump 10.13  Distrib 8.0.38, for Win64 (x86_64)
--
-- Host: localhost    Database: obligatorio_dda_2
-- ------------------------------------------------------
-- Server version	8.0.39

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
-- Table structure for table `pre_compra_video_juego`
--

DROP TABLE IF EXISTS `pre_compra_video_juego`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `pre_compra_video_juego` (
  `id` int NOT NULL AUTO_INCREMENT,
  `cantidad` int NOT NULL,
  `precio_final` double NOT NULL,
  `precio_individual` double NOT NULL,
  `venta_id` int DEFAULT NULL,
  `id_video_juego` int DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `FK5ju5kchnx202b2gppnrqb2cx0` (`id_video_juego`),
  KEY `FK67d85byc9bxs19ouhv3pjiimo` (`venta_id`),
  CONSTRAINT `FK5ju5kchnx202b2gppnrqb2cx0` FOREIGN KEY (`id_video_juego`) REFERENCES `video_juego` (`id`),
  CONSTRAINT `FK67d85byc9bxs19ouhv3pjiimo` FOREIGN KEY (`venta_id`) REFERENCES `venta` (`id`)
) ENGINE=InnoDB AUTO_INCREMENT=93 DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `pre_compra_video_juego`
--

LOCK TABLES `pre_compra_video_juego` WRITE;
/*!40000 ALTER TABLE `pre_compra_video_juego` DISABLE KEYS */;
INSERT INTO `pre_compra_video_juego` VALUES (1,1,60,60,1,32),(2,1,5,5,1,25),(3,1,25,25,1,27),(4,1,5.6000000000000005,7,2,34),(5,1,40,50,2,15),(6,1,4,5,2,25),(7,1,24,30,3,8),(8,1,16,20,3,21),(9,1,48,60,3,7),(10,1,30,30,4,47),(11,1,30,30,4,43),(12,1,40,40,4,41),(13,1,24,30,5,28),(14,1,12,15,5,29),(15,1,24,30,5,16),(16,1,48,60,5,9),(17,1,25,25,6,5),(18,1,50,50,6,2),(19,1,45,45,6,11),(20,1,35,35,7,10),(21,1,24,30,8,28),(22,1,40,50,9,33),(23,1,30,30,10,43),(24,1,28,35,11,37),(25,1,4,5,12,26),(26,1,4,5,12,25),(27,1,24,30,13,8),(28,2,10,5,14,30),(29,1,7,7,15,34),(30,1,35,35,15,37),(31,1,48,60,16,32),(32,1,24,30,16,3),(33,1,56,70,16,4),(34,1,60,60,17,9),(35,1,20,20,18,21),(36,1,35,35,18,37),(37,1,20,20,18,23),(38,1,48,60,19,1),(39,2,50,25,20,24),(40,1,70,70,21,4),(41,1,50,50,22,2),(42,1,48,60,23,1),(43,2,80,50,23,2),(44,1,4,5,23,30),(45,1,60,60,24,32),(46,2,32,20,25,6),(47,1,24,30,25,16),(48,1,48,60,25,7),(49,1,48,60,25,13),(50,1,40,50,25,14),(51,1,32,40,26,36),(52,1,40,50,26,33),(53,1,48,60,26,39),(54,1,30,30,27,8),(55,2,48,30,28,28),(56,1,48,60,28,38),(57,1,32,40,28,41),(58,1,20,25,28,27),(59,1,4,5,28,25),(60,1,16,20,28,42),(61,1,30,30,29,19),(62,1,30,30,29,16),(63,1,60,60,29,13),(64,1,60,60,30,38),(65,1,28,35,31,10),(66,1,48,60,31,9),(67,1,28,35,32,10),(68,1,48,60,32,9),(69,1,40,40,33,41),(70,1,30,30,34,47),(71,1,20,20,34,45),(72,1,30,30,34,8),(73,1,20,20,34,6),(74,1,25,25,34,5),(75,1,30,30,34,46),(76,1,48,60,35,32),(77,1,4,5,35,30),(78,1,30,30,36,28),(79,1,25,25,36,27),(80,1,5,5,36,26),(81,1,60,60,37,13),(82,1,50,50,37,15),(83,1,50,50,37,14),(84,1,5.6000000000000005,7,38,34),(85,1,48,60,38,38),(86,1,48,60,38,40),(87,1,28,35,39,10),(88,1,36,45,39,11),(89,1,50,50,40,35),(90,2,80,40,40,36),(91,1,30,30,40,3),(92,1,20,20,41,6);
/*!40000 ALTER TABLE `pre_compra_video_juego` ENABLE KEYS */;
UNLOCK TABLES;
/*!40103 SET TIME_ZONE=@OLD_TIME_ZONE */;

/*!40101 SET SQL_MODE=@OLD_SQL_MODE */;
/*!40014 SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS */;
/*!40014 SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS */;
/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;
/*!40111 SET SQL_NOTES=@OLD_SQL_NOTES */;

-- Dump completed on 2024-12-14 20:58:33

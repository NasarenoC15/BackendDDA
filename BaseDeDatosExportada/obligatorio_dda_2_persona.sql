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
-- Table structure for table `persona`
--

DROP TABLE IF EXISTS `persona`;
/*!40101 SET @saved_cs_client     = @@character_set_client */;
/*!50503 SET character_set_client = utf8mb4 */;
CREATE TABLE `persona` (
  `id` int NOT NULL,
  `correo` varchar(255) DEFAULT NULL,
  `fecha_registro` date DEFAULT NULL,
  `nombre` varchar(255) DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci;
/*!40101 SET character_set_client = @saved_cs_client */;

--
-- Dumping data for table `persona`
--

LOCK TABLES `persona` WRITE;
/*!40000 ALTER TABLE `persona` DISABLE KEYS */;
INSERT INTO `persona` VALUES (1,'nasa@correo.com','2023-12-06','Nasareno'),(2,'agus@correo.com','2023-12-06','Agustina'),(3,'cesar@correo.com','2023-12-06','Cesar'),(4,'rafa@correo.com','2023-12-06','Rafael'),(5,'meli@correo.com','2023-12-06','Melisa'),(6,'nati@correo.com','2023-12-06','Natalia'),(7,'agustin@correo.com','2023-12-06','Agustin'),(8,'maria.lopez@hotmail.com','2024-12-14','María López'),(9,' juan.perez@gmail.com','2024-12-14','Juan Pérez'),(10,'sofia.garcia@hotmail.com','2024-12-14','Sofía García'),(11,'carlos.rodriguez@gmail.com','2024-12-14','Carlos Rodríguez'),(12,'ana.martinez@hotmail.com','2024-12-14','Ana Martínez '),(13,'luis.gomez@gmail.com','2024-12-14','Luis Gómez'),(14,'mika@hotmail.com','2024-12-14','Mikaela Sosa'),(15,'caroponce@hotmail.com','2024-12-14','Carolina Ponce'),(16,'cecicollazo@gmail.com','2024-12-14','Cecilia Collazo'),(17,'lumar@hotmail.com','2024-12-14','Lucia Martinez'),(18,'valeria.torres@hotmail.com','2024-12-14','Valeria Torres'),(19,'javier.morales@gmail.com','2024-12-14','Javier Morales'),(20,'elena.fernandez@hotmail.com','2024-12-14','Elena Fernández'),(21,'diego.sanchez@gmail.com','2024-12-14','Diego Sánchez - '),(22,'ana.lopez@gmail.com','2024-12-14','Ana López'),(23,'carlos.perez@hotmail.com','2024-12-14','Carlos Pérez'),(24,'agusmartinez@gmail.com','2024-12-14','Agustin Martinez'),(25,'fabio_rodriguez@gmail.com','2024-12-14','Fabio Rodriguez'),(26,'emifernandez@gmail.com','2024-12-14','Emiliano Fernandez'),(27,'feli@gmail.com','2024-12-14','Felipe Da Silva'),(28,'clemen@gmail.com','2024-12-14','Clementina Rodriguez'),(29,'maria.garcia@yahoo.com','2024-12-14','María García'),(30,'juan.martinez@gmail.com','2024-12-14','Juan Martínez'),(31,' laura.fernandez@hotmail.com','2024-12-14','Laura Fernández'),(32,'jose.rodriguez@yahoo.com','2024-12-14','José Rodríguez'),(33,'sofia.torres@gmail.com','2024-12-14','Sofía Torres'),(34,'pedro.ramirez@hotmail.com','2024-12-14','Pedro Ramírez'),(35,'elena.morales@yahoo.com','2024-12-14','Elena Morales'),(36,'miguel.sanchez@gmail.com','2024-12-14','Miguel Sánchez'),(37,'lucia.herrera@hotmail.com','2024-12-14','Lucía Herrera'),(38,'diego.castro@yahoo.com','2024-12-14','Diego Castro'),(39,'paula.gomez@gmail.com','2024-12-14','Paula Gómez'),(40,'alberto.ruiz@hotmail.com','2024-12-14','Alberto Ruiz'),(41,'isabel.vargas@yahoo.com','2024-12-14','Isabel Vargas '),(42,'javier.jimenez@gmail.com','2024-12-14','Javier Jiménez'),(43,'andrea.ortiz@hotmail.com','2024-12-14','Andrea Ortiz'),(44,'daniel.diaz@yahoo.com','2024-12-14','Daniel Díaz'),(45,'carolina.mendoza@gmail.com','2024-12-14','Carolina Mendoza'),(46,'sergio.navarro@hotmail.com','2024-12-14','Sergio Navarro');
/*!40000 ALTER TABLE `persona` ENABLE KEYS */;
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

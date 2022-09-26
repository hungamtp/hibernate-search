-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';


CREATE SCHEMA IF NOT EXISTS `hibernate_search` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `hibernate_search` ;

CREATE TABLE IF NOT EXISTS `hibernate_search`.`product` (
                                                        `id` VARCHAR(36) NOT NULL,
                                                        `create_date` DATETIME NULL DEFAULT NULL,
                                                        `last_modified_date` DATETIME NULL DEFAULT NULL,
                                                        `description` VARCHAR(255) NULL DEFAULT NULL,
                                                        `name` VARCHAR(255) NULL DEFAULT NULL,
                                                        PRIMARY KEY (`id`))



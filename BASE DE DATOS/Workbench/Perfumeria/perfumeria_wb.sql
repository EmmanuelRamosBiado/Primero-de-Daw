-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema perfumeria
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema perfumeria
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `perfumeria` ;
USE `perfumeria` ;

-- -----------------------------------------------------
-- Table `perfumeria`.`laboratorio`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `perfumeria`.`laboratorio` (
  `laboratorio` VARCHAR(45) NOT NULL,
  `calle` VARCHAR(45) NOT NULL,
  `numero` INT NOT NULL,
  `poblacion` VARCHAR(50) NOT NULL,
  `telefono` VARCHAR(12) NOT NULL,
  `mail` VARCHAR(45) NOT NULL,
  `responsable` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`laboratorio`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `perfumeria`.`perfume`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `perfumeria`.`perfume` (
  `perfume` VARCHAR(45) NOT NULL,
  `tipo_envase` VARCHAR(45) NOT NULL,
  `tamano` DECIMAL(6,2) NOT NULL,
  `laboratorio` VARCHAR(45) NOT NULL,
  PRIMARY KEY (`perfume`),
  INDEX `fk_perfume_laboratorio_idx` (`laboratorio` ASC) VISIBLE,
  CONSTRAINT `fk_perfume_laboratorio`
    FOREIGN KEY (`laboratorio`)
    REFERENCES `perfumeria`.`laboratorio` (`laboratorio`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `perfumeria`.`esencia`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `perfumeria`.`esencia` (
  `esencia` VARCHAR(45) NOT NULL,
  `precio` DECIMAL(10,2) NOT NULL,
  PRIMARY KEY (`esencia`))
ENGINE = InnoDB;


-- -----------------------------------------------------
-- Table `perfumeria`.`contiene`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `perfumeria`.`contiene` (
  `perfume` VARCHAR(45) NOT NULL,
  `esencia` VARCHAR(45) NOT NULL,
  `proporcion` DECIMAL(5,2) NOT NULL,
  PRIMARY KEY (`perfume`, `esencia`),
  INDEX `fk_contiene_esencia_idx` (`esencia` ASC) VISIBLE,
  CONSTRAINT `fk_contiene_perfume`
    FOREIGN KEY (`perfume`)
    REFERENCES `perfumeria`.`perfume` (`perfume`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION,
  CONSTRAINT `fk_contiene_esencia`
    FOREIGN KEY (`esencia`)
    REFERENCES `perfumeria`.`esencia` (`esencia`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB;

alter table perfume add constraint ck_tamano check (tamano>0)
alter table contiene add constraint ck_proporcion check (proporcion>0)
alter table esencia add constraint ck_precio check (precio>0)



SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

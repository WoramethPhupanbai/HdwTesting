-- MySQL Workbench Forward Engineering

SET @OLD_UNIQUE_CHECKS=@@UNIQUE_CHECKS, UNIQUE_CHECKS=0;
SET @OLD_FOREIGN_KEY_CHECKS=@@FOREIGN_KEY_CHECKS, FOREIGN_KEY_CHECKS=0;
SET @OLD_SQL_MODE=@@SQL_MODE, SQL_MODE='ONLY_FULL_GROUP_BY,STRICT_TRANS_TABLES,NO_ZERO_IN_DATE,NO_ZERO_DATE,ERROR_FOR_DIVISION_BY_ZERO,NO_ENGINE_SUBSTITUTION';

-- -----------------------------------------------------
-- Schema mydb
-- -----------------------------------------------------
-- -----------------------------------------------------
-- Schema hdwtesting
-- -----------------------------------------------------

-- -----------------------------------------------------
-- Schema hdwtesting
-- -----------------------------------------------------
CREATE SCHEMA IF NOT EXISTS `hdwtesting` DEFAULT CHARACTER SET utf8mb4 COLLATE utf8mb4_0900_ai_ci ;
USE `hdwtesting` ;

-- -----------------------------------------------------
-- Table `hdwtesting`.`calculatecompensationtransaction`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hdwtesting`.`calculatecompensationtransaction` (
  `idcalculatecompensation` INT NOT NULL,
  `calculateResult` DOUBLE NULL,
  `datetime` TIMESTAMP(5) NULL,
  PRIMARY KEY (`idcalculatecompensation`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `hdwtesting`.`employee`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hdwtesting`.`employee` (
  `employeeId` INT NOT NULL AUTO_INCREMENT,
  `firstName` VARCHAR(100) NULL DEFAULT NULL,
  `lastName` VARCHAR(100) NULL DEFAULT NULL,
  `birthday` DATETIME NULL DEFAULT NULL,
  `calculatecompensation_id` INT NOT NULL,
  PRIMARY KEY (`employeeId`),
  INDEX `fk_employee_calculatecompensationtransaction1_idx` (`calculatecompensation_id` ASC) VISIBLE,
  CONSTRAINT `fk_employee_calculatecompensationtransaction1`
    FOREIGN KEY (`calculatecompensation_id`)
    REFERENCES `hdwtesting`.`calculatecompensationtransaction` (`idcalculatecompensation`)
    ON DELETE NO ACTION
    ON UPDATE NO ACTION)
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `hdwtesting`.`employeetype`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hdwtesting`.`employeetype` (
  `typeName` VARCHAR(45) NULL DEFAULT NULL,
  `typeDetail` VARCHAR(45) NULL DEFAULT NULL,
  `employee_employeeId` INT NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`employee_employeeId`),
  INDEX `fk_employeetype_employee1_idx` (`employee_employeeId` ASC) VISIBLE,
  CONSTRAINT `fk_employeetype_employee1`
    FOREIGN KEY (`employee_employeeId`)
    REFERENCES `hdwtesting`.`employee` (`employeeId`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `hdwtesting`.`fulltimeemployee`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hdwtesting`.`fulltimeemployee` (
  `salary` DOUBLE NULL DEFAULT NULL,
  `employee_employeeId` INT NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`employee_employeeId`),
  INDEX `fk_fulltimeemployee_employee_idx` (`employee_employeeId` ASC) VISIBLE,
  CONSTRAINT `fk_fulltimeemployee_employee`
    FOREIGN KEY (`employee_employeeId`)
    REFERENCES `hdwtesting`.`employee` (`employeeId`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


-- -----------------------------------------------------
-- Table `hdwtesting`.`parttimeemployee`
-- -----------------------------------------------------
CREATE TABLE IF NOT EXISTS `hdwtesting`.`parttimeemployee` (
  `compensation` DOUBLE NULL DEFAULT NULL,
  `employee_employeeId` INT NOT NULL AUTO_INCREMENT,
  PRIMARY KEY (`employee_employeeId`),
  INDEX `fk_parttimeemployee_employee1_idx` (`employee_employeeId` ASC) VISIBLE,
  CONSTRAINT `fk_parttimeemployee_employee1`
    FOREIGN KEY (`employee_employeeId`)
    REFERENCES `hdwtesting`.`employee` (`employeeId`))
ENGINE = InnoDB
DEFAULT CHARACTER SET = utf8mb4
COLLATE = utf8mb4_0900_ai_ci;


SET SQL_MODE=@OLD_SQL_MODE;
SET FOREIGN_KEY_CHECKS=@OLD_FOREIGN_KEY_CHECKS;
SET UNIQUE_CHECKS=@OLD_UNIQUE_CHECKS;

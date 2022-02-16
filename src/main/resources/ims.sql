CREATE DATABASE IF NOT EXISTS ims;

USE ims;

drop schema `ims`;

CREATE SCHEMA IF NOT EXISTS `ims`;

USE `ims` ;

CREATE TABLE IF NOT EXISTS `ims`.`customers` (
    `id` INT(11) NOT NULL AUTO_INCREMENT,
    `first_name` VARCHAR(40) DEFAULT NULL,
    `surname` VARCHAR(40) DEFAULT NULL,
    PRIMARY KEY (`id`)
);

CREATE TABLE IF NOT EXISTS `ims`.`items` (
	`item_id` int(11) NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(40) DEFAULT NULL,
    `price` DOUBLE DEFAULT NULL,
    PRIMARY KEY (`item_id`) );
    
CREATE TABLE IF NOT EXISTS `ims`.`orders` (
    `order_id` INT(11) NOT NULL AUTO_INCREMENT,
    `quantity` INT(4) NOT NULL,
    `cost` DOUBLE(6,2) DEFAULT NULL,
    `customer` int(11),
    PRIMARY KEY (`order_id`),
    FOREIGN KEY (`customer`) REFERENCES `customers`(`id`));
    
CREATE  TABLE IF NOT EXISTS `orders_items` (
	`item_id` int(11) NOT NULL,
    `order_id` int(11) NOT NULL,
    FOREIGN KEY (`item_id`) REFERENCES `items`(`item_id`),
    FOREIGN KEY (`order_id`) REFERENCES `orders`(`order_id`));
    
INSERT INTO `ims`.`customers` (`first_name`, `surname`) VALUES ('jordan', 'harrison');
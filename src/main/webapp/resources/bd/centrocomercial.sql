-- phpMyAdmin SQL Dump
-- version 4.1.14
-- http://www.phpmyadmin.net
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 26-11-2015 a las 16:44:29
-- Versión del servidor: 5.6.17
-- Versión de PHP: 5.5.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8 */;

--
-- Base de datos: `centrocomercial`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `administrador`
--

CREATE TABLE IF NOT EXISTS `administrador` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user` varchar(10) COLLATE utf8_spanish_ci DEFAULT NULL,
  `pass` varchar(20) COLLATE utf8_spanish_ci DEFAULT NULL,
  `role` varchar(3) COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `cliente`
--

CREATE TABLE IF NOT EXISTS `cliente` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user` varchar(10) COLLATE utf8_spanish_ci DEFAULT NULL,
  `pass` varchar(20) COLLATE utf8_spanish_ci DEFAULT NULL,
  `nombre` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `apellidos` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `ruta_imagen` varchar(500) COLLATE utf8_spanish_ci DEFAULT NULL,
  `online` int(11) DEFAULT NULL,
  `hora_conexion` date DEFAULT NULL,
  `role` varchar(3) COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `empleado`
--

CREATE TABLE IF NOT EXISTS `empleado` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `user` varchar(10) COLLATE utf8_spanish_ci DEFAULT NULL,
  `pass` varchar(20) COLLATE utf8_spanish_ci DEFAULT NULL,
  `nombre` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `apellidos` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `ruta_imagen` varchar(500) COLLATE utf8_spanish_ci DEFAULT NULL,
  `online` int(11) DEFAULT NULL,
  `hora_conexion` date DEFAULT NULL,
  `role` varchar(3) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tienda` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `codTienda` (`tienda`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `producto`
--

CREATE TABLE IF NOT EXISTS `producto` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `descripcion` varchar(200) COLLATE utf8_spanish_ci DEFAULT NULL,
  `ruta_imagen` varchar(500) COLLATE utf8_spanish_ci DEFAULT NULL,
  `disponible` int(11) DEFAULT NULL,
  `cliente` int(11) DEFAULT NULL,
  `tienda` int(11) DEFAULT NULL,
  PRIMARY KEY (`id`),
  KEY `codCliente` (`cliente`),
  KEY `codCliente_2` (`cliente`),
  KEY `codTienda` (`tienda`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `tienda`
--

CREATE TABLE IF NOT EXISTS `tienda` (
  `id` int(11) NOT NULL AUTO_INCREMENT,
  `nombre` varchar(50) COLLATE utf8_spanish_ci DEFAULT NULL,
  `descripcion` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `tipo` varchar(100) COLLATE utf8_spanish_ci DEFAULT NULL,
  `estado` int(11) DEFAULT NULL,
  `horario_abrir` varchar(5) COLLATE utf8_spanish_ci DEFAULT NULL,
  `horario_cerrar` varchar(5) COLLATE utf8_spanish_ci DEFAULT NULL,
  PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_spanish_ci AUTO_INCREMENT=1 ;

--
-- Restricciones para tablas volcadas
--

--
-- Filtros para la tabla `empleado`
--
ALTER TABLE `empleado`
  ADD CONSTRAINT `empleado_ibfk_1` FOREIGN KEY (`tienda`) REFERENCES `tienda` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

--
-- Filtros para la tabla `producto`
--
ALTER TABLE `producto`
  ADD CONSTRAINT `producto_ibfk_1` FOREIGN KEY (`cliente`) REFERENCES `cliente` (`id`) ON DELETE CASCADE ON UPDATE CASCADE,
  ADD CONSTRAINT `producto_ibfk_2` FOREIGN KEY (`tienda`) REFERENCES `tienda` (`id`) ON DELETE CASCADE ON UPDATE CASCADE;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

-- phpMyAdmin SQL Dump
-- version 5.1.1
-- https://www.phpmyadmin.net/
--
-- Servidor: 127.0.0.1
-- Tiempo de generación: 01-12-2021 a las 14:23:43
-- Versión del servidor: 10.4.21-MariaDB
-- Versión de PHP: 8.0.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Base de datos: `proyectopoo`
--

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `r_asistencia`
--

CREATE TABLE `r_asistencia` (
  `id_asistencia` int(11) NOT NULL,
  `id_empleado` int(11) DEFAULT NULL,
  `nombres` varchar(50) DEFAULT NULL,
  `apellidos` varchar(50) DEFAULT NULL,
  `usuario` varchar(50) DEFAULT NULL,
  `fecha` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `r_asistencia`
--

INSERT INTO `r_asistencia` (`id_asistencia`, `id_empleado`, `nombres`, `apellidos`, `usuario`, `fecha`) VALUES
(1, 1, 'rapazion', 'cesar', 'cesar', '2021-10-28');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `r_boleta`
--

CREATE TABLE `r_boleta` (
  `id_boleta` int(11) NOT NULL,
  `fecha` varchar(50) DEFAULT NULL,
  `total` varchar(50) DEFAULT NULL,
  `id_cliente` int(11) DEFAULT NULL,
  `id_empleado` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `r_boleta`
--

INSERT INTO `r_boleta` (`id_boleta`, `fecha`, `total`, `id_cliente`, `id_empleado`) VALUES
(1, '2021-10-27', '35.0', 2, 1),
(2, '2021-10-27', '17.5', 2, 1),
(3, '2021-10-27', '6.0', 2, 1),
(4, '2021-10-27', '17.5', 2, 1),
(5, '2021-10-27', '17.5', 6, 1),
(6, '2021-10-28', '6.0', 2, 1),
(7, '2021-10-28', '6.0', 2, 1),
(8, '2021-10-28', '6.0', 2, 1),
(9, '2021-10-28', '6.0', 2, 1),
(10, '2021-10-28', '6.0', 2, 1),
(11, '2021-10-28', '6.0', 2, 1),
(12, '2021-10-28', '6.0', 2, 1),
(13, '2021-10-28', '35.0', 2, 1),
(14, '2021-10-28', '18.400000000000002', 2, 1),
(15, '2021-10-28', '21.0', 2, 1),
(16, '2021-10-28', '5.0', 2, 1),
(17, '2021-10-29', '6.7', 2, 1),
(18, '2021-10-30', '115.0', 2, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `r_cliente`
--

CREATE TABLE `r_cliente` (
  `id_cliente` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `apellidos` varchar(50) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  `dni` varchar(50) DEFAULT NULL,
  `correo` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `r_cliente`
--

INSERT INTO `r_cliente` (`id_cliente`, `nombre`, `apellidos`, `direccion`, `telefono`, `dni`, `correo`) VALUES
(2, 'Cesar', 'Berrospi', 'Psje 28', '922', '4721', 'caberrospib@'),
(3, 'Luis', 'Quispe', 'Psje 27', '922', '922', 'bquispe@hotmail.com'),
(5, 'Mily', 'Del Pueblo', 'CHOSICA', '952952952', '4712147', 'mily@hotmail.com'),
(6, 'Adrian', 'Berrosp', 'Psj22', '47213', '415213311', 'r@hotmail.com'),
(7, 'Juan Daniel', 'Yucra Ludeña', 'Psje 22', '922487123', '4725321', 'lml@hotmail.com');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `r_detalle`
--

CREATE TABLE `r_detalle` (
  `id_detalle` int(11) NOT NULL,
  `cantidad` varchar(50) DEFAULT NULL,
  `subtotal` varchar(50) DEFAULT NULL,
  `id_venta` varchar(50) DEFAULT NULL,
  `id_producto` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `r_detalle`
--

INSERT INTO `r_detalle` (`id_detalle`, `cantidad`, `subtotal`, `id_venta`, `id_producto`) VALUES
(1, '3', '2.4000000000000004', '0', '1'),
(2, '3', '10.5', '0', '3'),
(3, '10', '35.0', '0', '3'),
(4, '10', '8.0', '0', '1'),
(5, '10', '6.0', '0', '4'),
(6, '521', '7.0', '0', '3'),
(7, '10', '35.0', '1', '3'),
(8, '5', '17.5', '2', '3'),
(9, '5', '17.5', '0', '3'),
(10, '10', '35.0', '1', '3'),
(11, '2', '6.0', '3', '5'),
(12, '3', '3.0', '2', '2'),
(13, '10', '6.0', '2', '4'),
(14, '21', '73.5', '2', '3'),
(15, '5', '17.5', '4', '3'),
(16, '5', '17.5', '5', '3'),
(17, '10', '8.0', '3', '1'),
(18, '10', '8.0', '4', '1'),
(19, '10', '35.0', '5', '3'),
(20, '10', '35.0', '5', '3'),
(21, '10', '35.0', '5', '3'),
(22, '10', '35.0', '5', '3'),
(23, '10', '35.0', '6', '3'),
(24, '10', '35.0', '6', '3'),
(25, '10', '35.0', '6', '3'),
(26, '10', '35.0', '6', '3'),
(27, '10', '35.0', '6', '3'),
(28, '10', '8.0', '7', '1'),
(29, '10', '8.0', '7', '1'),
(30, '10', '8.0', '7', '1'),
(31, '10', '6.0', '6', '4'),
(32, '10', '6.0', '7', '4'),
(33, '10', '6.0', '8', '4'),
(34, '10', '6.0', '9', '4'),
(35, '10', '6.0', '10', '4'),
(36, '10', '6.0', '11', '4'),
(37, '10', '6.0', '12', '4'),
(38, '10', '35.0', '13', '3'),
(39, '23', '18.400000000000002', '14', '1'),
(40, '35', '21.0', '15', '4'),
(41, '10', '35.0', '8', '3'),
(42, '25', '75.0', '9', '5'),
(43, '5', '5.0', '16', '2'),
(44, '2', '7.0', '10', '3'),
(45, '1', '1.0', '10', '6'),
(46, '1', '3.5', '17', '3'),
(47, '3', '2.4000000000000004', '17', '1'),
(48, '1', '0.8', '17', '1'),
(49, '10', '100.0', '18', '8'),
(50, '5', '15.0', '18', '5'),
(51, '5', '5.0', '11', '2');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `r_empleado`
--

CREATE TABLE `r_empleado` (
  `id_empleado` int(11) NOT NULL,
  `nombres` varchar(50) DEFAULT NULL,
  `apellidos` varchar(50) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  `dni` varchar(50) DEFAULT NULL,
  `correo` varchar(50) DEFAULT NULL,
  `privilegio` varchar(50) DEFAULT NULL,
  `usuario` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `r_empleado`
--

INSERT INTO `r_empleado` (`id_empleado`, `nombres`, `apellidos`, `direccion`, `telefono`, `dni`, `correo`, `privilegio`, `usuario`) VALUES
(2, 'Cesar', 'Berrospi', 'Psj', '521', '521', 'afc@hotmail.com', 'Empleado', 'Oshine'),
(3, 'Luis', 'Quispe', 'Psje20', '454', '412', '@', 'Administrador', 'rapa'),
(5, 'Angel', 'Guerra', 'Psje 20', '921462112', '4721631', 'alejo@hotmail.com', 'Empleado', 'yucra'),
(6, 'Alejandro', 'Berrospi', 'Psje 521', '924485152', '123', 'a@gmail.com', 'Administrador', 'Rapazion');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `r_factura`
--

CREATE TABLE `r_factura` (
  `id_factura` int(11) NOT NULL,
  `fecha` varchar(50) DEFAULT NULL,
  `ruc` varchar(50) DEFAULT NULL,
  `razonsocial` varchar(50) DEFAULT NULL,
  `total` varchar(50) DEFAULT NULL,
  `id_cliente` int(11) DEFAULT NULL,
  `id_empleado` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `r_factura`
--

INSERT INTO `r_factura` (`id_factura`, `fecha`, `ruc`, `razonsocial`, `total`, `id_cliente`, `id_empleado`) VALUES
(1, '2021-10-27', '20102010', 'SOCIO SAC', '35.0', 0, 1),
(2, '2021-10-27', '20210', 'SOC', '82.5', 0, 1),
(3, '2021-10-27', '205570', 'OLIVOS SAC', '8.0', 0, 1),
(4, '2021-10-27', '20102010', 'OLIVOS SAC', '8.0', 0, 1),
(5, '2021-10-27', '2010', '50120012', '140.0', 0, 0),
(6, '2021-10-27', '2010201023', 'SOCIOS ONLINE', '175.0', 0, 1),
(7, '2021-10-27', '20102010', 'SOCIOS ANIMOS', '24.0', 0, 1),
(8, '2021-10-28', '20102010', 'SOCIOS SAC', '35.0', 0, 1),
(9, '2021-10-28', '201020100', 'SODIMAC', '75.0', 0, 1),
(10, '2021-10-29', '2010201000', 'SOCIOS SAC', '8.0', 0, 1),
(11, '2021-10-30', '20102010030', 'SOCIOS SACA', '5.0', 0, 1);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `r_finanzas`
--

CREATE TABLE `r_finanzas` (
  `id_finanzas` int(11) NOT NULL,
  `asunto` varchar(70) DEFAULT NULL,
  `monto` double DEFAULT NULL,
  `fecha` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `r_finanzas`
--

INSERT INTO `r_finanzas` (`id_finanzas`, `asunto`, `monto`, `fecha`) VALUES
(1, 'PBI', 5000, '03/11/2021'),
(2, 'PAGO PROVEEDOR', 200, '05/11/2021');

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `r_producto`
--

CREATE TABLE `r_producto` (
  `id_producto` int(11) NOT NULL,
  `nombre` varchar(50) DEFAULT NULL,
  `precio` double DEFAULT NULL,
  `stock` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `r_producto`
--

INSERT INTO `r_producto` (`id_producto`, `nombre`, `precio`, `stock`) VALUES
(1, 'OREO', 0.8, 23),
(2, 'Picaras', 1, 15),
(3, 'Inka Kola 1Lt', 3.5, 1),
(4, 'GN', 0.6, 100),
(5, 'Papita', 3, 20),
(6, 'Glacitas', 1, 19),
(7, 'Piccolo', 0.5, 100),
(9, 'Vainilla', 0.5, 50);

-- --------------------------------------------------------

--
-- Estructura de tabla para la tabla `r_proveedor`
--

CREATE TABLE `r_proveedor` (
  `id_proveedor` int(11) NOT NULL,
  `nombres` varchar(50) DEFAULT NULL,
  `ruc` varchar(50) DEFAULT NULL,
  `razonsocial` varchar(50) DEFAULT NULL,
  `direccion` varchar(50) DEFAULT NULL,
  `telefono` varchar(50) DEFAULT NULL,
  `correo` varchar(50) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Volcado de datos para la tabla `r_proveedor`
--

INSERT INTO `r_proveedor` (`id_proveedor`, `nombres`, `ruc`, `razonsocial`, `direccion`, `telefono`, `correo`) VALUES
(1, 'Luis Angel Lopez', '20102010201', 'TIENDAS NUEVAS SAC', 'PSJE CAMPOS 523', '9222451', 'dcampos@gmail.com'),
(2, 'Cesar', '20102010', 'Venta Sac', 'Psje 48', '2561102', '@');

--
-- Índices para tablas volcadas
--

--
-- Indices de la tabla `r_asistencia`
--
ALTER TABLE `r_asistencia`
  ADD PRIMARY KEY (`id_asistencia`);

--
-- Indices de la tabla `r_boleta`
--
ALTER TABLE `r_boleta`
  ADD PRIMARY KEY (`id_boleta`);

--
-- Indices de la tabla `r_cliente`
--
ALTER TABLE `r_cliente`
  ADD PRIMARY KEY (`id_cliente`);

--
-- Indices de la tabla `r_detalle`
--
ALTER TABLE `r_detalle`
  ADD PRIMARY KEY (`id_detalle`);

--
-- Indices de la tabla `r_empleado`
--
ALTER TABLE `r_empleado`
  ADD PRIMARY KEY (`id_empleado`);

--
-- Indices de la tabla `r_factura`
--
ALTER TABLE `r_factura`
  ADD PRIMARY KEY (`id_factura`);

--
-- Indices de la tabla `r_finanzas`
--
ALTER TABLE `r_finanzas`
  ADD PRIMARY KEY (`id_finanzas`);

--
-- Indices de la tabla `r_producto`
--
ALTER TABLE `r_producto`
  ADD PRIMARY KEY (`id_producto`);

--
-- Indices de la tabla `r_proveedor`
--
ALTER TABLE `r_proveedor`
  ADD PRIMARY KEY (`id_proveedor`);

--
-- AUTO_INCREMENT de las tablas volcadas
--

--
-- AUTO_INCREMENT de la tabla `r_asistencia`
--
ALTER TABLE `r_asistencia`
  MODIFY `id_asistencia` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `r_boleta`
--
ALTER TABLE `r_boleta`
  MODIFY `id_boleta` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- AUTO_INCREMENT de la tabla `r_cliente`
--
ALTER TABLE `r_cliente`
  MODIFY `id_cliente` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=9;

--
-- AUTO_INCREMENT de la tabla `r_detalle`
--
ALTER TABLE `r_detalle`
  MODIFY `id_detalle` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=52;

--
-- AUTO_INCREMENT de la tabla `r_empleado`
--
ALTER TABLE `r_empleado`
  MODIFY `id_empleado` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;

--
-- AUTO_INCREMENT de la tabla `r_factura`
--
ALTER TABLE `r_factura`
  MODIFY `id_factura` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;

--
-- AUTO_INCREMENT de la tabla `r_finanzas`
--
ALTER TABLE `r_finanzas`
  MODIFY `id_finanzas` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- AUTO_INCREMENT de la tabla `r_producto`
--
ALTER TABLE `r_producto`
  MODIFY `id_producto` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=10;

--
-- AUTO_INCREMENT de la tabla `r_proveedor`
--
ALTER TABLE `r_proveedor`
  MODIFY `id_proveedor` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

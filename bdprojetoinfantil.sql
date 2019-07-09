-- phpMyAdmin SQL Dump
-- version 4.8.4
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: 08-Jul-2019 às 17:03
-- Versão do servidor: 10.1.37-MariaDB
-- versão do PHP: 7.3.0

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `bdprojetoinfantil`
--
CREATE DATABASE IF NOT EXISTS `bdprojetoinfantil` DEFAULT CHARACTER SET latin1 COLLATE latin1_swedish_ci;
USE `bdprojetoinfantil`;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbatividades`
--

CREATE TABLE `tbatividades` (
  `idatividades` int(11) NOT NULL,
  `faixaatividades` blob,
  `descriçaoatividades` blob,
  `idcat` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbcategoriaatividade`
--

CREATE TABLE `tbcategoriaatividade` (
  `idcat` int(11) NOT NULL,
  `categoriaatividade` varchar(80) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbfilhos`
--

CREATE TABLE `tbfilhos` (
  `idfilhos` int(11) NOT NULL,
  `sexofilhos` varchar(30) DEFAULT NULL,
  `datanascimentofilho` date DEFAULT NULL,
  `nomefilho` varchar(80) DEFAULT NULL,
  `fkidpais` int(11) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

-- --------------------------------------------------------

--
-- Estrutura da tabela `tbpais`
--

CREATE TABLE `tbpais` (
  `idpais` int(11) NOT NULL,
  `telefonespais` int(11) DEFAULT NULL,
  `senhapais` int(11) DEFAULT NULL,
  `datanascimentopais` date DEFAULT NULL,
  `loginpais` varchar(80) DEFAULT NULL,
  `emailpais` varchar(80) DEFAULT NULL,
  `sexopais` varchar(30) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Extraindo dados da tabela `tbpais`
--

INSERT INTO `tbpais` (`idpais`, `telefonespais`, `senhapais`, `datanascimentopais`, `loginpais`, `emailpais`, `sexopais`) VALUES
(1, NULL, 123, NULL, 'hegon', NULL, NULL);

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbatividades`
--
ALTER TABLE `tbatividades`
  ADD PRIMARY KEY (`idatividades`);

--
-- Indexes for table `tbcategoriaatividade`
--
ALTER TABLE `tbcategoriaatividade`
  ADD PRIMARY KEY (`idcat`);

--
-- Indexes for table `tbfilhos`
--
ALTER TABLE `tbfilhos`
  ADD PRIMARY KEY (`idfilhos`),
  ADD KEY `fkidpais` (`fkidpais`);

--
-- Indexes for table `tbpais`
--
ALTER TABLE `tbpais`
  ADD PRIMARY KEY (`idpais`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbatividades`
--
ALTER TABLE `tbatividades`
  MODIFY `idatividades` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbcategoriaatividade`
--
ALTER TABLE `tbcategoriaatividade`
  MODIFY `idcat` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbfilhos`
--
ALTER TABLE `tbfilhos`
  MODIFY `idfilhos` int(11) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT for table `tbpais`
--
ALTER TABLE `tbpais`
  MODIFY `idpais` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=2;

--
-- Constraints for dumped tables
--

--
-- Limitadores para a tabela `tbfilhos`
--
ALTER TABLE `tbfilhos`
  ADD CONSTRAINT `tbfilhos_ibfk_1` FOREIGN KEY (`fkidpais`) REFERENCES `tbpais` (`idpais`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

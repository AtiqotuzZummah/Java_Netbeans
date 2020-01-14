-- phpMyAdmin SQL Dump
-- version 4.9.0.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Jan 14, 2020 at 11:52 AM
-- Server version: 10.3.15-MariaDB
-- PHP Version: 7.3.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
SET AUTOCOMMIT = 0;
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `superrmarket`
--

-- --------------------------------------------------------

--
-- Table structure for table `superrmarket`
--

CREATE TABLE `superrmarket` (
  `id_barang` int(25) NOT NULL,
  `nama_barang` varchar(25) NOT NULL,
  `merk` varchar(45) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Dumping data for table `superrmarket`
--

INSERT INTO `superrmarket` (`id_barang`, `nama_barang`, `merk`) VALUES
(21, 'pasta gigi', 'pepsodent'),
(22, 'sabun', 'dove'),
(23, 'shampoo', 'sunsilk'),
(24, 'hand & body', 'vaseline'),
(25, 'parfume', 'pucelle'),
(26, 'snack', 'chitato'),
(27, 'minuman', 'freshtea'),
(28, 'mie instan', 'indomie'),
(29, 'susu', 'indomilk'),
(30, 'makanan', 'sari roti');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `superrmarket`
--
ALTER TABLE `superrmarket`
  ADD PRIMARY KEY (`id_barang`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

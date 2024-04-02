-- phpMyAdmin SQL Dump
-- version 5.2.1
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: Apr 02, 2024 at 11:11 AM
-- Server version: 10.4.32-MariaDB
-- PHP Version: 8.2.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Database: `clinicdb`
--

-- --------------------------------------------------------

--
-- Table structure for table `tbl_userdetails`
--

CREATE TABLE `tbl_userdetails` (
  `u_id` int(50) NOT NULL,
  `u_firstname` varchar(60) NOT NULL,
  `u_lastname` varchar(60) NOT NULL,
  `u_email` varchar(60) NOT NULL,
  `u_username` varchar(60) NOT NULL,
  `u_password` varchar(60) NOT NULL,
  `u_account` varchar(60) NOT NULL,
  `u_status` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_general_ci;

--
-- Dumping data for table `tbl_userdetails`
--

INSERT INTO `tbl_userdetails` (`u_id`, `u_firstname`, `u_lastname`, `u_email`, `u_username`, `u_password`, `u_account`, `u_status`) VALUES
(1, 'jhonard', 'victorillo', 'nards@gmail.com', 'nards', '12345', 'doctor', 'Active'),
(2, 'jhonard', 'cabizares', 'aki@gmail.com', 'nard1', '12345', 'DOCTOR', 'Pending'),
(3, 'kent', 'baquerosa', 'ddsds@gmail.com', 'kent1', '12345', 'DESK', 'Pending');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_userdetails`
--
ALTER TABLE `tbl_userdetails`
  ADD PRIMARY KEY (`u_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_userdetails`
--
ALTER TABLE `tbl_userdetails`
  MODIFY `u_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

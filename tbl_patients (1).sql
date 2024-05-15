-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 15, 2024 at 08:48 AM
-- Server version: 10.4.24-MariaDB
-- PHP Version: 7.4.29

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
-- Table structure for table `tbl_patients`
--

CREATE TABLE `tbl_patients` (
  `p_id` int(60) NOT NULL,
  `p_firstname` varchar(60) NOT NULL,
  `p_lastname` varchar(60) NOT NULL,
  `p_age` int(60) NOT NULL,
  `p_gender` varchar(60) NOT NULL,
  `p_dateofbirth` varchar(60) NOT NULL,
  `p_contact` varchar(60) NOT NULL,
  `p_address` varchar(60) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_patients`
--

INSERT INTO `tbl_patients` (`p_id`, `p_firstname`, `p_lastname`, `p_age`, `p_gender`, `p_dateofbirth`, `p_contact`, `p_address`) VALUES
(2, 'jake', 'bake', 45, 'male', '12/23/22', '09992233', 'relis'),
(3, 'jane', 'batas', 34, 'Female', '3/23/23', '2334444', 'mingla'),
(4, 'mary', 'lapiz', 32, 'Male', '3/23/23', '212133323', 'mayana'),
(7, 'test', 'test', 21, 'Male', '12-17-97', '234324234', 'test'),
(8, 'cutie', 'ewwe', 23, 'Female', '12-24-12', '09319393', 'mayana'),
(9, 'jane', 'nard', 12, 'Female', '12/23/23', '099122233', 'mayana'),
(10, 'kitty', 'brice', 16, 'Female', '06/26/2008', '0992339453', 'Minglanilla'),
(11, 'renan', 'bakosa', 23, 'Male', '09/23/24', '099122332323', 'tubod');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_patients`
--
ALTER TABLE `tbl_patients`
  ADD PRIMARY KEY (`p_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_patients`
--
ALTER TABLE `tbl_patients`
  MODIFY `p_id` int(60) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=12;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

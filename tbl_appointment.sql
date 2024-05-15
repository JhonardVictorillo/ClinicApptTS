-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Host: 127.0.0.1
-- Generation Time: May 15, 2024 at 08:49 AM
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
-- Table structure for table `tbl_appointment`
--

CREATE TABLE `tbl_appointment` (
  `appt_id` int(60) NOT NULL,
  `p_id` int(11) NOT NULL,
  `date` varchar(100) NOT NULL,
  `time` varchar(60) NOT NULL,
  `apptType` varchar(100) NOT NULL,
  `u_id` int(60) NOT NULL,
  `apptStatus` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_appointment`
--

INSERT INTO `tbl_appointment` (`appt_id`, `p_id`, `date`, `time`, `apptType`, `u_id`, `apptStatus`) VALUES
(2, 4, '12/23/24', '', 'Medical Examination', 13, 'Scheduled'),
(3, 1, '2/23/12', '', 'Check-Up', 1, 'Scheduled'),
(4, 4, '12/23/0024', '', 'Check-Up', 27, 'Canceled'),
(6, 2, '12/13/2024', '11:00 am', 'Doctor check', 39, 'Canceled'),
(8, 9, '12/23/24', '  :  ', 'Medical Examination', 27, 'Completed'),
(10, 8, '3/23/24', '  :  ', 'Medical Examination', 27, 'Completed'),
(11, 2, '12/23/24', '6:00', 'Doctor check', 41, 'Scheduled'),
(12, 8, '12/23/24', '', 'Medical Examination', 38, 'Scheduled'),
(13, 1, '6/23/24', '2:00 am', 'Check-Up', 27, 'Scheduled'),
(14, 3, '6/23/24', '2:00 pm', 'Doctor check', 27, 'Completed'),
(16, 7, 'MM/dd/yy', '5:00pm', 'Check-Up', 29, 'Completed'),
(17, 8, 'Thu Apr 18 22:43:50 CST 2024', '10:00am', 'Doctor check', 27, 'Scheduled'),
(18, 3, '05/17/2024', '12:30pm', 'Check-Up', 38, 'Scheduled'),
(19, 10, '05/15/2024', '10:00 AM', 'Medical Examination', 41, 'Scheduled'),
(20, 3, '05/06/2024', '4:00pm', 'Doctor check', 36, 'Scheduled'),
(21, 4, '05/17/2024', '12:40 pm', 'Check-Up', 38, 'Scheduled'),
(22, 7, '05/16/2024', '3:30pm', 'Doctor check', 27, 'Completed'),
(23, 9, '05/17/2024', '2:00 pm', 'Medical Examination', 27, 'Completed'),
(24, 7, '05/24/2024', '1:00pm', 'Doctor check', 29, 'Scheduled'),
(25, 7, '05/07/2024', '1:00pm', 'Check-Up', 27, 'Completed'),
(26, 7, '05/15/2024', '8:00am', 'Doctor check', 29, 'Scheduled'),
(27, 9, '05/16/2024', '9:00am', 'Check-Up', 29, 'Scheduled'),
(28, 9, '05/09/2024', '11:00pm', 'Check-Up', 27, 'Scheduled'),
(29, 7, '05/08/2024', '1:00pm', 'Check-Up', 27, 'Completed'),
(30, 4, '05/16/2024', '9:00am', 'Doctor check', 27, 'Scheduled'),
(31, 4, '05/15/2024', '2:00pm', 'Doctor check', 27, 'Scheduled');

--
-- Indexes for dumped tables
--

--
-- Indexes for table `tbl_appointment`
--
ALTER TABLE `tbl_appointment`
  ADD PRIMARY KEY (`appt_id`);

--
-- AUTO_INCREMENT for dumped tables
--

--
-- AUTO_INCREMENT for table `tbl_appointment`
--
ALTER TABLE `tbl_appointment`
  MODIFY `appt_id` int(60) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=32;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

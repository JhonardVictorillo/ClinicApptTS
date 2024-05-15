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
-- Table structure for table `tbl_userdetails`
--

CREATE TABLE `tbl_userdetails` (
  `u_id` int(50) NOT NULL,
  `u_firstname` varchar(60) NOT NULL,
  `u_lastname` varchar(60) NOT NULL,
  `u_email` varchar(60) NOT NULL,
  `u_username` varchar(100) NOT NULL,
  `u_password` varchar(200) NOT NULL,
  `u_account` varchar(60) NOT NULL,
  `u_status` varchar(60) NOT NULL,
  `u_images` varchar(100) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Dumping data for table `tbl_userdetails`
--

INSERT INTO `tbl_userdetails` (`u_id`, `u_firstname`, `u_lastname`, `u_email`, `u_username`, `u_password`, `u_account`, `u_status`, `u_images`) VALUES
(20, 'suway', 'suway', '@suway', 'suway', '15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225', 'DESK', 'Active', 'src/images/pic3.jpg'),
(22, 'ewqew', 'ewew', '@mais', 'licker', 'f0b29bcb86e7ab3d7267519193a0c5ffb8582178dbf7306d0c2b3cee69855330', 'DESK', 'Active', ''),
(23, 'cutieeeee', 'labo', 'cuteko', 'hash', 'fd6262c9439abc2c5859dbd20b5b3afec25aeb246320605183971f6749907e58', 'DESK', 'Active', ''),
(24, 'nards', 'daddy', '@suway', 'desk1', '15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225', 'DESK', 'Active', 'src/images/testpic2.png'),
(25, 'jhonardAdmin', 'vic', '@admin', 'superadmin', 'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f', 'Admin', 'Active', 'src/images/pic5.jpg'),
(26, 'test', 'test', 'testtest@test.com', 'test', '37268335dd6931045bdcdf92623ff819a64244b53d0e746d438797349d4da578', 'DESK', 'Active', ''),
(27, 'jhoinard', 'victorillo', '@doc1', 'doc1', 'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f', 'DOCTOR', 'Active', 'src/images/pic4.png'),
(28, 'nardixx', 'victorillo', '@nardixx', 'nardix', '15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225', 'DESK', 'Active', ''),
(29, 'zoren', 'clein', '@zoren', 'zoren1', 'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f', 'DOCTOR', 'Active', ''),
(30, 'qwe', 'qwe', '@test', 'test1', 'ed92e4c7e54e3f4a29d8041ec93124bd3c1ec4825701cac42b3fffaf0bd7120a', 'DESK', 'Active', ''),
(31, 'qwe', '23ewe', '@test2', 'test2', 'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f', 'DESK', 'Active', ''),
(32, 'kim', 'test', '@dockkim', 'kim1', 'ed92e4c7e54e3f4a29d8041ec93124bd3c1ec4825701cac42b3fffaf0bd7120a', ' DOCTOR', 'Active', ''),
(33, 'mark', 'test', '@mark', 'mark1', 'fef3d83e32b4d981b0c0f75206e891268c6aa8bd8db5a315db7bf24168a4be27', ' DOCTOR', 'Active', ''),
(35, 'wewe', 'ewew', '@cut', 'qwe', 'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f', ' DOCTOR', 'Active', ''),
(36, 'cute', 'ohaha', '@miss', 'doc2', 'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f', 'DOCTOR', 'Active', ''),
(37, 'qwqw', 'qwq', '@OPa', 'true', 'fef3d83e32b4d981b0c0f75206e891268c6aa8bd8db5a315db7bf24168a4be27', ' DOCTOR', 'Active', ''),
(38, 'aki', 'lasssssstttt', '@akira', 'aki', '692dadb5c2fa51de6721cfad0438efc75f6aeaea293d1ed1077d2bebacaf362b', 'DOCTOR', 'Active', ''),
(39, 'kitty', 'kitititi', '@kit', 'kit', 'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f', 'DOCTOR', 'Active', ''),
(40, 'usersds', 'utest', '@utest', 'user', 'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f', 'DESK', 'Inactive', ''),
(41, 'doctor', 'bestttt', '@best', 'doc3', 'ef797c8118f02dfb649607dd5d3f8c7623048c9c063d532cc95c5ed7a898a64f', 'DOCTOR', 'Active', ''),
(42, 'frontdesk1', 'villa', '@desk', 'desk2', '15e2b0d3c33891ebb0f1ef609ec419420c20e320ce94c65fbc8c3312448eb225', 'DESK', 'Active', '');

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
  MODIFY `u_id` int(50) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=43;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

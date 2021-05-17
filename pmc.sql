-- phpMyAdmin SQL Dump
-- version 5.0.3
-- https://www.phpmyadmin.net/
--
-- Máy chủ: 127.0.0.1
-- Thời gian đã tạo: Th5 17, 2021 lúc 02:48 AM
-- Phiên bản máy phục vụ: 10.4.14-MariaDB
-- Phiên bản PHP: 7.2.34

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Cơ sở dữ liệu: `pmc`
--

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `catogory`
--

CREATE TABLE `catogory` (
  `id` int(10) NOT NULL,
  `prarentid` int(20) DEFAULT NULL,
  `tile` text DEFAULT NULL,
  `metaTitle` text DEFAULT NULL,
  `slug` tinytext DEFAULT NULL,
  `content` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `communities`
--

CREATE TABLE `communities` (
  `id` int(11) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `photo` varchar(255) DEFAULT NULL,
  `published` tinyint(1) DEFAULT NULL,
  `createdAt` datetime NOT NULL,
  `updatedAt` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `community`
--

CREATE TABLE `community` (
  `id` int(100) NOT NULL,
  `title` text DEFAULT NULL,
  `content` text DEFAULT NULL,
  `userid` int(10) DEFAULT NULL,
  `url` varchar(250) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `community`
--

INSERT INTO `community` (`id`, `title`, `content`, `userid`, `url`) VALUES
(1, 'Lorem Ipsum', 'Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...', 1, 'https://images.unsplash.com/photo-1619595236494-7b6b5ea40dba?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80'),
(2, 'Lorem Ipsum', 'Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...', 2, 'https://images.unsplash.com/photo-1619595236494-7b6b5ea40dba?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80'),
(3, 'Lorem Ipsum 3', 'Neque porro quisquam est qui dolorem ipsum quia dolor sit amet, consectetur, adipisci velit...', 3, 'https://images.unsplash.com/photo-1573495612077-a689b084faab?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=1350&q=80'),
(4, 'Lorem Ipsum 3', 'Neque porro quisquam est qui dolorem ipsum  quia dolor sit amet, consectetur, adipisci velit...', 4, 'https://images.unsplash.com/photo-1619798146346-f3a83d31f976?ixid=MnwxMjA3fDB8MHxwaG90by1wYWdlfHx8fGVufDB8fHx8&ixlib=rb-1.2.1&auto=format&fit=crop&w=358&q=80'),
(5, 'Lorem Ipsum 4', 'Neque porro quisquslslllslam est qui dolorem ipsum  quia dolor sit amet, consectetur, adipisci velit...', 5, 'https://images.unsplash.com/photo-1594643566940-893b456ae452?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1yZWxhdGVkfDE0fHx8ZW58MHx8fHw%3D&auto=format&fit=crop&w=500&q=60'),
(6, 'Lorem Ipsum 5', 'Neque porro quisquslslllslam est qui dolorem ipsum  quia dolor sit amet, consectetur, adipisci velit...', 5, 'https://images.unsplash.com/photo-1594643566940-893b456ae452?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1yZWxhdGVkfDE0fHx8ZW58MHx8fHw%3D&auto=format&fit=crop&w=500&q=60'),
(7, 'Lorem Ipsum 6', 'Neque porro quisquslslllslam est qui dolorem ipsum  quia dolor sit amet, consectetur, adipisci velit...', 5, 'https://images.unsplash.com/photo-1594643566940-893b456ae452?ixlib=rb-1.2.1&ixid=MnwxMjA3fDB8MHxwaG90by1yZWxhdGVkfDE0fHx8ZW58MHx8fHw%3D&auto=format&fit=crop&w=500&q=60');

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `commussnities`
--

CREATE TABLE `commussnities` (
  `id` int(11) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `photo` varchar(255) DEFAULT NULL,
  `published` tinyint(1) DEFAULT NULL,
  `createdAt` datetime NOT NULL,
  `updatedAt` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `hibernate_sequence`
--

CREATE TABLE `hibernate_sequence` (
  `next_val` bigint(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `hibernate_sequence`
--

INSERT INTO `hibernate_sequence` (`next_val`) VALUES
(34);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `models`
--

CREATE TABLE `models` (
  `id` int(11) NOT NULL,
  `title` varchar(255) DEFAULT NULL,
  `content` varchar(255) DEFAULT NULL,
  `photo` varchar(255) DEFAULT NULL,
  `published` tinyint(1) DEFAULT NULL,
  `createdAt` datetime NOT NULL,
  `updatedAt` datetime NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `product`
--

CREATE TABLE `product` (
  `id` bigint(20) NOT NULL,
  `userid` int(20) NOT NULL,
  `title` varchar(75) NOT NULL,
  `metaTitle` varchar(100) DEFAULT NULL,
  `slug` varchar(100) NOT NULL,
  `summary` tinytext DEFAULT NULL,
  `type` smallint(6) NOT NULL DEFAULT 0,
  `sku` varchar(100) NOT NULL,
  `price` float NOT NULL DEFAULT 0,
  `discount` float NOT NULL DEFAULT 0,
  `quantity` smallint(6) NOT NULL DEFAULT 0,
  `shop` tinyint(1) NOT NULL DEFAULT 0,
  `createdAt` datetime NOT NULL,
  `updatedAt` datetime DEFAULT NULL,
  `publishedAt` datetime DEFAULT NULL,
  `startsAt` datetime DEFAULT NULL,
  `endsAt` datetime DEFAULT NULL,
  `content` text DEFAULT NULL,
  `create_at` datetime DEFAULT NULL,
  `end_at` datetime DEFAULT NULL,
  `meta_title` varchar(255) DEFAULT NULL,
  `start_at` datetime DEFAULT NULL,
  `update_at` datetime DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `product`
--

INSERT INTO `product` (`id`, `userid`, `title`, `metaTitle`, `slug`, `summary`, `type`, `sku`, `price`, `discount`, `quantity`, `shop`, `createdAt`, `updatedAt`, `publishedAt`, `startsAt`, `endsAt`, `content`, `create_at`, `end_at`, `meta_title`, `start_at`, `update_at`) VALUES
(3, 0, 'iPhone XSMax', 'iPhone xsmax 526GB', 'iphone', 'Điện thoại iPhone Xs Max 64GB chính hãng là smartphone 2 sim, giá rẻ, có trả góp. Giao hàng tận nơi trong 1 giờ, 1 đổi 1 tháng đầu nếu lỗi. MUA NGAY', 0, 'WW75K5210YW/SV', 12.5, 10, 1, 0, '2020-01-12 00:00:00', '2021-01-01 00:00:00', '2020-03-04 00:00:00', '2021-01-01 00:00:00', '2020-03-04 00:00:00', 'Hoàn toàn xứng đáng với những gì được mong chờ, phiên bản cao cấp nhất iPhone Xs Max 64 GB của Apple năm nay nổi bật với chip A12 Bionic mạnh mẽ, màn hình rộng đến 6.5 inch, cùng camera kép trí tuệ nhân tạo và Face ID được nâng cấp.\r\nThiết kế cao cấp với viền thép không gỉ và mặt kính cường lực\r\nĐiện thoại iPhone Xs Max sở hữu lối thiết kế vô cùng đẹp mắt với những đường cong mềm mại được thừa hưởng từ chiếc iPhone đời trước đó.', NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `user`
--

CREATE TABLE `user` (
  `userid` bigint(20) NOT NULL,
  `email` varchar(255) DEFAULT NULL,
  `name` varchar(255) DEFAULT NULL,
  `password` varchar(255) DEFAULT NULL,
  `role` varchar(255) DEFAULT NULL,
  `username` varchar(255) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `userpmc`
--

CREATE TABLE `userpmc` (
  `userid` int(11) NOT NULL,
  `name` text DEFAULT NULL,
  `username` text DEFAULT NULL,
  `email` text DEFAULT NULL,
  `password` text DEFAULT NULL,
  `role` text DEFAULT NULL,
  `isVerifed` text DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `userpmc`
--

INSERT INTO `userpmc` (`userid`, `name`, `username`, `email`, `password`, `role`, `isVerifed`) VALUES
(1, NULL, 'thi', 'thi@phuongmychi.vn', NULL, 'user', NULL),
(2, 'Finn', 'Williams', 'sksksks', 'slllsss', 'skskskkspap', NULL),
(5, NULL, 'admin', 'admin@gmail.com', ']??bR??7?D<^', 'user', NULL),
(6, 'thi', 'phuongmychi', 'admin@phuongmychi.vn', '/pA236whlWNFdCNX2sI5WRcO7Nx+PZYwsUo2liTefsc=', 'admin', NULL),
(8, 'Thi', 'chi', 'pmc@phuongmychi.vn', '/pA236whlWNFdCNX2sI5WRcO7Nx+PZYwsUo2liTefsc=', 'user', NULL),
(9, 'thi', 'ccc', 'pmc@phuongmychi.vn', '/pA236whlWNFdCNX2sI5WRcO7Nx+PZYwsUo2liTefsc=', 'user', NULL),
(10, 'PMC', 'SJJS', 'admin@pmc.vn', '/pA236whlWNFdCNX2sI5WRcO7Nx+PZYwsUo2liTefsc=', 'user', NULL),
(11, 'PMC', 'XOM', 'cc@pmc.vn', '/pA236whlWNFdCNX2sI5WRcO7Nx+PZYwsUo2liTefsc=', 'user', NULL),
(12, 'helloworld', 'Williams', 'sksksks@gmai.com', 'slllsss', 'user', NULL),
(13, 'thi', 'uhuh', 'ug@gmail.com', '/pA236whlWNFdCNX2sI5WRcO7Nx+PZYwsUo2liTefsc=', 'user', NULL),
(14, 'pmck', 'pmck', 'thind9x@gmail.com', '/pA236whlWNFdCNX2sI5WRcO7Nx+PZYwsUo2liTefsc=', 'user', 'false'),
(15, 'shsj', 'pmc', 'thind9x@gmail.com', 'PS/sjQOLG3eP/6PKhA1+uM+SL3gvcyNrP8SMT56GDsk=', 'user', 'false'),
(16, 'hjjq', 'hhhj', 'th@gmail.com', '/pA236whlWNFdCNX2sI5WRcO7Nx+PZYwsUo2liTefsc=', 'user', 'false'),
(17, '', 'admin@phuongmychi.vn', '', '/pA236whlWNFdCNX2sI5WRcO7Nx+PZYwsUo2liTefsc=', 'user', 'false'),
(18, 'Chi PhÆ°Æ¡ng Má»¹', 'phuongmychifc2003', 'phuongmychifc2003@gmail.com', '47DEQpj8HBSa+/TImW+5JCeuQeRkm5NMpJWZG3hSuFU=', 'user', 'false'),
(19, 'hellowosarldmsk', 'skskss', 'thisnlommsm@gmai.com', 'sllsalsss', 'user', NULL),
(20, 'hellowosarldmsk', 'skskss', 'thisnlommsm@gmai.com', NULL, 'user', NULL),
(21, 'hellowosarldmsk', 'skskss', 'thisnlommsm@gmai.com', 'sllsalsss', 'user', NULL),
(22, 'hellowosarldmsk', 'skskss', 'thisnlommsm@gmai.com', 'sllsalsss', 'user', NULL),
(23, 'hellowosarldmsk', 'skskss', 'thisnlommsm@gmai.com', 'sllsalsss', 'user', NULL),
(24, 'hellowosarldmsk', 'skskss', 'thisnlommsm@gmai.com', 'MjAwMw==', 'user', NULL),
(25, 'hellowosarldmsk', 'skskss', 'thisnlommsm@gmai.com', 'MjAwMw==', 'user', NULL),
(26, 'thi', 'pmc1', 'thind9x@gmail.com', 'UG1jMTMwMTIwMDM=', NULL, NULL),
(27, 'thi nguyen', 'phuongmychi', 'thind9x@gmail.com', 'b7f57c2301896dac127c402b57f0f25885b2afb2dd931ce92250b40e62c32908', NULL, NULL),
(28, 'Chi', 'pmc', 'developer@phuongmychi.vn', '6a4bd009c8e9c8fa84bdb2476be77fee281ac7b6b33d83fa8f85ba12d288e2fa', NULL, NULL),
(33, NULL, NULL, NULL, NULL, NULL, NULL);

-- --------------------------------------------------------

--
-- Cấu trúc bảng cho bảng `video`
--

CREATE TABLE `video` (
  `videoid` int(11) NOT NULL,
  `title` text CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `description` text CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `userupload` text CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `dateupload` date DEFAULT NULL,
  `status` text CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `viewcount` text CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `thumbnail` text CHARACTER SET utf8 COLLATE utf8_unicode_ci DEFAULT NULL,
  `videofile` text DEFAULT NULL,
  `thumnail` varchar(255) DEFAULT NULL,
  `data` tinyblob DEFAULT NULL,
  `userid` int(20) DEFAULT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4;

--
-- Đang đổ dữ liệu cho bảng `video`
--

INSERT INTO `video` (`videoid`, `title`, `description`, `userupload`, `dateupload`, `status`, `viewcount`, `thumbnail`, `videofile`, `thumnail`, `data`, `userid`) VALUES
(1, 'SIÊU TÀI NĂNG NHÍ 2 - TẬP 1 | Trấn Thành, Hari Won CHOÁNG NGỢP trước tài năng ĐỘC LẠ mùa 2 Super 10', 'Siêu Tài Năng Nhí Mùa 2 - tập 1, Trấn Thành, Hari Won tuyên bố mùa 2 cực kỳ mới lạ so với Siêu Tài Năng Nhí mùa 1, thật sự rất đáng để xem. Những video mới nhất, độc nhất của SIÊU TÀI NĂNG NHÍ sẽ được đăng tải trên Madison Media ', 'pmc', '2021-04-18', 'public', NULL, 'https://i.ytimg.com/vi/ddi2ljNGmRE/maxresdefault.jpg', 'ddi2ljNGmRE', NULL, NULL, NULL),
(2, 'Jack | LAYLALAY | Official Music Video', 'Đồng hành cùng nhãn hàng bia LARUE --- COMPOSER: JACK (J97)  SINGER: JACK (J97) MUSIC PRODUCER:  DTAP ARRANGER: TÙNG CEDRUS - W/n  MIX AND MASTER:  MINH MAXIMUM RECORD: KHẢI ĐĂNG - TÙNG CEDRUS - HƯNG THỊNH', 'pmcs', '2020-02-15', ' ', NULL, 'https://i.ytimg.com/vi/bTFoZBIIu4E/maxresdefault.jpg', 'bTFoZBIIu4E', NULL, NULL, NULL);

--
-- Chỉ mục cho các bảng đã đổ
--

--
-- Chỉ mục cho bảng `catogory`
--
ALTER TABLE `catogory`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `communities`
--
ALTER TABLE `communities`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `community`
--
ALTER TABLE `community`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `commussnities`
--
ALTER TABLE `commussnities`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `models`
--
ALTER TABLE `models`
  ADD PRIMARY KEY (`id`);

--
-- Chỉ mục cho bảng `product`
--
ALTER TABLE `product`
  ADD PRIMARY KEY (`id`),
  ADD UNIQUE KEY `uq_slug` (`slug`),
  ADD KEY `idx_product_user` (`userid`);

--
-- Chỉ mục cho bảng `user`
--
ALTER TABLE `user`
  ADD PRIMARY KEY (`userid`);

--
-- Chỉ mục cho bảng `userpmc`
--
ALTER TABLE `userpmc`
  ADD PRIMARY KEY (`userid`);

--
-- Chỉ mục cho bảng `video`
--
ALTER TABLE `video`
  ADD PRIMARY KEY (`videoid`),
  ADD KEY `fk_transaction_video` (`userid`);

--
-- AUTO_INCREMENT cho các bảng đã đổ
--

--
-- AUTO_INCREMENT cho bảng `catogory`
--
ALTER TABLE `catogory`
  MODIFY `id` int(10) NOT NULL AUTO_INCREMENT;

--
-- AUTO_INCREMENT cho bảng `community`
--
ALTER TABLE `community`
  MODIFY `id` int(100) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=8;

--
-- AUTO_INCREMENT cho bảng `product`
--
ALTER TABLE `product`
  MODIFY `id` bigint(20) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=4;

--
-- AUTO_INCREMENT cho bảng `userpmc`
--
ALTER TABLE `userpmc`
  MODIFY `userid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=34;

--
-- AUTO_INCREMENT cho bảng `video`
--
ALTER TABLE `video`
  MODIFY `videoid` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=3;

--
-- Các ràng buộc cho các bảng đã đổ
--

--
-- Các ràng buộc cho bảng `video`
--
ALTER TABLE `video`
  ADD CONSTRAINT `fk_transaction_video` FOREIGN KEY (`userid`) REFERENCES `userpmc` (`userid`) ON DELETE NO ACTION ON UPDATE NO ACTION;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

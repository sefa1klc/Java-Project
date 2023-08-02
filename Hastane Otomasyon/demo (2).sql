-- phpMyAdmin SQL Dump
-- version 5.2.0
-- https://www.phpmyadmin.net/
--
-- Anamakine: 127.0.0.1
-- Üretim Zamanı: 30 Ara 2022, 19:53:17
-- Sunucu sürümü: 10.4.27-MariaDB
-- PHP Sürümü: 8.1.12

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- Veritabanı: `demo`
--

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `adminler`
--

CREATE TABLE `adminler` (
  `username` text NOT NULL,
  `password` text NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_turkish_ci;

--
-- Tablo döküm verisi `adminler`
--

INSERT INTO `adminler` (`username`, `password`) VALUES
('Bashekim', 'bashekim'),
('1', '1');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `calisanlar`
--

CREATE TABLE `calisanlar` (
  `id` int(11) NOT NULL,
  `ad` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `soyad` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `departman` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL,
  `maas` text CHARACTER SET utf8 COLLATE utf8_turkish_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf32 COLLATE=utf32_turkish_ci;

--
-- Tablo döküm verisi `calisanlar`
--

INSERT INTO `calisanlar` (`id`, `ad`, `soyad`, `departman`, `maas`) VALUES
(1, 'Ahmet', 'Özkara', 'Başhekim', '0453618723'),
(2, 'Zeliha', 'YÜCEL', 'Bilişim', '4500'),
(3, 'Merve', 'SÖNMEZ', 'İnsan Kaynakları', '3000'),
(4, 'Merve', 'VURAL', 'İnsan Kaynakları', '2000'),
(5, 'Havva', 'KANDEMİR', 'Bilişim', '6000'),
(6, 'Hatice', 'YÜZBAŞIOĞLU', 'Yönetim', '4500'),
(7, 'Ahmet', 'YÜZBAŞIOĞLU', 'Yönetim', '4500'),
(8, 'Mustafa', 'TÜTEN', 'İnsan Kaynakları', '4000'),
(9, 'Mustafa', 'ERDEM', 'Yönetim', '4500'),
(10, 'Havva', 'VURAL', 'Bilişim', '5500'),
(11, 'Esra', 'AKBULUT', 'Pazarlama', '6000'),
(12, 'Hanife', 'YAVUZ', 'Yönetim', '6000'),
(13, 'Meryem', 'UYANIK', 'Yönetim', '4000'),
(14, 'Emine', 'ŞEN', 'Yönetim', '2000'),
(15, 'Hüseyin', 'ŞEN', 'İnsan Kaynakları', '2000'),
(16, 'Hüseyin', 'YÜCEL', 'İnsan Kaynakları', '2000'),
(17, 'Özlem', 'ÇEVİK', 'Yönetim', '4000'),
(18, 'Yunus Emre', 'ERDEM', 'Pazarlama', '4500'),
(19, 'Zeynep', 'ÖZTÜRK', 'Yönetim', '5000'),
(20, 'Hülya', 'ÖZTÜRK', 'İnsan Kaynakları', '3000'),
(21, 'İsmail', 'ERDEM', 'Pazarlama', '2500'),
(22, 'Esra', 'KANDEMİR', 'Yönetim', '4500'),
(23, 'Umut', 'ERKURAN', 'Bilişim', '4000'),
(24, 'Şerife', 'ERKURAN', 'İnsan Kaynakları', '4000'),
(25, 'Elif', 'VURAL', 'Pazarlama', '5000'),
(26, 'Mustafa', 'ŞEN', 'İnsan Kaynakları', '5500'),
(27, 'Meryem', 'KANDEMİR', 'Bilişim', '4000'),
(28, 'Enes', 'ÇEVİK', 'Bilişim', '3000'),
(29, 'Abdullah', 'ERTEKİN', 'İnsan Kaynakları', '2000'),
(30, 'Mehmet', 'ORHON', 'Pazarlama', '5000'),
(31, 'Ömer', 'SÖNMEZ', 'Pazarlama', '2000'),
(32, 'Abdullah', 'AKBULUT', 'İnsan Kaynakları', '6000'),
(33, 'Meryem', 'SÖNMEZ', 'Pazarlama', '3000'),
(34, 'İsmail', 'SÖNMEZ', 'Bilişim', '2500'),
(35, 'Zeynep', 'ŞEN', 'Yönetim', '6000'),
(36, 'Ayşe', 'YÜZBAŞIOĞLU', 'Pazarlama', '3000'),
(37, 'Enes', 'ŞEN', 'İnsan Kaynakları', '5500'),
(38, 'Şerife', 'ÇEVİK', 'İnsan Kaynakları', '2500'),
(39, 'Furkan', 'ERKURAN', 'Pazarlama', '4000'),
(40, 'Muhammed', 'ÖZTÜRK', 'Yönetim', '5000'),
(41, 'Hatice', 'VURAL', 'Yönetim', '2000'),
(42, 'Emine', 'ERTEKİN', 'Bilişim', '5000'),
(43, 'Hülya', 'YAVUZ', 'İnsan Kaynakları', '6000'),
(44, 'Meryem', 'ERTEKİN', 'Yönetim', '6000'),
(45, 'Hasan', 'YÜZBAŞIOĞLU', 'Bilişim', '3000'),
(46, 'Fadime', 'DEDE', 'İnsan Kaynakları', '2000'),
(47, 'Hasan', 'AKBULUT', 'Yönetim', '2500'),
(48, 'Süleyman', 'DEDE', 'İnsan Kaynakları', '4500'),
(49, 'Emine', 'ASLAN', 'Yönetim', '6000'),
(50, 'Hacer', 'ERKURAN', 'Bilişim', '2500'),
(51, '', '', '', ''),
(52, '', '', '', ''),
(55, 'Şevval Nur', 'Bilkay', 'Göt Hastalıkları', '1000000');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `doktor_bilgi`
--

CREATE TABLE `doktor_bilgi` (
  `doktor_id` int(11) NOT NULL,
  `doktor_tc` varchar(50) NOT NULL,
  `doktor_ad` varchar(50) NOT NULL,
  `doktor_soyad` varchar(50) NOT NULL,
  `doktor_alan` varchar(50) NOT NULL,
  `doktor_il` varchar(50) NOT NULL,
  `doktor_ilçe` varchar(50) NOT NULL,
  `doktor_dyeri` varchar(50) NOT NULL,
  `doktor_dtarihi` varchar(50) NOT NULL,
  `doktor_tel` varchar(50) NOT NULL,
  `doktor_parola` varchar(50) NOT NULL,
  `doktor_email` varchar(250) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `doktor_bilgi`
--

INSERT INTO `doktor_bilgi` (`doktor_id`, `doktor_tc`, `doktor_ad`, `doktor_soyad`, `doktor_alan`, `doktor_il`, `doktor_ilçe`, `doktor_dyeri`, `doktor_dtarihi`, `doktor_tel`, `doktor_parola`, `doktor_email`) VALUES
(1, '43255431324', 'Ahmet', 'Özkara', 'Başhekim', 'istanbul', 'Bakırköy', 'Ankara', '1985', '0453618723', '1', 'ahmet@gmail.com'),
(2, '57092027453', 'Alp', 'Burak', 'Kardiyoloji', 'istanbul', 'Bakırköy', 'Ankara', '1973', '0453618782', 'alp123456', 'alp@gmail.com'),
(3, '23483027453', 'Ayhan', 'Sucak', 'Kadın hastalıkları ve Doğum', 'istanbul', 'Bakırköy', 'çanakkale', '1964', '0551618723', 'ayhan123456', 'ayhan@gmail.com'),
(12, '37584939567', 'Kenan', 'Yılmaz', 'Göz hastalıkları', '', '', '', '', '0453619835', '', ''),
(18, '782438476842', 'Serhan', 'kılıç', 'Beyin', '', '', '', '', '055167283', '', '');

-- --------------------------------------------------------

--
-- Tablo için tablo yapısı `hasta_bilgi`
--

CREATE TABLE `hasta_bilgi` (
  `hasta_id` int(11) NOT NULL,
  `hasta_tc` text NOT NULL,
  `hasta_ad` varchar(50) NOT NULL,
  `hasta_soyad` varchar(50) NOT NULL,
  `hasta_dyeri` varchar(50) NOT NULL,
  `hasta_dtarihi` varchar(50) NOT NULL,
  `hasta_cinsiyet` varchar(50) NOT NULL,
  `hasta_telefon` varchar(50) NOT NULL,
  `hasta_adres` varchar(250) NOT NULL,
  `hasta_il` varchar(50) NOT NULL,
  `hasta_ilce` varchar(50) NOT NULL,
  `hasta_anne` varchar(50) NOT NULL,
  `hasta_baba` varchar(50) NOT NULL,
  `hasta_email` varchar(250) NOT NULL,
  `hasta_sgk` varchar(50) NOT NULL,
  `hasta_parola` text NOT NULL,
  `hasta_oda` varchar(50) NOT NULL,
  `hasta_yatak` varchar(50) NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8 COLLATE=utf8_turkish_ci;

--
-- Tablo döküm verisi `hasta_bilgi`
--

INSERT INTO `hasta_bilgi` (`hasta_id`, `hasta_tc`, `hasta_ad`, `hasta_soyad`, `hasta_dyeri`, `hasta_dtarihi`, `hasta_cinsiyet`, `hasta_telefon`, `hasta_adres`, `hasta_il`, `hasta_ilce`, `hasta_anne`, `hasta_baba`, `hasta_email`, `hasta_sgk`, `hasta_parola`, `hasta_oda`, `hasta_yatak`) VALUES
(1, '23612916319', 'Mehmet', 'Kesen', 'çankaya', '1989', 'erkek', '05525466576', 'Horasan Sk No:28 D:1 Çankaya/ Ankara', 'ankara', 'çankaya', 'zeliha', 'ahmet', 'mehmet@gmail.com', 'var', 'm123456', '', ''),
(2, '23612967319', 'Hale', 'Ak', 'samsun', '2002', 'kız', '03325466576', 'Gazi mh. Yenişehir / Mersin', 'samsun', 'çarşamba', 'şevval', 'sefa', 'hale@gmail.com', 'var', 'h123456', '', ''),
(3, '47385947365', 'Emine', 'Bilmez', 'nilüfer', '1994', 'kız', '04358679492', 'Çekmece İstanbul Cd. Bakırköy/ İstanbul', 'bursa', 'nilüfer', 'çilem', 'mete', 'emine@gmail.com', 'var', 'e123456', '', ''),
(4, '23009564694', 'Sefa', 'Kılıç', 'vezirköprü', '2000', 'erkek', '5511268370', 'Çekmece İstanbul Cd vezirköprü/Samsun', 'samsun', 'vezirköprü', 'emine', 'osman', 'sefakkilic@gmail.com', 'var', 'Sefa190320', '', ''),
(6, '1', 'deneme', '', '', '', '', '', '', '', '', '', '', '', '', '1', '', '');

--
-- Dökümü yapılmış tablolar için indeksler
--

--
-- Tablo için indeksler `calisanlar`
--
ALTER TABLE `calisanlar`
  ADD PRIMARY KEY (`id`);

--
-- Tablo için indeksler `doktor_bilgi`
--
ALTER TABLE `doktor_bilgi`
  ADD PRIMARY KEY (`doktor_id`);

--
-- Tablo için indeksler `hasta_bilgi`
--
ALTER TABLE `hasta_bilgi`
  ADD PRIMARY KEY (`hasta_id`);

--
-- Dökümü yapılmış tablolar için AUTO_INCREMENT değeri
--

--
-- Tablo için AUTO_INCREMENT değeri `calisanlar`
--
ALTER TABLE `calisanlar`
  MODIFY `id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=56;

--
-- Tablo için AUTO_INCREMENT değeri `doktor_bilgi`
--
ALTER TABLE `doktor_bilgi`
  MODIFY `doktor_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=19;

--
-- Tablo için AUTO_INCREMENT değeri `hasta_bilgi`
--
ALTER TABLE `hasta_bilgi`
  MODIFY `hasta_id` int(11) NOT NULL AUTO_INCREMENT, AUTO_INCREMENT=7;
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

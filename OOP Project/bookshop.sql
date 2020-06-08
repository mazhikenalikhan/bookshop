-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Хост: localhost:3306
-- Время создания: Июн 08 2020 г., 13:27
-- Версия сервера: 8.0.18
-- Версия PHP: 7.3.17

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `bookshop`
--

-- --------------------------------------------------------

--
-- Структура таблицы `admin`
--

CREATE TABLE `admin` (
  `id` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `price/tenge` int(11) NOT NULL,
  `number` int(11) NOT NULL,
  `Author` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `name` text COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Дамп данных таблицы `admin`
--

INSERT INTO `admin` (`id`, `price/tenge`, `number`, `Author`, `name`) VALUES
('1', 4430, 100, 'Рэнд А', 'Атлант расправил плечи'),
('10', 1850, 100, 'Э. М. Ремарк', 'Триумфальная арка'),
('11', 5270, 100, 'Рэнд А', 'Атлант расплавил плечи'),
('12', 1150, 100, 'Моруа А.', 'Письма незнакомке'),
('13', 1380, 100, 'Хаксли О.', 'О дивный новый мир'),
('14', 1380, 100, 'Берджесс Э.', 'Заводной апельсин'),
('15', 1190, 100, 'Уайльд О.', 'Портрет Дориана Грея'),
('16', 1000, 100, 'Лондон Дж.', 'Мартин Иден'),
('17', 1550, 100, 'Набоков В.В.', 'Лолита'),
('18', 1750, 100, 'Хэйли А.', 'Аэропорт'),
('19', 850, 100, 'Бронте Э.', 'Грозовой перевал'),
('2', 1520, 100, 'Оруэлл Дж', '1984'),
('20', 4640, 100, 'Рэнд А.', 'Источник'),
('3', 1810, 100, 'Э. М. Ремарк', 'Три товарища'),
('4', 1135, 100, 'Остин Дж', 'Гордость и предубеждение'),
('5', 1150, 100, 'Олкотт', 'Маленькие женщины'),
('6', 1315, 100, 'Голдинг У', 'Повелитель Мух\r\n'),
('7', 1190, 100, 'Драйзер Т', 'Финансист'),
('8', 1650, 100, 'Сэлинджер Дж.', 'Над пропастью во ржи'),
('9', 2190, 100, 'Гарсиа Маркес Г.', 'Сто лет одиночества');

-- --------------------------------------------------------

--
-- Структура таблицы `clients`
--

CREATE TABLE `clients` (
  `ID` varchar(100) COLLATE utf8mb4_unicode_ci NOT NULL,
  `username` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `password` text COLLATE utf8mb4_unicode_ci NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Дамп данных таблицы `clients`
--

INSERT INTO `clients` (`ID`, `username`, `password`) VALUES
('1', 'k.yessaly@astanait.edu.kz', 'cin>>Kais17'),
('2', 'a.mazhiken@astanait.edu.kz', 'Alikhan13245'),
('3', 'y.burkeyeva@astanait.edu.kz', 'katya1122');

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `admin`
--
ALTER TABLE `admin`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `clients`
--
ALTER TABLE `clients`
  ADD PRIMARY KEY (`ID`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

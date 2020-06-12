-- phpMyAdmin SQL Dump
-- version 5.0.2
-- https://www.phpmyadmin.net/
--
-- Хост: localhost:3306
-- Время создания: Июн 12 2020 г., 13:42
-- Версия сервера: 8.0.20
-- Версия PHP: 7.4.6

SET SQL_MODE = "NO_AUTO_VALUE_ON_ZERO";
START TRANSACTION;
SET time_zone = "+00:00";


/*!40101 SET @OLD_CHARACTER_SET_CLIENT=@@CHARACTER_SET_CLIENT */;
/*!40101 SET @OLD_CHARACTER_SET_RESULTS=@@CHARACTER_SET_RESULTS */;
/*!40101 SET @OLD_COLLATION_CONNECTION=@@COLLATION_CONNECTION */;
/*!40101 SET NAMES utf8mb4 */;

--
-- База данных: `temporary`
--

-- --------------------------------------------------------

--
-- Структура таблицы `magazine`
--

CREATE TABLE `magazine` (
  `id` int NOT NULL,
  `Author` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `number` int NOT NULL,
  `price` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Дамп данных таблицы `magazine`
--

INSERT INTO `magazine` (`id`, `Author`, `number`, `price`) VALUES
(1, 'Kazakhstan Today', 100, 250),
(2, 'Ontustik Ainasy', 100, 350),
(3, 'Qazaq Eli', 100, 250),
(4, 'Qazaqstanskaya pravda', 100, 200),
(5, 'Qazaqstan tarihy', 100, 200);

-- --------------------------------------------------------

--
-- Структура таблицы `pencils`
--

CREATE TABLE `pencils` (
  `id` int NOT NULL,
  `Company` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `Color` text COLLATE utf8mb4_unicode_ci NOT NULL,
  `number` int NOT NULL,
  `price` float NOT NULL
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_unicode_ci;

--
-- Дамп данных таблицы `pencils`
--

INSERT INTO `pencils` (`id`, `Company`, `Color`, `number`, `price`) VALUES
(1, 'Aigolek', 'Blue', 200, 150),
(2, 'Zebra', 'black', 200, 100),
(3, 'Gelevyi', 'blue', 200, 250),
(4, 'lololo', 'red', 200, 150),
(5, 'blablabla', 'red', 200, 150);

--
-- Индексы сохранённых таблиц
--

--
-- Индексы таблицы `magazine`
--
ALTER TABLE `magazine`
  ADD PRIMARY KEY (`id`);

--
-- Индексы таблицы `pencils`
--
ALTER TABLE `pencils`
  ADD PRIMARY KEY (`id`);
COMMIT;

/*!40101 SET CHARACTER_SET_CLIENT=@OLD_CHARACTER_SET_CLIENT */;
/*!40101 SET CHARACTER_SET_RESULTS=@OLD_CHARACTER_SET_RESULTS */;
/*!40101 SET COLLATION_CONNECTION=@OLD_COLLATION_CONNECTION */;

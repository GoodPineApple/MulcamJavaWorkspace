package metro;

import java.time.LocalTime;
import java.util.ArrayList;

public class Schedule {

	// 1호선 시간표 노포-신평

	protected int startSchedule[];

	protected int line1Schedule[] = { 510, 527, 540, 553, 605, 617, 626, 635, 643, 650, 657, 704, 710, 715, 719, 723,
			727, 731, 735, 739, 743, 747, 751, 755, 759, 803, 807, 811, 815, 819, 823, 827, 831, 835, 839, 843, 848,
			854, 900, 906, 912, 918, 924, 930, 936, 942, 948, 954, 1000, 1006, 1012, 1018, 1024, 1030, 1036, 1042,
			1048, 1054, 1100, 1106, 1112, 1118, 1124, 1130, 1136, 1142, 1148, 1154, 1200, 1206, 1212, 1218, 1224,
			1230, 1236, 1242, 1248, 1254, 1300, 1306, 1312, 1318, 1324, 1330, 1336, 1342, 1348, 1354, 1400, 1406,
			1412, 1418, 1424, 1430, 1436, 1442, 1448, 1454, 1500, 1506, 1512, 1518, 1524, 1530, 1536, 1542, 1548, 1554,
			1600, 1606, 1612, 1618, 1624, 1630, 1636, 1641, 1646, 1651, 1656, 1700, 1705, 1709, 1714, 1718, 1723,
			1727, 1732, 1736, 1740, 1744, 1748, 1752, 1756, 1800, 1804, 1808, 1812, 1816, 1820, 1824, 1829, 1833, 1838,
			1842, 1847, 1851, 1856, 1900, 1905, 1910, 1916, 1922, 1928, 1934, 1940, 1946, 1952, 1958, 2004, 2010,
			2016, 2023, 2031, 2039, 2047, 2055, 2103, 2111, 2119, 2127, 2135, 2143, 2151, 2159, 2209, 2219, 2231,
			2243, 2255, 2307, 2318, 2333 };

	// 1호선 시간표 신평-노포
	protected int line1ScheduleBack[] = { 505, 520, 534, 548, 600, 612, 624, 636, 646, 656, 704, 711, 717, 722, 727,
			731, 736, 740, 745, 749, 754, 758, 803, 807, 812, 816, 821, 825, 830, 834, 839, 843, 848, 852, 857, 901,
			906, 912, 918, 924, 930, 936, 942, 948, 954, 1000, 1006, 1012, 1018, 1024, 1030, 1036, 1042, 1048, 1054,
			1100, 1106, 1112, 1118, 1124, 1130, 1136, 1142, 1148, 1154, 1200, 1206, 1212, 1218, 1224, 1230, 1236,
			1242, 1248, 1254, 1300, 1306, 1312, 1318, 1324, 1330, 1336, 1342, 1348, 1354, 1400, 1406, 1412, 1418,
			1424, 1430, 1436, 1442, 1448, 1454, 1500, 1506, 1512, 1518, 1524, 1530, 1536, 1542, 1548, 1554, 1600,
			1606, 1612, 1618, 1624, 1630, 1636, 1642, 1647, 1652, 1657, 1701, 1706, 1710, 1715, 1719, 1724, 1728, 1732,
			1736, 1740, 1744, 1748, 1752, 1756, 1800, 1804, 1808, 1812, 1816, 1820, 1824, 1828, 1832, 1837, 1841, 1846,
			1850, 1855, 1859, 1904, 1908, 1913, 1917, 1922, 1927, 1932, 1937, 1943, 1949, 1955, 2001, 2007, 2013,
			2019, 2025, 2031, 2037, 2043, 2049, 2055, 2101, 2107, 2113, 2121, 2129, 2137, 2145, 2152, 2202, 2213,
			2225, 2237, 2249, 2301, 2312, 2328 };

	// 2호선 시간표 양산-장산
	protected int line2Schedule[] = { 514, 526, 538, 550, 559, 608, 614, 621, 625, 630, 639, 643, 648, 652, 701, 706,
			715, 724, 728, 737, 746, 751, 755, 805, 810, 815, 820, 825, 830, 836, 842, 849, 855, 902, 908, 915, 921,
			928, 934, 941, 947, 954, 1000, 1007, 1013, 1020, 1026, 1033, 1039, 1046, 1052, 1059, 1105, 1112, 1118,
			1125, 1131, 1138, 1144, 1151, 1157, 1204, 1210, 1217, 1223, 1230, 1236, 1243, 1249, 1256, 1302, 1309,
			1315, 1322, 1328, 1335, 1341, 1348, 1354, 1401, 1407, 1414, 1420, 1427, 1433, 1440, 1446, 1453, 1506,
			1512, 1525, 1532, 1538, 1545, 1558, 1604, 1614, 1619, 1623, 1632, 1637, 1646, 1650, 1659, 1704, 1713,
			1717, 1722, 1731, 1735, 1744, 1749, 1758, 1803, 1809, 1815, 1822, 1828, 1835, 1841, 1848, 1854, 1901,
			1907, 1914, 1920, 1927, 1934, 1941, 1948, 1956, 2004, 2012, 2020, 2028, 2036, 2044, 2052, 2100, 2108,
			2116, 2124, 2132, 2140, 2150, 2202, 2214, 2226, 2238, 2252, 2307, 2324 };

	// 2호선 시간표 장산-양산
	protected int line2ScheduleBack[] = { 518, 532, 544, 554, 606, 618, 630, 641, 651, 701, 707, 713, 719, 724, 729,
			734, 739, 744, 748, 753, 757, 802, 806, 811, 815, 820, 824, 829, 833, 838, 842, 847, 851, 856, 901, 906,
			911, 916, 921, 926, 931, 937, 944, 950, 957, 1003, 1010, 1016, 1023, 1029, 1036, 1042, 1049, 1055, 1102,
			1108, 1115, 1121, 1128, 1134, 1141, 1147, 1154, 1200, 1207, 1213, 1220, 1226, 1233, 1239, 1246, 1252, 1259,
			1305, 1312, 1318, 1325, 1331, 1338, 1344, 1351, 1357, 1404, 1410, 1417, 1423, 1430, 1436, 1443, 1449,
			1456, 1502, 1509, 1515, 1522, 1528, 1535, 1541, 1548, 1554, 1601, 1607, 1614, 1620, 1627, 1633, 1640,
			1646, 1653, 1659, 1705, 1710, 1715, 1719, 1724, 1728, 1733, 1737, 1742, 1746, 1751, 1755, 1800, 1804,
			1809, 1813, 1818, 1822, 1827, 1831, 1836, 1840, 1845, 1849, 1854, 1858, 1903, 1907, 1912, 1917, 1923, 1930,
			1936, 1943, 1949, 1956, 2002, 2009, 2015, 2022, 2029, 2036, 2043, 2050, 2057, 2104, 2111, 2119, 2127,
			2135, 2142, 2150, 2159, 2209, 2218, 2231, 2245, 2257, 2312, 2327, 2344 };

	// 3호선 시간표 대저-수영
	protected int line3Schedule[] = { 516, 531, 544, 556, 608, 619, 629, 638, 647, 656, 703, 710, 716, 721, 726, 731,
			736, 741, 746, 751, 756, 802, 807, 813, 818, 824, 829, 835, 840, 846, 851, 858, 905, 912, 919, 926, 933,
			940, 947, 954, 1001, 1008, 1015, 1022, 1029, 1036, 1043, 1050, 1057, 1104, 1111, 1118, 1125, 1132, 1139,
			1146, 1153, 1200, 1207, 1214, 1221, 1228, 1235, 1242, 1249, 1256, 1303, 1310, 1317, 1324, 1331, 1338,
			1345, 1352, 1359, 1406, 1413, 1420, 1427, 1434, 1441, 1448, 1455, 1502, 1509, 1516, 1523, 1530, 1537,
			1544, 1551, 1558, 1605, 1612, 1619, 1626, 1633, 1640, 1647, 1654, 1700, 1706, 1711, 1716, 1721, 1726,
			1731, 1736, 1741, 1746, 1751, 1756, 1801, 1806, 1812, 1817, 1823, 1828, 1834, 1839, 1845, 1850, 1856,
			1902, 1908, 1914, 1920, 1926, 1932, 1938, 1944, 1950, 1956, 2002, 2008, 2014, 2020, 2026, 2032, 2038,
			2044, 2050, 2056, 2102, 2110, 2118, 2126, 2134, 2142, 2150, 2158, 2206, 2213, 2223, 2235, 2247, 2259,
			2311, 2324, 2340 };

	// 3호선 시간표 수영-대저
	protected int line3ScheduleBack[] = { 520, 535, 547, 601, 612, 625, 637, 649, 701, 711, 720, 727, 734, 741, 746,
			751, 756, 801, 806, 811, 816, 821, 826, 831, 836, 842, 847, 853, 858, 904, 909, 915, 920, 926, 931, 938,
			945, 952, 959, 1006, 1013, 1020, 1027, 1034, 1041, 1048, 1055, 1102, 1109, 1116, 1123, 1130, 1137, 1144,
			1151, 1158, 1205, 1212, 1219, 1226, 1233, 1240, 1247, 1258, 1301, 1308, 1315, 1322, 1329, 1336, 1343,
			1350, 1357, 1404, 1411, 1418, 1425, 1432, 1439, 1446, 1453, 1500, 1507, 1514, 1521, 1528, 1535, 1542,
			1549, 1556, 1603, 1610, 1617, 1624, 1631, 1638, 1645, 1652, 1659, 1706, 1713, 1720, 1727, 1734, 1740,
			1746, 1751, 1756, 1801, 1806, 1811, 1816, 1821, 1826, 1831, 1836, 1841, 1846, 1852, 1857, 1903, 1908,
			1914, 1919, 1925, 1930, 1936, 1942, 1948, 1954, 2000, 2006, 2012, 2018, 2024, 2030, 2036, 2042, 2048, 2054,
			2100, 2106, 2112, 2119, 2127, 2135, 2143, 2151, 2159, 2207, 2215, 2227, 2239, 2249, 2302, 2314, 2327,
			2338, 2349, 2359 };

	// 4호선 시간표 안평-미남
	protected int line4Schedule[] = { 505, 515, 525, 535, 545, 555, 605, 614, 623, 631, 639, 647, 654, 701, 707, 712,
			717, 722, 727, 732, 737, 742, 747, 752, 757, 802, 807, 812, 817, 822, 827, 832, 837, 843, 849, 856, 904,
			912, 920, 928, 936, 944, 952, 1000, 1008, 1016, 1024, 1032, 1040, 1048, 1056, 1104, 1112, 1120, 1128,
			1136, 1144, 1152, 1200, 1208, 1216, 1224, 1232, 1240, 1248, 1256, 1304, 1312, 1320, 1328, 1336, 1344,
			1352, 1400, 1408, 1416, 1424, 1432, 1440, 1448, 1456, 1504, 1512, 1520, 1528, 1536, 1544, 1552, 1600,
			1608, 1616, 1624, 1632, 1640, 1648, 1656, 1703, 1710, 1717, 1723, 1729, 1734, 1739, 1744, 1749, 1754, 1759,
			1804, 1809, 1814, 1819, 1824, 1829, 1834, 1839, 1844, 1849, 1854, 1859, 1904, 1909, 1914, 1919, 1924,
			1930, 1937, 1944, 1951, 1958, 2005, 2012, 2020, 2028, 2036, 2044, 2052, 2100, 2108, 2116, 2124, 2132,
			2140, 2148, 2157, 2206, 2215, 2225, 2235, 2245, 2255, 2305, 2315, 2315, 2333, 2343 };

	// 4호선 시간표 미남-안평
	protected int line4ScheduleBack[] = { 540, 550, 600, 610, 620, 630, 640, 649, 657, 704, 711, 718, 725, 731, 737,
			742, 747, 752, 756, 801, 806, 811, 816, 821, 826, 831, 836, 841, 846, 851, 856, 901, 907, 913, 920, 927,
			935, 943, 951, 959, 1007, 1015, 1023, 1031, 1039, 1047, 1055, 1103, 1111, 1119, 1127, 1135, 1143, 1151,
			1159,  1207, 1215, 1223, 1231, 1239, 1247, 1255, 1303, 1311, 1319, 1327, 1335, 1343, 1351, 1359, 1407,
			1415, 1423, 1431, 1439, 1447, 1455, 1503, 1511, 1519, 1527, 1535, 1543, 1551, 1559, 1607, 1615, 1623,
			1631, 1647, 1655, 1703, 1711, 1719, 1727, 1735, 1742, 1748, 1753, 1758, 1803, 1808, 1813, 1818, 1823,
			1828, 1833, 1838, 1843, 1848, 1853, 1858, 1903, 1908, 1913, 1918, 1923, 1928, 1933, 1938, 1943, 1948, 1954,
			2000, 2007, 2014, 2021, 2028, 2036, 2044, 2052, 2100, 2108, 2116, 2124, 2132, 2140, 2148, 2156, 2205,
			2214, 2223, 2232, 2242, 2252, 2302, 2312, 2322, 2332, 2342, 2352 };

	// 5호선 시간표 가야대-사상
	protected int line5Schedule[] = { 500, 511, 522, 533, 538, 544, 549, 555, 600, 606, 611, 616, 620, 624, 629, 633,
			38, 342, 646, 651, 655, 700, 704, 708, 713, 717, 722, 726, 730, 735, 739, 744, 748, 752, 757, 801, 806,
			810, 814, 820, 826, 831, 837, 843, 848, 854, 900, 905, 911, 917, 922, 928, 934, 939, 945, 951, 956, 1002,
			1008, 1013, 1019, 1025, 1030, 1036, 1042, 1047, 1053, 1059, 1104, 1110, 1116, 1121, 1127, 1133, 1138, 1144,
			1150, 1155, 1201, 1207, 1212, 1218, 1224, 1229, 1235, 1241, 1246, 1252, 1258, 1303, 1309, 1315, 1320,
			1326, 1332, 1337, 1343, 1349, 1354, 1400, 1406, 1411, 1417, 1423, 1428, 1434, 1440, 1445, 1451, 1457,
			1502, 1508, 1514, 1519, 1525, 1531, 1536, 1542, 1548, 1553, 1559, 1605, 1610, 1615, 1619, 1624, 1628,
			1632, 1637, 1641, 1646, 1650, 1654, 1659, 1703, 1708, 1712, 1716, 1721, 1725, 1730, 1734, 1738, 1743, 1747,
			1752, 1756, 1800, 1805, 1809, 1814, 1818, 1822, 1827, 1833, 1839, 1845, 1851, 1857, 1903, 1909, 1915,
			1921, 1927, 1933, 1939, 1945, 1951, 1957, 2003, 2009, 2015, 2021, 2027, 2033, 2039, 2045, 2051, 2057,
			2103, 2109, 2115, 2121, 2129, 2137, 2145, 2153, 2201, 2209, 2217, 2225, 2233, 2241, 2249, 2257, 2308,
			2319 };

	// 5호선 시간표 사상-가야대
	protected int line5ScheduleBack[] = { 500, 511, 522, 533, 544, 555, 600, 606, 617, 622, 628, 633, 639, 644, 650,
			655, 659, 704, 708, 713, 717, 721, 726, 730, 735, 739, 743, 748, 752, 757, 801, 805, 810, 814, 819, 823,
			827, 832, 836, 841, 845, 849, 854, 858, 904, 910, 915, 921, 927, 932, 938, 944, 949, 955, 1001, 1006,
			1012, 1018, 1023, 1029, 1035, 1040, 1046, 1052, 1057, 1103, 1109, 1114, 1120, 1126, 1131, 1137, 1143, 1148,
			1154, 1200, 1205, 1211, 1217, 1222, 1228, 1234, 1239, 1245, 1251, 1256, 1302, 1308, 1313, 1325, 1330,
			1336, 1342, 1347, 1353, 1359, 1404, 1410, 1416, 1421, 1427, 1433, 1438, 1444, 1450, 1455, 1501, 1507,
			1512, 1518, 1524, 1529, 1535, 1541, 1546, 1552, 1558, 1603, 1609, 1615, 1620, 1626, 1632, 1637, 1643, 1649,
			1654, 1659, 1703, 1707, 1712, 1716, 1721, 1725, 1729, 1734, 1738, 1743, 1747, 1752, 1756, 1800, 1805,
			1809, 1813, 1818, 1822, 1827, 1831, 1835, 1840, 1844, 1849, 1853, 1857, 1902, 1906, 1911, 1917, 1923, 1929,
			1935, 1941, 1947, 1953, 1959, 2005, 2011, 2017, 2023, 2029, 2035, 2041, 2047, 2053, 2059, 2105, 2111,
			2117, 2123, 2129, 2135, 2141, 2147, 2153, 2159, 2205, 2213, 2221, 2229, 2237, 2245, 2253, 2301, 2309,
			2317, 2326 };

	MetroDao DAO = new MetroDao();
	MetroVO VO = new MetroVO(null, 0, 0, 0, false, false, false, 0, 0, 0, 0); // 출발역
	MetroVO departmetroVO = new MetroVO(null, 0, 0, 0, false, false, false, 0, 0, 0, 0); // 출발역
	MetroVO arrivemetroVO = new MetroVO(null, 0, 0, 0, false, false, false, 0, 0, 0, 0); // 도착역
	protected int currentHour;
	protected int currentMinute;

	protected ArrayList<String> ListSchedule = new ArrayList<String>();
	
	
	public Schedule(int departstn, int arrivestn) {
		currentHour = LocalTime.now().getHour();
		currentMinute = LocalTime.now().getMinute();
		DAO.createConnection();
		departmetroVO = DAO.selectStationWhere(departstn);
		arrivemetroVO = DAO.selectStationWhere(arrivestn);
		RouteCal rc = new RouteCal(departstn, arrivestn);
		if (departmetroVO.getStnline() == arrivemetroVO.getStnline()) {
			switch (departmetroVO.getStnline()) {
			case 1:
				if (departstn < arrivestn) {
					startSchedule = new int[line1Schedule.length];
					startSchedule = line1Schedule;
					RouteCal rc2 = new RouteCal(101, departstn);
					for (int i = 0; i < startSchedule.length; i++) {
						startSchedule[i] += rc2.getDistance();
					}
					break;
				} else {
					startSchedule = new int[line1ScheduleBack.length];
					startSchedule = line1ScheduleBack;
					RouteCal rc2 = new RouteCal(134, departstn);
					for (int i = 0; i < startSchedule.length; i++) {
						startSchedule[i] += rc2.getDistance();
					}
					break;
				}
			case 2:
				if (departstn < arrivestn) {
					startSchedule = new int[line2Schedule.length];
					startSchedule = line2Schedule;
					RouteCal rc2 = new RouteCal(201, departstn);
					for (int i = 0; i < startSchedule.length; i++) {
						startSchedule[i] += rc2.getDistance();
					}
					break;
				} else {
					startSchedule = new int[line2ScheduleBack.length];
					startSchedule = line2ScheduleBack;
					RouteCal rc2 = new RouteCal(243, departstn);
					for (int i = 0; i < startSchedule.length; i++) {
						startSchedule[i] += rc2.getDistance();
					}
					break;
				}
			case 3:
				if (departstn < arrivestn) {
					startSchedule = new int[line3Schedule.length];
					startSchedule = line3Schedule;
					RouteCal rc2 = new RouteCal(301, departstn);
					for (int i = 0; i < startSchedule.length; i++) {
						startSchedule[i] += rc2.getDistance();
					}
					break;
				} else {
					startSchedule = new int[line3ScheduleBack.length];
					startSchedule = line3ScheduleBack;
					RouteCal rc2 = new RouteCal(317, departstn);
					for (int i = 0; i < startSchedule.length; i++) {
						startSchedule[i] += rc2.getDistance();
					}
					break;
				}
			case 4:
				if (departstn < arrivestn) {
					startSchedule = new int[line4Schedule.length];
					startSchedule = line4Schedule;
					RouteCal rc2 = new RouteCal(401, departstn);
					for (int i = 0; i < startSchedule.length; i++) {
						startSchedule[i] += rc2.getDistance();
					}
					break;
				} else {
					startSchedule = new int[line4ScheduleBack.length];
					startSchedule = line4ScheduleBack;
					RouteCal rc2 = new RouteCal(414, departstn);
					for (int i = 0; i < startSchedule.length; i++) {
						startSchedule[i] += rc2.getDistance();
					}
					break;
				}
			case 5:
				if (departstn < arrivestn) {
					startSchedule = new int[line5Schedule.length];
					startSchedule = line5Schedule;
					RouteCal rc2 = new RouteCal(501, departstn);
					for (int i = 0; i < startSchedule.length; i++) {
						startSchedule[i] += rc2.getDistance();
					}
					break;
				} else {
					startSchedule = new int[line5ScheduleBack.length];
					startSchedule = line5ScheduleBack;
					RouteCal rc2 = new RouteCal(521, departstn);
					for (int i = 0; i < startSchedule.length; i++) {
						startSchedule[i] += rc2.getDistance();
					}
					break;
				}
			}

		} else {
			VO = DAO.selectFirstTransferStation(rc.getFirstTransfer(), departmetroVO.getStnline());
	
			switch (departmetroVO.getStnline()) {
			case 1:
				if (departstn < VO.getStnnum()) {
					startSchedule = new int[line1Schedule.length];
					startSchedule = line1Schedule;
					RouteCal rc2 = new RouteCal(101, departstn);
					for (int i = 0; i < startSchedule.length; i++) {
						startSchedule[i] += rc2.getDistance();
					}
					break;
				} else {
					startSchedule = new int[line1ScheduleBack.length];
					startSchedule = line1ScheduleBack;
					RouteCal rc2 = new RouteCal(134, departstn);
					for (int i = 0; i < startSchedule.length; i++) {
						startSchedule[i] += rc2.getDistance();
					}
					break;
				}
			case 2:
				if (departstn < VO.getStnnum()) {
					startSchedule = new int[line2Schedule.length];
					startSchedule = line2Schedule;
					RouteCal rc2 = new RouteCal(201, departstn);
					for (int i = 0; i < startSchedule.length; i++) {
						startSchedule[i] += rc2.getDistance();
					}
					break;
				} else {
					startSchedule = new int[line2ScheduleBack.length];
					startSchedule = line2ScheduleBack;
					RouteCal rc2 = new RouteCal(243, departstn);
					for (int i = 0; i < startSchedule.length; i++) {
						startSchedule[i] += rc2.getDistance();
					}
					break;
				}
			case 3:
				if (departstn < VO.getStnnum()) {
					startSchedule = new int[line3Schedule.length];
					startSchedule = line3Schedule;
					RouteCal rc2 = new RouteCal(301, departstn);
					for (int i = 0; i < startSchedule.length; i++) {
						startSchedule[i] += rc2.getDistance();
					}
					break;
				} else {
					startSchedule = new int[line3ScheduleBack.length];
					startSchedule = line3ScheduleBack;
					RouteCal rc2 = new RouteCal(317, departstn);
					for (int i = 0; i < startSchedule.length; i++) {
						startSchedule[i] += rc2.getDistance();
					}
					break;
				}
			case 4:
				if (departstn < VO.getStnnum()) {
					startSchedule = new int[line4Schedule.length];
					startSchedule = line4Schedule;
					RouteCal rc2 = new RouteCal(401, departstn);
					for (int i = 0; i < startSchedule.length; i++) {
						startSchedule[i] += rc2.getDistance();
					}
					break;
				} else {
					startSchedule = new int[line4ScheduleBack.length];
					startSchedule = line4ScheduleBack;
					RouteCal rc2 = new RouteCal(414, departstn);
					for (int i = 0; i < startSchedule.length; i++) {
						startSchedule[i] += rc2.getDistance();
					}
					break;
				}
			case 5:
				if (departstn < VO.getStnnum()) {
					startSchedule = new int[line5Schedule.length];
					startSchedule = line5Schedule;
					RouteCal rc2 = new RouteCal(501, departstn);
					for (int i = 0; i < startSchedule.length; i++) {
						startSchedule[i] += rc2.getDistance();
					}
					break;
				} else {
					startSchedule = new int[line5ScheduleBack.length];
					startSchedule = line5ScheduleBack;
					RouteCal rc2 = new RouteCal(521, departstn);
					for (int i = 0; i < startSchedule.length; i++) {
						startSchedule[i] += rc2.getDistance();
					}
					break;
				}
			}
		}
	}
	
	public void getSchedule() {
		int [] hourSchedule = new int[startSchedule.length];
		int [] minuteSchedule = new int[startSchedule.length];
		String [] stringSchedule = new String[startSchedule.length];
		for(int i=0;i<startSchedule.length;i++){
			hourSchedule[i] = startSchedule[i]/100;
			minuteSchedule[i] = startSchedule[i]%100;
			stringSchedule[i] = hourSchedule[i]+":"+minuteSchedule[i];
			ListSchedule.add(stringSchedule[i]);
		}
	}

	public static void main(String[] args) {
		System.out.println(LocalTime.now());
		System.out.println(LocalTime.now().getHour());
		System.out.println(LocalTime.now().getMinute());
		Schedule s = new Schedule(101,105);
		s.getSchedule();
		System.out.println(s.ListSchedule);
	}
}

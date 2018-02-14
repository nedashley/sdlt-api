package com.redmonkeysoftware.sdlt.model;

import org.apache.commons.lang3.StringUtils;

public enum LocalAuthority implements BaseEnumType {
    LR_9051("9051", "Aberdeen, City - 9051"),
    LR_9052("9052", "Aberdeenshire - 9052"),
    LR_3805("3805", "Adur - 3805"),
    LR_0905("0905", "Allerdale - 0905"),
    LR_1005("1005", "Amber Valley - 1005"),
    LR_6805("6805", "Anglesey, Isle of - 6805"),
    LR_9053("9053", "Angus - 9053"),
    LR_7005("7005", "Antrim - 7005"),
    LR_7010("7010", "Ards - 7010"),
    LR_9054("9054", "Argyll and Bute - 9054"),
    LR_7015("7015", "Armagh - 7015"),
    LR_3810("3810", "Arun - 3810"),
    LR_3005("3005", "Ashfield - 3005"),
    LR_2205("2205", "Ashford - 2205"),
    LR_0405("0405", "Aylesbury Vale - 0405"),
    LR_3505("3505", "Babergh - 3505"),
    LR_7020("7020", "Ballymena - 7020"),
    LR_7025("7025", "Ballymoney - 7025"),
    LR_7030("7030", "Banbridge - 7030"),
    LR_5060("5060", "Barking and Dagenham - 5060"),
    LR_5090("5090", "Barnet - 5090"),
    LR_4405("4405", "Barnsley - 4405"),
    LR_0910("0910", "Barrow in Furness - 0910"),
    LR_1505("1505", "Basildon - 1505"),
    LR_1705("1705", "Basingstoke and Deane - 1705"),
    LR_3010("3010", "Bassetlaw - 3010"),
    LR_0114("0114", "Bath and North East Somerset - 0114"),
    LR_0205("0205", "Bedford - 0205"),
    LR_7035("7035", "Belfast - 7035"),
    LR_5120("5120", "Bexley - 5120"),
    LR_4605("4605", "Birmingham - 4605"),
    LR_2405("2405", "Blaby - 2405"),
    LR_2372("2372", "Blackburn with Darwen - 2372"),
    LR_2373("2373", "Blackpool - 2373"),
    LR_6910("6910", "Blaenau Gwent - 6910"),
    LR_1010("1010", "Bolsover - 1010"),
    LR_4205("4205", "Bolton - 4205"),
    LR_9055("9055", "Borders, The - 9055"),
    LR_2505("2505", "Boston - 2505"),
    LR_1250("1250", "Bournemouth - 1250"),
    LR_0335("0335", "Bracknell Forest - 0335"),
    LR_4705("4705", "Bradford - 4705"),
    LR_1510("1510", "Braintree - 1510"),
    LR_2605("2605", "Breckland - 2605"),
    LR_5150("5150", "Brent - 5150"),
    LR_1515("1515", "Brentwood - 1515"),
    LR_6915("6915", "Bridgend - 6915"),
    LR_1445("1445", "Brighton and Hove - 1445"),
    LR_0116("0116", "Bristol - 0116"),
    LR_2610("2610", "Broadland - 2610"),
    LR_5180("5180", "Bromley - 5180"),
    LR_1805("1805", "Bromsgrove - 1805"),
    LR_1905("1905", "Broxbourne - 1905"),
    LR_3015("3015", "Broxtowe - 3015"),
    LR_2315("2315", "Burnley - 2315"),
    LR_4210("4210", "Bury - 4210"),
    LR_6920("6920", "Caerphilly - 6920"),
    LR_4710("4710", "Calderdale - 4710"),
    LR_0505("0505", "Cambridge - 0505"),
    LR_5210("5210", "Camden - 5210"),
    LR_3405("3405", "Cannock Chase - 3405"),
    LR_2210("2210", "Canterbury - 2210"),
    LR_6815("6815", "Cardiff - 6815"),
    LR_0915("0915", "Carlisle - 0915"),
    LR_6825("6825", "Carmarthenshire (Carmarthen) - 6825"),
    LR_6828("6828", "Carmarthenshire (Dinefwr) - 6828"),
    LR_6829("6829", "Carmarthenshire (Llanelli) - 6829"),
    LR_7040("7040", "Carrickfergus - 7040"),
    LR_1520("1520", "Castle Point - 1520"),
    LR_7045("7045", "Castlereagh - 7045"),
    LR_0215("0215", "Central Bedfordshire - 0215"),
    LR_6820("6820", "Ceredigion - 6820"),
    LR_2410("2410", "Charnwood - 2410"),
    LR_1525("1525", "Chelmsford - 1525"),
    LR_1605("1605", "Cheltenham - 1605"),
    LR_3105("3105", "Cherwell - 3105"),
    LR_0630("0630", "Cheshire East - 0630"),
    LR_0605("0605", "Chester - 0605"),
    LR_1015("1015", "Chesterfield - 1015"),
    LR_3815("3815", "Chichester - 3815"),
    LR_0415("0415", "Chiltern - 0415"),
    LR_2320("2320", "Chorley - 2320"),
    LR_1210("1210", "Christchurch - 1210"),
    LR_9064("9064", "City of Edinburgh - 9064"),
    LR_9067("9067", "City of Glasgow - 9067"),
    LR_2465("2465", "City of Leicester - 2465"),
    LR_5030("5030", "City of London - 5030"),
    LR_2741("2741", "City of York - 2741"),
    LR_9056("9056", "Clackmannan - 9056"),
    LR_1530("1530", "Colchester - 1530"),
    LR_7050("7050", "Coleraine - 7050"),
    LR_6905("6905", "Conwy - 6905"),
    LR_7055("7055", "Cookstown - 7055"),
    LR_0920("0920", "Copeland - 0920"),
    LR_2805("2805", "Corby - 2805"),
    LR_0810("0810", "Cornwall - 0810"),
    LR_1610("1610", "Cotswold - 1610"),
    LR_4610("4610", "Coventry - 4610"),
    LR_7060("7060", "Craigavon - 7060"),
    LR_2705("2705", "Craven - 2705"),
    LR_3820("3820", "Crawley - 3820"),
    LR_5240("5240", "Croydon - 5240"),
    LR_1910("1910", "Dacorum - 1910"),
    LR_1350("1350", "Darlington - 1350"),
    LR_2215("2215", "Dartford - 2215"),
    LR_2810("2810", "Daventry - 2810"),
    LR_6830("6830", "Denbighshire - 6830"),
    LR_1055("1055", "Derby - 1055"),
    LR_1045("1045", "Derbyshire Dales - 1045"),
    LR_7095("7095", "Derry - 7095"),
    LR_4410("4410", "Doncaster - 4410"),
    LR_2220("2220", "Dover - 2220"),
    LR_7065("7065", "Down - 7065"),
    LR_4615("4615", "Dudley - 4615"),
    LR_9057("9057", "Dumbarton and Clydebank - 9057"),
    LR_9058("9058", "Dumfries and Galloway - 9058"),
    LR_9059("9059", "Dundee - 9059"),
    LR_7070("7070", "Dungannon - 7070"),
    LR_1320("1320", "Durham - 1320"),
    LR_5270("5270", "Ealing - 5270"),
    LR_9060("9060", "East Ayrshire - 9060"),
    LR_0510("0510", "East Cambridgeshire - 0510"),
    LR_1105("1105", "East Devon - 1105"),
    LR_1240("1240", "East Dorset - 1240"),
    LR_9061("9061", "East Dunbartonshire - 9061"),
    LR_1710("1710", "East Hampshire - 1710"),
    LR_1915("1915", "East Hertfordshire - 1915"),
    LR_2510("2510", "East Lindsey - 2510"),
    LR_9062("9062", "East Lothian - 9062"),
    LR_2815("2815", "East Northamptonshire - 2815"),
    LR_9063("9063", "East Renfrewshire - 9063"),
    LR_2001("2001", "East Riding of Yorkshire - 2001"),
    LR_3410("3410", "East Staffordshire - 3410"),
    LR_1410("1410", "Eastbourne - 1410"),
    LR_1715("1715", "Eastleigh - 1715"),
    LR_0925("0925", "Eden - 0925"),
    LR_9064_DUP("9064", "Edinburgh, City of, - 9064"),
    LR_0620("0620", "Ellesmere Port and Neston - 0620"),
    LR_3605("3605", "Elmbridge - 3605"),
    LR_5300("5300", "Enfield - 5300"),
    LR_1535("1535", "Epping Forest - 1535"),
    LR_3610("3610", "Epsom and Ewell - 3610"),
    LR_1025("1025", "Erewash - 1025"),
    LR_1110("1110", "Exeter - 1110"),
    LR_9065("9065", "Falkirk - 9065"),
    LR_1720("1720", "Fareham - 1720"),
    LR_0515("0515", "Fenland - 0515"),
    LR_7075("7075", "Fermanagh - 7075"),
    LR_9066("9066", "Fife - 9066"),
    LR_6835("6835", "Flintshire - 6835"),
    LR_3510("3510", "Forest Heath - 3510"),
    LR_1615("1615", "Forest of Dean - 1615"),
    LR_2325("2325", "Fylde - 2325"),
    LR_4505("4505", "Gateshead - 4505"),
    LR_3020("3020", "Gedling - 3020"),
    LR_9067_DUP("9067", "Glasgow, City of, - 9067"),
    LR_1620("1620", "Gloucester - 1620"),
    LR_1725("1725", "Gosport - 1725"),
    LR_2230("2230", "Gravesham - 2230"),
    LR_2615("2615", "Great Yarmouth - 2615"),
    LR_5330("5330", "Greenwich - 5330"),
    LR_3615("3615", "Guildford - 3615"),
    LR_6810("6810", "Gwynedd - 6810"),
    LR_5360("5360", "Hackney - 5360"),
    LR_0650("0650", "Halton - 0650"),
    LR_2710("2710", "Hambleton - 2710"),
    LR_5390("5390", "Hammersmith and Fulham - 5390"),
    LR_2415("2415", "Harborough - 2415"),
    LR_5420("5420", "Haringey - 5420"),
    LR_1540("1540", "Harlow - 1540"),
    LR_2715("2715", "Harrogate - 2715"),
    LR_5450("5450", "Harrow - 5450"),
    LR_1730("1730", "Hart - 1730"),
    LR_0724("0724", "Hartlepool - 0724"),
    LR_1415("1415", "Hastings - 1415"),
    LR_1735("1735", "Havant - 1735"),
    LR_5480("5480", "Havering - 5480"),
    LR_1850("1850", "Herefordshire - 1850"),
    LR_1920("1920", "Hertsmere - 1920"),
    LR_1030("1030", "High Peak - 1030"),
    LR_9068("9068", "Highland - 9068"),
    LR_5510("5510", "Hillingdon - 5510"),
    LR_2420("2420", "Hinckley and Bosworth - 2420"),
    LR_3825("3825", "Horsham - 3825"),
    LR_5540("5540", "Hounslow - 5540"),
    LR_0520("0520", "Huntingdonshire - 0520"),
    LR_2330("2330", "Hyndburn - 2330"),
    LR_9069("9069", "Inverclyde - 9069"),
    LR_3515("3515", "Ipswich - 3515"),
    LR_6805_DUP("6805", "Isle of Anglesey - 6805"),
    LR_2100("2100", "Isle of Wight - 2100"),
    LR_0835("0835", "Isles of Scilly - 0835"),
    LR_5570("5570", "Islington - 5570"),
    LR_3905("3905", "Kennet - 3905"),
    LR_5600("5600", "Kensington and Chelsea - 5600"),
    LR_0815("0815", "Kerrier - 0815"),
    LR_2820("2820", "Kettering - 2820"),
    LR_2635("2635", "Kings Lynn and West Norfolk - 2635"),
    LR_2004("2004", "Kingston-upon-Hull (City and county) - 2004"),
    LR_5630("5630", "Kingston-upon-Thames - 5630"),
    LR_4715("4715", "Kirklees - 4715"),
    LR_4305("4305", "Knowsley - 4305"),
    LR_5660("5660", "Lambeth - 5660"),
    LR_2335("2335", "Lancaster - 2335"),
    LR_7080("7080", "Larne - 7080"),
    LR_4720("4720", "Leeds - 4720"),
    LR_2465_DUP("2465", "Leicester, City of, - 2465"),
    LR_1425("1425", "Lewes - 1425"),
    LR_5690("5690", "Lewisham - 5690"),
    LR_3415("3415", "Lichfield - 3415"),
    LR_7085("7085", "Limavady - 7085"),
    LR_2515("2515", "Lincoln - 2515"),
    LR_7090("7090", "Lisburn - 7090"),
    LR_4310("4310", "Liverpool - 4310"),
    LR_5030_DUP("5030", "London, City of, - 5030"),
    LR_0230("0230", "Luton - 0230"),
    LR_7100("7100", "Magherafelt - 7100"),
    LR_2235("2235", "Maidstone - 2235"),
    LR_1545("1545", "Maldon - 1545"),
    LR_1860("1860", "Malvern Hills - 1860"),
    LR_4215("4215", "Manchester - 4215"),
    LR_3025("3025", "Mansfield - 3025"),
    LR_2280("2280", "Medway - 2280"),
    LR_2430("2430", "Melton - 2430"),
    LR_3305("3305", "Mendip - 3305"),
    LR_6925("6925", "Merthyr Tydfil - 6925"),
    LR_5720("5720", "Merton - 5720"),
    LR_3830("3830", "Mid Sussex - 3830"),
    LR_1135("1135", "Mid-Devon - 1135"),
    LR_3520("3520", "Mid-Suffolk - 3520"),
    LR_0734("0734", "Middlesbrough - 0734"),
    LR_9070("9070", "Midlothian - 9070"),
    LR_0435("0435", "Milton Keynes - 0435"),
    LR_3620("3620", "Mole Valley - 3620"),
    LR_6840("6840", "Monmouthshire - 6840"),
    LR_9071("9071", "Moray - 9071"),
    LR_7110("7110", "Moyle - 7110"),
    LR_6930("6930", "Neath and Port Talbot - 6930"),
    LR_1740("1740", "New Forest - 1740"),
    LR_3030("3030", "Newark and Sherwood - 3030"),
    LR_3420("3420", "Newcastle-under-Lyme - 3420"),
    LR_4510("4510", "Newcastle-upon-Tyne - 4510"),
    LR_5750("5750", "Newham - 5750"),
    LR_6935("6935", "Newport - 6935"),
    LR_7105("7105", "Newry and Mourne - 7105"),
    LR_7115("7115", "Newtownabbey - 7115"),
    LR_9072("9072", "North Ayrshire - 9072"),
    LR_1115("1115", "North Devon - 1115"),
    LR_1215("1215", "North Dorset - 1215"),
    LR_7120("7120", "North Down - 7120"),
    LR_1035("1035", "North East Derbyshire - 1035"),
    LR_2002("2002", "North East Lincolnshire - 2002"),
    LR_1925("1925", "North Hertfordshire - 1925"),
    LR_2520("2520", "North Kesteven - 2520"),
    LR_9073("9073", "North Lanarkshire - 9073"),
    LR_2003("2003", "North Lincolnshire - 2003"),
    LR_2620("2620", "North Norfolk - 2620"),
    LR_0121("0121", "North Somerset - 0121"),
    LR_4515("4515", "North Tyneside - 4515"),
    LR_3705("3705", "North Warwickshire - 3705"),
    LR_2435("2435", "North West Leicestershire - 2435"),
    LR_2825("2825", "Northampton - 2825"),
    LR_2920("2920", "Northumberland - 2920"),
    LR_2625("2625", "Norwich - 2625"),
    LR_3060("3060", "Nottingham - 3060"),
    LR_3710("3710", "Nuneaton and Bedworth - 3710"),
    LR_2440("2440", "Oadby and Wigston - 2440"),
    LR_4220("4220", "Oldham - 4220"),
    LR_7125("7125", "Omagh - 7125"),
    LR_9000("9000", "Orkney Islands - 9000"),
    LR_3110("3110", "Oxford - 3110"),
    LR_6845("6845", "Pembrokeshire - 6845"),
    LR_2340("2340", "Pendle - 2340"),
    LR_9074("9074", "Perthshire and Kinross - 9074"),
    LR_0540("0540", "Peterborough - 0540"),
    LR_1160("1160", "Plymouth - 1160"),
    LR_1255("1255", "Poole - 1255"),
    LR_1775("1775", "Portsmouth City Council - 1775"),
    LR_6854("6854", "Powys (Breconshire) - 6854"),
    LR_6850("6850", "Powys (Montgomeryshire) - 6850"),
    LR_6853("6853", "Powys (Radnorshire) - 6853"),
    LR_2345("2345", "Preston - 2345"),
    LR_1225("1225", "Purbeck - 1225"),
    LR_0345("0345", "Reading - 0345"),
    LR_5780("5780", "Redbridge - 5780"),
    LR_0728("0728", "Redcar and Cleveland - 0728"),
    LR_1825("1825", "Redditch - 1825"),
    LR_3625("3625", "Reigate and Banstead - 3625"),
    LR_9075("9075", "Renfrewshire - 9075"),
    LR_8998("8998", "Retrospective - 8998"),
    LR_6940("6940", "Rhondda, Cynon, Taff - 6940"),
    LR_2350("2350", "Ribble Valley - 2350"),
    LR_5810("5810", "Richmond-upon-Thames - 5810"),
    LR_2720("2720", "Richmondshire - 2720"),
    LR_4225("4225", "Rochdale - 4225"),
    LR_1550("1550", "Rochford - 1550"),
    LR_2355("2355", "Rossendale - 2355"),
    LR_1430("1430", "Rother - 1430"),
    LR_4415("4415", "Rotherham - 4415"),
    LR_3715("3715", "Rugby - 3715"),
    LR_3630("3630", "Runnymede - 3630"),
    LR_3040("3040", "Rushcliffe - 3040"),
    LR_1750("1750", "Rushmoor - 1750"),
    LR_2470("2470", "Rutland - 2470"),
    LR_2725("2725", "Ryedale - 2725"),
    LR_4230("4230", "Salford - 4230"),
    LR_4620("4620", "Sandwell - 4620"),
    LR_2730("2730", "Scarborough - 2730"),
    LR_0835_DUP("0835", "Scilly, Isles of - 0835"),
    LR_3310("3310", "Sedgemoor - 3310"),
    LR_4320("4320", "Sefton - 4320"),
    LR_2735("2735", "Selby - 2735"),
    LR_2245("2245", "Sevenoaks - 2245"),
    LR_4420("4420", "Sheffield - 4420"),
    LR_2250("2250", "Shepway - 2250"),
    LR_9010("9010", "Shetland Islands - 9010"),
    LR_3220("3220", "Shropshire - 3220"),
    LR_0350("0350", "Slough - 0350"),
    LR_4625("4625", "Solihull - 4625"),
    LR_9076("9076", "South Ayrshire - 9076"),
    LR_0410("0410", "South Bucks - 0410"),
    LR_0530("0530", "South Cambridgeshire - 0530"),
    LR_1040("1040", "South Derbyshire - 1040"),
    LR_0119("0119", "South Gloucestershire - 0119"),
    LR_1125("1125", "South Hams - 1125"),
    LR_2525("2525", "South Holland - 2525"),
    LR_2530("2530", "South Kesteven - 2530"),
    LR_0930("0930", "South Lakeland - 0930"),
    LR_9077("9077", "South Lanarkshire - 9077"),
    LR_2630("2630", "South Norfolk - 2630"),
    LR_2830("2830", "South Northamptonshire - 2830"),
    LR_3115("3115", "South Oxfordshire - 3115"),
    LR_2360("2360", "South Ribble - 2360"),
    LR_3325("3325", "South Somerset - 3325"),
    LR_3430("3430", "South Staffordshire - 3430"),
    LR_4520("4520", "South Tyneside - 4520"),
    LR_1780("1780", "Southampton - 1780"),
    LR_1590("1590", "Southend-on-Sea - 1590"),
    LR_5840("5840", "Southwark - 5840"),
    LR_3635("3635", "Spelthorne - 3635"),
    LR_1930("1930", "St Albans - 1930"),
    LR_3525("3525", "St Edmundsbury - 3525"),
    LR_4315("4315", "St Helens - 4315"),
    LR_3425("3425", "Stafford - 3425"),
    LR_3435("3435", "Staffordshire Moorlands - 3435"),
    LR_1935("1935", "Stevenage - 1935"),
    LR_9078("9078", "Stirling - 9078"),
    LR_4235("4235", "Stockport - 4235"),
    LR_0738("0738", "Stockton-on-Tees - 0738"),
    LR_3455("3455", "Stoke-on-Trent - 3455"),
    LR_7130("7130", "Strabane - 7130"),
    LR_3720("3720", "Stratford on Avon - 3720"),
    LR_1625("1625", "Stroud - 1625"),
    LR_3530("3530", "Suffolk Coastal - 3530"),
    LR_4525("4525", "Sunderland - 4525"),
    LR_3640("3640", "Surrey Heath - 3640"),
    LR_5870("5870", "Sutton - 5870"),
    LR_2255("2255", "Swale - 2255"),
    LR_6855("6855", "Swansea - 6855"),
    LR_3935("3935", "Swindon - 3935"),
    LR_4240("4240", "Tameside - 4240"),
    LR_3445("3445", "Tamworth - 3445"),
    LR_3645("3645", "Tandridge - 3645"),
    LR_3315("3315", "Taunton Deane - 3315"),
    LR_1130("1130", "Teignbridge - 1130"),
    LR_3240("3240", "Telford and Wrekin - 3240"),
    LR_1560("1560", "Tendring - 1560"),
    LR_1760("1760", "Test Valley - 1760"),
    LR_1630("1630", "Tewkesbury - 1630"),
    LR_2260("2260", "Thanet - 2260"),
    LR_1940("1940", "Three Rivers - 1940"),
    LR_1595("1595", "Thurrock - 1595"),
    LR_2265("2265", "Tonbridge and Malling - 2265"),
    LR_1165("1165", "Torbay - 1165"),
    LR_6945("6945", "Torfaen - 6945"),
    LR_1145("1145", "Torridge - 1145"),
    LR_5900("5900", "Tower Hamlets - 5900"),
    LR_4245("4245", "Trafford - 4245"),
    LR_8999("8999", "Transitional - 8999"),
    LR_2270("2270", "Tunbridge Wells - 2270"),
    LR_1570("1570", "Uttlesford - 1570"),
    LR_6950("6950", "Vale of Glamorgan - 6950"),
    LR_3120("3120", "Vale of White Horse - 3120"),
    LR_0635("0635", "Vale Royal - 0635"),
    LR_4725("4725", "Wakefield - 4725"),
    LR_4630("4630", "Walsall - 4630"),
    LR_5930("5930", "Waltham Forest - 5930"),
    LR_5960("5960", "Wandsworth - 5960"),
    LR_0655("0655", "Warrington - 0655"),
    LR_3725("3725", "Warwick - 3725"),
    LR_1945("1945", "Watford - 1945"),
    LR_3535("3535", "Waveney - 3535"),
    LR_3650("3650", "Waverley - 3650"),
    LR_1435("1435", "Wealden - 1435"),
    LR_2835("2835", "Wellingborough - 2835"),
    LR_1950("1950", "Welwyn Hatfield - 1950"),
    LR_0340("0340", "West Berkshire - 0340"),
    LR_1150("1150", "West Devon - 1150"),
    LR_1230("1230", "West Dorset - 1230"),
    LR_2365("2365", "West Lancashire - 2365"),
    LR_2535("2535", "West Lindsey - 2535"),
    LR_9079("9079", "West Lothian - 9079"),
    LR_3125("3125", "West Oxfordshire - 3125"),
    LR_3320("3320", "West Somerset - 3320"),
    LR_9020("9020", "Western Isles - 9020"),
    LR_5990("5990", "Westminster City - 5990"),
    LR_1235("1235", "Weymouth and Portland - 1235"),
    LR_4250("4250", "Wigan - 4250"),
    LR_3915("3915", "Wiltshire - 3915"),
    LR_1765("1765", "Winchester - 1765"),
    LR_0355("0355", "Windsor and Maidenhead - 0355"),
    LR_4325("4325", "Wirral - 4325"),
    LR_3655("3655", "Woking - 3655"),
    LR_0360("0360", "Wokingham - 0360"),
    LR_4635("4635", "Wolverhampton - 4635"),
    LR_1835("1835", "Worcester - 1835"),
    LR_3835("3835", "Worthing - 3835"),
    LR_6955("6955", "Wrexham - 6955"),
    LR_1840("1840", "Wychavon - 1840"),
    LR_0425("0425", "Wycombe - 0425"),
    LR_2370("2370", "Wyre - 2370"),
    LR_1845("1845", "Wyre Forest - 1845"),
    LR_2741_DUP("2741", "York, City of - 2741");
    private final String code;
    private final String description;

    private LocalAuthority(final String code, final String description) {
        this.code = code;
        this.description = description;
    }

    @Override
    public String getCode() {
        return code;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public String toString() {
        return code;
    }

    public static LocalAuthority fromCode(final String code) {
        for (LocalAuthority ict : values()) {
            if (StringUtils.equalsIgnoreCase(ict.getCode(), code)) {
                return ict;
            }
        }
        return null;
    }
}
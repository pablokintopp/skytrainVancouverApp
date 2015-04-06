package com.example.skytrainvancouver;

import java.util.ArrayList;

import android.provider.Telephony.Mms.Addr;

public class Constants {
	
	public static ArrayList<Station> stations = new ArrayList<Station>();
	
	public static int  NUM_STATIONS= 52;
	
	/*          VANCOUVER SKYTRAIN LINES           */
	public static String LINE_EXPO = "Expo Line";
	public static String LINE_MILLENIUM = "Millenium Line";
	public static String LINE_CANADA = "Canada Line";
	public static String LINE_EVERGREEN = "Evergreen Line";
	
	//**** Each station is going to be a position in the matrix ****//
	public static int WATERFRONT = 0; // * 1 32
	public static int BURRARD = 1;
	public static int GRANVILLE = 2;
	public static int CHINATOWN = 3;
	public static int MAINSTREET = 4;
	public static int COMMERCIAL = 5; //* 4 6 30 31
	public static int NANAIMO = 6;
	public static int _29AVENUE = 7;
	public static int JOYCE = 8;
	public static int PATTERSON = 9;
	public static int METROTOWN = 10;
	public static int ROYAL_OAK = 11;
	public static int EDMONDS = 12;
	public static int _22STREET = 13 ;
	public static int NEW_WEST = 14 ;
	public static int COLUMBIA = 15; // 14 16 20
	public static int SCOTT_ROAD = 16 ;
	public static int GATEWAY = 17; 
	public static int SURREY = 18;
	public static int KING_GEORGE = 19;
	
	//ArrayList <Station> stations ...
	//stations. add(new Station(,"Waterfront", "Line", "ZoneFare","Etc"));
	
	public static int SAPPERTON = 20 ;
	public static int BRAID = 21 ;
	public static int LOUGHEED = 22 ; //47 
	public static int PRODUCTION_WAY = 23;
	public static int LAKE_CITY = 24;
	public static int SPERLING = 25;
	public static int HOLDOM = 26;
	public static int BRENTWOOD = 27;
	public static int GILMORE = 28 ;
	public static int RUPERT = 29;
	public static int RENFREW = 30;
	public static int VCC_CLARK = 31;
	
	public static int VANCOUVER_CITY = 32;
	public static int YALETOWN = 33;
	public static int OLYMPIC = 34;
	public static int BROADWAY_CITY_HALL = 35;
	public static int KING_EDWARD = 36;
	public static int OAKRIDGE = 37;
	public static int LANGARA = 38;
	public static int MARINE = 39;
	public static int BRIDGEPORT = 40;
	public static int ABERDEEN = 41;
	public static int LANDSDOWNE = 42;
	public static int RICHMOND = 43;
	public static int VCC_TEMPLETON = 44;
	public static int SEA_ISLAND = 45;
	public static int  YVR_AIRPORT= 46;
	
	public static int  BURQUITLAM = 47;
	public static int  MOODY_CENTRE= 48;
	public static int  INLET= 49;
	public static int  COQUITLAM= 50;
	public static int  DOUGLAS_LINCOLN= 51;
	
	//****************************************************//
	public static  int TIMES_MATRIX[][] = {{0,2,3,4,6,9,12,13,15,17,18,20,23,25,29,30,33,36,37,39,33,31,28,26,23,21,19,17,16,13,12,10,2,4,6,7,9,12,14,17,19,21,23,25,34,36,38,30,35,37,40,43},
		{2,0,1,2,4,7,10,11,13,15,16,18,21,23,27,28,31,34,35,37,31,29,26,24,21,19,17,15,14,11,10,8,4,6,8,9,11,14,16,19,21,23,25,27,36,38,40,28,33,35,38,41},
		{3,1,0,1,3,6,9,10,12,14,15,17,20,22,26,27,30,33,34,36,30,28,25,23,20,18,16,14,13,10,9,7,5,7,9,10,12,15,17,20,22,24,26,28,37,39,41,27,32,34,37,40},
		{4,2,1,0,2,5,8,9,11,13,14,16,19,21,25,26,29,32,33,35,29,27,24,22,19,17,15,13,12,9,8,6,6,8,10,11,13,16,18,21,23,25,27,29,38,40,42,26,31,33,36,39},
		{6,4,3,2,0,3,6,7,9,11,12,14,17,19,23,24,27,30,31,33,27,25,22,20,17,15,13,11,10,7,6,4,8,10,12,13,15,18,20,23,25,27,29,31,40,42,44,24,29,31,34,37},
		{9,7,6,5,3,0,3,4,6,8,9,11,14,16,20,21,24,27,28,30,24,22,19,17,14,12,10,8,7,4,3,1,11,13,15,16,18,21,23,26,28,30,32,34,43,45,47,21,26,28,31,34},
		{12,10,9,8,6,3,0,1,3,5,6,8,11,13,17,18,21,24,25,27,21,23,22,20,17,15,13,11,10,7,6,4,14,16,18,19,21,24,26,29,31,33,35,37,46,48,50,24,29,31,34,37},
		{13,11,10,9,7,4,1,0,2,4,5,7,10,12,16,17,20,23,24,26,20,22,23,21,18,16,14,12,11,8,7,5,15,17,19,20,22,25,27,30,32,34,36,38,47,49,51,25,30,32,35,38},
		{15,13,12,11,9,6,3,2,0,2,3,5,8,10,14,15,18,21,22,24,18,20,23,23,20,18,16,14,13,10,9,7,17,19,21,22,24,27,29,32,34,36,38,40,49,51,53,25,30,32,35,38},
		{17,15,14,13,11,8,5,4,2,0,1,3,6,8,12,13,16,19,20,22,16,18,21,23,22,20,18,16,15,12,11,9,19,21,23,24,26,29,31,34,36,38,40,42,51,53,55,23,28,30,33,36},
		{18,16,15,14,12,9,6,5,3,1,0,2,5,7,11,12,15,18,19,21,15,17,20,22,23,21,19,17,16,13,12,10,20,22,24,25,27,30,32,35,37,39,41,43,52,54,56,22,27,29,32,35},
		{20,18,17,16,14,11,8,7,5,3,2,0,3,5,9,10,13,16,17,19,13,15,18,20,23,23,21,19,18,15,14,12,22,24,26,27,29,32,34,37,39,41,43,45,54,56,58,20,25,27,30,33},
		{23,21,20,19,17,14,11,10,8,6,5,3,0,2,6,7,10,13,14,16,10,12,15,17,20,22,24,22,21,18,17,15,25,27,29,30,32,35,37,40,42,44,46,48,57,59,61,17,22,24,27,30},
		{25,23,22,21,19,16,13,12,10,8,7,5,2,0,4,5,8,11,12,14,8,10,13,15,18,20,22,24,23,20,19,17,27,29,31,32,34,37,39,42,44,46,48,50,59,61,63,15,20,22,25,28},
		{29,27,26,25,23,20,17,16,14,12,11,9,6,4,0,1,4,7,8,10,4,6,9,11,14,16,18,20,21,24,23,21,31,33,35,36,38,41,43,46,48,50,52,54,63,65,67,11,16,18,21,24},
		{30,28,27,26,24,21,18,17,15,13,12,10,7,5,1,0,3,6,7,9,3,5,8,10,13,15,17,19,20,23,24,22,32,34,36,37,39,42,44,47,49,51,53,55,64,66,68,10,15,17,20,23},
		{33,31,30,29,27,24,21,20,18,16,15,13,10,8,4,3,0,3,4,6,6,8,11,13,16,18,20,22,23,26,27,25,35,37,39,40,42,45,47,50,52,54,56,58,67,69,71,13,18,20,23,26},
		{36,34,33,32,30,27,24,23,21,19,18,16,13,11,7,6,3,0,1,3,9,11,14,16,19,21,23,25,26,29,30,28,38,40,42,43,45,48,50,53,55,57,59,61,70,72,74,16,21,23,26,29},
		{37,35,34,33,31,28,25,24,22,20,19,17,14,12,8,7,4,1,0,2,10,12,15,17,20,22,24,26,27,30,31,29,39,41,43,44,46,49,51,54,56,58,60,62,71,73,75,17,22,24,27,30},
		{39,37,36,35,33,30,27,26,24,22,21,19,16,14,10,9,6,3,2,0,12,14,17,19,22,24,26,28,29,32,33,31,41,43,45,46,48,51,53,56,58,60,62,64,73,75,77,19,24,26,29,32},
		{33,31,30,29,27,24,21,20,18,16,15,13,10,8,4,3,6,9,10,12,0,2,5,7,10,12,14,16,17,20,21,25,35,37,39,40,42,45,47,50,52,54,56,58,67,69,71,7,12,14,17,20},
		{31,29,28,27,25,22,23,22,20,18,17,15,12,10,6,5,8,11,12,14,2,0,3,5,8,10,12,14,15,18,19,23,33,35,37,38,40,43,45,48,50,52,54,56,65,67,69,5,10,12,15,18},
		{28,26,25,24,22,19,22,23,23,21,20,18,15,13,9,8,11,14,15,17,5,3,0,2,5,7,9,11,12,15,16,20,30,32,34,35,37,40,42,45,47,49,51,53,62,64,66,2,7,9,12,15},
		{26,24,23,22,20,17,20,21,23,23,22,20,17,15,11,10,13,16,17,19,7,5,2,0,3,5,7,9,10,13,14,18,28,30,32,33,35,38,40,43,45,47,49,51,60,62,64,4,9,11,14,17},
		{23,21,20,19,17,14,17,18,20,22,23,23,20,18,14,13,16,19,20,22,10,8,5,3,0,2,4,6,7,10,11,15,25,27,29,30,32,35,37,40,42,44,46,48,57,59,61,7,12,14,17,20},
		{21,19,18,17,15,12,15,16,18,20,21,23,22,20,16,15,18,21,22,24,12,10,7,5,2,0,2,4,5,8,9,13,23,25,27,28,30,33,35,38,40,42,44,46,55,57,59,9,14,16,19,22},
		{19,17,16,15,13,10,13,14,16,18,19,21,24,22,18,17,20,23,24,26,14,12,9,7,4,2,0,2,3,6,7,11,21,23,25,26,28,31,33,36,38,40,42,44,53,55,57,11,16,18,21,24},
		{17,15,14,13,11,8,11,12,14,16,17,19,22,24,20,19,22,25,26,28,16,14,11,9,6,4,2,0,1,4,5,9,19,21,23,24,26,29,31,34,36,38,40,42,51,53,55,13,18,20,23,26},
		{16,14,13,12,10,7,10,11,13,15,16,18,21,23,21,20,23,26,27,29,17,15,12,10,7,5,3,1,0,3,4,8,18,20,22,23,25,28,30,33,35,37,39,41,50,52,54,14,19,21,24,27},
		{13,11,10,9,7,4,7,8,10,12,13,15,18,20,24,23,26,29,30,32,20,18,15,13,10,8,6,4,3,0,1,5,15,17,19,20,22,25,27,30,32,34,36,38,47,49,51,17,22,24,27,30},
		{12,10,9,8,6,3,6,7,9,11,12,14,17,19,23,24,27,30,31,33,21,19,16,14,11,9,7,5,4,1,0,4,14,16,18,19,21,24,26,29,31,33,35,37,46,48,50,18,23,25,28,31},
		{10,8,7,6,4,1,4,5,7,9,10,12,15,17,21,22,25,28,29,31,25,23,20,18,15,13,11,9,8,5,4,0,12,14,16,17,19,22,24,27,29,31,33,35,44,46,48,22,27,29,32,35},
		{2,4,5,6,8,11,14,15,17,19,20,22,25,27,31,32,35,38,39,41,35,33,30,28,25,23,21,19,18,15,14,12,0,2,4,5,7,10,12,15,17,19,21,23,32,34,36,32,37,39,42,45},
		{4,6,7,8,10,13,16,17,19,21,22,24,27,29,33,34,37,40,41,43,37,35,32,30,27,25,23,21,20,17,16,14,2,0,2,3,5,8,10,13,15,17,19,21,30,32,34,34,39,41,44,47},
		{6,8,9,10,12,15,18,19,21,23,24,26,29,31,35,36,39,42,43,45,39,37,34,32,29,27,25,23,22,19,18,16,4,2,0,1,3,6,8,11,13,15,17,19,28,30,32,36,41,43,46,49},
		{7,9,10,11,13,16,19,20,22,24,25,27,30,32,36,37,40,43,44,46,40,38,35,33,30,28,26,24,23,20,19,17,5,3,1,0,2,5,7,10,12,14,16,18,27,29,31,37,42,44,47,50},
		{9,11,12,13,15,18,21,22,24,26,27,29,32,34,38,39,42,45,46,48,42,40,37,35,32,30,28,26,25,22,21,19,7,5,3,2,0,3,5,8,10,12,14,16,25,27,29,39,44,46,49,52},
		{12,14,15,16,18,21,24,25,27,29,30,32,35,37,41,42,45,48,49,51,45,43,40,38,35,33,31,29,28,25,24,22,10,8,6,5,3,0,2,5,7,9,11,13,22,24,26,42,47,49,52,55},
		{14,16,17,18,20,23,26,27,29,31,32,34,37,39,43,44,47,50,51,53,47,45,42,40,37,35,33,31,30,27,26,24,12,10,8,7,5,2,0,3,5,7,9,11,20,22,24,44,49,51,54,57},
		{17,19,20,21,23,26,29,30,32,34,35,37,40,42,46,47,50,53,54,56,50,48,45,43,40,38,36,34,33,30,29,27,15,13,11,10,8,5,3,0,2,4,6,8,17,19,21,47,52,54,57,60},
		{19,21,22,23,25,28,31,32,34,36,37,39,42,44,48,49,52,55,56,58,52,50,47,45,42,40,38,36,35,32,31,29,17,15,13,12,10,7,5,2,0,2,4,6,15,17,19,49,54,56,59,62},
		{21,23,24,25,27,30,33,34,36,38,39,41,44,46,50,51,54,57,58,60,54,52,49,47,44,42,40,38,37,34,33,31,19,17,15,14,12,9,7,4,2,0,2,4,13,15,17,51,56,58,61,64},
		{23,25,26,27,29,32,35,36,38,40,41,43,46,48,52,53,56,59,60,62,56,54,51,49,46,44,42,40,39,36,35,33,21,19,17,16,14,11,9,6,4,2,0,2,11,13,15,53,58,60,63,66},
		{25,27,28,29,31,34,37,38,40,42,43,45,48,50,54,55,58,61,62,64,58,56,53,51,48,46,44,42,41,38,37,35,23,21,19,18,16,13,11,8,6,4,2,0,9,11,13,55,60,62,65,68},
		{34,36,37,38,40,43,46,47,49,51,52,54,57,59,63,64,67,70,71,73,67,65,62,60,57,55,53,51,50,47,46,44,32,30,28,27,25,22,20,17,15,13,11,9,0,2,4,64,69,71,74,77},
		{36,38,39,40,42,45,48,49,51,53,54,56,59,61,65,66,69,72,73,75,69,67,64,62,59,57,55,53,52,49,48,46,34,32,30,29,27,24,22,19,17,15,13,11,2,0,2,66,71,73,76,79},
		{38,40,41,42,44,47,50,51,53,55,56,58,61,63,67,68,71,74,75,77,71,69,66,64,61,59,57,55,54,51,50,48,36,34,32,31,29,26,24,21,19,17,15,13,4,2,0,68,73,75,78,81},
		{30,28,27,26,24,21,24,25,25,23,22,20,17,15,11,10,13,16,17,19,7,5,2,4,7,9,11,13,14,17,18,22,32,34,36,37,39,42,44,47,49,51,53,55,64,66,68,0,5,7,10,13},
		{35,33,32,31,29,26,29,30,30,28,27,25,22,20,16,15,18,21,22,24,12,10,7,9,12,14,16,18,19,22,23,27,37,39,41,42,44,47,49,52,54,56,58,60,69,71,73,5,0,2,5,8},
		{37,35,34,33,31,28,31,32,32,30,29,27,24,22,18,17,20,23,24,26,14,12,9,11,14,16,18,20,21,24,25,29,39,41,43,44,46,49,51,54,56,58,60,62,71,73,75,7,2,0,3,6},
		{40,38,37,36,34,31,34,35,35,33,32,30,27,25,21,20,23,26,27,29,17,15,12,14,17,19,21,23,24,27,28,32,42,44,46,47,49,52,54,57,59,61,63,65,74,76,78,10,5,3,0,3},
		{43,41,40,39,37,34,37,38,38,36,35,33,30,28,24,23,26,29,30,32,20,18,15,17,20,22,24,26,27,30,31,35,45,47,49,50,52,55,57,60,62,64,66,68,77,79,81,13,8,6,3,0},
		};
	public  static int PATH_MATRIX[][] = {{0,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,1,1,1,1,1},
		{0,1,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,2,2,2,2,2},
		{1,1,2,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,1,1,1,1,1,1,1,1,1,1,1,1,1,1,1,3,3,3,3,3},
		{2,2,2,3,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,2,2,2,2,2,2,2,2,2,2,2,2,2,2,2,4,4,4,4,4},
		{3,3,3,3,4,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,3,3,3,3,3,3,3,3,3,3,3,3,3,3,3,5,5,5,5,5},
		{4,4,4,4,4,5,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,30,30,30,30,30,30,30,30,30,30,31,4,4,4,4,4,4,4,4,4,4,4,4,4,4,4,30,30,30,30,30},
		{5,5,5,5,5,5,6,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5},
		{6,6,6,6,6,6,6,7,8,8,8,8,8,8,8,8,8,8,8,8,8,8,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6,6},
		{7,7,7,7,7,7,7,7,8,9,9,9,9,9,9,9,9,9,9,9,9,9,9,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,7,9,9,9,9,9},
		{8,8,8,8,8,8,8,8,8,9,10,10,10,10,10,10,10,10,10,10,10,10,10,10,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,8,10,10,10,10,10},
		{9,9,9,9,9,9,9,9,9,9,10,11,11,11,11,11,11,11,11,11,11,11,11,11,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,9,11,11,11,11,11},
		{10,10,10,10,10,10,10,10,10,10,10,11,12,12,12,12,12,12,12,12,12,12,12,12,12,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,10,12,12,12,12,12},
		{11,11,11,11,11,11,11,11,11,11,11,11,12,13,13,13,13,13,13,13,13,13,13,13,13,13,13,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,11,13,13,13,13,13},
		{12,12,12,12,12,12,12,12,12,12,12,12,12,13,14,14,14,14,14,14,14,14,14,14,14,14,14,14,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,12,14,14,14,14,14},
		{13,13,13,13,13,13,13,13,13,13,13,13,13,13,14,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,13,15,15,15,15,15},
		{14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,15,16,16,16,16,20,20,20,20,20,20,20,20,20,20,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,14,20,20,20,20,20},
		{15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,16,17,17,17,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15},
		{16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,17,18,18,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16,16},
		{17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,18,19,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17,17},
		{18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,19,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18,18},
		{15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,20,21,21,21,21,21,21,21,21,21,21,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,15,21,21,21,21,21},
		{22,22,22,22,22,22,20,20,20,20,20,20,20,20,20,20,20,20,20,20,20,21,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22},
		{23,23,23,23,23,23,23,23,21,21,21,21,21,21,21,21,21,21,21,21,21,21,22,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,23,47,47,47,47,47},
		{24,24,24,24,24,24,24,24,24,22,22,22,22,22,22,22,22,22,22,22,22,22,22,23,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,24,22,22,22,22,22},
		{25,25,25,25,25,25,25,25,25,25,25,23,23,23,23,23,23,23,23,23,23,23,23,23,24,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,25,23,23,23,23,23},
		{26,26,26,26,26,26,26,26,26,26,26,26,24,24,24,24,24,24,24,24,24,24,24,24,24,25,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,26,24,24,24,24,24},
		{27,27,27,27,27,27,27,27,27,27,27,27,25,25,25,25,25,25,25,25,25,25,25,25,25,25,26,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,27,25,25,25,25,25},
		{28,28,28,28,28,28,28,28,28,28,28,28,28,26,26,26,26,26,26,26,26,26,26,26,26,26,26,27,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,26,26,26,26,26},
		{29,29,29,29,29,29,29,29,29,29,29,29,29,29,27,27,27,27,27,27,27,27,27,27,27,27,27,27,28,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,29,27,27,27,27,27},
		{30,30,30,30,30,30,30,30,30,30,30,30,30,30,28,28,28,28,28,28,28,28,28,28,28,28,28,28,28,29,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,30,28,28,28,28,28},
		{5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,29,29,29,29,29,29,29,29,29,29,30,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,29,29,29,29,29},
		{5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,31,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5,5},
		{0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,32,33,33,33,33,33,33,33,33,33,33,33,33,33,33,0,0,0,0,0},
		{32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,32,33,34,34,34,34,34,34,34,34,34,34,34,34,34,32,32,32,32,32},
		{33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,33,34,35,35,35,35,35,35,35,35,35,35,35,35,33,33,33,33,33},
		{34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,34,35,36,36,36,36,36,36,36,36,36,36,36,34,34,34,34,34},
		{35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,35,36,37,37,37,37,37,37,37,37,37,37,35,35,35,35,35},
		{36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,36,37,38,38,38,38,38,38,38,38,38,36,36,36,36,36},
		{37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,37,38,39,39,39,39,39,39,39,39,37,37,37,37,37},
		{38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,38,39,40,40,40,40,40,40,40,38,38,38,38,38},
		{39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,39,40,41,41,41,41,41,41,39,39,39,39,39},
		{40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,40,41,42,42,42,42,42,40,40,40,40,40},
		{41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,41,42,43,43,43,43,41,41,41,41,41},
		{42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,42,43,44,44,44,42,42,42,42,42},
		{43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,43,44,45,45,43,43,43,43,43},
		{44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,44,45,46,44,44,44,44,44},
		{45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,45,46,45,45,45,45,45},
		{22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,22,47,48,48,48,48},
		{47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,47,48,49,49,49},
		{48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,48,49,50,50},
		{49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,50,51},
		{50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,50,51},
		};
	
	public static void initStations(){
		
		stations.add(new Station(0,"Waterfront", new String[]{LINE_MILLENIUM,LINE_EXPO,LINE_CANADA}, 1));
		stations.add(new Station(1,"Burrard", new String[]{LINE_MILLENIUM,LINE_EXPO}, 1));
		stations.add(new Station(2,"Granville", new String[]{LINE_MILLENIUM,LINE_EXPO}, 1));
		stations.add(new Station(3,"Stadium Chinatown", new String[]{LINE_MILLENIUM,LINE_EXPO}, 1));
		stations.add(new Station(4,"Main Street Science World", new String[]{LINE_MILLENIUM,LINE_EXPO}, 1));
		stations.add(new Station(5,"Commercial Broadway", new String[]{LINE_MILLENIUM,LINE_EXPO}, 1));
		stations.add(new Station(6,"Nanaimo", new String[]{LINE_MILLENIUM,LINE_EXPO}, 1));
		stations.add(new Station(7,"29th Avenue", new String[]{LINE_MILLENIUM,LINE_EXPO}, 1));
		stations.add(new Station(8,"Joyce Collingwood", new String[]{LINE_MILLENIUM,LINE_EXPO}, 1));
		stations.add(new Station(9,"Patterson", new String[]{LINE_MILLENIUM,LINE_EXPO}, 2));
		stations.add(new Station(10,"Metrotown", new String[]{LINE_MILLENIUM,LINE_EXPO}, 2));
		stations.add(new Station(11,"Royal Oak", new String[]{LINE_MILLENIUM,LINE_EXPO}, 2));
		stations.add(new Station(12,"Edmonds", new String[]{LINE_MILLENIUM,LINE_EXPO}, 2));
		stations.add(new Station(13,"22nd Street", new String[]{LINE_MILLENIUM,LINE_EXPO}, 2));
		stations.add(new Station(14,"New Westminster", new String[]{LINE_MILLENIUM,LINE_EXPO}, 2));
		stations.add(new Station(15,"Columbia", new String[]{LINE_MILLENIUM,LINE_EXPO}, 2));
		stations.add(new Station(16,"Scott Road", new String[]{LINE_EXPO}, 3));
		stations.add(new Station(17,"Gateway", new String[]{LINE_EXPO}, 3));
		stations.add(new Station(18,"Surrey Central", new String[]{LINE_EXPO}, 3));
		stations.add(new Station(19,"King George", new String[]{LINE_EXPO}, 3));
		
		stations.add(new Station(20,"Sapperton", new String[]{LINE_MILLENIUM}, 2));
		stations.add(new Station(21,"Braid", new String[]{LINE_MILLENIUM}, 2));
		stations.add(new Station(22,"Lougheed Town Centre", new String[]{LINE_MILLENIUM, LINE_EVERGREEN}, 2));
		stations.add(new Station(23,"Production Way University", new String[]{LINE_MILLENIUM}, 2));
		stations.add(new Station(24,"Lake City Way", new String[]{LINE_MILLENIUM}, 2));
		stations.add(new Station(25,"Sperling Burnaby Lake", new String[]{LINE_MILLENIUM}, 2));
		stations.add(new Station(26,"Holdom", new String[]{LINE_MILLENIUM}, 2));
		stations.add(new Station(27,"Brentwood Town Centre", new String[]{LINE_MILLENIUM}, 2));
		stations.add(new Station(28,"Gilmore", new String[]{LINE_MILLENIUM}, 2));
		stations.add(new Station(29,"Rupert", new String[]{LINE_MILLENIUM}, 1));
		stations.add(new Station(30,"Renfrew", new String[]{LINE_MILLENIUM}, 1));
		stations.add(new Station(31,"VCC-Clark", new String[]{LINE_MILLENIUM}, 1));
		
		stations.add(new Station(32,"Vancouver City Centre", new String[]{LINE_CANADA}, 1));
		stations.add(new Station(33,"Yaletown Roundhouse", new String[]{LINE_CANADA}, 1));
		stations.add(new Station(34,"Olympic Village", new String[]{LINE_CANADA}, 1));
		stations.add(new Station(35,"Broadway City Hall", new String[]{LINE_CANADA}, 1));
		stations.add(new Station(36,"King Edward", new String[]{LINE_CANADA}, 1));
		stations.add(new Station(37,"Oakridge 41st", new String[]{LINE_CANADA}, 1));
		stations.add(new Station(38,"Langara 49th", new String[]{LINE_CANADA}, 1));
		stations.add(new Station(39,"Marine Drive", new String[]{LINE_CANADA}, 1));
		stations.add(new Station(40,"Bridgeport", new String[]{LINE_CANADA}, 2));
		stations.add(new Station(41,"Aberdeen", new String[]{LINE_CANADA}, 2));
		stations.add(new Station(42,"Lansdowne", new String[]{LINE_CANADA}, 2));
		stations.add(new Station(43,"Richmond Brighouse", new String[]{LINE_CANADA}, 2));
		stations.add(new Station(44,"Templeton", new String[]{LINE_CANADA}, 0));
		stations.add(new Station(45,"Sea Island Centre", new String[]{LINE_CANADA}, 0));
		stations.add(new Station(46,"YVR Airport", new String[]{LINE_CANADA}, 0));
		
		stations.add(new Station(47,"Burquitlam", new String[]{LINE_EVERGREEN}, 3));
		stations.add(new Station(48,"Port Moody", new String[]{LINE_EVERGREEN}, 3));
		stations.add(new Station(49,"Inlet Centre", new String[]{LINE_EVERGREEN}, 3));
		stations.add(new Station(50,"Coquitlam", new String[]{LINE_EVERGREEN}, 3));
		stations.add(new Station(51,"Douglas Lincoln", new String[]{LINE_EVERGREEN}, 3));
		
		initInterestPoints();
		
		//TODO add Evergreen line stations.
	}
	
	public static void initInterestPoints(){
		stations.get(NEW_WEST).getPoints().add(new InterestPoint(R.drawable.p_douglas_college,"Douglas College"));
		stations.get(NEW_WEST).getPoints().add(new InterestPoint(R.drawable.p_old_station,"Old Station New Westminster"));
		stations.get(NEW_WEST).getPoints().add(new InterestPoint(R.drawable.p_new_west_heritage_preservation,"Heritage Preservation"));

		stations.get(WATERFRONT).getPoints().add(new InterestPoint(R.drawable.p_waterfront_station,"Waterfront Station"));
		
		stations.get(BURRARD).getPoints().add(new InterestPoint(R.drawable.p_burrard_station,"Burrard Station"));
		stations.get(BURRARD).getPoints().add(new InterestPoint(R.drawable.p_burrard_bridge,"Burrard Bridge"));
		
		stations.get(GRANVILLE).getPoints().add(new InterestPoint(R.drawable.p_pacific_center,"Pacific Center"));
		stations.get(GRANVILLE).getPoints().add(new InterestPoint(R.drawable.p_joes_apartament,"Joe's Apartament"));
		
		stations.get(CHINATOWN).getPoints().add(new InterestPoint(R.drawable.p_bc_place,"BC Place"));
		stations.get(CHINATOWN).getPoints().add(new InterestPoint(R.drawable.p_chinatown_station,"Stadium-Chinatown Station"));
		
		stations.get(MAINSTREET).getPoints().add(new InterestPoint(R.drawable.p_pacific_central,"Pacific Central"));
		stations.get(MAINSTREET).getPoints().add(new InterestPoint(R.drawable.p_science_world,"Science World"));
		
		stations.get(COMMERCIAL).getPoints().add(new InterestPoint(R.drawable.p_commercial_station,"Commercial Brodway Station"));
		stations.get(COMMERCIAL).getPoints().add(new InterestPoint(R.drawable.p_commercial_driver_street,"Commercial Drive Street"));
		stations.get(COMMERCIAL).getPoints().add(new InterestPoint(R.drawable.p_boteco_brasil,"Boteco Brasil"));
		
		stations.get(NANAIMO).getPoints().add(new InterestPoint(R.drawable.p_nanaimo_station,"Nanaimo Station"));
		stations.get(NANAIMO).getPoints().add(new InterestPoint(R.drawable.p_nanaimo_street,"Nanaimo Street"));
		
		stations.get(_29AVENUE).getPoints().add(new InterestPoint(R.drawable.p_29th_station,"29th Avenue Station"));
		
		stations.get(JOYCE).getPoints().add(new InterestPoint(R.drawable.p_joyce,"Joyce-Collingwood Station"));
		stations.get(JOYCE).getPoints().add(new InterestPoint(R.drawable.p_vanness_ave,"Joyce-Collingwood Station at Vanness Avenuew"));
		stations.get(JOYCE).getPoints().add(new InterestPoint(R.drawable.p_joyce_bbq,"Joyce BBQ"));
		
		stations.get(PATTERSON).getPoints().add(new InterestPoint(R.drawable.p_central_park,"Central Park"));
		stations.get(PATTERSON).getPoints().add(new InterestPoint(R.drawable.p_waves_coffee_patterson,"Waves Coffee Shop"));
		
		stations.get(METROTOWN).getPoints().add(new InterestPoint(R.drawable.p_metrotown,"Metropolis Mall"));
		stations.get(METROTOWN).getPoints().add(new InterestPoint(R.drawable.p_bestbuy,"Best Buy"));
		stations.get(METROTOWN).getPoints().add(new InterestPoint(R.drawable.p_burnaby_public_library,"Burnaby Public Library"));
		
		stations.get(ROYAL_OAK).getPoints().add(new InterestPoint(R.drawable.p_metrotown_royal_oak,"Metrotown Madza"));
		
		stations.get(EDMONDS).getPoints().add(new InterestPoint(R.drawable.p_edmonds,"Edmonds Station"));
		
		stations.get(_22STREET).getPoints().add(new InterestPoint(R.drawable.p_22th_station,"22th Street Station"));
		stations.get(_22STREET).getPoints().add(new InterestPoint(R.drawable.p_queensborough_landing,"Queensborough Lading Outlet"));
		
		stations.get(COLUMBIA).getPoints().add(new InterestPoint(R.drawable.p_okonomi_sushi,"Okonomi Sushi"));
		stations.get(COLUMBIA).getPoints().add(new InterestPoint(R.drawable.p_queens_park,"Queens Park"));
		
		stations.get(SAPPERTON).getPoints().add(new InterestPoint(R.drawable.p_royal_columbian_hospital,"Royal Columbian Hospital"));
		
		stations.get(BRAID).getPoints().add(new InterestPoint(R.drawable.p_braid,"Braid Station"));
		stations.get(BRAID).getPoints().add(new InterestPoint(R.drawable.p_hume_park_braid,"Hume Park"));
		
		stations.get(LOUGHEED).getPoints().add(new InterestPoint(R.drawable.p_lougheed_towncenter,"Lougheed Towncenter Mall"));
		stations.get(LOUGHEED).getPoints().add(new InterestPoint(R.drawable.p_foggy_dew,"Foggy Dew"));
		stations.get(LOUGHEED).getPoints().add(new InterestPoint(R.drawable.p_coquitlam_college,"Coquitlam College"));
		
		stations.get(PRODUCTION_WAY).getPoints().add(new InterestPoint(R.drawable.p_burnaby_200_area_conservation,"Burnaby 200 area Conservation"));
		stations.get(PRODUCTION_WAY).getPoints().add(new InterestPoint(R.drawable.p_simon_fraser,"Simon Fraser University"));
		
		stations.get(LAKE_CITY).getPoints().add(new InterestPoint(R.drawable.p_burnaby_lake,"Burnaby Lake"));
		stations.get(LAKE_CITY).getPoints().add(new InterestPoint(R.drawable.p_burnaby_mountain_golf,"Burnaby Mountain Golf"));
		
		stations.get(SPERLING).getPoints().add(new InterestPoint(R.drawable.p_sperling_elementary_school,"Sperling Elementary School"));
		
		stations.get(BRENTWOOD).getPoints().add(new InterestPoint(R.drawable.p_brentwood_town_center,"Brentwood Town Center Mall"));
		stations.get(BRENTWOOD).getPoints().add(new InterestPoint(R.drawable.p_british_columbia_institute_of_technology,"British Columbia Institute of Technology"));
		
		stations.get(RUPERT).getPoints().add(new InterestPoint(R.drawable.p_thunderbird_elementary_school,"Thunderbird Elementary School"));
		
		stations.get(VCC_CLARK).getPoints().add(new InterestPoint(R.drawable.p_vcc,"vancouver community college"));
		
		stations.get(KING_GEORGE).getPoints().add(new InterestPoint(R.drawable.p_jim_pattison, "Jim Pattison Outpatient Care and Surgery Centre"));
		stations.get(KING_GEORGE).getPoints().add(new InterestPoint(R.drawable.p_surrey_memorial_hospital, "Surrey Memorial Hospital"));
		
		stations.get(SURREY).getPoints().add(new InterestPoint(R.drawable.p_surrey_central_mall, "Surrey Central Mall"));
		stations.get(SURREY).getPoints().add(new InterestPoint(R.drawable.p_surrey_libraries, "Surrey Libraries"));
		
		stations.get(SCOTT_ROAD).getPoints().add(new InterestPoint(R.drawable.p_cdi_college_scott_road, "CDI College"));
		
		stations.get(YALETOWN).getPoints().add(new InterestPoint(R.drawable.p_yaletown_ferry_dock, "yaletown Ferry Dock"));
		stations.get(YALETOWN).getPoints().add(new InterestPoint(R.drawable.p_roundhouse_community_arts, "Roundhouse Community Arts & Recreation Centre"));
		
		stations.get(OLYMPIC).getPoints().add(new InterestPoint(R.drawable.p_olympic_village, "Olympic Village"));
		
		stations.get(BROADWAY_CITY_HALL).getPoints().add(new InterestPoint(R.drawable.p_vancouver_general_hospital, "Vancouver General Hospital"));
		stations.get(BROADWAY_CITY_HALL).getPoints().add(new InterestPoint(R.drawable.p_vancouver_city_hall, "Vancouver City Hall"));
		
		stations.get(KING_EDWARD).getPoints().add(new InterestPoint(R.drawable.p_vancouver_olympic_centre, "Vancouver Olympic Centre"));
		stations.get(KING_EDWARD).getPoints().add(new InterestPoint(R.drawable.p_queen_elizbeth_park, "Queen Elizabeth Park"));
		stations.get(KING_EDWARD).getPoints().add(new InterestPoint(R.drawable.p_health_care_of_bc, "Children's & Women's Health Centre Of British Columbia"));
		
		stations.get(OAKRIDGE).getPoints().add(new InterestPoint(R.drawable.p_oakridge_centre,"Oakridge Centre"));
		
		stations.get(LANGARA).getPoints().add(new InterestPoint(R.drawable.p_langara_college,"Langara College"));
		stations.get(LANGARA).getPoints().add(new InterestPoint(R.drawable.p_langara_golf,"Langara golf Course"));
		
		stations.get(ABERDEEN).getPoints().add(new InterestPoint(R.drawable.p_aberdeen_centre,"Aberdeen Centre"));
		
		stations.get(LANDSDOWNE).getPoints().add(new InterestPoint(R.drawable.p_lansdowne_centre,"Lansdowne Centre"));
		
		stations.get(RICHMOND).getPoints().add(new InterestPoint(R.drawable.p_richmond_centre,"Richmond Centre"));
		
		stations.get(YVR_AIRPORT).getPoints().add(new InterestPoint(R.drawable.p_yvr_airport,"Vancouver International Airport(YVR-Airport)"));
		
		stations.get(MOODY_CENTRE).getPoints().add(new InterestPoint(R.drawable.p_port_moody,"Port Moody"));
		stations.get(MOODY_CENTRE).getPoints().add(new InterestPoint(R.drawable.p_port_moody_recreation_complex,"Port Moody Recreation Complex"));
		
		stations.get(COQUITLAM).getPoints().add(new InterestPoint(R.drawable.p_coquitlam_centre,"Coquitlam Centre"));
		
		stations.get(DOUGLAS_LINCOLN).getPoints().add(new InterestPoint(R.drawable.p_douglas_college_coquitlam,"Douglas College"));
		
		
		
		
				
		
		
		
		
		
	}
	
	
}

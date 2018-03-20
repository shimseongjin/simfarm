package Draw;

public class Map{
	public static int Fence[][]=new int [][]{ // 맵정보 저장하는 공간
		{6,1,1,1,1,1,1,1,7,1,1,1,1,1,1,1,7,1,1,1,1,1,1,1,8},
		{4,-1,-1,-1,-1,-1,-1,-1,4,-1,-1,-1,-1,-1,-1,-1,4,-1,-1,-1,-1,-1,-1,-1,4},
		{4,-1,-1,-1,-1,-1,-1,-1,4,-1,-1,-1,-1,-1,-1,-1,4,-1,-1,-1,-1,-1,-1,-1,4},
		{4,-1,-1,-1,-1,-1,-1,-1,4,-1,-1,-1,-1,-1,-1,-1,4,-1,-1,-1,-1,-1,-1,-1,4},
		{4,-1,-1,-1,-1,-1,-1,-1,4,-1,-1,-1,-1,-1,-1,-1,4,-1,-1,-1,-1,-1,-1,-1,4},
		{4,-1,-1,-1,-1,-1,-1,-1,4,-1,-1,-1,-1,-1,-1,-1,4,-1,-1,-1,-1,-1,-1,-1,4},
		{4,-1,-1,-1,-1,-1,-1,-1,4,-1,-1,-1,-1,-1,-1,-1,4,-1,-1,-1,-1,-1,-1,-1,4},
		{9,1,1,1,1,1,1,1,10,1,1,1,1,1,1,1,10,1,1,1,1,1,1,1,11},
		{4,-1,-1,-1,-1,-1,-1,-1,4,-1,-1,-1,-1,-1,-1,-1,4,-1,-1,-1,-1,-1,-1,-1,4},
		{4,-1,-1,-1,-1,-1,-1,-1,4,-1,-1,-1,-1,-1,-1,-1,4,-1,-1,-1,-1,-1,-1,-1,4},
		{4,-1,-1,-1,-1,-1,-1,-1,4,-1,-1,-1,-1,-1,-1,-1,4,-1,-1,-1,-1,-1,-1,-1,4},
		{4,-1,-1,-1,-1,-1,-1,-1,4,-1,-1,-1,-1,-1,-1,-1,4,-1,-1,-1,-1,-1,-1,-1,4},
		{4,-1,-1,-1,-1,-1,-1,-1,4,-1,-1,-1,-1,-1,-1,-1,4,-1,-1,-1,-1,-1,-1,-1,4},
		{4,-1,-1,-1,-1,-1,-1,-1,4,-1,-1,-1,-1,-1,-1,-1,4,-1,-1,-1,-1,-1,-1,-1,4},
		{6,1,1,1,1,1,1,1,13,1,1,1,1,1,1,1,13,1,1,1,1,1,1,1,14}
	};
	public static int FarmBg[][]=new int [][]{
		{186,187,187,187,187,187,187,187,187,187,187,187,187,187,187,187,187,187,187,187,187,187,187,187,188},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{228,229,229,229,229,229,229,229,229,229,229,229,229,229,229,229,229,229,229,229,229,229,229,229,230}
	};
	
	public static int StateBg[][]=new int [][]{
		{383,384,385,386,387,383,384,385,386,387,383,384,385,386,387,383,384,385,386,387,383,384,385,386,387},
		{383,384,385,386,387,383,384,385,386,387,383,384,385,386,387,383,384,385,386,387,383,384,385,386,387},
		{383,384,385,386,387,383,384,385,386,387,383,384,385,386,387,383,384,385,386,387,383,384,385,386,387},
	};
	
	public static int StartBg[][]=new int [][]{
		{168,169,170,187,187,187,187,187,187,187,187,187,187,187,187,187,187,187,187,187,187,187,187,187,188},
		{189,190,191,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{210,211,212,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{228,229,229,229,229,229,229,229,229,229,229,229,229,229,229,229,229,229,229,229,229,229,229,229,230}
	};
	

	public static int StartaddBg[][]=new int [][]{
		{127,-1,128,187,187,187,187,187,187,187,187,187,187,187,187,187,187,187,187,187,187,187,187,187,188},
		{-1,-1,-1,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{148,-1,149,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{207,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,251,250,209},
		{228,229,229,229,229,229,229,229,229,229,229,229,229,229,229,229,229,229,229,229,229,229,229,229,230}
	};
}

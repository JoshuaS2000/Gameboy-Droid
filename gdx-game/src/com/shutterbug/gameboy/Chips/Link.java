package com.shutterbug.gameboy.Chips;
import com.shutterbug.gameboy.Z80.*;
import android.util.*;

public class Link
{
	public void testLink(Z80 z80){
	System.out.println("Link console" + Character.getNumericValue(z80.memory[0xFF01]));
	Log.d("Link console",Character.toString((z80.memory[0xFF01])));
}
}

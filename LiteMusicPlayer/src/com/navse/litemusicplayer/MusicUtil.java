package com.navse.litemusicplayer;

import java.io.File;
import java.io.FilenameFilter;

public class MusicUtil {
	public boolean Accept(File dir, String fileName){
		return fileName.endsWith(".mp3");
	}

}

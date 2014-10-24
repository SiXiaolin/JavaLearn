package headfirst;
import java.util.*;
import java.io.*;


public class JukeBox {
	ArrayList<Song> songlist= new ArrayList<Song>();
	
	public static void main(String args[]){
		new JukeBox().go();
	}
	
	public void go(){
		getSongs();
		System.out.println(songlist);
		Collections.sort(songlist);
		System.out.println(songlist);
	}
	
	void getSongs(){
		try{
			File file= new File("SongList.txt");
			BufferedReader reader= new BufferedReader(new FileReader(file));
			String line= null;
			while((line=reader.readLine())!=null){
				addSong(line);
			}
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	void addSong(String linetoParse){
		String[] tokens= linetoParse.split("/");
		songlist.add(new Song(tokens[0],tokens[1],tokens[2],tokens[3]));
	}

}


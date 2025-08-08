package study01;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

public class solo0808 {

	public static void main(String[] args) {
		String str = "\n가을하늘 광활한데 높고 구름없이 "
				     + "\n밝은 달은 우리 가음 일편단심일세"
				     + "\n무궁화삼천리화려강산"
				     + "\n대한사람 대한으로 길이 보전하세";
		
		
		try(Writer writer = new FileWriter("C:/Temp/test8.txt",true)){
			writer.write(str);
			
			System.out.println("출력이 완료 되었습니다.");
			
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		
	}

}

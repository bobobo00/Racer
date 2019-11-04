package thread;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;

/**
 * œ¬‘ÿÕº∆¨°¢
 * 
 * @author dell
 *
 */

public class WebDownLoader {
	public static class DownLoderThread extends Thread{
		private String URL;
		private String dest;
		
		public DownLoderThread(String uRL, String dest) {
			super();
			this.URL = uRL;
			this.dest = dest;
		}
		@Override
		public void run() {
			// TODO Auto-generated method stub
			down(URL,dest);
			System.out.println(dest);
			
		}
		private void down(String URL,String dest) {
			try {
				FileUtils.copyURLToFile(new URL(URL), new File(dest));
			} catch (MalformedURLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
				System.out.println("œ¬‘ÿ¥ÌŒÛ");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
	public static void main(String[] args) {
		DownLoderThread thread1=new DownLoderThread("http://p1.pstatp.com/large/403c00037462ae2eee13","p.jpg");
		DownLoderThread thread2=new DownLoderThread("http://p1.pstatp.com/large/403c00037462ae2eee13","n.jpg");
		DownLoderThread thread3=new DownLoderThread("http://5b0988e595225.cdn.sohucs.com/images/20170830/d8b57e0dce0d4fa29bd5ef014be663d5","g.jpg");
		//∆Ù∂Ø
		thread1.start();
		thread2.start();
		thread3.start();
		
		
	}
}
